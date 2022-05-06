/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.util;

import it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali.Errore;

public class ErroreGetFarmacie extends Errore implements Errorable {

	public ErroreGetFarmacie() {
		
	}
	
	
	public ErroreGetFarmacie(Errore errore) {
		super.setCodice(errore.getCodice());
		super.setDescrizione(errore.getDescrizione());
	}
}
