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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices._types.FailureStoreLifecycleTemplate

/**
 * Template equivalent of FailureStoreLifecycle that allows nullable values.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.FailureStoreLifecycleTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class FailureStoreLifecycleTemplate implements JsonpSerializable {
	@Nullable
	private final Time dataRetention;

	@Nullable
	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	private FailureStoreLifecycleTemplate(Builder builder) {

		this.dataRetention = builder.dataRetention;
		this.enabled = builder.enabled;

	}

	public static FailureStoreLifecycleTemplate of(Function<Builder, ObjectBuilder<FailureStoreLifecycleTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If defined, every document added to this data stream will be stored at least
	 * for this time frame. Any time after this duration the document could be
	 * deleted. When empty, every document in this data stream will be stored
	 * indefinitely.
	 * <p>
	 * API name: {@code data_retention}
	 */
	@Nullable
	public final Time dataRetention() {
		return this.dataRetention;
	}

	/**
	 * If defined, it turns data stream lifecycle on/off
	 * (<code>true</code>/<code>false</code>) for this data stream. A data stream
	 * lifecycle that's disabled (enabled: <code>false</code>) will have no effect
	 * on the data stream.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
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

		if (this.dataRetention != null) {
			generator.writeKey("data_retention");
			this.dataRetention.serialize(generator, mapper);

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FailureStoreLifecycleTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FailureStoreLifecycleTemplate> {
		@Nullable
		private Time dataRetention;

		@Nullable
		private Boolean enabled;

		/**
		 * If defined, every document added to this data stream will be stored at least
		 * for this time frame. Any time after this duration the document could be
		 * deleted. When empty, every document in this data stream will be stored
		 * indefinitely.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(@Nullable Time value) {
			this.dataRetention = value;
			return this;
		}

		/**
		 * If defined, every document added to this data stream will be stored at least
		 * for this time frame. Any time after this duration the document could be
		 * deleted. When empty, every document in this data stream will be stored
		 * indefinitely.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.dataRetention(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If defined, it turns data stream lifecycle on/off
		 * (<code>true</code>/<code>false</code>) for this data stream. A data stream
		 * lifecycle that's disabled (enabled: <code>false</code>) will have no effect
		 * on the data stream.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FailureStoreLifecycleTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FailureStoreLifecycleTemplate build() {
			_checkSingleUse();

			return new FailureStoreLifecycleTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FailureStoreLifecycleTemplate}
	 */
	public static final JsonpDeserializer<FailureStoreLifecycleTemplate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FailureStoreLifecycleTemplate::setupFailureStoreLifecycleTemplateDeserializer);

	protected static void setupFailureStoreLifecycleTemplateDeserializer(
			ObjectDeserializer<FailureStoreLifecycleTemplate.Builder> op) {

		op.add(Builder::dataRetention, Time._DESERIALIZER, "data_retention");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
