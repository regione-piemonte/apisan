/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.Base64;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UtentiCfRicevutePagamentiSanitariIdRicevutaGetService extends PagRESTBaseService {
	@Autowired
	private PtwServiceClient ptwServiceClient;

	
	private String cf;
	private String idRicevuta;
	
	public UtentiCfRicevutePagamentiSanitariIdRicevutaGetService(String cf, String idRicevuta, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.idRicevuta = idRicevuta;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		
		byte[] filePdf = ptwServiceClient.getIcevutePagamentiSanitari(xRequestID, xCodiceServizio, cf, idRicevuta);
		
		byte[] filePdfDecoder = Base64.getDecoder().decode(filePdf);
		
		return Response.ok().entity(filePdfDecoder).type("application/pdf").build();
	}

}
