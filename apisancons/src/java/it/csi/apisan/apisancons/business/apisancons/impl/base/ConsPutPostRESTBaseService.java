/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.exception.ErroreConsensoBuilder;
import it.csi.apisan.apisancons.exception.ErroreConsensoRESTException;
import it.csi.apisan.apisancons.exception.RESTException;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaStatoBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.RisultatoCodice;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ServiceResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoFonte;
import it.csi.apisan.apisancons.integration.conspref.errorecittadino.Errore;
import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;
import it.csi.apisan.apisancons.util.Constants;

public abstract class ConsPutPostRESTBaseService extends ConsDelegheRestBaseService {
	
	@Autowired
	ConsensoBeService service;
	
	public ConsPutPostRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}
	
	
	protected Fonte newFonteCittadino() {
		Fonte fonte = new Fonte();
		fonte.setCodice(Constants.FONTE_CODICE);
		TipoFonte tipoFonte = new TipoFonte();
		tipoFonte.setCodice(Constants.FONTE_CODICE);
		fonte.setTipoFonte(tipoFonte);
		return fonte;
	}
	
	protected void verificaConsensoPostPut(Consenso consenso, boolean isPost) {
		checkNotNull(consenso, "Consenso non valorizzato", consenso);
		if(isPost) {
			checkNotNull(consenso.getCfCittadino(), "codicefiscale mancante", consenso);
			checkNotNull(consenso.getAsr(), "Asr non presente", consenso);
			checkNotNull(consenso.getIdInformativa(), "Id informativa non valorizzato", consenso);
			checkNotBlank("" + consenso.getIdInformativa(), "Id informativa non valorizzato", consenso);
		}

		checkNotNull(consenso.getIdAura(), "Id Aura nno presente", consenso);
		checkNotNull(consenso.getTipoStato(), "Stato del consenso non valorizzato", consenso);
		checkNotNull(consenso.getTipoStato().getCodice(), "Stato del consenso non valorizzato", consenso);
		checkNotNull(consenso.getValoreConsenso(), "Valore del consenso non impostato", consenso );
		checkNotNull(consenso.getValoreConsenso().getCodice(), "Valore del consenso non impostato", consenso );
		
		checkCondition(isStatoValido(consenso) ,ErroreConsensoBuilder.from(Status.BAD_REQUEST, consenso).dettaglio("Stato", "Lo stato impostato e il valore non sono validi").exception());
		//richamo il servizio degli stati e verifico che ia stato inserito uno stato consentito
		ConsultaStatoBeResponse response = service.consultaStatoBeService(newRequestConsultaCodifiche());
		checkSuccesso(response, "Impossibile verificare lo stato", consenso);
				
		Optional<it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoStato> errTipoStato = response.getStati().stream().filter(c -> consenso.getTipoStato().getCodice().equals(c.getCodice()) ).findFirst();
		checkCondition(errTipoStato.isPresent(), ErroreConsensoBuilder.from(Status.BAD_REQUEST, consenso).dettaglio("Stato", "Lo stato impostato non \u00E8 valido").exception());
		
	}
	protected boolean isStatoValido(Consenso consenso) {
		boolean statoValido = true;
		if(consenso.getTipoStato().getCodice().equals(Constants.STATO_REVOCATO) && consenso.getValoreConsenso().getCodice().equals(Constants.VALORE_SI)) {
			statoValido = false;
		}
		return statoValido;
	}
	//devo sovrascrivere tutti i metodi di check per ritornare ErroreConsenso e non errore
	@SuppressWarnings("unlikely-arg-type")
	protected void checkSuccesso(ServiceResponse sr, String servizioFault, Consenso cons) {
		if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito())  || (sr.getElencoErrori() != null && (!sr.getElencoErrori().isEmpty())) ) {
			//se trovo delle eccezioni le richiamo eccetto se trovo l'errore di on trovate occorrenze
			if(erroreNonTrovateOccorrenze(sr)) {
				return;
			}
			if((sr.getElencoErrori() != null) && (!sr.getElencoErrori().isEmpty())){
				throw toRESTErroreCittadinoException(sr.getElencoErrori(), 502, servizioFault, "", cons);
			}
		}
	}
	
	
	protected void checkNotBlank(String str, String message, Consenso cons) {
		checkNotBlank(str, ErroreConsensoBuilder.from(Status.BAD_REQUEST, cons).dettaglio("PARAMETRO", message).exception());
	}
	
	protected void checkNotNull(Object obj, String message, Consenso cons) {
		checkNotNull(obj, ErroreConsensoBuilder.from(Status.BAD_REQUEST, cons).dettaglio("PARAMETRO", message).exception());
	}
	
	protected void checkCondition(boolean isOk, RESTException re) {
		if(!isOk) {
			throw re;
		}
	}
	
	protected ErroreConsensoRESTException toRESTErroreCittadinoException(List<Errore> errori, int status, String servizioFault, String msgDefault, Consenso cons) {
		ErroreConsensoBuilder erroreBuilder = ErroreConsensoBuilder.from(status, servizioFault, cons).title(msgDefault);
		
		if(errori!=null) {
			errori.stream().forEach(e -> erroreBuilder.dettaglio(e.getCodice(), e.getDescrizione()));
		}
		
		return erroreBuilder.exception();
	}
}
