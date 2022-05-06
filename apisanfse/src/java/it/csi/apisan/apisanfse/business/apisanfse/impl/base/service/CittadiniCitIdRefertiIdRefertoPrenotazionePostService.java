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

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.dto.apisanfse.ImmagineRete;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanfse.integration.dmacc.CCScaricoRefertoServicePortType;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSRResponse;
import it.csi.apisan.apisanfse.integration.scaricostudi.CCScaricoStudiServicePortType;
import it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.scaricostudi.ScaricaStudiReq;
import it.csi.apisan.apisanfse.integration.scaricostudi.ScaricaStudiRes;
import it.csi.apisan.apisanfse.integration.scaricostudi.SistemaOperativo;
import it.csi.apisan.apisanfse.util.ConstantsFse;;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRefertiIdRefertoPrenotazionePostService extends FseDelegheRESTBaseService {

	private static final String IMR = "IMR"; //Codice Componente Locale IMR
	
	private String citId;
	private String idReferto;
	private ImmagineRete prenotazione;
	@Autowired
	CCScaricoStudiServicePortType scaricoStudiPort;
	
	@Autowired
	private CCScaricoRefertoServicePortType cCScaricoRefertoServicePortType; 
	

	public CittadiniCitIdRefertiIdRefertoPrenotazionePostService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String citId, String idReferto,
			ImmagineRete prenotazioneImmagine, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.idReferto = idReferto;
		this.prenotazione = prenotazioneImmagine;
	}

	@Override
	protected Response execute() {
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		
		GetListaRefertiSR requestLR = newGetListaRefertiSR(citId);

		GetListaRefertiSRResponse response = cCScaricoRefertoServicePortType.getListaRefertiSR(requestLR);
		
		if(!it.csi.apisan.apisanfse.integration.dma.RisultatoCodice.SUCCESSO.equals(response.getEsito())) {
			log.error("execute","Chiamata a getListaRefertiSR con Risultato codice: !RisultatoCodice.SUCCESSO" );
			throw toRESTException(response.getErrori());
		}
		
		
		List<MetadatiDocumentoSR> metadatiDocumenti = getMetadatiDocumentoDistinctIdReferto(response.getMetadatiDocumenti());
		
		MetadatiDocumentoSR ref = getMetadatiDocumentoFromLista(metadatiDocumenti, idReferto);
		
		ScaricaStudiRes res = invocaScaricaStudi(ref);
		if (res == null || RisultatoCodice.FALLIMENTO.equals(res.getEsito())) {

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

	private ScaricaStudiRes invocaScaricaStudi(MetadatiDocumentoSR ref) {
		final String METHOD_NAME = "invocaScaricaStudi";
		
		ScaricaStudiReq reqSS = new ScaricaStudiReq();
		
		reqSS.setIdReferto(ref.getCodiceDocumentoDipartimentale());
    	reqSS.setPeriodoConservazione(ref.getNumeroGiorniDownload()); //TODO da fissare su 30 giorni
    	reqSS.setPin(ConstantsFse.PIN_CODE);
    	reqSS.setCodiceFiscale(citId);
    	
    	if(StringUtils.isNotBlank(prenotazione.getSistemaOperativo())) {  //TODO Passare fisso windows
	    	SistemaOperativo sistemaOperativo = SistemaOperativo.valueOf(prenotazione.getSistemaOperativo().toUpperCase());
	    	reqSS.setSistemaOperativo(sistemaOperativo);
    	}
    	if(ref.getLuogoProduzioneDocumento() != null && ref.getLuogoProduzioneDocumento().getStruttura() != null) {
    		reqSS.setStrutturaSanitaria(ref.getLuogoProduzioneDocumento().getStruttura().getCodice());    //TODO da mettere vuota??
    	}
    	
    	reqSS.setEmail(prenotazione.getEMail());//TODO mettere vuota 
    	reqSS.setAsr(getAsr(ref));    //TODO Mettere codice componente locale
    	reqSS.setAccessionNumbers(getAccessionNumbers(ref));  //TODO stringa di accession number
		
		ScaricaStudiRes res = scaricoStudiPort.scaricaStudi(reqSS);
		log.debug(METHOD_NAME, "Esito: %s", (res!=null?res.getEsito():"null"));
		return res;
	}

	private String getAsr(MetadatiDocumentoSR ref) {
		
		//TODO nuovi servizi da gettutti docs IMR non esiste quindi per asr prendo sempre il codice della componente locale
		
//		return ref.getAccessionNumbers().stream().filter((ans) -> "IMR".equals(ref.getComponenteLocale().getCodice()))
//		.findFirst().map((ans) -> {
//			String split[] = ans.split("\\.");
//			if (split.length > 1) {
//				return split[1];
//			}
//			return ref.getComponenteLocale().getCodice();
//		}).orElse(ref.getComponenteLocale().getCodice());
		
		
		
		if (IMR.equals(ref.getComponenteLocale().getCodice())) {
			for (String ans : ref.getAccessionNumbers()) {
				String split[] = ans.split("\\.");
				if (split.length > 1) {
					return split[0];
				}
			}
		}
		
		return ref.getComponenteLocale().getCodice();
	}

	private String getAccessionNumbers(MetadatiDocumentoSR ref) {
    	String accessionNumbers = "";
    	
    	for (String ans : ref.getAccessionNumbers()) {
    		
    		if (IMR.equals(ref.getComponenteLocale().getCodice())){
    			String split[] = ans.split("\\.");
    			if (split.length>1){
    				ans = split[1];
    			}
    		}
    		
    		if ("".equals(accessionNumbers)) {
    			accessionNumbers = ans;
    		} else {
    			accessionNumbers = accessionNumbers + "|-|"+ans;
    		}
		}
		return accessionNumbers;
	}
	

}
