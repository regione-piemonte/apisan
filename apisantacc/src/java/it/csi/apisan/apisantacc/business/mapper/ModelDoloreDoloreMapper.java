/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelDolore;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDoloreIntensita;
import it.csi.dma.dmaclbluc.DoloreResponse;

public class ModelDoloreDoloreMapper extends BaseMapper<ModelDolore, DoloreResponse> {

	@Override
	public DoloreResponse to(ModelDolore source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDolore from(DoloreResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelDolore source = new ModelDolore();
		
		source.setId(dest.getId());	
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));
		
		if(dest.getDolore() != null) {
			source.setDescrizione(dest.getDolore().getDescrizione());
			source.setAreaInteressata(dest.getDolore().getAreaInteressata());
			source.setIntensitaValore(dest.getDolore().getIntensitaValore());
			ModelDoloreIntensita md=new ModelDoloreIntensita();
			md.setValore(dest.getDolore().getIntensitaValore());
			md.setDescrizione(dest.getDolore().getIntensitaDescrizione());						
			source.setIntensita(md);
			source.setDataInizio(m.from(dest.getDolore().getDataInizio()));
			source.setDataFine(m.from(dest.getDolore().getDataFine()));
			
		}
		return source;
	}

}
