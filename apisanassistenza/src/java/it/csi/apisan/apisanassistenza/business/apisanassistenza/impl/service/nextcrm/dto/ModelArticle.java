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
public class ModelArticle {
	
	private Integer id = null;
	private Integer ticketId = null;
	private Integer typeId = null;
	private String type = null;
	private String body = null;
	private String contentType = null;
	private String from = null;
	private String to = null;
	private String cc = null;
	private String replyTo = null;
	private String messageId = null;
	private String messageIdMd5 = null;
	private String inReplyTo = null;
	private String references = null;
	private String subject = null;
	private String createdAt = null;
	private String updatedAt = null;
	
	private List<ModelAttachments> attachments = new ArrayList<ModelAttachments>();
	
	@JsonProperty("type_id")
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
	@JsonProperty("body")
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@JsonProperty("content_type")
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	@JsonProperty("from")
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
	@JsonProperty("attachments")
	public List<ModelAttachments> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<ModelAttachments> attachments) {
		this.attachments = attachments;
	}
	
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@JsonProperty("ticket_id")
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@JsonProperty("to")
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	@JsonProperty("cc")
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	@JsonProperty("reply_to")
	public String getReplyTo() {
		return replyTo;
	}
	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}
	
	@JsonProperty("message_id")
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	@JsonProperty("message_id_md5")
	public String getMessageIdMd5() {
		return messageIdMd5;
	}
	public void setMessageIdMd5(String messageIdMd5) {
		this.messageIdMd5 = messageIdMd5;
	}
	
	@JsonProperty("in_reply_to")
	public String getInReplyTo() {
		return inReplyTo;
	}
	public void setInReplyTo(String inReplyTo) {
		this.inReplyTo = inReplyTo;
	}
	
	@JsonProperty("references")
	public String getReferences() {
		return references;
	}
	public void setReferences(String references) {
		this.references = references;
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
		sb.append("class ModelArticle {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
		sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    attachments: ").append(toIndentedString(attachments.toString())).append("\n");
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
