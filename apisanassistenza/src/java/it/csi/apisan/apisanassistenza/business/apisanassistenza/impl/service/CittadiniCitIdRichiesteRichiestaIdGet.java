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
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaDettaglio;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)

public class CittadiniCitIdRichiesteRichiestaIdGet extends AssistenzaRESTService {
	
	@Autowired
	NextCrmApiClient nextCrmApiClient;	

	String citId = null;
	String richiestaId = null;
	public CittadiniCitIdRichiesteRichiestaIdGet() {
		super();
	}

	public CittadiniCitIdRichiesteRichiestaIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.richiestaId = richiestaId;
	}
	@Override
	protected Response execute() {
		validateCommonRequiredData();
		validateRequiredAndValidCodiceFiscaleIdentitaDigitale();
		validateRequiredAndValidCodiceFiscaleFromParam(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		// checkCodiceFiscaleUgualeAdAltroCodiceFiscaleStessoUtente(shibIdentitaCodiceFiscale, citId);
		// checkNotBlank(citId, "Il parametro codice fiscale è obbligatorio");
		// checkCodiceFiscaleValido(citId);
		checkCodiceIdentificativoRichiestaValido(richiestaId);
		nextCrmApiClient.checkTicketExists(citId, richiestaId);
		ModelRichiestaDettaglio richiesta =  nextCrmApiClient.getRichiesta(citId, richiestaId, identitaDigitale);
		return Response.ok().entity(richiesta).build();
	}
	

}
