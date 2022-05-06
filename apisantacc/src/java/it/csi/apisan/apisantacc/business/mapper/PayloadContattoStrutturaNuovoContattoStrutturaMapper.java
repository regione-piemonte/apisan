/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.PayloadContattoStrutturaNuovo;
import it.csi.dma.dmaclbluc.ContattoStruttura;
import it.csi.dma.dmaclbluc.TipologiaContatto;
import it.csi.dma.dmaclbluc.TipologiaStruttura;

public class PayloadContattoStrutturaNuovoContattoStrutturaMapper extends BaseMapper<PayloadContattoStrutturaNuovo, ContattoStruttura>{

	@Override
	public ContattoStruttura to(PayloadContattoStrutturaNuovo source) {
		if(source == null) {
			return null;
		}
		ContattoStruttura contattoStruttura = new ContattoStruttura();
		contattoStruttura.setDataFineContatto(new DateXMLGregorianCalendarMapper().to(source.getDataContattoFine()));
		contattoStruttura.setDataInizioContatto(new DateXMLGregorianCalendarMapper().to(source.getDataContattoInizio()));
		contattoStruttura.setDenominazioneStruttura(source.getDenominazione());
		contattoStruttura.setMotivazioneContatto(source.getMotivazione());		
		contattoStruttura.setTipoContattoMedNonConvenz(source.getMedicinaNonConvenzionaleTipoContatto());
		TipologiaContatto tipologiaContatto = new TipologiaContatto();
		tipologiaContatto.setCodice(new StringEnumMapper<it.csi.dma.dmaclbluc.ContattoTipoCodice>(it.csi.dma.dmaclbluc.ContattoTipoCodice.class).from(source.getTipoContattoCodice()));
		contattoStruttura.setTipologiaContatto(tipologiaContatto);
		TipologiaStruttura tipologiaStruttura = new TipologiaStruttura();				
		tipologiaStruttura.setCodice(new StringEnumMapper<it.csi.dma.dmaclbluc.StrutturaTipoCodice>(it.csi.dma.dmaclbluc.StrutturaTipoCodice.class).from(source.getStrutturaTipoCodice()));		
		contattoStruttura.setTipologiaStruttura(tipologiaStruttura);
		
		return contattoStruttura;
	}

	@Override
	public PayloadContattoStrutturaNuovo from(ContattoStruttura dest) {
		if(dest == null) {
			return null;
		}
		PayloadContattoStrutturaNuovo payloadContattoStrutturaNuovo = new PayloadContattoStrutturaNuovo();
		payloadContattoStrutturaNuovo.setDataContattoFine(new DateXMLGregorianCalendarMapper().from(dest.getDataFineContatto()));
		payloadContattoStrutturaNuovo.setDataContattoInizio(new DateXMLGregorianCalendarMapper().from(dest.getDataInizioContatto()));
		payloadContattoStrutturaNuovo.setDenominazione(dest.getDenominazioneStruttura());
		payloadContattoStrutturaNuovo.setMotivazione(dest.getMotivazioneContatto());		
		payloadContattoStrutturaNuovo.setMedicinaNonConvenzionaleTipoContatto(dest.getTipoContattoMedNonConvenz());
		if(dest.getTipologiaContatto()!=null) {
			payloadContattoStrutturaNuovo.setTipoContattoCodice(new StringEnumMapper<it.csi.dma.dmaclbluc.ContattoTipoCodice>(it.csi.dma.dmaclbluc.ContattoTipoCodice.class).to(dest.getTipologiaContatto().getCodice()));
		}
		if(dest.getTipologiaStruttura()!=null) {		
			payloadContattoStrutturaNuovo.setStrutturaTipoCodice(new StringEnumMapper<it.csi.dma.dmaclbluc.StrutturaTipoCodice>(it.csi.dma.dmaclbluc.StrutturaTipoCodice.class).to(dest.getTipologiaStruttura().getCodice()));
		}
		
		return payloadContattoStrutturaNuovo;
	}

}
