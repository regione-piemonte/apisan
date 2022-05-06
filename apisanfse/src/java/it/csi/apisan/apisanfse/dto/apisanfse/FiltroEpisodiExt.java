/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.List;

import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.FiltroEpisodi;

public class FiltroEpisodiExt extends FiltroEpisodi {

	public FiltroEpisodiExt(List<CategoriaTipologia> categoriaTipologia, List<Etichetta> etichettaAnatomica, List<Etichetta> etichettaPersonale, String tipiEpisodio) {
		if(categoriaTipologia!=null) {
			super.categoriaTipologia=categoriaTipologia;
		}
		if(etichettaAnatomica!=null) {
			super.etichettaAnatomica=etichettaAnatomica;
		}
		if(etichettaPersonale!=null) {
			super.etichettaPersonale=etichettaPersonale;
		}
		if(tipiEpisodio != null) {
			super.tipoEpisodio = tipiEpisodio;
		}
			
	}

}
