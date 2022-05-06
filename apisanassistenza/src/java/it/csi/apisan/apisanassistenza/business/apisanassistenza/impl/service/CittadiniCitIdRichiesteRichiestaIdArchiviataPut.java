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
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaArchiviata;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)

public class CittadiniCitIdRichiesteRichiestaIdArchiviataPut extends AssistenzaRESTService {
	
	String richiestaId = null;
	String citId = null;
	PayloadRichiestaArchiviata payloadRichiestaArchiviata;
	
	@Autowired
	NextCrmApiClient nextCrmApiClient;	

	
	public CittadiniCitIdRichiesteRichiestaIdArchiviataPut() {
		super();
	}
	
	public CittadiniCitIdRichiesteRichiestaIdArchiviataPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			PayloadRichiestaArchiviata payloadRichiestaArchiviata, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.richiestaId = richiestaId;
	}

	
	@Override
	protected Response execute() {
		log.info("execute", "BEGIN");
		validateCommonRequiredData();
		
		validateRequiredAndValidCodiceFiscaleIdentitaDigitale();
		validateRequiredAndValidCodiceFiscaleFromParam(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		checkNotBlank(richiestaId, "Il parametro identificativo della richiesta è obbligatorio");
		checkCodiceIdentificativoRichiestaValido(richiestaId);
		ModelTicket ticketExists = nextCrmApiClient.checkTicketExists(citId, richiestaId);
		log.info("execute", "dump citID, richiestaID: %s, %s", citId, richiestaId);
		nextCrmApiClient.closeTicket(citId, richiestaId, ticketExists);
		log.info("execute", "END");
		return Response.ok().entity(null).build();
	}


}
