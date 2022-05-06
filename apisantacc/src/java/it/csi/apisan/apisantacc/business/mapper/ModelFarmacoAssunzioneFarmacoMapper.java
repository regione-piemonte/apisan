/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;


import it.csi.apisan.apisantacc.dto.apisantacc.ModelFarmaco;
import it.csi.dma.dmaclbluc.AssunzioneFarmacoResponse;

public class ModelFarmacoAssunzioneFarmacoMapper extends BaseMapper<ModelFarmaco, AssunzioneFarmacoResponse> {

	@Override
	public AssunzioneFarmacoResponse to(ModelFarmaco source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelFarmaco from(AssunzioneFarmacoResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelFarmaco source = new ModelFarmaco();
		
		source.setId(dest.getId());	
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));		
		if(dest.getAssunzioneFarmaco() != null) {		
			source.setFarmaco(dest.getAssunzioneFarmaco().getFarmaco());
			source.setDataAssunzione(m.from(dest.getAssunzioneFarmaco().getDataAssunzione()));
			source.setQuantita(dest.getAssunzioneFarmaco().getQuantita());
		}
		return source;
	}

}
