/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class ListaPrenotazione {
	
	private List<Pratica> listaPratica = new ArrayList<Pratica>();

	
	  @ApiModelProperty(value = "")
	  @JsonProperty("pratica") 
	  
	public List<Pratica> getListaPratica() {
		return listaPratica;
	}

	public void setListaPratica(List<Pratica> listaPratica) {
		this.listaPratica = listaPratica;
	}
	
	
}
