/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;

public class ModelCittadinanzaModelCittadinanzaMapper extends BaseMapper<ModelCittadinanza, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza to(ModelCittadinanza source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza();
		dest.setDescrizione(source.getDescrizione());
		dest.setId(source.getId());
		dest.setComunitario(source.isComunitario());
		return dest;
	}

	@Override
	public ModelCittadinanza from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza dest) {
		if(dest == null) {
			return null;
		}
		ModelCittadinanza source = new ModelCittadinanza();
		source.setDescrizione(dest.getDescrizione());
		source.setId(dest.getId());
		source.setComunitario(dest.isComunitario());
		return source;
	}

}
