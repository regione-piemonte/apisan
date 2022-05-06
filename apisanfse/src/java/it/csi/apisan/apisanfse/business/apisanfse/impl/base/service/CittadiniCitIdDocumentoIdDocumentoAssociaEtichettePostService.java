/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseEtichetteRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.BigDecimalStringMapper;
import it.csi.apisan.apisanfse.business.mapper.TipoOperazioneTipoOperazioneMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadAssociaEtichette;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.DocumentiService;
import it.csi.apisan.apisanfse.integration.etichette.dma.Documento;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaIdEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.AssociaDisassociaEtichetteRequest;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.EtichetteResponse;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentoIdDocumentoAssociaEtichettePostService  extends FseEtichetteRESTBaseService{

	private String citId;
	private String idDocumento;
	private PayloadAssociaEtichette payloadAssociaEtichette;
	
	private AssociaDisassociaEtichetteRequest request;
	private EtichetteResponse response;
		
	@Autowired
	DocumentiService documentiService;
	
	public CittadiniCitIdDocumentoIdDocumentoAssociaEtichettePostService(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, 
			String citId, 
			String idDocumento,
			PayloadAssociaEtichette payloadAssociaEtichette, 
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.idDocumento = idDocumento;
		this.payloadAssociaEtichette = payloadAssociaEtichette;
	}
	
	@Override
	protected void validateRequestParameters() {

		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "DeleteEtichetta versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkNotBlank(idDocumento, "Identificativo del documento mancante");
		checkCodiceFiscaleValido(citId);	
						
	}

	@Override
	protected void setSoapRequest() {

		////////////////////////TUTTI I DOC REQUEST /////////////////////////////////////////////////////		
		
//		GetTuttiDocsRequest requestTuttiDocs = new GetTuttiDocsRequest();
//		requestTuttiDocs.setRichiedente(newRichiedenteInfoDocumenti());
//		//riempiere la request
//		requestTuttiDocs.setCfPaziente(this.citId);		
//
//		GetTuttiDocsResponse responseTuttiDocs =  documentiService.getTuttiDocs(requestTuttiDocs);
//
//		//In caso di fallimento torno errore
//		if(responseTuttiDocs.getEsito().equals(it.csi.apisan.apisanfse.integration.documenti.dmacc.RisultatoCodice.FALLIMENTO)) {
//			throw toRESTDocumentiException(responseTuttiDocs.getErrori());
//		}	
//		//fare il mapper tra documenti ed etichette
//		Categoria categoriaDoc = responseTuttiDocs.getDocumenti().stream().filter(d -> d.getIdDocumentoIlec().equals(new BigDecimal(idDocumento))).findFirst().get().getCategoria();

		//////////////////////// ASSOCIA DISASSOCIA REQUEST /////////////////////////////////////////////////////								
		request = new AssociaDisassociaEtichetteRequest();  
		//TODO idtagfisso 
		//NOTA: credo che l'id tag fisso sia l'id dell'unica etichetta fissa nella listi id etichette e nel secondo caso ???
		//una etichetta fissa
		//una o piu' etichette personali
		//una etichetta fissa e piu' etichette personali
		if(payloadAssociaEtichette.getIdTagFisso()!=null) {
			request.setIdTagFisso(payloadAssociaEtichette.getIdTagFisso().longValue());
		}
		
		//if(payloadAssociaEtichette.getListaIdEtichette()!=null && payloadAssociaEtichette.getListaIdEtichette().size()>0) {
			ListaIdEtichette listaIdEtichette = new ListaIdEtichette();											
			payloadAssociaEtichette.getListaIdEtichette().forEach(e -> listaIdEtichette.getIdEtichetta().add(e));
			request.setListaIdEtichette(listaIdEtichette);
		//}
		
		request.setRichiedente(newRichiedenteInfo());	    	    
		request.setCfPaziente(this.citId);
		Documento documento = new Documento();		
		//documento.setCategoria(new CategoriaEtichetteCategoriaDocumentiMapper().from(categoriaDoc));
		if(payloadAssociaEtichette.getCategoria()!=null && !payloadAssociaEtichette.getCategoria().equals("")) {
			documento.setCategoria(Categoria.valueOf(payloadAssociaEtichette.getCategoria()));
		}
		documento.setCodiceComponenteLocale(payloadAssociaEtichette.getCodiceCl());
		//idDocumento e' un BigDecimal
		documento.setId(new BigDecimalStringMapper().from((idDocumento)));	
		request.setDocumento(documento);
			
		request.setTipoOperazione(new TipoOperazioneTipoOperazioneMapper().to(this.payloadAssociaEtichette.getTipoOperazione()));	
		
	}

	@Override
	protected void callService() {
		response = etichetteService.associaDisassociaEtichette(request);        	    				
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
		return Response.ok().build();
	}
}
