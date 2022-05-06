/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;
import it.csi.apisan.apisanfse.integration.etichette.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoEtichetta;

public class EtichettaEtichette extends Etichetta implements Etichettable{
	
	public EtichettaEtichette() {}
	
	public EtichettaEtichette(Etichetta etichetta) {
		if(etichetta!=null) {
			super.setIdEtichetta(etichetta.getIdEtichetta());
			super.setTesto(etichetta.getTesto());
			super.setTipoEtichetta(etichetta.getTipoEtichetta());
		}
	}	

	@Override
	public void setTipoEtichetta(Object value) {
		super.setTipoEtichetta((TipoEtichetta)value);
		
	}


}
