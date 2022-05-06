/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelEvento;
import it.csi.dma.dmaclbluc.EventoResponse;

public class ModelEventoEventoMapper extends BaseMapper<ModelEvento, EventoResponse> {

	@Override
	public EventoResponse to(ModelEvento source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelEvento from(EventoResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelEvento source = new ModelEvento();
		
		source.setId(dest.getId());	
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));
		
		if(dest.getEvento() != null) {
			source.setDescrizione(dest.getEvento().getDescrizione());
			source.setData(m.from(dest.getEvento().getData()));			
		}
		return source;
	}

}
