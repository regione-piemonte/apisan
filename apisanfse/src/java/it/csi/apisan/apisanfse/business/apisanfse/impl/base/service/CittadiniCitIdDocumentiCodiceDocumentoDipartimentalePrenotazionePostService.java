/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.business.integration.dao.ApisanFseDecodificheDao;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadPrenotaImmagine;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.ScaricoStudiRequest;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.ScaricoStudiResponse;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.ScaricoStudiWSBean;
import it.csi.apisan.apisanfse.integration.scaricostudi.SistemaOperativo;
import it.csi.apisan.apisanfse.util.ConstantsFse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiCodiceDocumentoDipartimentalePrenotazionePostService
		extends FseDelegheRESTBaseService {
	private String codiceDocumentoDipartimentale; 
	private PayloadPrenotaImmagine payloadPrenotaImmagine;
	private String citId;
	@Autowired
	ScaricoStudiWSBean scaricoStudiWSBean;
	@Autowired
	ApisanFseDecodificheDao costantiDao;

	public CittadiniCitIdDocumentiCodiceDocumentoDipartimentalePrenotazionePostService(String citId, String codiceDocumentoDipartimentale, PayloadPrenotaImmagine payloadPrenotaImmagine,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.codiceDocumentoDipartimentale = codiceDocumentoDipartimentale; 
		this.payloadPrenotaImmagine = payloadPrenotaImmagine;
		this.citId = citId;
	}

	

	@Override
	protected Response execute() {
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		ScaricoStudiResponse res = invocaScaricaStudi();
		
		if (res == null || it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.RisultatoCodice.FALLIMENTO.name().equals(res.getEsito())) {

			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR)
					.title("Errore servizio scarica studi")
					.dettagli(res != null ? res.getErrori() : null, e -> {
						Dettaglio d = new Dettaglio();
						d.setChiave(e.getCodice());
						d.setValore(e.getDescrizione());
						return d;
					})
					.exception();

		}
		
		return Response.status(Status.CREATED).build();
		
	}
	
	
	private ScaricoStudiResponse invocaScaricaStudi() {
		final String METHOD_NAME = "invocaScaricaStudi";
		
		ScaricoStudiRequest reqSS = new ScaricoStudiRequest();
		
		reqSS.setIdReferto(this.codiceDocumentoDipartimentale);
    	reqSS.setPeriodoConservazione(costantiDao.getParametroConfigurazione(ConstantsFse.CHIAVE_CONSERVAZIONE_IMMAGINE)); //TODO da fissare su 30 giorni
    	reqSS.setPin(ConstantsFse.PIN_CODE);
    	reqSS.setCodiceFiscale(citId);
    	
    	
    	
    	/*if(StringUtils.isNotBlank(payloadPrenotaImmagine.getSistemaOperativo())) {  //TODO Passare fisso windows
	    	SistemaOperativo sistemaOperativo = SistemaOperativo.valueOf(payloadPrenotaImmagine.getSistemaOperativo());
	    	reqSS.setSistemaOperativo(sistemaOperativo);
    	}else {*/
    		reqSS.setSistemaOperativo(SistemaOperativo.WINDOWS.name());
    	//}
    	reqSS.setStrutturaSanitaria("");    //TODO da mettere vuota??
    	reqSS.setEmail(payloadPrenotaImmagine.getEMail());//TODO mettere vuota 
    	reqSS.setAsr(payloadPrenotaImmagine.getCodiceComponenteLocale());    //TODO Mettere codice componente locale
    	reqSS.setAcessionNumbers(getAccessionNumbers(payloadPrenotaImmagine.getAccessionNumbers()));  //TODO stringa di accession number  
		
		ScaricoStudiResponse res = scaricoStudiWSBean.scaricoStudi(reqSS);
		log.debug(METHOD_NAME, "Esito: %s", (res!=null?res.getEsito():"null"));
		return res;
	}
	
	
	private String getAccessionNumbers(List<String> ref) {
    	String accessionNumbers = "";
    	
    	for (String ans : ref) {
    		
    		
    		if ("".equals(accessionNumbers)) {
    			accessionNumbers = ans;
    		} else {
    			accessionNumbers = accessionNumbers + "|-|"+ans;
    		}
		}
		return accessionNumbers;
	}
}
