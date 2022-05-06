/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelAttachments {
	
	private Integer id = null;
	private Integer size = null;
	private String filename = null;
	private String data = null;
	private ModelMimeType preferences = null;
	private String mimeType = null; // only for payload create ticket 
	
	
	@JsonProperty("filename")
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	
	@JsonProperty("preferences")
	public ModelMimeType getPreferences() {
		return preferences;
	}

	public void setPreferences(ModelMimeType preferences) {
		this.preferences = preferences;
	}

	@JsonProperty("data")
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
	
	@JsonProperty("mime-type")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		// TODO: to implement
		return true;
	}

	@Override
	public int hashCode() {
		// TODO: to implement
		return Objects.hash();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelAttachments {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}	

}
