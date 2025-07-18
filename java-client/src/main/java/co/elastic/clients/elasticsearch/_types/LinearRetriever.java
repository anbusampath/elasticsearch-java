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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: _types.LinearRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.LinearRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class LinearRetriever extends RetrieverBase implements RetrieverVariant {
	private final List<InnerRetriever> retrievers;

	@Nullable
	private final Integer rankWindowSize;

	@Nullable
	private final String query;

	private final List<String> fields;

	@Nullable
	private final ScoreNormalizer normalizer;

	// ---------------------------------------------------------------------------------------------

	private LinearRetriever(Builder builder) {
		super(builder);

		this.retrievers = ApiTypeHelper.unmodifiable(builder.retrievers);
		this.rankWindowSize = builder.rankWindowSize;
		this.query = builder.query;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.normalizer = builder.normalizer;

	}

	public static LinearRetriever of(Function<Builder, ObjectBuilder<LinearRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Linear;
	}

	/**
	 * Inner retrievers.
	 * <p>
	 * API name: {@code retrievers}
	 */
	public final List<InnerRetriever> retrievers() {
		return this.retrievers;
	}

	/**
	 * API name: {@code rank_window_size}
	 */
	@Nullable
	public final Integer rankWindowSize() {
		return this.rankWindowSize;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code normalizer}
	 */
	@Nullable
	public final ScoreNormalizer normalizer() {
		return this.normalizer;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.retrievers)) {
			generator.writeKey("retrievers");
			generator.writeStartArray();
			for (InnerRetriever item0 : this.retrievers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.rankWindowSize != null) {
			generator.writeKey("rank_window_size");
			generator.write(this.rankWindowSize);

		}
		if (this.query != null) {
			generator.writeKey("query");
			generator.write(this.query);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.normalizer != null) {
			generator.writeKey("normalizer");
			this.normalizer.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LinearRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LinearRetriever> {
		@Nullable
		private List<InnerRetriever> retrievers;

		@Nullable
		private Integer rankWindowSize;

		@Nullable
		private String query;

		@Nullable
		private List<String> fields;

		@Nullable
		private ScoreNormalizer normalizer;

		/**
		 * Inner retrievers.
		 * <p>
		 * API name: {@code retrievers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>retrievers</code>.
		 */
		public final Builder retrievers(List<InnerRetriever> list) {
			this.retrievers = _listAddAll(this.retrievers, list);
			return this;
		}

		/**
		 * Inner retrievers.
		 * <p>
		 * API name: {@code retrievers}
		 * <p>
		 * Adds one or more values to <code>retrievers</code>.
		 */
		public final Builder retrievers(InnerRetriever value, InnerRetriever... values) {
			this.retrievers = _listAdd(this.retrievers, value, values);
			return this;
		}

		/**
		 * Inner retrievers.
		 * <p>
		 * API name: {@code retrievers}
		 * <p>
		 * Adds a value to <code>retrievers</code> using a builder lambda.
		 */
		public final Builder retrievers(Function<InnerRetriever.Builder, ObjectBuilder<InnerRetriever>> fn) {
			return retrievers(fn.apply(new InnerRetriever.Builder()).build());
		}

		/**
		 * API name: {@code rank_window_size}
		 */
		public final Builder rankWindowSize(@Nullable Integer value) {
			this.rankWindowSize = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * API name: {@code normalizer}
		 */
		public final Builder normalizer(@Nullable ScoreNormalizer value) {
			this.normalizer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LinearRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LinearRetriever build() {
			_checkSingleUse();

			return new LinearRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LinearRetriever}
	 */
	public static final JsonpDeserializer<LinearRetriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LinearRetriever::setupLinearRetrieverDeserializer);

	protected static void setupLinearRetrieverDeserializer(ObjectDeserializer<LinearRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::retrievers, JsonpDeserializer.arrayDeserializer(InnerRetriever._DESERIALIZER), "retrievers");
		op.add(Builder::rankWindowSize, JsonpDeserializer.integerDeserializer(), "rank_window_size");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::normalizer, ScoreNormalizer._DESERIALIZER, "normalizer");

	}

}
