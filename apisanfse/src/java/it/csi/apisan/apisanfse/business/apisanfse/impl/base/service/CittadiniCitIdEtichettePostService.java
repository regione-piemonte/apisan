/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
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
import it.csi.apisan.apisanfse.integration.etichette.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.EtichetteResponse;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.EtichetteService;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.SetEtichettaRequest;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdEtichettePostService  extends FseEtichetteRESTBaseService{

	private String citId;
	private PayloadEtichetta payloadEtichetta;
	
	private SetEtichettaRequest request;	    
	private RichiedenteInfo richiedente;
	private EtichetteResponse response;
		
	public CittadiniCitIdEtichettePostService(String shibIdentitaCodiceFiscale, String xRequestID,			
			String citId,
			PayloadEtichetta payloadEtichetta,
			String xCodiceServizio, 
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.payloadEtichetta=payloadEtichetta;
	}


	@Override
	protected void validateRequestParameters() {		
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "PostEtichette versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkNotNull(payloadEtichetta, "Testo dell'etichetta da modificare non valorizzato");								    		
	}

	@Override
	protected void setSoapRequest() {
		request = new SetEtichettaRequest();	    
	    request.setCfPaziente(this.citId);
	    
	    richiedente = newRichiedenteInfo();
	    request.setRichiedente(richiedente);
	    
	    request.setTestoEtichetta(this.payloadEtichetta.getTestoEtichetta());	     	   		
	}

	@Override
	protected void callService() {
		response = etichetteService.setEtichettaPersonale(request);		   	  
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
		
		     				               
		TipoEtichetta tipoEtichetta = TipoEtichetta.ENTRAMBE;         
		   
		Holder<List<Errore>> listaErrori = new Holder<List<Errore>>();
		Holder<RisultatoCodice> risultatoCodice = new Holder<RisultatoCodice>();
		Holder<ListaEtichette> listaEtichette = new Holder<ListaEtichette>();
		etichetteService.getListaEtichette(richiedente, this.citId, tipoEtichetta, listaErrori, risultatoCodice, listaEtichette);
		
		//In caso di fallimento torno errore
		if(risultatoCodice.value.equals(RisultatoCodice.FALLIMENTO)) {
			throw toRESTEtichetteException(listaErrori.value);
		}
		       		
		List<Etichetta> listaEtichetta = listaEtichette.value.getEtichetta();
		
		List<ModelEtichetta> modelEtichette = listaEtichetta.stream().map(s -> new ModelEtichettaEtichettaMapper().from(new EtichettaEtichette(s))).collect(Collectors.toList());               
		
		ModelEtichetta idEtichetta = modelEtichette.stream()
			  .filter(etichetta -> this.payloadEtichetta.getTestoEtichetta().trim().equals(etichetta.getTesto().toString().trim()))
			  .findAny()
			  .orElse(null);
		
		return Response.ok(idEtichetta).build();
	}
}
