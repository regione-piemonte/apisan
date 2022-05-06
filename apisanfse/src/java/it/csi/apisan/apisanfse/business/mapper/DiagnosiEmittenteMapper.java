/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Diagnosi;
import it.csi.apisan.apisanfse.integration.esenzioni.dma.DiagnosiEsenzione;

public class DiagnosiEmittenteMapper extends BaseMapper<Diagnosi, DiagnosiEsenzione>{

	@Override
	public DiagnosiEsenzione to(Diagnosi source) {
		if(source == null)
			return null;
		DiagnosiEsenzione diagnosiEsenzione = new DiagnosiEsenzione();
		diagnosiEsenzione.setCodice(source.getCodice());
		diagnosiEsenzione.setDescrizione(source.getDescrizione());
		diagnosiEsenzione.setRiferimento(source.getRiferimento());
		return diagnosiEsenzione;
	}

	@Override
	public Diagnosi from(DiagnosiEsenzione dest) {
		if(dest == null)
			return null;
		Diagnosi diagnosi = new Diagnosi();
		diagnosi.setCodice(dest.getCodice());
		diagnosi.setDescrizione(dest.getDescrizione());
		diagnosi.setRiferimento(dest.getRiferimento());
		return diagnosi;
	}

}
