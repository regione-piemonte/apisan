/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanesen.business.apisanesen.impl.base.EsenRESTBaseService;
import it.csi.apisan.apisanesen.dto.apisanesen.EsenzionePost;
import it.csi.apisan.apisanesen.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfEsenzioniPostService extends EsenRESTBaseService {
	String cf;
	EsenzionePost esenzione;
	@Autowired
	EsenServiceClient client;

	public CittadiniCfEsenzioniPostService(String cf,EsenzionePost esenzione, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.esenzione = esenzione;
	}

	@Override
	protected Response execute() {
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		//ancora da verificare se serve checkUtenteAutorizzato
		checkUtenteAutorizzato(cf);
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotNull(esenzione, ErroreBuilder.from(Status.BAD_REQUEST.getStatusCode(), "Esenzione non valorizzata").exception());
		
		String ret = client.inserisciEsenzioni(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, "esenzioni", esenzione);
		return Response.ok(ret).type(MediaType.APPLICATION_JSON).build();
	}

}
