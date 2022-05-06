/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.util.List;

import it.csi.dma.dmaclbluc.CancellaRilevazioniRequest;

public class CancellaRilevazioniRequestExt extends CancellaRilevazioniRequest{
	
	public CancellaRilevazioniRequestExt(List<Long> idRilevazione) {
		super.idRilevazione=idRilevazione;
	}

}
