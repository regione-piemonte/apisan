/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.StatoDelega;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.model.DelegaServizio;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;


public abstract class ScreenDelegheRESTBaseService extends ScreenRESTBaseService {

	@Autowired
	protected DelegheCittadiniService delegheCittadiniService;
	
	@Value("${serviceScreenName}")
	private String serviceDelegheName;
	
	private String nomeDelegante = null;
	private String cognomeDelegante = null;
	
	
	
	public String getNomeDelegante() {
		return nomeDelegante;
	}


	public String getCognomeDelegante() {
		return cognomeDelegante;
	}


	public ScreenDelegheRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	
	public ScreenDelegheRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	
	protected void checkUtenteAutorizzatoOrDelegato(String cf) {
		checkUtenteAutorizzatoOrDelegato( cf, serviceDelegheName); 
	}
	//aggiunta nella condizione che l'utente sia delegato
	protected void checkUtenteAutorizzatoOrDelegato(String cf, String codiceServizio) {
		checkNotNull(shibIdentitaCodiceFiscale, ErroreBuilder.from(ApisanScreenStatus.UTENTE_NON_AUTORIZZATO).exception());
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegato( cf, codiceServizio), ErroreBuilder.from(ApisanScreenStatus.UTENTE_NON_AUTORIZZATO).exception());
		}
	}	
	//metodo che verifica se l'utente sia delegato o meno e in caso in cui lo sia riempie l'oggetto delega
	protected void verificaUtenteAutorizzatoODelegato(String cf, String codiceServizio) {
		checkNotNull(shibIdentitaCodiceFiscale, ErroreBuilder.from(ApisanScreenStatus.UTENTE_NON_AUTORIZZATO).exception());
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegatoGradoTipo( cf, codiceServizio), ErroreBuilder.from(ApisanScreenStatus.UTENTE_NON_AUTORIZZATO).exception());
		}
	}
	
	private GetDelegantiResponse chiamataDeleghe(String cf , String codiceServizio) {
		GetDeleganti req = new GetDeleganti();
		it.csi.deleghe.deleghebe.ws.model.Richiedente richiedente = new it.csi.deleghe.deleghebe.ws.model.Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
		req.setRichiedente(richiedente);

		Cittadino cittDelegante = new Cittadino();
		cittDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittDelegante);
		//req.setCodiciServizio(Arrays.asList(serviceROLName));
		req.setCodiciServizio(Arrays.asList(codiceServizio));
		req.setStatiDelega(Arrays.asList(StatoDelega.ATTIVA.toString(), StatoDelega.INSCADENZA.toString()));
				
		Cittadino cittDelegato = new Cittadino();
		cittDelegato.setCodiceFiscale(shibIdentitaCodiceFiscale);
		req.setCittadinoDelegato(cittDelegato);
		
		//per verificare se il cf in path abbia delegato l'utente nell'header (shibidentitacf) preferisco fare una chiamata sui deleganti (ovvero chi ha effettuato l'autenticazione
		// richiama il servizio per vedere se il cf del path sia un suo delegante in questo modo per l'audit la catena ha preciso chi effettua la chiamata 
		GetDelegantiResponse gdResp = delegheCittadiniService.getDelegantiService(req);
		return gdResp;
	}
	
	
	protected boolean isUtenteDelegatoGradoTipo(String cf, String codiceServizio) {
		String METHOD_NAME = "isUtenteDelegatoGradoTipo";
		GetDelegantiResponse gdResp = chiamataDeleghe(cf, codiceServizio);

		if (!it.csi.deleghe.deleghebe.ws.model.RisultatoCodice.SUCCESSO.equals(gdResp.getEsito())) {
			List<it.csi.deleghe.deleghebe.ws.model.Errore> errori = gdResp.getErrori();
			if(errori!=null) {
				log.error(METHOD_NAME, "Errore getDelegatiService service:");
				errori.forEach(e -> {
					log.error(METHOD_NAME, "   Codice: %s, Descrizione: %s", e.getCodice(), e.getDescrizione());
				});
			}

			return false;
		}

		boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty() );
		
		if(presentiDeleghe) {
			Optional<DelegaServizio> delegaServ = gdResp.getDeleganti().get(0).getDeleghe().stream().filter(delRol -> codiceServizio.equals(delRol.getCodiceServizio()) 
					&& (StatoDelega.ATTIVA.toString().equals(delRol.getStatoDelega())
							|| StatoDelega.INSCADENZA.toString().equals(delRol.getStatoDelega() )))
					.filter(del ->  del.getDataInizioDelega().compareTo(new Date()) <=0 && del.getDataFineDelega().compareTo(new Date()) >=0).findFirst();
					//.collect(Collectors.toList()) ;
			if(delegaServ.isPresent()) {
				nomeDelegante = gdResp.getDeleganti().get(0).getNome();
				cognomeDelegante = gdResp.getDeleganti().get(0).getCognome();
			}
			
			return delegaServ.isPresent();
		}else {
			return false;
		}
	}
	
	
	protected boolean isUtenteDelegato(String cf, String codiceServizio) {
		final String METHOD_NAME = "isUtenteDelegato";
		GetDelegantiResponse gdResp = chiamataDeleghe(cf, codiceServizio);
		if (!it.csi.deleghe.deleghebe.ws.model.RisultatoCodice.SUCCESSO.equals(gdResp.getEsito())) {
			List<it.csi.deleghe.deleghebe.ws.model.Errore> errori = gdResp.getErrori();
			if(errori!=null) {
				log.error(METHOD_NAME, "Errore getDelegatiService service:");
				errori.forEach(e -> {
					log.error(METHOD_NAME, "   Codice: %s, Descrizione: %s", e.getCodice(), e.getDescrizione());
				});
			}
			
			return false;
		}
		
		
		return isPresenteDeleganteAttivo(gdResp, codiceServizio);
	}	
	
	private boolean isPresenteDeleganteAttivo(GetDelegantiResponse gdResp, String servizioName) {

		boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty() );

		return	(presentiDeleghe && gdResp.getDeleganti().stream().anyMatch(c ->  c.getDeleghe().stream().filter(delRol -> servizioName.equals(delRol.getCodiceServizio()) 
				&& (StatoDelega.ATTIVA.toString().equals(delRol.getStatoDelega())
						|| StatoDelega.INSCADENZA.toString().equals(delRol.getStatoDelega() )))
				.anyMatch(del ->  del.getDataInizioDelega().compareTo(new Date()) <=0 && del.getDataFineDelega().compareTo(new Date()) >=0)   )) ;
	}


}
