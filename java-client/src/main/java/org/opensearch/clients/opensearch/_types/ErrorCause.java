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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch._types;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ErrorCause
@JsonpDeserializable
public class ErrorCause implements JsonpSerializable {
	private final Map<String, JsonData> metadata;

	private final String type;

	private final String reason;

	@Nullable
	private final String stackTrace;

	@Nullable
	private final ErrorCause causedBy;

	private final List<ErrorCause> rootCause;

	private final List<ErrorCause> suppressed;

	// ---------------------------------------------------------------------------------------------

	private ErrorCause(Builder builder) {

		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);

		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.reason = ModelTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.stackTrace = builder.stackTrace;
		this.causedBy = builder.causedBy;
		this.rootCause = ModelTypeHelper.unmodifiable(builder.rootCause);
		this.suppressed = ModelTypeHelper.unmodifiable(builder.suppressed);

	}

	public static ErrorCause of(Function<Builder, ObjectBuilder<ErrorCause>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Additional details about the error
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - The type of error
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - A human-readable explanation of the error, in english
	 * <p>
	 * API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * The server stack trace. Present only if the <code>error_trace=true</code>
	 * parameter was sent with the request.
	 * <p>
	 * API name: {@code stack_trace}
	 */
	@Nullable
	public final String stackTrace() {
		return this.stackTrace;
	}

	/**
	 * API name: {@code caused_by}
	 */
	@Nullable
	public final ErrorCause causedBy() {
		return this.causedBy;
	}

	/**
	 * API name: {@code root_cause}
	 */
	public final List<ErrorCause> rootCause() {
		return this.rootCause;
	}

	/**
	 * API name: {@code suppressed}
	 */
	public final List<ErrorCause> suppressed() {
		return this.suppressed;
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

		for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.stackTrace != null) {
			generator.writeKey("stack_trace");
			generator.write(this.stackTrace);

		}
		if (this.causedBy != null) {
			generator.writeKey("caused_by");
			this.causedBy.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.rootCause)) {
			generator.writeKey("root_cause");
			generator.writeStartArray();
			for (ErrorCause item0 : this.rootCause) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.suppressed)) {
			generator.writeKey("suppressed");
			generator.writeStartArray();
			for (ErrorCause item0 : this.suppressed) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ErrorCause}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ErrorCause> {
		@Nullable
		private Map<String, JsonData> metadata = new HashMap<>();

		/**
		 * Additional details about the error
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		private String type;

		private String reason;

		@Nullable
		private String stackTrace;

		@Nullable
		private ErrorCause causedBy;

		@Nullable
		private List<ErrorCause> rootCause;

		@Nullable
		private List<ErrorCause> suppressed;

		/**
		 * Required - The type of error
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - A human-readable explanation of the error, in english
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * The server stack trace. Present only if the <code>error_trace=true</code>
		 * parameter was sent with the request.
		 * <p>
		 * API name: {@code stack_trace}
		 */
		public final Builder stackTrace(@Nullable String value) {
			this.stackTrace = value;
			return this;
		}

		/**
		 * API name: {@code caused_by}
		 */
		public final Builder causedBy(@Nullable ErrorCause value) {
			this.causedBy = value;
			return this;
		}

		/**
		 * API name: {@code caused_by}
		 */
		public final Builder causedBy(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.causedBy(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code root_cause}
		 */
		public final Builder rootCause(@Nullable List<ErrorCause> value) {
			this.rootCause = value;
			return this;
		}

		/**
		 * API name: {@code root_cause}
		 */
		public final Builder rootCause(ErrorCause... value) {
			this.rootCause = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code root_cause}
		 */
		@SafeVarargs
		public final Builder rootCause(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>>... fns) {
			this.rootCause = new ArrayList<>(fns.length);
			for (Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn : fns) {
				this.rootCause.add(fn.apply(new ErrorCause.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code suppressed}
		 */
		public final Builder suppressed(@Nullable List<ErrorCause> value) {
			this.suppressed = value;
			return this;
		}

		/**
		 * API name: {@code suppressed}
		 */
		public final Builder suppressed(ErrorCause... value) {
			this.suppressed = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code suppressed}
		 */
		@SafeVarargs
		public final Builder suppressed(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>>... fns) {
			this.suppressed = new ArrayList<>(fns.length);
			for (Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn : fns) {
				this.suppressed.add(fn.apply(new ErrorCause.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link ErrorCause}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ErrorCause build() {
			_checkSingleUse();

			return new ErrorCause(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ErrorCause}
	 */
	public static final JsonpDeserializer<ErrorCause> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ErrorCause::setupErrorCauseDeserializer, Builder::build);

	protected static void setupErrorCauseDeserializer(DelegatingDeserializer<ErrorCause.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::stackTrace, JsonpDeserializer.stringDeserializer(), "stack_trace");
		op.add(Builder::causedBy, ErrorCause._DESERIALIZER, "caused_by");
		op.add(Builder::rootCause, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "root_cause");
		op.add(Builder::suppressed, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "suppressed");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			if (builder.metadata == null) {
				builder.metadata = new HashMap<>();
			}
			builder.metadata.put(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
