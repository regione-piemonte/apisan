/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.consensoini.dma.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.consensoini.dma.Errore;
import it.csi.apisan.apisanfse.integration.consensoini.dma.InformativaIN;
import it.csi.apisan.apisanfse.integration.consensoini.dma.Paziente;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RegimeDMA;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RichiedenteExt;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RuoloDMA;
import it.csi.apisan.apisanfse.util.CostantiConsenso;

public abstract class FseConsensiRESTBaseService extends FseDelegheRESTBaseService {

	public FseConsensiRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	
	public FseConsensiRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	
	protected ErroreRESTException toRESTConsensiException(List<Errore> errori) {
		return toRESTConsensiException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
	
	
	protected ErroreRESTException toRESTConsensiException(List<Errore> errori, int status, String msgDefault) {
		return ErroreBuilder.from(status, msgDefault).dettagli(errori, (e -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(e.getCodice());
			d.setValore(e.getDescrizione());
			return d;
		})).exception();
	}
	
	protected RuoloDMA newRuoloDma(String citId) {
		RuoloDMA ruolo = new RuoloDMA();
		ruolo.setCodice(CostantiConsenso.RUOLO);
	/*	if(shibIdentitaCodiceFiscale.equalsIgnoreCase(citId)) {
			ruolo.setCodice(CostantiConsenso.RUOLO);
		}else {
			ruolo.setCodice(CostantiConsenso.RUOLO_DEL);
		}
		*/
		return ruolo;
	}
	
	protected RegimeDMA newRegimeDMA() {
		RegimeDMA regime = new RegimeDMA();
		regime.setCodice(CostantiConsenso.CODICE_REGIME); // deve essere messo fisso
		return regime;
	}
	
	protected ApplicazioneRichiedente newApplicazioneRichiedente() {
		ApplicazioneRichiedente appRichiedente = new ApplicazioneRichiedente();
		//appRichiedente.setCodice(CostantiConsenso.APPLICAZIONE_RICHIEDENTE); //avrei messo il codice servizio ma non va (mail Tom 22/11)
		appRichiedente.setCodice(xCodiceServizio);//verifica con Veronica il 20/04/2022 
		return appRichiedente;
	}
	
	protected Paziente newPaziente(String cf) {
		Paziente paz = new Paziente();
		paz.setCodiceFiscale(cf);
		
		return paz;
	}
	
	protected InformativaIN newUtimaInformativaIn(String cf) {
		InformativaIN requestInformativa = new InformativaIN();
		
		requestInformativa.setIdentificativoInformativa(CostantiConsenso.IDENTIFICATIVO_ULTIMA_INFORMAIVA);
		requestInformativa.setIdentificativoOrganizzazione(CostantiConsenso.IDENTIFICATIVO_ORGANIZZAZIONE);
		requestInformativa.setIdentificativoUtente(cf);
		//TODO chiedere
		//requestInformativa.setPinCode(value);
		requestInformativa.setRuoloUtente(CostantiConsenso.RUOLO_UTENTE);
		requestInformativa.setStrutturaUtente(CostantiConsenso.IDENTIFICATIVO_ORGANIZZAZIONE);
		requestInformativa.setTipoAttivita(CostantiConsenso.TIPO_ATTIVITA_INFORMATIVA);
		
		return requestInformativa;
	}
	
	protected RichiedenteExt newRichiedenteConsenso(String cf, Delega delega) {
		return newRichiedenteConsenso( cf,  delega, null);
	}
	
	protected RichiedenteExt newRichiedenteConsenso(String cf, Delega delega, String identita) {
		RichiedenteExt rich = new RichiedenteExt();
		rich.setApplicazione(newApplicazioneRichiedente());
		if(delega != null && (delega.getTipoDelega() != null || delega.getGradoDelega() != null) ) {
			if(identita == null) {
				rich.setCodiceFiscale(shibIdentitaCodiceFiscale);
			}else {
				rich.setCodiceFiscale(identita);
			}
			
			rich.setGradoDelega(delega.getGradoDelega());
			rich.setTipoDelega(delega.getTipoDelega());
		}else {
			rich.setCodiceFiscale(cf);
		}
		rich.setNumeroTransazione(xRequestID); //da mettere x-request-id
		rich.setRegime(newRegimeDMA());
		rich.setRuolo(newRuoloDma(cf));
		rich.setTokenOperazione(xRequestID); //verificare se puo andare bene o meno l'x-request-id
		
		return rich;
	}

}
