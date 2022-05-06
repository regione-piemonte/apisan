/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.TipoReferto;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class TipoRefertoCodificaMapper extends BaseMapper<TipoReferto, it.csi.apisan.apisanfse.integration.dma.Codifica> {

	@Override
	public Codifica to(TipoReferto source) {
		if(source == null) {
			return null;
		}
		Codifica dest = new Codifica();
		dest.setCodice(source.getDescrizione());
		dest.setDescrizione(source.getDescrizione());
		dest.setRiferimento(source.getDescrizione());
		return dest;
	}

	@Override
	public TipoReferto from(Codifica dest) {
		if(dest == null) {
			return null;
		}
		TipoReferto source = new TipoReferto();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setRiferimento(dest.getRiferimento());
		return source;
	}
	

}
