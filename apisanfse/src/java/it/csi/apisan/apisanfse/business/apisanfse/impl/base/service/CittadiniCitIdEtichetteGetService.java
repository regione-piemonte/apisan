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

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseEtichetteRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelEtichettaEtichettaMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaEtichette;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.etichette.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoEtichetta;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.RisultatoCodice;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdEtichetteGetService extends FseEtichetteRESTBaseService{
	
	private String citId;
	
	
	private RichiedenteInfo richiedente;              				              
	private TipoEtichetta tipoEtichetta;         	   
	private Holder<List<Errore>> listaErrori;
	private Holder<RisultatoCodice> risultatoCodice;
	private Holder<ListaEtichette> listaEtichette;					
	
	public CittadiniCitIdEtichetteGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, 
			String citId,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
	}	

	@Override
	protected void validateRequestParameters() {
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetEtichette versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");		
		checkCodiceFiscaleValido(citId);		
	}

	@Override
	protected void setSoapRequest() {
		richiedente = newRichiedenteInfo();                     				              
        tipoEtichetta = TipoEtichetta.ENTRAMBE;         
		   
        listaErrori = new Holder<List<Errore>>();
        risultatoCodice = new Holder<RisultatoCodice>();
        listaEtichette = new Holder<ListaEtichette>();		
	}

	@Override
	protected void callService() {
		
		java.util.Map<String, Object> requestContext = ((javax.xml.ws.BindingProvider)etichetteService).getRequestContext();
		requestContext.put(org.apache.cxf.interceptor.LoggingMessage.ID_KEY, xRequestID);
		
		
		
		etichetteService.getListaEtichette(richiedente, this.citId, tipoEtichetta, listaErrori, risultatoCodice, listaEtichette);
	}

	@Override
	protected void checkErrors() throws ErroreRESTException{
		 //In caso di fallimento torno errore
        if(risultatoCodice.value.equals(RisultatoCodice.FALLIMENTO)) {
        	throw toRESTEtichetteException(listaErrori.value);
        }		
	}

	@Override
	protected Response getResponse() {
		List<Etichetta> listaEtichetta = listaEtichette.value.getEtichetta();               
	    List<ModelEtichetta> modelEtichette = listaEtichetta.stream().map(s -> new ModelEtichettaEtichettaMapper().from(new EtichettaEtichette(s))).collect(Collectors.toList());	                			
		return Response.ok(modelEtichette).build();		
	}		
	

}
