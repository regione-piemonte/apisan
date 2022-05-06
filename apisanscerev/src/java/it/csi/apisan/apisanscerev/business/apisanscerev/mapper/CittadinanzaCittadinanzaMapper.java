/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;

public class CittadinanzaCittadinanzaMapper extends BaseMapper<ModelCittadinanza, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza to(ModelCittadinanza source) {
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza();
		dest.setId(source.getId());
		dest.setDescrizione(source.getDescrizione());
		dest.setComunitario(source.isComunitario());
		return dest;
	}

	@Override
	public ModelCittadinanza from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza dest) {
		ModelCittadinanza source = new ModelCittadinanza();
		source.setId(dest.getId());
		source.setDescrizione(dest.getDescrizione());
		source.setComunitario(dest.isComunitario());
		return source;
	}

}
