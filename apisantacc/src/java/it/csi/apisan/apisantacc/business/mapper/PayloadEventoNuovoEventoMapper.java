/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.PayloadEventoNuovo;
import it.csi.dma.dmaclbluc.Evento;

public class PayloadEventoNuovoEventoMapper extends BaseMapper<PayloadEventoNuovo, Evento>{

	@Override
	public Evento to(PayloadEventoNuovo source) {
		if(source == null) {
			return null;
		}
		Evento evento = new Evento();
		evento.setData(new DateXMLGregorianCalendarMapper().to(source.getData()));
		evento.setDescrizione(source.getDescrizione());		
		return evento;
	}

	@Override
	public PayloadEventoNuovo from(Evento dest) {
		if(dest == null) {
			return null;
		}
		PayloadEventoNuovo payloadEventoNuovo = new PayloadEventoNuovo();
		payloadEventoNuovo.setData(new DateXMLGregorianCalendarMapper().from(dest.getData()));
		payloadEventoNuovo.setDescrizione(dest.getDescrizione());		
		return payloadEventoNuovo;
	}

}
