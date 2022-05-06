/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.EnteEmittente;
import it.csi.apisan.apisanfse.integration.esenzioni.dma.EnteEmittenteEsenzione;

public class EnteEmittenteEsenzioniMapper extends BaseMapper<EnteEmittente, EnteEmittenteEsenzione>{

	@Override
	public EnteEmittenteEsenzione to(EnteEmittente source) {
		if(source == null)
			return null;
		EnteEmittenteEsenzione enteEmittenteEsenzione = new EnteEmittenteEsenzione();
		enteEmittenteEsenzione.setCodice(source.getCodice());
		enteEmittenteEsenzione.setDescrizione(source.getDescrizione());
		enteEmittenteEsenzione.setRiferimento(source.getRiferimento());
		
		return enteEmittenteEsenzione;
	}

	@Override
	public EnteEmittente from(EnteEmittenteEsenzione dest) {
		if(dest == null)
			return null;
		EnteEmittente enteEmittente = new EnteEmittente();
		enteEmittente.setCodice(dest.getCodice());
		enteEmittente.setDescrizione(dest.getDescrizione());
		enteEmittente.setRiferimento(dest.getRiferimento());
		
		return enteEmittente;
	}

}
