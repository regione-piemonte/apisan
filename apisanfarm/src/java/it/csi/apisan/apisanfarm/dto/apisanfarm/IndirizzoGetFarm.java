/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali.IndirizzoType;

public class IndirizzoGetFarm extends IndirizzoType implements Indirizzable {

	public IndirizzoGetFarm(IndirizzoType indirizzo) {
		super.setCap(indirizzo.getCap());
		super.setComune(indirizzo.getComune());
		super.setIndirizzo(indirizzo.getIndirizzo());
		super.setProvincia(indirizzo.getProvincia());
	}



}
