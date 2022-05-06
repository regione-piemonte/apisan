/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdMediciMonitoratiMedicoIdDeleteService extends ScerevDelegheRESTBaseService {
	
	private String citId; 
	private String medicoId;
	@Autowired
	ScerevServiceClient scerevService;		
	
	public CittadiniCitIdMediciMonitoratiMedicoIdDeleteService(String citId, String medicoId, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		this.medicoId = medicoId;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(citId, "Cit id non valorizzato");
		checkNotBlank(medicoId, "MedicoId non valorizzato");

		String resp = scerevService.deleteMonitoraMedico(httpHeaders, citId, medicoId);
		
		return Response.ok().entity(resp).build();
	}

}
