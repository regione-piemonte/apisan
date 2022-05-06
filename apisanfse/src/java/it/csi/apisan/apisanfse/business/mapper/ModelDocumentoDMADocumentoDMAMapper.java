/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoDma;
import it.csi.apisan.apisanfse.integration.documenti.dma.SiNo;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.DocumentoDMA;

public class ModelDocumentoDMADocumentoDMAMapper extends BaseMapper<ModelDocumentoDma, DocumentoDMA> {

	@Override
	public DocumentoDMA to(ModelDocumentoDma source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDocumentoDma from(DocumentoDMA dest) {
		if(dest == null) {
			return null;
		}
		ModelDocumentoDma source = new ModelDocumentoDma();
		source.setAccessionNumber(dest.getAccessionNumber());
		source.setCodiceEpisodioDipartimentale(dest.getCodiceEpisodioDipartimentale());
		source.setCodicePazienteDipartimentale(dest.getCodicePazienteDipartimentale());
		source.setDocumento(dest.getDocumento());
		if(dest.getFirmatoDigitalmente() != null) {
			source.setFirmatoDigitalmente((dest.getFirmatoDigitalmente() != null && dest.getFirmatoDigitalmente().equals(SiNo.SI) ));
		}
		source.setIdDipartimentale(dest.getIdDipartimentale());
		source.setIdDocumento(dest.getIdDocumento());
		source.setIdEpisodio(dest.getIdEpisodio());
		source.setLinkImmagini(new ModelLinkImmagineLinkImmagineMapper().fromList(dest.getLinkImmagini()));
		source.setLinkImmaginiStazioniRefertanti(new ModelLinkImmagineRefertanteLinkImmagineStazioneRefertanteMapper().fromList(dest.getLinkImmaginiStazioneRefertante()) );
		source.setListaNre(dest.getListaNre());
		source.setOscurato(dest.getOscurato());
		
		return source;
	}

}
