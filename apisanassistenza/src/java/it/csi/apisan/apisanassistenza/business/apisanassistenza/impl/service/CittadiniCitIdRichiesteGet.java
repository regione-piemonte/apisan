/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.NextCrmApiClient;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaLista;
import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRichiesteGet extends AssistenzaRESTService{
	
	@Autowired
	NextCrmApiClient nextCrmApiClient;
	
	String citId = null;
	Boolean archiviata = null;
	String applicazione = null;
	String parolaChiave = null;
	String da = null;
	String a = null;
	String id = null;

	public CittadiniCitIdRichiesteGet() {
		super();
	}

	public CittadiniCitIdRichiesteGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Boolean archiviata, String applicazione,
			String parolaChiave, String da, String a, String id, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.archiviata = archiviata;
		this.applicazione = applicazione;
		this.parolaChiave = parolaChiave;
		this.da = da;
		this.a = a;
		this.id = id;
	}

	@Override
	protected Response execute() {
		validateCommonRequiredData();
		validateRequiredAndValidCodiceFiscaleIdentitaDigitale();
		validateRequiredAndValidCodiceFiscaleFromParam(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		boolean ricercaPerData = (StringUtils.isEmpty(da) || StringUtils.isEmpty(a));
		checkCondition(ricercaPerData, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("RICERCA PER DATA", "La ricerca per periodo non è abilitata").exception());
		
		boolean nessunoValorizzato = (archiviata == null && StringUtils.isEmpty(applicazione) && StringUtils.isEmpty(parolaChiave)
				&& StringUtils.isEmpty(da) && StringUtils.isEmpty(a) && StringUtils.isEmpty(id));
		checkCondition(!nessunoValorizzato, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Impostare almeno un parametro").exception());
		
		List<ModelRichiestaLista> elencoRichieste = nextCrmApiClient.searchRichieste(citId, archiviata, applicazione, parolaChiave, da, a, id);
		
		return Response.ok().entity(elencoRichieste).build();
	}

}
