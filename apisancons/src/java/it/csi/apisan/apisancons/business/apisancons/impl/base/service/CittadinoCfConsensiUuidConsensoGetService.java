/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.util.UUID;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsDelegheRestBaseService;
import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.ConsensoConsensoMapper;
import it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBeResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadinoCfConsensiUuidConsensoGetService extends ConsDelegheRestBaseService {
	@Autowired
	ConsensoBeService service;	
	String cf; 
	UUID uuidConsenso;
	
	
	public CittadinoCfConsensiUuidConsensoGetService(String cf, UUID uuidConsenso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.uuidConsenso = uuidConsenso;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkUtenteAutorizzatoOrDelegato(cf);
		
		ConsultaConsensoBe request = new ConsultaConsensoBe();
		
		request.setFonte(newFonteCittadinoRequest());
		request.setCfCittadino(cf);
		request.setRichiedente(newRichiedente());
		request.setVerificaAura(true);
		ConsultaConsensoBeResponse response =  service.consultaConsensoBeService(request);
		
		checkSuccesso(response, "CittadinoCfConsensiGetService");
		
		//prendo solo quello co uuid = uuid passato come parametro
		Consenso consensoRit = response.getConsensi().getConsenso().stream().filter(cons -> cons.equals(uuidConsenso.toString()) ).findFirst().orElse(null);
		
		it.csi.apisan.apisancons.dto.apisancons.Consenso consenso = new ConsensoConsensoMapper().from(consensoRit);
		
		//uuid.toString
		return Response.ok(consenso).build();
	}

}
