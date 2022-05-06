/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAllegatoTipo;

public class ModelAllegatoTipoModelAllegatoTipoMapper extends BaseMapper<ModelAllegatoTipo, it.csi.apisan.apisanscerev.dto.scerev.ModelAllegatoTipo> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelAllegatoTipo to(ModelAllegatoTipo source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelAllegatoTipo dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelAllegatoTipo();
		dest.setDescrizione(source.getDescrizione());
		dest.setTipo(source.getTipo());
		dest.setStranieri(source.isStranieri());
		return dest;
	}

	@Override
	public ModelAllegatoTipo from(it.csi.apisan.apisanscerev.dto.scerev.ModelAllegatoTipo dest) {
		if(dest == null) {
			return null;
		}
		ModelAllegatoTipo source = new ModelAllegatoTipo();
		source.setDescrizione(dest.getDescrizione());
		source.setStranieri(dest.isStranieri());
		source.setTipo(dest.getTipo());
		return source;
	}

}
