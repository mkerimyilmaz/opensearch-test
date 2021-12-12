/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

import com.github.jk1.license.ProjectData
import com.github.jk1.license.render.ReportRenderer
import java.io.FileWriter

buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
        maven(url = "https://aws.oss.sonatype.org/content/repositories/snapshots/")
        maven(url = "https://plugins.gradle.org/m2/")
        jcenter()
    }
}


plugins {
    java
    checkstyle
    `maven-publish`
    id("com.github.jk1.dependency-license-report") version "1.17"
}

java {
    targetCompatibility = JavaVersion.VERSION_1_8
    sourceCompatibility = JavaVersion.VERSION_1_8

    withJavadocJar()
    withSourcesJar()
}

tasks.withType<Jar> {
    doFirst {
        if (rootProject.extra.has("gitHashFull")) {
            val jar = this as Jar
            jar.manifest.attributes["X-Git-Revision"] = rootProject.extra["gitHashFull"]
            jar.manifest.attributes["X-Git-Commit-Time"] = rootProject .extra["gitCommitTime"]
        } else {
            throw GradleException("No git information available")
        }
    }

    manifest {
        attributes["Implementation-Title"] = "OpenSearch Java client"
        attributes["Implementation-Vendor"] = "OpenSearch"
        attributes["Implementation-URL"] = "https://github.com/opensearch-project/opensearch-java/"
        attributes["Build-Date"] = rootProject.extra["buildTime"]
    }

    metaInf {
        from("../LICENSE.txt")
        from("../NOTICE.txt")
    }
}

tasks.test {
    systemProperty("tests.security.manager", "false")
    // Basic auth settings for integration test
    systemProperty("https", System.getProperty("https", "true"))
    systemProperty("user", System.getProperty("user", "admin"))
    systemProperty("password", System.getProperty("password", "admin"))
}

val unitTest = task<Test>("unitTest") {
    filter {
        excludeTestsMatching("org.opensearch.client.opensearch.integTest.*")
    }
}

val integrationTest = task<Test>("integrationTest") {
    filter {
        includeTestsMatching("org.opensearch.client.opensearch.integTest.*")
    }
    systemProperty("tests.security.manager", "false")
    // Basic auth settings for integration test
    systemProperty("https", System.getProperty("https", "true"))
    systemProperty("user", System.getProperty("user", "admin"))
    systemProperty("password", System.getProperty("password", "admin"))
}

dependencies {
    val opensearchVersion = "1.2.1"
    val jacksonVersion = "2.12.5"

    // Apache 2.0
    implementation("org.opensearch.client", "opensearch-rest-client", opensearchVersion)
    testImplementation("org.opensearch.test", "framework", opensearchVersion)

    // Apache 2.0
    implementation("com.google.code.findbugs:jsr305:3.0.2")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://eclipse-ee4j.github.io/jsonp/
    implementation("jakarta.json", "jakarta.json-api", "2.0.1")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // http://json-b.net/
    implementation("jakarta.json.bind", "jakarta.json.bind-api", "2.0.0")

    // Apache 2.0
    implementation("com.fasterxml.jackson.core", "jackson-core", jacksonVersion)
    implementation("com.fasterxml.jackson.core", "jackson-databind", jacksonVersion)

    // EPL-2.0 OR BSD-3-Clause
    // https://eclipse-ee4j.github.io/yasson/
    implementation("org.eclipse", "yasson", "2.0.2")

    // Eclipse 1.0
    testImplementation("junit", "junit" , "4.12") {
        exclude(group = "org.hamcrest")
    }
}

licenseReport {
    renderers = arrayOf(SpdxReporter(File(rootProject.buildDir, "release/dependencies.csv")))
    excludeGroups = arrayOf("org.opensearch.client")
}

class SpdxReporter(val dest: File) : ReportRenderer {
    // License names to their SPDX identifier
    val spdxIds = mapOf(
        "Apache License, Version 2.0" to "Apache-2.0",
        "The Apache Software License, Version 2.0" to "Apache-2.0",
        "BSD Zero Clause License" to "0BSD",
        "Eclipse Public License 2.0" to "EPL-2.0",
        "Eclipse Public License v. 2.0" to "EPL-2.0",
        "GNU General Public License, version 2 with the GNU Classpath Exception" to "GPL-2.0 WITH Classpath-exception-2.0",
        "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0" to "CDDL-1.0"
    )

    private fun quote(str: String) : String {
        return if (str.contains(',') || str.contains("\"")) {
            "\"" + str.replace("\"", "\"\"") + "\""
        } else {
            str
        }
    }

    override fun render(data: ProjectData?) {
        dest.parentFile.mkdirs()
        FileWriter(dest).use { out ->
            out.append("name,url,version,revision,license\n")
            data?.allDependencies?.forEach { dep ->
                val info = com.github.jk1.license.render.LicenseDataCollector.multiModuleLicenseInfo(dep)

                val depVersion = dep.version
                val depName = dep.group + ":" + dep.name
                val depUrl = info.moduleUrls.first()

                val licenseIds = info.licenses.mapNotNull { license ->
                    license.name?.let {
                        checkNotNull(spdxIds[it]) { "No SPDX identifier for $license" }
                    }
                }.toSet()

                // Combine multiple licenses.
                // See https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/#composite-license-expressions
                val licenseId = licenseIds.joinToString(" OR ")
                out.append("${quote(depName)},${quote(depUrl)},${quote(depVersion)},,${quote(licenseId)}\n")
            }
        }
    }
}

tasks.withType<Jar> {
    doLast {
        ant.withGroovyBuilder {
            "checksum"("algorithm" to "md5", "file" to archivePath)
            "checksum"("algorithm" to "sha1", "file" to archivePath)
            "checksum"("algorithm" to "sha-256", "file" to archivePath, "fileext" to ".sha256")
            "checksum"("algorithm" to "sha-512", "file" to archivePath, "fileext" to ".sha512")
        }
    }
}

publishing {
    repositories{
        maven {
            url = uri("${rootProject.buildDir}/repository")
        }
    }
    publications {
        create<MavenPublication>("publishMaven") {
            from(components["java"])
            pom {
                name.set("OpenSearch Java Client")
                packaging = "jar"
                artifactId = "opensearch-java"
                description.set("High level OpenSearch Java Client. This is a pre-release of 1.0.0 and is for testing and feedback purposes only.")
                url.set("https://github.com/opensearch-project/opensearch-java/")
                scm {
                    connection.set("scm:git@github.com:opensearch-project/opensearch-java.git")
                    developerConnection.set("scm:git@github.com:opensearch-project/opensearch-java.git")
                    url.set("git@github.com:opensearch-project/opensearch-java.git")
                }
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        name.set("opensearch-project")
                        url.set("https://www.opensearch.org")
                        inceptionYear.set("2021")
                    }
                }
            }
        }
    }
}
