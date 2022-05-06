/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelStatoRichiesta;
import it.csi.apisan.apisanfse.integration.scaricostudi.StatoRichiesta;

public class ModelStatoRichiestaStatoRichiestaEnumMapper extends BaseMapper<ModelStatoRichiesta, StatoRichiesta> {

	@Override
	public StatoRichiesta to(ModelStatoRichiesta source) {
		// TODO Auto-generated method stub
		if(source == null) {
			return null;
		}
		return StatoRichiesta.valueOf(source.name());
	}

	@Override
	public ModelStatoRichiesta from(StatoRichiesta dest) {
		// TODO Auto-generated method stub
		if(dest == null) {
			return null;
		}
		return ModelStatoRichiesta.valueOf(dest.name());
	}

	

}
