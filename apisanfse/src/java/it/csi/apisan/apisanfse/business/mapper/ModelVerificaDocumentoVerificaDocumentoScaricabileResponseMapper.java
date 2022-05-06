/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.VerificaDocumentoScaricabileResponse;

public class ModelVerificaDocumentoVerificaDocumentoScaricabileResponseMapper extends BaseMapper<ModelVerificaDocumento, VerificaDocumentoScaricabileResponse> {

	@Override
	public VerificaDocumentoScaricabileResponse to(ModelVerificaDocumento source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelVerificaDocumento from(VerificaDocumentoScaricabileResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelVerificaDocumento source = new ModelVerificaDocumento();
		source.setCodiceAzione(dest.getCodiceAzione());
		source.setCodiceCl(dest.getCodiceCL());
		source.setCodiceEpisodio(dest.getCodiceEpisodio());
		source.setIdDocumentoIlec(dest.getCodiceDocumentoIlec());
		
		return source;
	}

}
