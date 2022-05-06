/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.PayloadDoloreNuovo;
import it.csi.dma.dmaclbluc.Dolore;

public class PayloadDoloreNuovoDoloreMapper extends BaseMapper<PayloadDoloreNuovo, Dolore>{

	@Override
	public Dolore to(PayloadDoloreNuovo source) {
		Dolore dolore = new Dolore();
	    dolore.setAreaInteressata(source.getAreaInteressata());
        dolore.setDataFine(new DateXMLGregorianCalendarMapper().to(source.getDataFine()));
        dolore.setDataInizio(new DateXMLGregorianCalendarMapper().to(source.getDataInizio()));
        dolore.setDescrizione(source.getDescrizione());
        dolore.setIntensitaDescrizione(source.getDescrizione());
        dolore.setIntensitaValore(new IntegerStringMapper().to(source.getIntensitaValore()));
        return dolore;
	}

	@Override
	public PayloadDoloreNuovo from(Dolore dest) {
		PayloadDoloreNuovo payloadDoloreNuovo = new PayloadDoloreNuovo();
		payloadDoloreNuovo.setAreaInteressata(dest.getAreaInteressata());
		payloadDoloreNuovo.setDataFine(new DateXMLGregorianCalendarMapper().from(dest.getDataFine()));
		payloadDoloreNuovo.setDataInizio(new DateXMLGregorianCalendarMapper().from(dest.getDataInizio()));
		payloadDoloreNuovo.setDescrizione(dest.getDescrizione());
		payloadDoloreNuovo.setDescrizione(dest.getIntensitaDescrizione());
		payloadDoloreNuovo.setIntensitaValore(new IntegerStringMapper().from(dest.getIntensitaValore()));
        return payloadDoloreNuovo;
	}

}
