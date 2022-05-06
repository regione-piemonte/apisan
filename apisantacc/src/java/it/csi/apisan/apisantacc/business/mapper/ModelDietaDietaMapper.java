/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelDieta;
import it.csi.dma.dmaclbluc.DietaResponse;

public class ModelDietaDietaMapper extends BaseMapper<ModelDieta, DietaResponse> {

	@Override
	public DietaResponse to(ModelDieta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDieta from(DietaResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelDieta source = new ModelDieta();
		
		source.setId(dest.getId());	
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));
		
		if(dest.getDieta() != null) {
			source.setData(m.from(dest.getDieta().getData()));
			source.setColazioneDescrizione(dest.getDieta().getColazioneDescrizione());
			source.setColazioneCalorie(dest.getDieta().getColazioneCalorie());
			source.setPranzoDescrizione(dest.getDieta().getPranzoDescrizione());
			source.setPranzoCalorie(dest.getDieta().getPranzoCalorie());
			source.setCenaDescrizione(dest.getDieta().getCenaDescrizione());
			source.setCenaCalorie(dest.getDieta().getCenaCalorie());
			source.setSpuntiniDescrizione(dest.getDieta().getSpuntiniDescrizione());
			source.setSpuntiniCalorie(dest.getDieta().getSpuntiniCalorie());
		}
		return source;
	}

}
