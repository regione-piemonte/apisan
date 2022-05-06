/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.apisanprof.impl.base;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanprof.exception.ErroreBuilder;
import it.csi.apisan.apisanprof.util.ApisanProfStatus;
import it.csi.apisan.apisanprof.util.StatoDelega;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.model.DelegaServizio;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;

public abstract class ProfDelegheRESTBaseService extends ProfRESTBaseService {
	
	@Autowired
	protected DelegheCittadiniService delegheCittadiniService;
	
	
	public ProfDelegheRESTBaseService( SecurityContext securityContext, HttpHeaders httpHeaders){
		super(securityContext, httpHeaders);
	}
	
	
	protected void checkUtenteAutorizzatoOrDelegato(String cf, String servizio) {
		
		checkNotNull(shibIdentitaCodiceFiscale, ApisanProfStatus.UTENTE_NON_AUTORIZZATO.getRestException("Utente non autorizzato a compiere l'operazione"));
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegato(cf, servizio), ApisanProfStatus.UTENTE_NON_AUTORIZZATO.getRestException("Utente non autorizzato a compiere l'operazione"));
		}
	}	
	
	
	//Constants.SERVICE_NAME = servizio
	protected boolean isUtenteDelegato(String cf, String servizio) {
		final String METHOD_NAME = "isUtenteDelegato";
		GetDeleganti req = new GetDeleganti();
		it.csi.deleghe.deleghebe.ws.model.Richiedente richiedente = new it.csi.deleghe.deleghebe.ws.model.Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
		req.setRichiedente(richiedente);

		Cittadino cittDelegante = new Cittadino();
		cittDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittDelegante);
		req.setCodiciServizio(Arrays.asList(servizio));
		req.setStatiDelega(Arrays.asList(StatoDelega.ATTIVA.toString(), StatoDelega.INSCADENZA.toString()));

		Cittadino cittDelegato = new Cittadino();
		cittDelegato.setCodiceFiscale(shibIdentitaCodiceFiscale);
		req.setCittadinoDelegato(cittDelegato);
		
		//per verificare se il cf in path abbia delegato l'utente nell'header (shibidentitacf) preferisco fare una chiamata sui deleganti (ovvero chi ha effettuato l'autenticazione
		// richiama il servizio per vedere se il cf del path sia un suo delegante in questo modo per l'audit la catena ha preciso chi effettua la chiamata
		//StopWatch stopWatch = new StopWatch(Constants.STOP_WATCH_CATEGORY);
		//stopWatch.start();
		GetDelegantiResponse gdResp = delegheCittadiniService.getDelegantiService(req);
		//stopWatch.stop();
		
		//stopWatch.dumpElapsed(this.getClass().getSimpleName(), "isUtenteDelegato", "chiamata servizio delegantiservice", "delegheCittadiniService.getDelegantiService");
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
	
		return isPresenteDeleganteAttivo(gdResp, servizio);
	}	
	
	private boolean isPresenteDeleganteAttivo(GetDelegantiResponse gdResp, String servizio) {

		boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty() );

		return	(presentiDeleghe && gdResp.getDeleganti().stream().anyMatch(c ->  c.getDeleghe().stream().filter(delRol -> servizio.equals(delRol.getCodiceServizio()) 
				&& (StatoDelega.ATTIVA.toString().equals(delRol.getStatoDelega())
						|| StatoDelega.INSCADENZA.toString().equals(delRol.getStatoDelega() )))
				.anyMatch(del ->  del.getDataInizioDelega().compareTo(new Date()) <=0 && del.getDataFineDelega().compareTo(new Date()) >=0)   )) ;
	}

}
