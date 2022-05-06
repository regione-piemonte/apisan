/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import it.csi.apisan.apisanvac.model.FiltriStringhe;

public class FilterCentriVaccinali {

	private FiltriStringhe asl;
	private FiltriStringhe associazione;
	private FiltriStringhe tipoCentro;
	
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("asl") 
	 
	public FiltriStringhe getAsl() {
		return asl;
	}

	public void setAsl(FiltriStringhe asl) {
		this.asl = asl;
	}
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("associazione") 

	public FiltriStringhe getAssociazione() {
		return associazione;
	}

	public void setAssociazione(FiltriStringhe associazione) {
		this.associazione = associazione;
	}
	
	@ApiModelProperty(value = "")
	 @JsonProperty("tipoCentro") 

	public FiltriStringhe getTipoCentro() {
		return tipoCentro;
	}

	public void setTipoCentro(FiltriStringhe tipoCentro) {
		this.tipoCentro = tipoCentro;
	}

}
