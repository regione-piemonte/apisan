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
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.DocumentoAllegato;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)

public class CittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet extends AssistenzaRESTService {

	@Autowired
	NextCrmApiClient nextCrmApiClient;	

	String citId = null;
	String richiestaId = null;
	String documentoId = null;
	
	public CittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet() {
		super();
	}
	public CittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			String documentoId, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.richiestaId = richiestaId;
		this.documentoId = documentoId;
	}

	@Override
	protected Response execute() {
		validateCommonRequiredData();
		validateRequiredAndValidCodiceFiscaleIdentitaDigitale();
		validateRequiredAndValidCodiceFiscaleFromParam(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		checkNotBlank(richiestaId, "Il parametro id richiesta è obbligatorio");
		checkCodiceIdentificativoRichiestaValido(richiestaId);
		checkNotBlank(documentoId, "Il parametro id documento è obbligatorio");
		checkCodiceIdentificativoDocumentoValido(documentoId);
		nextCrmApiClient.checkTicketExists(citId, richiestaId);
		
		DocumentoAllegato documento =  nextCrmApiClient.getDocumentoAllegato(citId, richiestaId, documentoId);
		
		return Response.ok().entity(documento.getFileContent())
				.type(documento.getContentType())
				.header("Content-Disposition", "attachment; filename=\"" + documento.getFileName() + "\"")
				.build();
	}

}
