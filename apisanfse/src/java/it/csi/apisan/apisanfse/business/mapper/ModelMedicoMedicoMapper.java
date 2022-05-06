/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelMedico;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Medico;

public class ModelMedicoMedicoMapper extends BaseMapper<ModelMedico, Medico> {

	@Override
	public Medico to(ModelMedico source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelMedico from(Medico dest) {
		if(dest == null) {
			return null;
		}
		ModelMedico source = new ModelMedico();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCognome(dest.getCognome());
		source.setNome(dest.getCognome());
		source.setTipoMedico(dest.getTipoMedico());
		return source;
	}

}
