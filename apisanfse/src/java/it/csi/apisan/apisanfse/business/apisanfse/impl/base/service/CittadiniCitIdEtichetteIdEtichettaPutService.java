/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseEtichetteRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelEtichettaEtichettaMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaEtichette;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadEtichetta;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.etichette.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoEtichetta;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoOperazione;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.EtichetteResponse;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.EtichetteService;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.UpdateEtichettaRequest;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdEtichetteIdEtichettaPutService  extends FseEtichetteRESTBaseService{

	private String citId;
	private Long idEtichetta;
	private PayloadEtichetta payloadEtichetta;
	
	private UpdateEtichettaRequest request;
	private EtichetteResponse response;
	private RichiedenteInfo richiedente;
		
	public CittadiniCitIdEtichetteIdEtichettaPutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String citId, 
			Long idEtichetta,
			PayloadEtichetta payloadEtichetta,
			String xCodiceServizio,		
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.idEtichetta=idEtichetta;
		this.payloadEtichetta=payloadEtichetta;
	}	

	@Override
	protected void validateRequestParameters() {
		
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "PutEtichette versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");		
		checkNotNull(idEtichetta, "Identificativo della Etichetta mancante");
		checkNotNull(payloadEtichetta, "Testo dell'etichetta da modificare non valorizzato");
		checkCodiceFiscaleValido(citId);			
		
	}

	@Override
	protected void setSoapRequest() {

        request = new UpdateEtichettaRequest();        
        request.setCfPaziente(this.citId);
        request.setIdEtichetta(this.idEtichetta);
        request.setTipoOperazione(TipoOperazione.AGGIORNAMENTO);
        request.setTestoEtichetta(this.payloadEtichetta.getTestoEtichetta());
        
        richiedente = newRichiedenteInfo();
        request.setRichiedente(richiedente);                                
		
	}

	@Override
	protected void callService() {
		response = etichetteService.updateEtichettaPersonale(request);              		
	}

	@Override
	protected void checkErrors() throws ErroreRESTException {
		//In caso di fallimento torno errore
        if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {	    	
        	throw toRESTEtichetteException(response.getErrori());
	    }                 		                     		
	}

	@Override
	protected Response getResponse() {
//		String  paziente = this.citId;     				               
//        TipoEtichetta tipoEtichetta = TipoEtichetta.ENTRAMBE;         
//		   
//        Holder<List<Errore>> listaErrori = new Holder<List<Errore>>();
//        Holder<RisultatoCodice> risultatoCodice = new Holder<RisultatoCodice>();
//        Holder<ListaEtichette> listaEtichette = new Holder<ListaEtichette>();
//        etichetteService.getListaEtichette(richiedente, paziente, tipoEtichetta, listaErrori, risultatoCodice, listaEtichette);	 
//        
//        //In caso di fallimento torno errore
//        if(risultatoCodice.value.equals(RisultatoCodice.FALLIMENTO)) {	    	
//        	throw toRESTEtichetteException(listaErrori.value);
//	    }
//               		
//        List<Etichetta> listaEtichetta = listaEtichette.value.getEtichetta();
//        
//        List<ModelEtichetta> modelEtichette = listaEtichetta.stream().map(s -> new ModelEtichettaEtichettaMapper().from(new EtichettaEtichette(s))).collect(Collectors.toList());
//		
//		return Response.status(Status.OK).entity(modelEtichette).build();
		
		return Response.ok().build();

	}

	
}
