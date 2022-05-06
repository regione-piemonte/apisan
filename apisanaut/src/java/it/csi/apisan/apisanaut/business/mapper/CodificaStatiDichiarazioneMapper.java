/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.Codifica;
import it.csi.deleghe.deleghebe.ws.model.StatoDichiarazione;

public class CodificaStatiDichiarazioneMapper extends BaseMapper<Codifica, StatoDichiarazione> {

	@Override
	public StatoDichiarazione to(Codifica source) {
		if(source == null) {
			return null;
		}
		StatoDichiarazione dest = new StatoDichiarazione();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public Codifica from(StatoDichiarazione dest) {
		if(dest == null) {
			return null;
		}
		Codifica source = new Codifica();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
