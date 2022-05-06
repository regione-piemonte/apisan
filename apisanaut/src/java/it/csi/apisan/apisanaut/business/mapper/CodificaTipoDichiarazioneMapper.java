/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.Codifica;
import it.csi.deleghe.deleghebe.ws.model.TipoDichiarazione;

public class CodificaTipoDichiarazioneMapper extends BaseMapper<Codifica, TipoDichiarazione> {

	@Override
	public TipoDichiarazione to(Codifica source) {
		if(source == null) {
			return null;
		}
		TipoDichiarazione dest = new TipoDichiarazione();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		return dest;
		
	}

	@Override
	public Codifica from(TipoDichiarazione dest) {
		if(dest == null) {
			return null;
		}
		Codifica source = new Codifica();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
