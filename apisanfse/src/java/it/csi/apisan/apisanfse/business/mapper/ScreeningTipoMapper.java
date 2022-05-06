/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningTipo;

public class ScreeningTipoMapper  extends BaseMapper<Codifica, ScreeningTipo>{

	@Override
	public ScreeningTipo to(Codifica source) {
		if(source == null) {
			return null;
		}
		ScreeningTipo screeningTipo = new ScreeningTipo();
		screeningTipo.setCodice(source.getCodice());
		screeningTipo.setDescrizione(source.getDescrizione());
		screeningTipo.setRiferimento(source.getRiferimento());
		return screeningTipo;
	}

	@Override
	public Codifica from(ScreeningTipo dest) {
		if(dest == null) {
			return null;
		}
		Codifica codifica = new Codifica();
		codifica.setCodice(dest.getCodice());
		codifica.setDescrizione(dest.getDescrizione());
		codifica.setRiferimento(dest.getRiferimento());
		return codifica;
	}

}
