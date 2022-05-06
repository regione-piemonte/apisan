/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoInfoMedico;

public class ModelCittadinoInfoMedicoModelCittadinoInfoMedicoMapper extends BaseMapper<ModelCittadinoInfoMedico, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfoMedico> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfoMedico to(ModelCittadinoInfoMedico source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfoMedico dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfoMedico();
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setId(source.getId());
		return dest;
	}

	@Override
	public ModelCittadinoInfoMedico from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfoMedico dest) {
		if(dest == null) {
			return null;
		}
		ModelCittadinoInfoMedico source = new ModelCittadinoInfoMedico();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setId(dest.getId());
		return source;
	}

}
