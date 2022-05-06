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
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoMonitorato;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdMediciMonitoratiGetService extends ScerevDelegheRESTBaseService {
	
	private String citId;
	@Autowired
	ScerevServiceClient scerevService;	

	public CittadiniCitIdMediciMonitoratiGetService(String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		
		List<ModelMedicoMonitorato> listaMedici = scerevService.getMediciMonitorati(citId, httpHeaders);
		
		return Response.ok().entity(listaMedici).build();
	}

}
