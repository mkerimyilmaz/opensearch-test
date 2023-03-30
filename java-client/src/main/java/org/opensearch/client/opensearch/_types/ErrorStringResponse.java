/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch._types;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

import java.util.function.Function;

/**
 * The response returned by OpenSearch when request execution did not
 * succeed.
 */
@JsonpDeserializable
public class ErrorStringResponse implements JsonpSerializable {
	private final String error;

	private final int status;

	// ---------------------------------------------------------------------------------------------

	private ErrorStringResponse(Builder builder) {

		this.error = ApiTypeHelper.requireNonNull(builder.error, this, "error");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static ErrorStringResponse of(Function<Builder, ObjectBuilder<ErrorStringResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code error}
	 */
	public final String error() {
		return this.error;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final int status() {
		return this.status;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("error");
		generator.write(this.error);

		generator.writeKey("status");
		generator.write(this.status);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ErrorStringResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ErrorStringResponse> {
		private String error;

		private Integer status;

		/**
		 * Required - API name: {@code error}
		 */
		public final Builder error(String value) {
			this.error = value;
			return this;
		}

		/**
		 * Required - API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<String>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(int value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link ErrorStringResponse}.
		 *
		 * @throws NullPointerException if some of the required fields are null.
		 */
		public ErrorStringResponse build() {
			_checkSingleUse();

			return new ErrorStringResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ErrorStringResponse}
	 */
	public static final JsonpDeserializer<ErrorStringResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ErrorStringResponse::setupErrorResponseDeserializer);

	protected static void setupErrorResponseDeserializer(ObjectDeserializer<ErrorStringResponse.Builder> op) {
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");
	}

}
