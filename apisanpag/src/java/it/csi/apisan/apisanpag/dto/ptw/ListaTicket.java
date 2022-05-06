/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class ListaTicket {
	
	
	ErrorePrenotazione errore;

	List<Ticket> listaTicket;
	
	@ApiModelProperty(value = "")
	@JsonProperty("errore") 
	
	public ErrorePrenotazione getErrore() {
		return errore;
	}

	public void setErrore(ErrorePrenotazione errore) {
		this.errore = errore;
	}
	
	
	@ApiModelProperty(value = "")
	@JsonProperty("lista_ticket")
	
	public List<Ticket> getListaTicket() {
		return listaTicket;
	}

	public void setListaTicket(List<Ticket> listaTicket) {
		this.listaTicket = listaTicket;
	}
	
	
}
