/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.util;

public interface Errorable {
	
	public String getCodice();
	public String getDescrizione();
	
	public void setCodice(String codice);
	public void setDescrizione(String descrizione);
}
