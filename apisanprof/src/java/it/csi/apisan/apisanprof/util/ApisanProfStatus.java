/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.util;

import java.util.IllegalFormatException;
import java.util.List;

import it.csi.apisan.apisanprof.dto.apisanprof.Dettaglio;
import it.csi.apisan.apisanprof.exception.ErroreBuilder;
import it.csi.apisan.apisanprof.exception.RestErroreException;

public enum ApisanProfStatus {
	UTENTE_NON_AUTORIZZATO(401, "Utente non Autorizzato"), 
	BAD_REQUEST(400, "Errore Validazione"),
	RISORSA_NON_TROVATA(404, "RISORSA_NON_TROVATA"),
	REQUEST_TIME_OUT(504, "Request timeout");

	private int status;
	private String code;
	

	ApisanProfStatus(int status, String code) {
		this.status = status;
		this.code = code;
	}

	public int getStatus() {
		return this.status;
	}
	


	/*public RESTException getRestException(Object... args) {
		String desc = String.format(descTemplate, args);
		return new RESTException(this.statusCode,  desc, desc);
	}*/
	
	
	public RestErroreException getRestException() {
		//String desc = String.format(descTemplate, args);
		return new RestErroreException(this.status,  this.code, this.code);
	}
	
	public RestErroreException getRestException(String title) {
		//String desc = String.format(descTemplate, args);
		return new RestErroreException(new ErroreBuilder(this.status,  this.code).getErrore(  title), this.code );
	}
	
	public RestErroreException getRestException(String title, List<Dettaglio> dettagli) {
		return new RestErroreException(new ErroreBuilder(this.status,  this.code).getErrore(  title, dettagli), this.code );
	}
	
	
	//utile avere 
	/*public RESTException getRestException(MediaType mediaType, Object entity, String message) {
		return new RESTException(this.statusCode, mediaType, entity, message);
	}*/
}
