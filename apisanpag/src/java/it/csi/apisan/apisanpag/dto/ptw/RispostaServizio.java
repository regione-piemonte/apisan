/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class RispostaServizio {

	private String codice = null;
	private String messaggio = null;
	
	@ApiModelProperty(value = "")
	@JsonProperty("codice") 
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	@ApiModelProperty(value = "")
	@JsonProperty("messaggio") 
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((messaggio == null) ? 0 : messaggio.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RispostaServizio other = (RispostaServizio) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (messaggio == null) {
			if (other.messaggio != null)
				return false;
		} else if (!messaggio.equals(other.messaggio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RispostaServizio [codice=" + codice + ", messaggio=" + messaggio + "]";
	}
	
	

}
