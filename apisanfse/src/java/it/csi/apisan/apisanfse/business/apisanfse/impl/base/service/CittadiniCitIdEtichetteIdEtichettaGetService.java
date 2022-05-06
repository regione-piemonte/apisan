/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseEtichetteRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelEtichettaEtichettaMapper;
import it.csi.apisan.apisanfse.business.mapper.TipologiaEtichettaEnumTipoEtichettaMapper;
import it.csi.apisan.apisanfse.business.mapper.TipologiaEtichettaEnumTipoEtichettaMapper.TipologiaServizi;
import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaEtichette;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta.TipologiaEtichettaEnum;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.etichette.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoEtichetta;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdEtichetteIdEtichettaGetService extends FseEtichetteRESTBaseService{
	
	private String citId;
	private Long idEtichetta;
	
	private RichiedenteInfo richiedente;                  				              
	private TipoEtichetta tipoEtichetta;    
	private String tipologiaEtichetta;
		   
	private Holder<List<Errore>> listaErrori;
	private Holder<RisultatoCodice> risultatoCodice;
	private Holder<ListaEtichette> listaEtichette; 
	
	public CittadiniCitIdEtichetteIdEtichettaGetService(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, Long idEtichetta,
			String tipologiaEtichetta, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.idEtichetta=idEtichetta;
		this.tipologiaEtichetta=tipologiaEtichetta;
	}

	@Override
	protected void validateRequestParameters() {

		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetEtichetta versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkNotBlank(tipologiaEtichetta, "Tipologia dell'etichetta non valorizzata");
		checkNotNull(idEtichetta, "Identificativo della Etichetta mancante");
		checkCodiceFiscaleValido(citId);
				
	}

	@Override
	protected void setSoapRequest() {
						
        richiedente = newRichiedenteInfo();                      				              
        tipoEtichetta =  (TipoEtichetta)new TipologiaEtichettaEnumTipoEtichettaMapper(TipologiaServizi.ETICHETTE).to(TipologiaEtichettaEnum.valueOf(this.tipologiaEtichetta.toUpperCase()));         
		   
        listaErrori = new Holder<List<Errore>>();
        risultatoCodice = new Holder<RisultatoCodice>();
        listaEtichette = new Holder<ListaEtichette>();                               	
		
	}

	@Override
	protected void callService() {

		etichetteService.getListaEtichette(richiedente, this.citId, tipoEtichetta, listaErrori, risultatoCodice, listaEtichette);	
        	   		
	}

	@Override
	protected void checkErrors() throws ErroreRESTException {

		 //In caso di fallimento torno errore
	    if(risultatoCodice.value.equals(RisultatoCodice.FALLIMENTO)) {
	    	throw toRESTEtichetteException(listaErrori.value);	    	
	    }                  
		
	}

	@Override
	protected Response getResponse() {
		List<Etichetta> listaEtichetta = listaEtichette.value.getEtichetta();
        
        Etichetta idEtichetta = listaEtichetta.stream()
        		  .filter(etichetta -> this.idEtichetta.equals(etichetta.getIdEtichetta()))
        		  .findAny()
        		  .orElse(null);
        
        ModelEtichetta modelEtichetta = new ModelEtichettaEtichettaMapper().from(new EtichettaEtichette(idEtichetta));
                		
		return Response.ok(modelEtichetta).build();
	}

}
