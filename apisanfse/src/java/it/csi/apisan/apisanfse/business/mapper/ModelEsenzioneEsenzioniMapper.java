/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsenzioneEsenzioni;
import it.csi.apisan.apisanfse.integration.esenzioni.dma.Esenzione;

public class ModelEsenzioneEsenzioniMapper extends BaseMapper<ModelEsenzioneEsenzioni, Esenzione>{

	@Override
	public Esenzione to(ModelEsenzioneEsenzioni source) {
		if(source == null) {
			return null;
		}
		Esenzione esenzione = new Esenzione();
		esenzione.setCodice(source.getCodice());
		esenzione.setCodiceAttestato(source.getCodiceAttestato());
		esenzione.setDataEmissione(new DateXMLGregorianCalendarMapper().to(source.getDataEmissione()));
		esenzione.setDataScadenza(new DateXMLGregorianCalendarMapper().to(source.getDataScadenza()));
		esenzione.setDescrizione(source.getDescrizione());
		esenzione.setDiagnosi(new DiagnosiEmittenteMapper().to(source.getDiagnosi()));
		esenzione.setEnteEmittente(new EnteEmittenteEsenzioniMapper().to(source.getEnteEmittente()));
		esenzione.setOscurato(source.getOscurato());
		esenzione.setRiferimento(source.getRiferimento());		
		
		return esenzione;
	}

	@Override
	public ModelEsenzioneEsenzioni from(Esenzione dest) {
		if(dest == null) {
			return null;
		}
		ModelEsenzioneEsenzioni modelEsenzioneEsenzioni = new ModelEsenzioneEsenzioni();
		modelEsenzioneEsenzioni.setCodice(dest.getCodice());
		modelEsenzioneEsenzioni.setCodiceAttestato(dest.getCodiceAttestato());
		modelEsenzioneEsenzioni.setDataEmissione(new DateXMLGregorianCalendarMapper().from(dest.getDataEmissione()));
		modelEsenzioneEsenzioni.setDataScadenza(new DateXMLGregorianCalendarMapper().from(dest.getDataScadenza()));
		modelEsenzioneEsenzioni.setDescrizione(dest.getDescrizione());
		modelEsenzioneEsenzioni.setDiagnosi(new DiagnosiEmittenteMapper().from(dest.getDiagnosi()));
		modelEsenzioneEsenzioni.setEnteEmittente(new EnteEmittenteEsenzioniMapper().from(dest.getEnteEmittente()));
		modelEsenzioneEsenzioni.setOscurato(dest.getOscurato());
		modelEsenzioneEsenzioni.setRiferimento(dest.getRiferimento());
		
		return modelEsenzioneEsenzioni;
	}

}
