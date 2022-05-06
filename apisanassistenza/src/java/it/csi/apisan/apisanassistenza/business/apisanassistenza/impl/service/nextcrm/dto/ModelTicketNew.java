/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelTicketNew {

	public ModelTicketNew(String number, Integer id, String title, Integer groupId, Integer priorityId,
			Integer stateId, String state, Integer customerId, String utenteRiconosciuto, String note, Integer typeId,
			String asset, String assetId, Integer articleCount, List<Integer> articleIds, String createdAt,
			String updatedAt) {
		super();
		this.number = number;
		this.id = id;
		this.title = title;
		this.groupId = groupId;
		this.priorityId = priorityId;
		this.stateId = stateId;
		this.state = state;
		this.customerId = customerId;
		this.utenteRiconosciuto = utenteRiconosciuto;
		this.note = note;
		this.typeId = typeId;
		this.asset = asset;
		this.assetId = assetId;
		this.articleCount = articleCount;
		this.articleIds = articleIds;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	public ModelTicketNew() {
		super();
	}


	private String number = null;
	private Integer id = null;
	private String title = null;
	private Integer groupId = null;


	private Integer priorityId = null;
	private Integer stateId = null;
	private String state = null;
	private Integer customerId = null;
	private String utenteRiconosciuto = null;
	private String note = null;
	private Integer typeId = null;
	private String asset = null;
	private String assetId = null;
	private Integer articleCount = null;
	private List<Integer> articleIds = new ArrayList<Integer>();
	private String createdAt;
	private String updatedAt;	

	
	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("group_id")
	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@JsonProperty("article_ids")
	public List<Integer> getArticleIds() {
		return articleIds;
	}

	public void setArticleIds(List<Integer> articleIds) {
		this.articleIds = articleIds;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("priority_id")
	public Integer getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	@JsonProperty("state_id")
	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("customer_id")
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@JsonProperty("type_id")
	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@JsonProperty("utente_riconosciuto")
	public String getUtenteRiconosciuto() {
		return utenteRiconosciuto;
	}

	public void setUtenteRiconosciuto(String utenteRiconosciuto) {
		this.utenteRiconosciuto = utenteRiconosciuto;
	}

	@JsonProperty("note")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@JsonProperty("article_count")
	public Integer getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}

	@JsonProperty("asset")
	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}
	
	@JsonProperty("asset_id")
	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
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
		sb.append("class ModelTicketNew {\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
