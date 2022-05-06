/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.RispostaServizio;

public class RispostaServizioRispostaServizioMapper extends BaseMapper<RispostaServizio, it.csi.apisan.apisanpag.dto.ptw.RispostaServizio> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.RispostaServizio to(RispostaServizio source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.RispostaServizio dest = new it.csi.apisan.apisanpag.dto.ptw.RispostaServizio();
		dest.setCodice(source.getCodice());
		dest.setMessaggio(source.getMessaggio());
		return dest;
	}

	@Override
	public RispostaServizio from(it.csi.apisan.apisanpag.dto.ptw.RispostaServizio dest) {
		if(dest == null) {
			return null;
		}
		RispostaServizio source = new RispostaServizio();
		source.setCodice(dest.getCodice());
		source.setMessaggio(dest.getMessaggio());
		return source;
	}

}
