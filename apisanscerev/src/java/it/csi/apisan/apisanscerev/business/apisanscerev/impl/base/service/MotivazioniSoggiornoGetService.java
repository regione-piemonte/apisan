/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevRESTBaseService;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneSoggiorno;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MotivazioniSoggiornoGetService extends ScerevRESTBaseService {
	
	@Autowired
	ScerevServiceClient scerevServiceClient;
	
	public MotivazioniSoggiornoGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		//checkNotBlank(xForwardedFor, "ip client non valorizzato"); 
		List<ModelMotivazioneSoggiorno> lista = scerevServiceClient.getMotivazioniSoggiorno(this.httpHeaders);
		
		return Response.ok(lista).build();
	}

}
