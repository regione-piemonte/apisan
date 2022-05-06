/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class ModelUserNew {

	private String email;
	private String firstname;
	private String lastname;
	private String phone;
	private String fax;
	private String mobile;
	private String note;
	private String codiceFiscale;
	private String tesseraTeam;
	private String tesseraStp;
	private String tesseraEni;

	
	@JsonProperty("firstname")
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@JsonProperty("lastname")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@JsonProperty("fax")
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@JsonProperty("mobile")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@JsonProperty("note")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@JsonProperty("codice_fiscale")
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	@JsonProperty("tessera_team")
	public String getTesseraTeam() {
		return tesseraTeam;
	}
	public void setTesseraTeam(String tesseraTeam) {
		this.tesseraTeam = tesseraTeam;
	}
	
	@JsonProperty("tessera_stp")
	public String getTesseraStp() {
		return tesseraStp;
	}
	public void setTesseraStp(String tesseraStp) {
		this.tesseraStp = tesseraStp;
	}
	
	@JsonProperty("tessera_eni")
	public String getTesseraEni() {
		return tesseraEni;
	}
	public void setTesseraEni(String tesseraEni) {
		this.tesseraEni = tesseraEni;
	}
	

	@Override
	public int hashCode() {
		// TODO: to implement
		return Objects.hash();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelUserNew {\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");

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
