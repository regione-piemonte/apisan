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
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.PayloadRettificaMedicoPayload2Mapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadRettificaMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta;
import it.csi.apisan.apisanscerev.dto.scerev.Payload2;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdCambioMedicoRichiestaRichiestaIdRettificaPostService extends ScerevDelegheRESTBaseService {
	
	String citId; 
	String richiestaId;
	PayloadRettificaMedico payloadRettificaMedico;
	@Autowired
	ScerevServiceClient scerevService;	
	
	public CittadiniCitIdCambioMedicoRichiestaRichiestaIdRettificaPostService(String citId, String richiestaId,
			PayloadRettificaMedico payloadRettificaMedico, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.richiestaId = richiestaId;
		this.payloadRettificaMedico = payloadRettificaMedico;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(richiestaId, "Id richiesta non valorizzato");
		checkNotNull(payloadRettificaMedico, "Payload non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		Payload2 payload = new PayloadRettificaMedicoPayload2Mapper().to(payloadRettificaMedico); 
		
		ModelCambioMedicoRichiesta modelCambioRic = scerevService.postRettificaCambioMedicoRichiesta(citId, richiestaId, payload, httpHeaders);
		it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiesta modelResp = new ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper().from(modelCambioRic);
		return Response.status(201).entity(modelResp).build();
	}

}
