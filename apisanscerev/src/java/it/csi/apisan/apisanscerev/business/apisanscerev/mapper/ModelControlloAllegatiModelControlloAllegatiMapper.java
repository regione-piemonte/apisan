/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelControlloAllegati;

public class ModelControlloAllegatiModelControlloAllegatiMapper extends BaseMapper<ModelControlloAllegati, it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati to(ModelControlloAllegati source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati();
		dest.setAllegati(new ModelAllegatoTipoModelAllegatoTipoMapper().toList(source.getAllegati()));
		dest.setAssistenzaTemporaneaStranieri(source.isAssistenzaTemporaneaStranieri());
		return dest;
	}

	@Override
	public ModelControlloAllegati from(it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati dest) {
		if(dest == null) {
			return null;
		}
		ModelControlloAllegati source = new ModelControlloAllegati();
		source.setAllegati(new ModelAllegatoTipoModelAllegatoTipoMapper().fromList(dest.getAllegati()));
		source.setAssistenzaTemporaneaStranieri(dest.isAssistenzaTemporaneaStranieri());
		return source;
	}

}
