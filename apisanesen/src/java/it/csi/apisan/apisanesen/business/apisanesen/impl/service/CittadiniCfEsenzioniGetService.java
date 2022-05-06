/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanesen.business.apisanesen.impl.base.EsenRESTBaseService;
import it.csi.apisan.apisanesen.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfEsenzioniGetService extends EsenRESTBaseService {
	
	private String cf;
	private String filter;
	@Autowired
	EsenServiceClient service;
	
	public CittadiniCfEsenzioniGetService(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,String filter,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}
	
	protected Response execute() {
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		//ancora da verificare se serve checkUtenteAutorizzato
		checkUtenteAutorizzato(cf);
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(filter, "Filtro non valorizzato");
		//Passare il filtro come codificato
		String filterDaPassare = ""; 
		try {
			filterDaPassare = URLEncoder.encode(filter, StandardCharsets.UTF_8.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "filter").exception();
		}
		
		String ret = service.getServiceEsenzioni(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, filterDaPassare, null);
		return Response.ok(ret).type(MediaType.APPLICATION_JSON).build();
	}
}
