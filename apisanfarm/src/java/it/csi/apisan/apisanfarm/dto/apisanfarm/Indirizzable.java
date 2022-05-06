/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

public interface Indirizzable {
	
	public void setProvincia(String provincia);
	public void setComune(String comune);
	public void setCap(String cap);
	public void setIndirizzo(String indirizzo);
	
	public String getProvincia();
	public String getComune();
	public String getCap();
	public String getIndirizzo();

}
