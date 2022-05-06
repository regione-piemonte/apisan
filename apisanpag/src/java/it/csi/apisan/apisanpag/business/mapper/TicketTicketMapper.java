/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import java.util.ArrayList;

import it.csi.apisan.apisanpag.dto.apisanpag.Pratica;
import it.csi.apisan.apisanpag.dto.apisanpag.Ticket;
import it.csi.apisan.apisanpag.dto.ptw.ListaPrenotazione;

public class TicketTicketMapper extends BaseMapper<Ticket, it.csi.apisan.apisanpag.dto.ptw.Ticket> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Ticket to(Ticket source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Ticket dest = new it.csi.apisan.apisanpag.dto.ptw.Ticket();
		dest.setErrore(new ErrorePrenotazioneErrorePrenotazioneMapper().to(source.getErrore()));
		dest.setPaziente(new CittadinoMapper().to(source.getPaziente()));
		if(source.getListaPrenotazione() != null) {
			ListaPrenotazione lista = new ListaPrenotazione();
			lista.setListaPratica(new PraticaPraticaMapper().toList(source.getListaPrenotazione()));
			dest.setListaprenotazione(  lista);
		}
		return dest;	
	}

	@Override
	public Ticket from(it.csi.apisan.apisanpag.dto.ptw.Ticket dest) {
		if(dest == null) {
			return null;
		}
		Ticket source = new Ticket();
		source.setErrore(new ErrorePrenotazioneErrorePrenotazioneMapper().from(dest.getErrore()));
		source.setPaziente(new CittadinoMapper().from(dest.getPaziente()));
		if(dest.getListaprenotazione() != null) {
			source.setListaPrenotazione(new PraticaPraticaMapper().fromList(dest.getListaprenotazione().getListaPratica()));
		}else {
			source.setListaPrenotazione(new ArrayList<Pratica>());
		}
		return source;
	}

}
