/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.esen;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Disclaimer {
	
	private String codice = null;  
	private String descrizione = null;
	
	
	@ApiModelProperty(value = "")
	@JsonProperty("codice") 
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	@ApiModelProperty(value = "")
	@JsonProperty("descrizione") 	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
	  
}
