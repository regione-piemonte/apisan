/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.business.integration.dao.dto.ApisanTCategoriaDocumentoDto;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoDocumento;

public class TipoDocumentoApisanTCategoriaDocumentoDtoMapper extends BaseMapper<TipoDocumento, ApisanTCategoriaDocumentoDto> {

	@Override
	public ApisanTCategoriaDocumentoDto to(TipoDocumento source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoDocumento from(ApisanTCategoriaDocumentoDto dest) {
		if(dest == null) {
			return null;
		}
		TipoDocumento source = new TipoDocumento();
		source.setCodice(dest.getCodiceDocumento());
		source.setDescrizione(dest.getDescrizioneDocumento());
		return source;
	}

}
