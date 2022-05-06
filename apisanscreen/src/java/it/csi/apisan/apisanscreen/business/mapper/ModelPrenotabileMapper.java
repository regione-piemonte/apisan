/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelPrenotabile;
import it.csi.screenserviziwebsol.CheckEtaScreeningOutParametersType;

public class ModelPrenotabileMapper extends BaseMapper<ModelPrenotabile, CheckEtaScreeningOutParametersType> {

	@Override
	public CheckEtaScreeningOutParametersType to(ModelPrenotabile source) {

		// NON NECESSARIO
		return null;

	}

	@Override
	public ModelPrenotabile from(CheckEtaScreeningOutParametersType dest) {
		if (dest == null) {
			return null;
		}

		ModelPrenotabile result = new ModelPrenotabile();
		result.setPrenotabile(dest.getFlag() == 1);
		return result;
	}

}
