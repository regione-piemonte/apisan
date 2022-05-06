/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.StatoDiNascita;

public class StatoDiNascitaScreeningMapper extends BaseMapper<StatoDiNascita, it.csi.apisan.apisanfse.integration.screening.dma.StatoDiNascita> {

	@Override
	public it.csi.apisan.apisanfse.integration.screening.dma.StatoDiNascita to(StatoDiNascita source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.screening.dma.StatoDiNascita result = new it.csi.apisan.apisanfse.integration.screening.dma.StatoDiNascita();
		result.setCodice(source.getCodice());
		result.setDescrizione(source.getDescrizione());
		result.setRiferimento(source.getRiferimento());
		return result;
	}

	@Override
	public StatoDiNascita from(it.csi.apisan.apisanfse.integration.screening.dma.StatoDiNascita dest) {
		if(dest==null) {
			return null;
		}
		StatoDiNascita result = new StatoDiNascita();
		result.setCodice(dest.getCodice());
		result.setDescrizione(dest.getDescrizione());
		result.setRiferimento(dest.getRiferimento());
		return result;
	}

}
