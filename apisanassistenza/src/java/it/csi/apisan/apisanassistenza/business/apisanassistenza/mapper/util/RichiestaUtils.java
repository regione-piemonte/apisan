/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.util;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsStatusTicket;

public class RichiestaUtils {
	
	public static boolean isRichiestaArchiviata(Integer ticketStateId) {
		return ticketStateId.equals(ConstantsStatusTicket.CHIUSO);
	}

	public static boolean isRichiestaModificabile(Integer ticketStateId) {
		return ticketStateId.equals(ConstantsStatusTicket.NUOVO) || ticketStateId.equals(ConstantsStatusTicket.APERTO) || ticketStateId.equals(ConstantsStatusTicket.IN_ATTESA_DI_RISPOSTA) || ticketStateId.equals(ConstantsStatusTicket.RISOLTO);
	}
}
