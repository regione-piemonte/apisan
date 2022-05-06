/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;
import it.csi.apisan.apisanscerev.exception.ErroreBuilder;
import it.csi.apisan.apisanscerev.util.rest.ResponseService;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAllegatoAllegatoIdGetSerice extends ScerevDelegheRESTBaseService {
	
	String citId;
	String allegatoId;
	public static final String X_CONTENT_DISPOSITION = "Content-Disposition";
	@Autowired
	ScerevServiceClient scerevServiceClient;	
	
	public CittadiniCitIdAllegatoAllegatoIdGetSerice(String citId, String allegatoid, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.allegatoId = allegatoid;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(allegatoId, "inserire l'allegato");
		checkUtenteAutorizzatoOrDelegato(citId);
			
		ResponseService<byte[]> response =	scerevServiceClient.getAllegato(httpHeaders, citId, allegatoId);
		
		byte[] byteRes = response.getBody();
	
		//String fileName = response.getHeaders().get(X_CONTENT_DISPOSITION).split("filename=")[1].split(";")[0];
		
		Response res = Response.ok().entity(byteRes).build();
		res.getMetadata().add(X_CONTENT_DISPOSITION,  response.getHeaders().get(X_CONTENT_DISPOSITION));
		return res; 
		
	}

}
