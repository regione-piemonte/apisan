/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelConsensoScreening;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Consenso;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.ModalitaDiAlimentazione;

public class ModelConsensoScreeningConsensoMapper extends BaseMapper<ModelConsensoScreening, Consenso>{

	@Override
	public Consenso to(ModelConsensoScreening source) {
		if(source == null) {
			return null;
		}
		
		Consenso consenso = new Consenso();
		consenso.setAblConsOpeAmm(new BooleanSiNoOscuramentoMapper().to(source.isAblConsOpeAmm()));		
		consenso.setAlimentaFse(new BooleanSiNoOscuramentoMapper().to(source.isAlimentaFse()));	
		consenso.setConsensoAllaCostituzioneDMA(new BooleanSiNoOscuramentoMapper().to(source.isConsensoAllaCostituzioneDma()));	
		consenso.setDataDiAggiornamento(new DateXMLGregorianCalendarMapper().to(source.getDataAggiornamento()));
		consenso.setDataDiValidazione(new DateXMLGregorianCalendarMapper().to(source.getDataValidazione()));		
		consenso.setDerogaEmergenza(new BooleanSiNoOscuramentoMapper().to(source.isDerogaEmergenza()));	
		if(source.getModalitaAlimentazione()!=null){
			ModalitaDiAlimentazione modalitaDiAlimentazione = new ModalitaDiAlimentazione();
			BeanUtils.copyProperties(source.getModalitaAlimentazione(), modalitaDiAlimentazione);	
			consenso.setModalitaDiAlimentazione(modalitaDiAlimentazione);
		}	
		consenso.setPregresso(new BooleanSiNoOscuramentoMapper().to(source.isPregresso()));	
					
		return consenso;
	}

	@Override
	public ModelConsensoScreening from(Consenso dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
