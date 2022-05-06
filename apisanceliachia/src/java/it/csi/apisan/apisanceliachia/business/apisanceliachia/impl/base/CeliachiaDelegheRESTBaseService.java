/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base;

import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import it.csi.apisan.apisanceliachia.exception.ErroreBuilder;
import it.csi.apisan.apisanceliachia.util.ApisanCeliachiaStatus;
import it.csi.apisan.apisanceliachia.util.DateIsoStringUtil;
import it.csi.apisan.apisanceliachia.util.StatoDelega;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;

import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;

public abstract class CeliachiaDelegheRESTBaseService extends CeliachiaRESTBaseService {
	
	
	@Autowired
	protected DelegheCittadiniService delegheCittadiniService;
	
	@Value("${serviceceliachiaName}")
	private String serviceceliachiaName;
	
	
	protected Date dateIsoFromString(String date, String campo) {
		try {
			return DateIsoStringUtil.parseRFC339(date);
		} catch (DateTimeParseException e) {
			throw  ErroreBuilder.from(ApisanCeliachiaStatus.PARAMETRO_NON_VALIDO, campo).exception();
		}
	}
	
	public CeliachiaDelegheRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		// TODO Auto-generated constructor stub
	}

	protected void checkUtenteAutorizzatoOrDelegato(String cf) {
		checkUtenteAutorizzatoOrDelegato( cf, serviceceliachiaName); 
	}
	//aggiunta nella condizione che l'utente sia delegato
	protected void checkUtenteAutorizzatoOrDelegato(String cf, String codiceServizio) {
		checkNotNull(shibIdentitaCodiceFiscale, ErroreBuilder.from(ApisanCeliachiaStatus.UTENTE_NON_AUTORIZZATO).exception());
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegato( cf, codiceServizio), ErroreBuilder.from(ApisanCeliachiaStatus.UTENTE_NON_AUTORIZZATO).exception());
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

		return	(presentiDeleghe && gdResp.getDeleganti().stream().anyMatch(c ->  c.getDeleghe().stream().filter(delScerev -> servizioName.equals(delScerev.getCodiceServizio()) 
				&& (StatoDelega.ATTIVA.toString().equals(delScerev.getStatoDelega())
						|| StatoDelega.INSCADENZA.toString().equals(delScerev.getStatoDelega() )))
				.anyMatch(del ->  del.getDataInizioDelega().compareTo(new Date()) <=0 && del.getDataFineDelega().compareTo(new Date()) >=0)   )) ;
	}	

}
