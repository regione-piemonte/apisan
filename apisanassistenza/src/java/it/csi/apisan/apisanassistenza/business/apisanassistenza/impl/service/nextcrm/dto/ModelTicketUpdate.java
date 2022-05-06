/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelTicketUpdate {
	
	private Integer priorityId = null;
	private Integer stateId = null;
	private String title = null;
	private String customer = null;
	private Integer typeId = null;
	private Integer utenteRiconosciuto = null;
	private String note = null;
	private Integer assetId = null;
	
	
	@JsonProperty("state_id")
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty("priority_id")
	public Integer getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}
	
	@JsonProperty("customer")
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	@JsonProperty("utente_riconosciuto")
	public Integer getUtenteRiconosciuto() {
		return utenteRiconosciuto;
	}
	public void setUtenteRiconosciuto(Integer utenteRiconosciuto) {
		this.utenteRiconosciuto = utenteRiconosciuto;
	}
	
	@JsonProperty("note")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@JsonProperty("type_id")
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
	@JsonProperty("asset_id")
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
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
		sb.append("class ModelTicketScrittura {\n");
		sb.append("    stateId ").append(toIndentedString(stateId)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    priorityId: ").append(toIndentedString(priorityId)).append("\n");
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
