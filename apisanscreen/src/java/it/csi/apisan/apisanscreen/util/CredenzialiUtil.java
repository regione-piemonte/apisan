/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.util;

import it.csi.screenserviziwebsol.CredenzialiType;

public class CredenzialiUtil {

	/**
	 * Restituisce l'oggetto con le credenziali
	 * @param delegante
	 * @param delegato
	 * @return
	 */
	public static CredenzialiType getCredenzialiType(String delegante, String delegato) {
		CredenzialiType credenziali = new CredenzialiType();
		credenziali.setIdOperatore(ConstantsScreen.ID_OPERATORE);
		credenziali.setCodiceFiscaleDelegante(delegante);
		credenziali.setCodiceFiscaleDelegato(delegato);
		return credenziali;
	}
}
