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
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicket;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadMessaggioNuovo;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRichiesteRichiestaIdMessaggiPost extends AssistenzaRESTService{

	
	String richiestaId = null;
	String citId = null;
	PayloadMessaggioNuovo payloadMessaggioNuovo;
	
	@Autowired
	NextCrmApiClient nextCrmApiClient;
	
	public CittadiniCitIdRichiesteRichiestaIdMessaggiPost() {
		super();
	}

	public CittadiniCitIdRichiesteRichiestaIdMessaggiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			PayloadMessaggioNuovo payloadMessaggioNuovo, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.richiestaId = richiestaId;
		this.payloadMessaggioNuovo = payloadMessaggioNuovo;
	}

	@Override
	protected Response execute() {
		validateCommonRequiredData();
		validateRequiredAndValidCodiceFiscaleIdentitaDigitale();
		validateRequiredAndValidCodiceFiscaleFromParam(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		checkNotBlank(richiestaId, "Il parametro identificativo della richiesta è obbligatorio");
		checkCodiceIdentificativoRichiestaValido(richiestaId);
		ModelTicket ticketExists = nextCrmApiClient.checkTicketExists(citId, richiestaId);
		ModelMessaggio messaggio = nextCrmApiClient.addMessageToRichiesta(citId, richiestaId, payloadMessaggioNuovo, ticketExists);
		return Response.ok().entity(messaggio).build();
	}
	
}
