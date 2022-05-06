/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDocumentoLettura;

public class ModelDocumentoLetturaModelDocumentoLetturaMapper extends BaseMapper<ModelDocumentoLettura, it.csi.apisan.apisanscerev.dto.scerev.ModelDocumentoLettura> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelDocumentoLettura to(ModelDocumentoLettura source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelDocumentoLettura dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelDocumentoLettura();
		dest.setDescrizione(source.getDescrizione());
		dest.setNomeFile(dest.getNomeFile());
		dest.setTipo(source.getTipo());
		dest.setId(source.getId());
		return dest;
	}

	@Override
	public ModelDocumentoLettura from(it.csi.apisan.apisanscerev.dto.scerev.ModelDocumentoLettura dest) {
		if(dest == null) {
			return null;
		}
		ModelDocumentoLettura source = new ModelDocumentoLettura();
		source.setDescrizione(dest.getDescrizione());
		source.setNomeFile(dest.getNomeFile());
		source.setTipo(dest.getTipo());
		source.setId(dest.getId());
		return source;
	}

}
