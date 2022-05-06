/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelDocumentoDettaglio;
import it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleOutParametersType;

public class ModelDocumentoDettaglioGetDettaglioDocumentoDigitaleOutParametersTypeMapper extends BaseMapper<ModelDocumentoDettaglio, GetDettaglioDocumentoDigitaleOutParametersType> {

	@Override
	public GetDettaglioDocumentoDigitaleOutParametersType to(ModelDocumentoDettaglio source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDocumentoDettaglio from(GetDettaglioDocumentoDigitaleOutParametersType dest) {
		if(dest == null) {
			return null;
		}
		ModelDocumentoDettaglio source = new ModelDocumentoDettaglio();
		//source.setLetto(dest.getPLetto());
		source.setNomeFile(dest.getPNomeFile());
		source.setBase64(new String(dest.getPFile()));
		source.setLetto(dest.getPLetto() != null && dest.getPLetto().equalsIgnoreCase("SI"));
		return source;
	}

}
