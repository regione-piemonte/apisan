/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.util.List;

import it.csi.dma.dmaclbluc.ListaRilevazioniRequest;
import it.csi.dma.dmaclbluc.RilevazioneRequest;

public class ListaRilevazioniRequestExt extends ListaRilevazioniRequest{
	
	public ListaRilevazioniRequestExt(List<RilevazioneRequest> rilevazione) {
		super.rilevazione=rilevazione;
	}

}
