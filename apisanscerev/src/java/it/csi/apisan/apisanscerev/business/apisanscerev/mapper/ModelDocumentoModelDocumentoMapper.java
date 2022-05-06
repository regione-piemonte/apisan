/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDocumento;

public class ModelDocumentoModelDocumentoMapper extends BaseMapper<ModelDocumento, it.csi.apisan.apisanscerev.dto.scerev.ModelDocumento> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelDocumento to(ModelDocumento source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelDocumento dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelDocumento();
		dest.setBase64(source.getBase64());
		dest.setDescrizione(source.getDescrizione());
		dest.setNomeFile(source.getNomeFile());
		dest.setStranieri(source.isStranieri());
		dest.setTipo(source.getTipo());
		return dest;
		
	}

	@Override
	public ModelDocumento from(it.csi.apisan.apisanscerev.dto.scerev.ModelDocumento dest) {
		if(dest == null) {
			return null;
		}
		ModelDocumento source = new ModelDocumento();
		source.setBase64(dest.getBase64());
		source.setDescrizione(dest.getDescrizione());
		source.setNomeFile(dest.getNomeFile());
		source.setStranieri(dest.isStranieri());
		source.setTipo(dest.getTipo());
		return source;
	}

}
