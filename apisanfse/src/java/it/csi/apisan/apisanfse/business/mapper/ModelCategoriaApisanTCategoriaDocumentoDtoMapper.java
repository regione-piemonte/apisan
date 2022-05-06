/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.business.integration.dao.dto.ApisanTCategoriaDocumentoDto;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoria;

public class ModelCategoriaApisanTCategoriaDocumentoDtoMapper extends BaseMapper<ModelCategoria, ApisanTCategoriaDocumentoDto> {

	@Override
	public ApisanTCategoriaDocumentoDto to(ModelCategoria source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelCategoria from(ApisanTCategoriaDocumentoDto dest) {
		if(dest == null) {
			return null;
		}
		ModelCategoria source = new ModelCategoria();
		source.setCodice(dest.getCodiceCategoria());
		source.setDescrizione(dest.getDescrizioneCategoria());
		
		return source;
	}

}
