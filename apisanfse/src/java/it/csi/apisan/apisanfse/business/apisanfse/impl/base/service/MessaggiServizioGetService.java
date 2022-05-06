/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseUtilityRESTBaseService;
import it.csi.apisan.apisanfse.integration.utility.dmacc.GetMessaggiDiServizioRequest;
import it.csi.apisan.apisanfse.integration.utility.dmacc.GetMessaggiDiServizioResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MessaggiServizioGetService extends FseUtilityRESTBaseService {
	
	
	public MessaggiServizioGetService( SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Valorizzare la Request id");
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(xForwardedFor, "Valorizzare ip chiamante");
		
		
		GetMessaggiDiServizioRequest request = new GetMessaggiDiServizioRequest();
		request.setRichiedente(newRichiedenteInfo());
		
		GetMessaggiDiServizioResponse response =  serviceUtility.getMessaggiDiServizio(request);
		
		checkSuccessoServiceUtility(response);
		
		
		return Response.ok(response.getMessaggi()).build();
	}

}
