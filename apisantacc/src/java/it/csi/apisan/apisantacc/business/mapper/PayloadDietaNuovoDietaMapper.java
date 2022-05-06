/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.PayloadDietaNuovo;
import it.csi.dma.dmaclbluc.Dieta;

public class PayloadDietaNuovoDietaMapper extends BaseMapper<PayloadDietaNuovo, Dieta>{

	@Override
	public Dieta to(PayloadDietaNuovo source) {
		if(source == null) {
			return null;
		}
		Dieta dieta = new Dieta();
		dieta.setCenaCalorie(source.getCenaCalorie());
		dieta.setCenaDescrizione(source.getCenaDescrizione());
		dieta.setColazioneCalorie(source.getColazioneCalorie());
		dieta.setColazioneDescrizione(source.getColazioneDescrizione());
		dieta.setData(new DateXMLGregorianCalendarMapper().to(source.getData()));
		dieta.setPranzoCalorie(source.getPranzoCalorie());
		dieta.setPranzoDescrizione(source.getPranzoDescrizione());		
		dieta.setSpuntiniCalorie(source.getSpuntiniCalorie());
		dieta.setSpuntiniDescrizione(source.getSpuntiniDescrizione());
		return dieta;
	}

	@Override
	public PayloadDietaNuovo from(Dieta dest) {
		if(dest == null) {
			return null;
		}
		PayloadDietaNuovo payloadDietaNuovo = new PayloadDietaNuovo();
		payloadDietaNuovo.setCenaCalorie(dest.getCenaCalorie());
		payloadDietaNuovo.setCenaDescrizione(dest.getCenaDescrizione());
		payloadDietaNuovo.setColazioneCalorie(dest.getColazioneCalorie());
		payloadDietaNuovo.setColazioneDescrizione(dest.getColazioneDescrizione());
		payloadDietaNuovo.setData(new DateXMLGregorianCalendarMapper().from(dest.getData()));
		payloadDietaNuovo.setPranzoCalorie(dest.getPranzoCalorie());
		payloadDietaNuovo.setPranzoDescrizione(dest.getPranzoDescrizione());		
		payloadDietaNuovo.setSpuntiniCalorie(dest.getSpuntiniCalorie());
		payloadDietaNuovo.setSpuntiniDescrizione(dest.getSpuntiniDescrizione());
		return payloadDietaNuovo;
	}

}
