/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.NextCrmApiClient;
import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;
import it.csi.apisan.apisanassistenza.util.ApisanAssistenzaErrorStatusCode;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)

public class CittadiniCitIdRichiesteRichiestaIdDelete extends AssistenzaRESTService {

	String richiestaId = null;
	String citId = null;
	@Autowired
	NextCrmApiClient nextCrmApiClient;	
	
	public CittadiniCitIdRichiesteRichiestaIdDelete() {
		super();
	}

	public CittadiniCitIdRichiesteRichiestaIdDelete(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.richiestaId = richiestaId;
	}

	@Override
	protected Response execute() {
		throw ErroreBuilder
		.from(ApisanAssistenzaErrorStatusCode.OPERAZIONE_NON_IMPLEMENTATA)
		.exception();
	}	

}
