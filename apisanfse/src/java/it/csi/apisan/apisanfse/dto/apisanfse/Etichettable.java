/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

public interface Etichettable {
		
	
    public Long getIdEtichetta();
    public void setIdEtichetta(Long value);
    public String getTesto();
    public void setTesto(String value);    
    public Object getTipoEtichetta();   
    public void setTipoEtichetta(Object value);
}
