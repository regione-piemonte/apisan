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
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsPutPostRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.ConsensoConsensoMapper;
import it.csi.apisan.apisancons.business.apisancons.mapper.DateXMLGregorianCalendarMapper;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.exception.ErroreConsensoBuilder;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ModificaConsensoBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ModificaConsensoBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoASR;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadinoCfConsensiIdInformativaAslIdAslPutService extends ConsPutPostRESTBaseService {
	
	@Autowired
	ConsensoBeService service;
	private Consenso consenso;
	private String cf;
	private String idInformativa;
	private String idAsl;
	
	public CittadinoCfConsensiIdInformativaAslIdAslPutService(String cf, String idInformativa, String idAsl,
  			 Consenso consenso, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.idInformativa = idInformativa;
		this.idAsl = idAsl;
		this.consenso = consenso;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato", consenso);
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato", consenso);
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato", consenso);
		checkUtenteAutorizzatoOrDelegato(cf);
		verificaConsensoPostPut(consenso, false);
		ModificaConsensoBe requestModifica = newRequestModifica();
			
		ModificaConsensoBeResponse response = service.modificaConsensoBeService(requestModifica);
		checkSuccesso(response, "CittadinoCfConsensiIdInformativaAslIdAslPutService", consenso);
		
		
		Consenso consResp =  new ConsensoConsensoMapper().from(response.getConsenso()); 
		
		return Response.status(200).type(MediaType.APPLICATION_JSON).entity(consResp).build() ;
	}
	
	private ModificaConsensoBe newRequestModifica() {
		it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso consPut = new ConsensoConsensoMapper().to(consenso);
		
		ModificaConsensoBe request = new ModificaConsensoBe();
		
		request.setRichiedente(newRichiedente());
		//request.setDataAcquisizione(consPut.getDataAcquisizione());
		//la data acquisizione deve essere la data odierna
		log.info("CittadinoCfConsensiIdInformativaAslIdAslPutService.newRequestModifica", " this.cf: " + this.cf + " shibIdentitaCodiceFiscale: " + shibIdentitaCodiceFiscale);
		
		if(!this.cf.equalsIgnoreCase(this.shibIdentitaCodiceFiscale)) {
			log.info("CittadinoCfConsensiIdInformativaAslIdAslPutService.newRequestModifica cf diversi", " this.cf: " + this.cf + " shibIdentitaCodiceFiscale: " + shibIdentitaCodiceFiscale);
			request.setCfDelegato(shibIdentitaCodiceFiscale);
		}
		request.setDataAcquisizione(new DateXMLGregorianCalendarMapper().to(new Date()) );
		request.setFonte(newFonteCittadinoRequest());
		request.setIdInformativa(Integer.parseInt(idInformativa));
		request.setCfCittadino(cf);
		TipoASR tipoAsr = new TipoASR();
		tipoAsr.setCodice(idAsl);
		request.setAsr(tipoAsr);
		request.setValoreConsenso(consPut.getValoreConsenso());
		request.setTipoStato(consPut.getTipoStato());
		request.setIdAura(consPut.getIdAura());
		return request;
	}
	

}
