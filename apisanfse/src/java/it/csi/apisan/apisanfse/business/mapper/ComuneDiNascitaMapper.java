/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita;

public class ComuneDiNascitaMapper extends BaseMapper<ComuneDiNascita, it.csi.apisan.apisanfse.integration.dma.ComuneDiNascita> {

	@Override
	public it.csi.apisan.apisanfse.integration.dma.ComuneDiNascita to(ComuneDiNascita source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.ComuneDiNascita result = new it.csi.apisan.apisanfse.integration.dma.ComuneDiNascita();
		result.setCodice(source.getCodice());
		result.setDescrizione(source.getDescrizione());
		result.setRiferimento(source.getRiferimento());
		return result;
	}

	@Override
	public ComuneDiNascita from(it.csi.apisan.apisanfse.integration.dma.ComuneDiNascita dest) {
		if(dest==null) {
			return null;
		}
		ComuneDiNascita result = new ComuneDiNascita();
		result.setCodice(dest.getCodice());
		result.setDescrizione(dest.getDescrizione());
		result.setRiferimento(dest.getRiferimento());
		return result;
	}

}
