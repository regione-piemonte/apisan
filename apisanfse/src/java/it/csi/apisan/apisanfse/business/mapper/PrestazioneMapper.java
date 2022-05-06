/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Branca;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Prestazione;

public class PrestazioneMapper extends BaseMapper<it.csi.apisan.apisanfse.dto.apisanfse.Prestazione,it.csi.apisan.apisanfse.integration.documenti.dmacc.Prestazione>{

	@Override
	public Prestazione to(it.csi.apisan.apisanfse.dto.apisanfse.Prestazione source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.documenti.dmacc.Prestazione modelPrestazione = new it.csi.apisan.apisanfse.integration.documenti.dmacc.Prestazione();
		modelPrestazione.setDataOra(new DateXMLGregorianCalendarMapper().to(source.getDataOra()));
		modelPrestazione.setIdPrestazione(source.getIdPrestazione());
		
		modelPrestazione.setBranca(new BrancaDocumentiBrancaMapper().to(source.getBranca()));

		return modelPrestazione;
	}

	@Override
	public it.csi.apisan.apisanfse.dto.apisanfse.Prestazione from(Prestazione dest) {
		if(dest==null) {
			return null;
		}
		it.csi.apisan.apisanfse.dto.apisanfse.Prestazione modelPrestazione = new it.csi.apisan.apisanfse.dto.apisanfse.Prestazione();
		modelPrestazione.setDataOra(new DateXMLGregorianCalendarMapper().from(dest.getDataOra()));
		modelPrestazione.setIdPrestazione(dest.getIdPrestazione());
		modelPrestazione.setBranca(new BrancaDocumentiBrancaMapper().from(dest.getBranca()));
		return modelPrestazione;
	}

}
