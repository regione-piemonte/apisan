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

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevStampeRESTBaseService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdCambioMedicoRichiestaRichiestaIdPdfGetService extends ScerevStampeRESTBaseService {
	
	private String citId;
	private String richiestaId;
	@Autowired
	ScerevServiceClient scerevServiceClient;
	
	public CittadiniCitIdCambioMedicoRichiestaRichiestaIdPdfGetService(String citId,String richiestaId,String contentDisposition,SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.richiestaId  = richiestaId;
		this.contentDisposition = contentDisposition;
		this.fileName = "richiestaCambioMedico.pdf";
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		byte[] biteResp = scerevServiceClient.getRichiestaCambioMedicoPdf(httpHeaders, citId, richiestaId, contentDisposition);
		
		return Response.ok().entity(biteResp).type("application/pdf").build();
	}

}
