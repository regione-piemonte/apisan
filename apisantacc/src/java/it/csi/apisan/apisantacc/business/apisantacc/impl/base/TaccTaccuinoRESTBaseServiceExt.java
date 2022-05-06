/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import it.csi.dma.dmaclbluc.Richiedente;

public abstract class TaccTaccuinoRESTBaseServiceExt extends TaccTaccuinoRESTBaseService{
	
	private String citId;
	private Long taccuinoId;

	public String getCitId() {
		return citId;
	}
	
	public Long getTaccuinoId() {
		return taccuinoId;
	}	

	public TaccTaccuinoRESTBaseServiceExt(String shibIdentitaCodiceFiscale, String xRequestID, String xForwardedFor, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders,String citId,Long taccuinoId) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.taccuinoId=taccuinoId;
		checkNotNull(xRequestID, "xRequestID non impostato");
		checkNotNull(xCodiceServizio, "xRequestID non impostato");
		checkNotNull(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotNull(xForwardedFor, "xForwardedFor non impostato");
		
		checkNotBlank(this.citId, "Codice fiscale cittadino su cui operare non impostato");
		checkNotNull(this.taccuinoId, "Identificativo taccuino non impostato");
	}
	
	public Richiedente newRichiedenteTaccuino() {
		return super.newRichiedenteTaccuino();
	}

}
