/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.apisanprof.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanprof.business.apisanprof.impl.base.ProfDelegheRESTBaseService;
import it.csi.apisan.apisanprof.business.apisanprof.impl.base.ProfRESTBaseService;
import it.csi.apisan.apisanprof.dto.apisanprof.VerificaTeam;
import it.csi.aura.auraws.services.central.ricercateam.RicercaTEAMSoap;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfVerificaTeamGetService extends ProfDelegheRESTBaseService {
	private String cf;
	private String team; 
	private String servizio;
	@Autowired
	RicercaTEAMSoap ricercaTeamSoap;
	

	public CittadiniCfVerificaTeamGetService(String cf, String team, String servizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.team = team; 
		this.servizio = servizio;
	}

	@Override
	protected Response execute() {
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotNull(xCodiceServizio, "Codice servizio non valorizzata");
		checkUtenteAutorizzatoOrDelegato(cf, servizio);
		String ret =ricercaTeamSoap.ricercaTEAM(cf, team);
		VerificaTeam verifica = new VerificaTeam();
		verifica.setDescRisposta(ret);
		return Response.ok(verifica).build();
	}

}
