/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;

public class CodificaCodificaMapper extends BaseMapper<Codifica, it.csi.apisan.apisanfse.integration.dma.Codifica> {

	@Override
	public it.csi.apisan.apisanfse.integration.dma.Codifica to(Codifica source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.Codifica dest = new it.csi.apisan.apisanfse.integration.dma.Codifica();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		dest.setRiferimento(source.getRiferimento());
		return dest;
	}

	@Override
	public Codifica from(it.csi.apisan.apisanfse.integration.dma.Codifica dest) {
		if(dest == null) {
			return null;
		}
		Codifica from = new Codifica();
		from.setCodice(dest.getCodice());
		from.setDescrizione(dest.getDescrizione());
		from.setRiferimento(dest.getRiferimento());
		return from;
	}

}
