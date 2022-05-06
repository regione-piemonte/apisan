/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import it.csi.apisan.apisanvac.model.FiltriStringhe;

public class FilterSoloCovid {

	private FiltriStringhe soloCovid;
	
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("soloCovid")
	 
	public FiltriStringhe getSoloCovid() {
		return soloCovid;
	}

	public void setSoloCovid(FiltriStringhe soloCovid) {
		this.soloCovid = soloCovid;
	}
	
	
	 
}
