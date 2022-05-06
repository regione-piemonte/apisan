/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

public class IdentitaDigitale {
	
	
	public IdentitaDigitale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdentitaDigitale(String codiceFiscale, String email) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.email = email;
	}

	private String codiceFiscale = null;
	private String email = null;

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		if (codiceFiscale != null)
			this.codiceFiscale = codiceFiscale;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null)
			this.email = email;
	}
	
	public boolean hasCodiceFiscale() {
		return codiceFiscale != null;
	}
	
	public boolean hasEmail() {
		return email != null;
	}
	
	public boolean hasValues() {
		return hasCodiceFiscale() && hasEmail();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(codiceFiscale, email);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class email {\n");

		sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
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
