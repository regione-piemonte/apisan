/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;


import it.csi.apisan.apisantacc.dto.apisantacc.ModelSintomo;
import it.csi.dma.dmaclbluc.SintomoResponse;

public class ModelSintomoSintomoMapper extends BaseMapper<ModelSintomo, SintomoResponse> {

	@Override
	public SintomoResponse to(ModelSintomo source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelSintomo from(SintomoResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelSintomo source = new ModelSintomo();
		
		source.setId(dest.getId());	
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));		
		if(dest.getSintomo() != null) {		
			source.setDescrizione(dest.getSintomo().getDescrizione());
			source.setAreaInteressata(dest.getSintomo().getAreaInteressata());
			source.setDataInizio(m.from(dest.getSintomo().getDataInizio()));
			source.setDataFine(m.from(dest.getSintomo().getDataFine()));
		}
		return source;
	}

}
