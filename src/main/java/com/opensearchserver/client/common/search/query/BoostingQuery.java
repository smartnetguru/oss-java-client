/**
 * Copyright 2014-2015 OpenSearchServer Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.opensearchserver.client.common.search.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_EMPTY)
public class BoostingQuery {

	public String patternQuery;
	public Float boost;

	public BoostingQuery() {
		patternQuery = null;
		boost = null;
	}

	/**
	 * @param patternQuery
	 *            the patternQuery to set
	 * @return this instance
	 */
	public BoostingQuery setPatternQuery(String patternQuery) {
		this.patternQuery = patternQuery;
		return this;
	}

	/**
	 * @param boost
	 *            the boost to set
	 * @return this instance
	 */
	public BoostingQuery setBoost(Float boost) {
		this.boost = boost;
		return this;
	}

}
