/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentoResponse;

public class ModelDocumentoResponseGetDocumentoResponseMapper extends BaseMapper<ModelDocumentoResponse, GetDocumentoResponse> {

	@Override
	public GetDocumentoResponse to(ModelDocumentoResponse source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDocumentoResponse from(GetDocumentoResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelDocumentoResponse source = new ModelDocumentoResponse();
		source.setAuthDocumentoDipaertimentale(dest.getAuthDocumentoDipartimentale());
		source.setComponenteLocaleRisposta(new ModelComponenteLocaleComponenteLocaleMapper().from(dest.getComponenteLocaleRisposta()));
		source.setDocumento(new ModelDocumentoDMADocumentoDMAMapper().from(dest.getDocumento()));
		source.setDocumentoSuDipartimentale(dest.getDocumentoSuDipartimentale());
		source.setUrlDocumentoDipartimentale(dest.getUrlDocumentoDipartimentale());
		return source;
	}

}
