/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsPutPostRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.ConsensoConsensoMapper;
import it.csi.apisan.apisancons.business.apisancons.mapper.DateXMLGregorianCalendarMapper;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.InserisciConsensoBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.InserisciConsensoBeResponse;
import it.csi.apisan.apisancons.util.Constants;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadinoCfConsensiPost extends ConsPutPostRESTBaseService {
	@Autowired
	ConsensoBeService service;
	String cf;
	Consenso consenso;
	
	
	public CittadinoCfConsensiPost(String cf,Consenso consenso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.consenso = consenso;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato", consenso);
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato", consenso);
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato", consenso);
		checkUtenteAutorizzatoOrDelegato(cf);
		verificaConsensoPostPut(consenso, true);
		//setto il delegato
		if(!this.cf.equalsIgnoreCase(this.shibIdentitaCodiceFiscale)) {
			consenso.setCfDelegato(shibIdentitaCodiceFiscale);
		}
		it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso consIns = new ConsensoConsensoMapper().to(consenso);
		consIns.setFonte(newFonteCittadino()); 
		//23/01/2020 deciso che in inserimento prende la data acquisizione odierna (non quella passata da front end)
		consIns.setDataAcquisizione(new DateXMLGregorianCalendarMapper().to(new Date()));
		
		InserisciConsensoBe request = new InserisciConsensoBe();
		request.setRichiedente(newRichiedente());
		request.setConsenso(consIns);
		request.setOperatore(Constants.FONTE_CODICE);
		
		
		InserisciConsensoBeResponse response = service.inserisciConsensoBeService(request);
		checkSuccesso(response, "Consenso Post", consenso);
		
		Consenso consResp =  new ConsensoConsensoMapper().from(response.getConsenso()); 
		
		return Response.status(201).type(MediaType.APPLICATION_JSON).entity(consResp).build() ;
	}
	


}
