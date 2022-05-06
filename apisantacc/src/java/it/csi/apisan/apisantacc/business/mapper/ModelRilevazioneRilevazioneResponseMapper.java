/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazione;
import it.csi.dma.dmaclbluc.RilevazioneResponse;

public class ModelRilevazioneRilevazioneResponseMapper extends BaseMapper<ModelRilevazione, RilevazioneResponse>{

	@Override
	public RilevazioneResponse to(ModelRilevazione source) {
		
		if(source==null) {
			return null;
		}		
		
		RilevazioneResponse rilevazioneResponse  = new RilevazioneResponse();
		rilevazioneResponse.setRilevazione(new ModelRilevazioneRilevazioneMapper().to(source));
		rilevazioneResponse.setId(source.getId());
		rilevazioneResponse.setDataAggiornamento(new DateXMLGregorianCalendarMapper().to(source.getDataAggiornamento()));
		rilevazioneResponse.setDataCreazione(new DateXMLGregorianCalendarMapper().to(source.getDataCreazione()));	
		
		return rilevazioneResponse;
	}

	@Override
	public ModelRilevazione from(RilevazioneResponse dest) {
		if(dest==null) {
			return null;
		}
		
		ModelRilevazione  modelRilevazione  = new ModelRilevazioneRilevazioneMapper().from(dest.getRilevazione());
		modelRilevazione.setId(dest.getId());
		modelRilevazione.setDataAggiornamento(new DateXMLGregorianCalendarMapper().from(dest.getDataAggiornamento()));
		modelRilevazione.setDataCreazione(new DateXMLGregorianCalendarMapper().from(dest.getDataCreazione()));			
																
								
		return modelRilevazione;
		
	}

}
 