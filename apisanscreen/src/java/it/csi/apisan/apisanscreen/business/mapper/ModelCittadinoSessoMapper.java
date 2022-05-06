/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadinoSesso;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadinoSesso.CodiceInternoPrefissoEnum;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadinoSesso.SessoEnum;
import it.csi.screenserviziwebsol.VerificaAssistitaOutParametersType;

public class ModelCittadinoSessoMapper extends BaseMapper<ModelCittadinoSesso, VerificaAssistitaOutParametersType> {

	@Override
	public VerificaAssistitaOutParametersType to(ModelCittadinoSesso source) {

		// NON NECESSARIO
		return null;

	}

	@Override
	public ModelCittadinoSesso from(VerificaAssistitaOutParametersType dest) {
		if (dest == null) {
			return null;
		}

		ModelCittadinoSesso result = new ModelCittadinoSesso();

		result.setCodiceInterno(dest.getPCodIdInterno());

		if (dest.getPPrefIdInterno() != null && !dest.getPPrefIdInterno().isEmpty()) {
			CodiceInternoPrefissoEnum sEnum = CodiceInternoPrefissoEnum.valueOf(dest.getPPrefIdInterno());
			result.setCodiceInternoPrefisso(sEnum);
		}

		if (dest.getPIndSesso() != null && !dest.getPIndSesso().isEmpty()) {
			SessoEnum sEnum = SessoEnum.valueOf(dest.getPIndSesso());
			result.setSesso(sEnum);
		}
		return result;
	}

}
