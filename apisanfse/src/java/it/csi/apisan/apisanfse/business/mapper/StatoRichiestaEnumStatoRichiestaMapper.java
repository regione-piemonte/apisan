/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Referto.StatoRichiestaEnum;
import it.csi.apisan.apisanfse.integration.scaricostudi.StatoRichiesta;

public class StatoRichiestaEnumStatoRichiestaMapper extends BaseMapper<StatoRichiestaEnum, StatoRichiesta> {

	@Override
	public StatoRichiesta to(StatoRichiestaEnum source) {
		// TODO Auto-generated method stub
		if(source == null) {
			return null;
		}
		return StatoRichiesta.valueOf(source.name());
	}

	@Override
	public StatoRichiestaEnum from(StatoRichiesta dest) {
		// TODO Auto-generated method stub
		if(dest == null) {
			return null;
		}
		return StatoRichiestaEnum.valueOf(dest.name());
	}

}
