/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale;

public class ModelDocumentoPersonaleMapper extends BaseMapper<ModelDocumentoPersonale, DocumentoPersonale> {

	@Override
	public DocumentoPersonale to(ModelDocumentoPersonale source) {
		if(source == null)
			return null;
		DocumentoPersonale documentoPersonale = new DocumentoPersonale();
		documentoPersonale.setAllegato(source.getAllegato());
		documentoPersonale.setDataOraAggiornamento(new DateXMLGregorianCalendarMapper().to(source.getDataOraAggiornamento()));
		documentoPersonale.setTipoAllegato(source.getTipoAllegato());
		documentoPersonale.setTrascrizione(source.getTrascrizione());
		
		return documentoPersonale;
	}

	@Override
	public ModelDocumentoPersonale from(DocumentoPersonale dest) {
		if(dest == null)
			return null;
		ModelDocumentoPersonale documentoPersonale = new ModelDocumentoPersonale();
		documentoPersonale.setAllegato(dest.getAllegato());
		documentoPersonale.setDataOraAggiornamento(new DateXMLGregorianCalendarMapper().from(dest.getDataOraAggiornamento()));
		documentoPersonale.setTipoAllegato(dest.getTipoAllegato());
		documentoPersonale.setTrascrizione(dest.getTrascrizione());
		
		return documentoPersonale;
	}

}
