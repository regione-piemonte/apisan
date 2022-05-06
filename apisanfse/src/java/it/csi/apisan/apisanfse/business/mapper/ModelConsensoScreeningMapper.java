/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelConsensoScreening;
import it.csi.apisan.apisanfse.integration.screening.dma.Consenso;

public class ModelConsensoScreeningMapper  extends BaseMapper<ModelConsensoScreening , Consenso>{

	@Override
	public Consenso to(ModelConsensoScreening source) {
		if(source == null)
			return null;
		Consenso consenso = new Consenso();
		
		consenso.setAblConsOpeAmm(new BooleanSiNoScreeningMapper().to(source.isAblConsOpeAmm()));
		consenso.setAlimentaFse(new BooleanSiNoScreeningMapper().to(source.isAlimentaFse()));
		consenso.setConsensoAllaCostituzioneDMA(new BooleanSiNoScreeningMapper().to(source.isConsensoAllaCostituzioneDma()));
		consenso.setDataDiAggiornamento(new DateXMLGregorianCalendarMapper().to(source.getDataAggiornamento()));
		consenso.setDataDiValidazione(new DateXMLGregorianCalendarMapper().to(source.getDataValidazione()));
		consenso.setDerogaEmergenza(new BooleanSiNoScreeningMapper().to(source.isDerogaEmergenza()));
		consenso.setModalitaDiAlimentazione(new ModalitaAlimentazioneScreeningMapper().to(source.getModalitaAlimentazione()));
		consenso.setPregresso(new BooleanSiNoScreeningMapper().to(source.isPregresso()));	
		
		return consenso;
		
	}

	@Override
	public ModelConsensoScreening from(Consenso dest) {
		if(dest == null)
			return null;
		ModelConsensoScreening modelConsensoScreening = new ModelConsensoScreening();		
		modelConsensoScreening.setAblConsOpeAmm(new BooleanSiNoScreeningMapper().from(dest.getAblConsOpeAmm()));
		modelConsensoScreening.setAlimentaFse(new BooleanSiNoScreeningMapper().from(dest.getAlimentaFse()));
		modelConsensoScreening.setConsensoAllaCostituzioneDma(new BooleanSiNoScreeningMapper().from(dest.getConsensoAllaCostituzioneDMA()));
		modelConsensoScreening.setDataAggiornamento(new DateXMLGregorianCalendarMapper().from(dest.getDataDiAggiornamento()));
		modelConsensoScreening.setDataValidazione(new DateXMLGregorianCalendarMapper().from(dest.getDataDiValidazione()));
		modelConsensoScreening.setDerogaEmergenza(new BooleanSiNoScreeningMapper().from(dest.getDerogaEmergenza()));
		modelConsensoScreening.setModalitaAlimentazione(new ModalitaAlimentazioneScreeningMapper().from(dest.getModalitaDiAlimentazione()));
		modelConsensoScreening.setPregresso(new BooleanSiNoScreeningMapper().from(dest.getPregresso()));		
		
		return modelConsensoScreening;
	}

	
}
