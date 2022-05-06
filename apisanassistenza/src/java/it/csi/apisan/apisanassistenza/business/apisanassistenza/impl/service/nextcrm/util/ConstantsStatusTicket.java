/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util;

public class ConstantsStatusTicket {
	
	public static final Integer NUOVO = 1;
	public static final Integer APERTO = 2;
	public static final Integer CHIUSO = 4;
	public static final Integer RISOLTO = 8;
	public static final Integer IN_ATTESA_DI_RISPOSTA = 9;
	public static final Integer IN_LAVORAZIONE_ESTERNA = 10;
}
