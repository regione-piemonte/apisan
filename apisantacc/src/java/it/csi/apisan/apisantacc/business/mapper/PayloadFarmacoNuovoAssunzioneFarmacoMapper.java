/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.PayloadFarmacoNuovo;
import it.csi.dma.dmaclbluc.AssunzioneFarmaco;

public class PayloadFarmacoNuovoAssunzioneFarmacoMapper extends BaseMapper<PayloadFarmacoNuovo, AssunzioneFarmaco>{

	@Override
	public AssunzioneFarmaco to(PayloadFarmacoNuovo source) {

		if(source == null) {
			return null;
		}
		
		AssunzioneFarmaco assunzioneFarmaco = new AssunzioneFarmaco();		
		assunzioneFarmaco.setDataAssunzione(new DateXMLGregorianCalendarMapper().to(source.getDataAssunzione()));
		assunzioneFarmaco.setFarmaco(source.getFarmaco());
		assunzioneFarmaco.setQuantita(source.getQuantita());
		
		
		return assunzioneFarmaco;
	}

	@Override
	public PayloadFarmacoNuovo from(AssunzioneFarmaco dest) {
		if(dest == null) {
			return null;
		}
		
		PayloadFarmacoNuovo payloadFarmacoNuovo = new PayloadFarmacoNuovo();
		payloadFarmacoNuovo.setDataAssunzione(new DateXMLGregorianCalendarMapper().from(dest.getDataAssunzione()));
		payloadFarmacoNuovo.setFarmaco(dest.getFarmaco());
		payloadFarmacoNuovo.setQuantita(dest.getQuantita());
		return payloadFarmacoNuovo;
	}

}
