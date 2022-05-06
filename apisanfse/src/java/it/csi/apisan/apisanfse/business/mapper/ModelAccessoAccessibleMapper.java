/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Accessible;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelAccesso;
import it.csi.apisan.apisanfse.integration.paziente.dma.Codifica;
import it.csi.apisan.apisanfse.integration.paziente.dma.RegimeDMA;
import it.csi.apisan.apisanfse.integration.paziente.dma.RuoloDMA;

public class ModelAccessoAccessibleMapper<T extends Codifica> extends BaseMapper<ModelAccesso, Accessible<T>> {

	@Override
	public Accessible to(ModelAccesso source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAccesso from(Accessible dest) {
		if(dest == null) {
			return null;
		}
		ModelAccesso source = new ModelAccesso();
		//source.setAziendaSanitaria(new AziendaSanitariaAziendaSanitariaMapper().from(dest.getA));
		source.setApplicazioneVerticale(dest.getApplicazioneVerticale());
		source.setCodiceFiscaleOperatore(dest.getCodiceFiscaleOperatore());
		source.setCognomeOperatore(dest.getCognomeOperatore());
		source.setCollocazione(dest.getCollocazione());
		source.setDataAccesso(new DateXMLGregorianCalendarMapper().from(dest.getDataAccesso()));
		source.setDescrizione(dest.getDescrizione());
		source.setIdAccesso(dest.getIdAccesso());
		source.setNomeOperatore(dest.getNomeOperatore());
		
		source.setRegime( new ModelCodificaCodificaPersonaleMapper<RegimeDMA>().from(dest.getRegime()));
		source.setRuolo(  new ModelCodificaCodificaPersonaleMapper<RuoloDMA>().from(dest.getRuolo())) ;
		source.setTipoAccesso( new ModelCodificaCodificaPersonaleMapper().from(dest.getTipoOperazione())  );
		
		return source;
	}

}
