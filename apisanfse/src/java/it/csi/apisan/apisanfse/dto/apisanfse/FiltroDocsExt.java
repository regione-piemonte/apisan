/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.List;

import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.FiltroDocs;

public class FiltroDocsExt extends FiltroDocs{
	    	
	public FiltroDocsExt(List<CategoriaTipologia> categoriaTipologia, List<Etichetta> etichettaAnatomica, List<Etichetta> etichettaPersonale) {
		if(categoriaTipologia!=null)
			super.categoriaTipologia=categoriaTipologia;
		if(etichettaAnatomica!=null)
			super.etichettaAnatomica=etichettaAnatomica;
		if(etichettaPersonale!=null)
			super.etichettaPersonale=etichettaPersonale;
	}
	
	
	public FiltroDocsExt(List<CategoriaTipologia> categoriaTipologia) {
			super.categoriaTipologia=categoriaTipologia;
	}

}
