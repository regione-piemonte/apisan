/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import it.csi.apisan.apisancons.exception.ErroreBuilder;
import it.csi.apisan.apisancons.util.ApisanConsStatus;
import it.csi.apisan.apisancons.util.StatoDelega;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;

public abstract class ConsDelegheRestBaseService extends ConsRESTBaseService {

	@Autowired
	protected DelegheCittadiniService delegheCittadiniService;
	
	@Value("${serviceCONSName}")
	private String serviceCONSName;

	public ConsDelegheRestBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	protected void checkUtenteAutorizzatoOrDelegato(String cf) {
		checkUtenteAutorizzatoOrDelegato( cf, serviceCONSName); 
	}
	//aggiunta nella condizione che l'utente sia delegato
	protected void checkUtenteAutorizzatoOrDelegato(String cf, String codiceServizio) {
		checkNotNull(shibIdentitaCodiceFiscale, ErroreBuilder.from(ApisanConsStatus.UTENTE_NON_AUTORIZZATO).exception());
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegato( cf, codiceServizio), ErroreBuilder.from(ApisanConsStatus.UTENTE_NON_AUTORIZZATO).exception());
		}
	}	
	
	protected boolean isUtenteDelegato(String cf, String codiceServizio) {
		final String METHOD_NAME = "isUtenteDelegato";
		GetDeleganti req = new GetDeleganti();
		it.csi.deleghe.deleghebe.ws.model.Richiedente richiedente = new it.csi.deleghe.deleghebe.ws.model.Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
		req.setRichiedente(richiedente);

		Cittadino cittDelegante = new Cittadino();
		cittDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittDelegante);
		req.setCodiciServizio(Arrays.asList(codiceServizio));
		req.setStatiDelega(Arrays.asList(StatoDelega.ATTIVA.toString(), StatoDelega.INSCADENZA.toString()));
		
		
		Cittadino cittDelegato = new Cittadino();
		cittDelegato.setCodiceFiscale(shibIdentitaCodiceFiscale);
		req.setCittadinoDelegato(cittDelegato);
		
		
		//per verificare se il cf in path abbia delegato l'utente nell'header (shibidentitacf) preferisco fare una chiamata sui deleganti (ovvero chi ha effettuato l'autenticazione
		// richiama il servizio per vedere se il cf del path sia un suo delegante in questo modo per l'audit la catena ha preciso chi effettua la chiamata 
		GetDelegantiResponse gdResp = delegheCittadiniService.getDelegantiService(req);
		
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
