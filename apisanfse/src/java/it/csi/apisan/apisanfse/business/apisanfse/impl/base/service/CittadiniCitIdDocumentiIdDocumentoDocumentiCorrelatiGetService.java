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

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoDocumentoMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dma.TipoCorrelazioneDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentiCorrelatiRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentiCorrelatiResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.IdentificativoDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoDocumentiCorrelatiGetService extends FseDocumentiRESTBaseService {
	
	private String citId; 
	private String idDocumento; 
	private String codiceCl;
	private String tipoCorrelazioneDocumento;
		
	public CittadiniCitIdDocumentiIdDocumentoDocumentiCorrelatiGetService(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, 
			String citId, 
			String idDocumento, 
			String codiceCl,
			String tipoCorrelazioneDocumento,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.idDocumento=idDocumento;
		this.codiceCl=codiceCl;
		this.tipoCorrelazioneDocumento=tipoCorrelazioneDocumento;
	
	}

	@Override
	protected Response execute() {

		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetDocumentiCorrelati versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");		
		checkNotBlank(codiceCl, "Codice della componente locale non valorizzato");
		checkNotBlank(tipoCorrelazioneDocumento, "tipo di correlazione ricerca non valorizzato");
		checkNotBlank(idDocumento, "Identificativo del documento non valorizzato");
		checkCodiceFiscaleValido(citId);
		
		GetDocumentiCorrelatiRequest request = new GetDocumentiCorrelatiRequest();		
		request.setRichiedente(newRichiedenteInfo());	
		request.setCfPaziente(citId);
		IdentificativoDocumento documento = new IdentificativoDocumento();
		documento.setCodiceCL(this.codiceCl);
		documento.setIdDocumentoIlec(this.idDocumento);
		request.setDocumento(documento);
				
		request.setTipoCorrelazioneDocumento(TipoCorrelazioneDocumento.valueOf(this.tipoCorrelazioneDocumento));
		
		GetDocumentiCorrelatiResponse  response = documentiService.getDocumentiCorrelati(request);
		
		//In caso di fallimento torno errore
	    if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
	    	throw toRESTDocumentiException(response.getErrori());
	    }	
								
	/*	List<ModelDocumento> documenti = new ModelDocumentoDocumentoMapper().fromList(response.getDocumenti());
		documenti.stream().forEach( c ->  arricchisciScaricoStudi(c, citId));*/
	    
	    List<ModelDocumento> documenti = response.getDocumenti().stream().map(c -> {
	    	ModelDocumento modelDocumento = new ModelDocumentoDocumentoMapper().from(c);	
			arricchisciScaricoStudi(modelDocumento, citId);
			return modelDocumento;
	    }).collect(Collectors.toList());
	    
		return Response.ok(documenti).build();
	}

}
