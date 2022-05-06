/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl.base;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanfarm.business.integration.dao.ApisanFarmDErroreDao;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ErroreDettaglio;
import it.csi.apisan.apisanfarm.exception.ErroreBuilder;
import it.csi.apisan.apisanfarm.exception.ErroreRESTException;
import it.csi.apisan.apisanfarm.util.ConstantsFarm;
import it.csi.dma.farmab.interfacews.msg.farab.FarabService;
import it.csi.dma.farmab.interfacews.msg.farab.Richiedente;
import it.csi.dma.farmab.interfacews.msg.farab.TipoCodice;
import it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType;
import it.csi.dma.farmab.interfacews.msg.farab.Errore;

public abstract class FarabFarmRESTBaseService extends FarmRESTBaseService {
	@Autowired
	protected FarabService service;
	
	@Autowired
	protected ApisanFarmDErroreDao erroreDao;
	
	public FarabFarmRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
	}
	
	
	
	protected void checkSuccesso(Holder<String> esito, Holder<ElencoErroriType> errori, Class<?> methodName) {
		
		
		if (!ConstantsFarm.SUCCESSO.equals(esito.value) ) {
			ElencoErroriType elencoErrori = errori.value;
			if (elencoErrori != null && elencoErrori.getErrore() != null && elencoErrori.getErrore().size() > 0) {
				log.error(methodName.getName(), "Risposta dal servizio %s andata in errore con codice $s. Errore: %s",
						methodName);
				List<ErroreDettaglio> listaDettagli = elencoErrori.getErrore().stream().map( err -> {
					ErroreDettaglio d = new ErroreDettaglio();
					d.setChiave(err.getCodice());
					d.setValore(err.getDescrizione());
					return d;
				}).collect(Collectors.toList()) ;
				
				 it.csi.apisan.apisanfarm.dto.apisanfarm.Errore errorePres =  erroreDao.getMappingErrore(listaDettagli);
				 throw new ErroreRESTException(errorePres);
			}else {
				throw ErroreBuilder.from(502, methodName.getName()).exception();
			}
		}
	}
	
	protected ErroreRESTException toErroreRESTException(ElencoErroriType elencoErrori) {
		String title = "Errore esecuzione servizio " + this.getClass().getSimpleName();
		List<Errore> errori = elencoErrori.getErrore();
		
		
		return ErroreBuilder.from(502, errori.get(0).getCodice()).title(title).dettagli(errori, elEr -> {
			ErroreDettaglio d = new ErroreDettaglio();
			d.setChiave(elEr.getCodice());
			d.setValore(elEr.getDescrizione());
			return d;
		}).exception(errori.get(0).getDescrizione());
		
	}
	
	protected Richiedente  createNewRichiedente(String codiceAppVerticale, String codiceFiscale) {
		Richiedente rich = new Richiedente();
		TipoCodice appVerticale = new TipoCodice();
		appVerticale.setCodice(codiceAppVerticale); 
		rich.setApplicativoVerticale(appVerticale);
		TipoCodice applicazione = new TipoCodice();
		applicazione.setCodice(xCodiceServizio);
		rich.setApplicazione(applicazione);
		if(codiceFiscale != null) {
			rich.setCodiceFiscale(codiceFiscale);
		}else {
			rich.setCodiceFiscale(shibIdentitaCodiceFiscale);
		}
		
		rich.setIp(xForwardedFor);
		rich.setNumeroTransazione(xRequestID);
		TipoCodice ruolo = new TipoCodice();		
		ruolo.setCodice(ConstantsFarm.RUOLO);
		rich.setRuolo(ruolo);
		return rich;
	}

	


	

}
