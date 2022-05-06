/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.PayloadSintomoNuovo;
import it.csi.dma.dmaclbluc.Sintomo;

public class PayloadSintomoNuovoSintomoMapper extends BaseMapper<PayloadSintomoNuovo, Sintomo>{

	@Override
	public Sintomo to(PayloadSintomoNuovo source) {
		if(source == null) {
			return null;
		}
		Sintomo sintomo = new Sintomo();
		sintomo.setAreaInteressata(source.getAreaInteressata());
		sintomo.setDataFine(new DateXMLGregorianCalendarMapper().to(source.getDataFine()));
		sintomo.setDataInizio(new DateXMLGregorianCalendarMapper().to(source.getDataInizio()));
		sintomo.setDescrizione(source.getDescrizione());		
		return sintomo;
	}

	@Override
	public PayloadSintomoNuovo from(Sintomo dest) {
		if(dest == null) {
			return null;
		}
		PayloadSintomoNuovo payloadSintomoNuovo = new PayloadSintomoNuovo();
		payloadSintomoNuovo.setAreaInteressata(dest.getAreaInteressata());
		payloadSintomoNuovo.setDataFine(new DateXMLGregorianCalendarMapper().from(dest.getDataFine()));
		payloadSintomoNuovo.setDataInizio(new DateXMLGregorianCalendarMapper().from(dest.getDataInizio()));
		payloadSintomoNuovo.setDescrizione(dest.getDescrizione());		
		return payloadSintomoNuovo;
	}

}
