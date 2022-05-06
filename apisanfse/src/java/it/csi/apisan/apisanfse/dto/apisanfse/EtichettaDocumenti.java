/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import it.csi.apisan.apisanfse.integration.documenti.dma.TipoEtichetta;
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;

public class EtichettaDocumenti extends Etichetta implements Etichettable{
	
	public EtichettaDocumenti() {}
	
	public EtichettaDocumenti(Etichetta etichetta) {
		super.setIdEtichetta(etichetta.getIdEtichetta());
		super.setTesto(etichetta.getTesto());
		super.setTipoEtichetta(etichetta.getTipoEtichetta());
	}		

	@Override
	public void setTipoEtichetta(Object value) {
		super.setTipoEtichetta((TipoEtichetta)value);
	}

}
