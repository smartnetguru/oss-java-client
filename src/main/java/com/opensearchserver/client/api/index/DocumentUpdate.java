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
package com.opensearchserver.client.api.index;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.opensearchserver.client.api.LanguageEnum;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_EMPTY)
public class DocumentUpdate {

	@XmlAttribute
	public LanguageEnum lang;

	public List<FieldUpdate> fields;

	public DocumentUpdate() {
		lang = null;
		fields = null;
	}

	/**
	 * @param lang
	 *            the lang to set
	 */
	public DocumentUpdate setLang(LanguageEnum lang) {
		this.lang = lang;
		return this;
	}

	/**
	 * @param fields
	 *            the fields to set
	 */
	public DocumentUpdate setFields(List<FieldUpdate> fields) {
		this.fields = fields;
		return this;
	}

	/**
	 * @param field
	 *            the field to add
	 */
	public DocumentUpdate addField(FieldUpdate field) {
		if (fields == null)
			fields = new ArrayList<FieldUpdate>();
		fields.add(field);
		return this;
	}

}
