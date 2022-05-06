/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.integration.documenti.dma.Errore;


public class CodificaErroreMapper extends BaseMapper<Codifica, Errore> {

	@Override
	public Errore to(Codifica source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Codifica from(Errore dest) {
		if(dest == null) {
			return null;
		}
		Codifica source = new Codifica();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setRiferimento(dest.getRiferimento());
		return source;
	}

}
