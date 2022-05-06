/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoResponseGetDocumentoResponseMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoResponse;
import it.csi.apisan.apisanfse.integration.documenti.dma.ComponenteLocale;
import it.csi.apisan.apisanfse.integration.documenti.dma.MetadatiDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dma.SiNo;
import it.csi.apisan.apisanfse.integration.documenti.dma.TipoDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoDocumentoGetService extends FseDocumentiRESTBaseService {
	
	private String citId; 
	private String idDocumento;
	private String idEpisodio;
	private String componenteLocale; 
	private Boolean firmatoDigitalmente; 
	private Boolean criptato;
	private String idRepository; 
	private String documentoDipartimentale;
	private String tipoDocumento;
	private String codiceRuolo;
	private String codiceAppVerticale;
	@Value("${serviceROLName}")
	private String serviceROLName;
	
	public CittadiniCitIdDocumentiIdDocumentoDocumentoGetService(String citId, String idDocumento,
			String idEpisodio, String componenteLocale, Boolean firmatoDigitalmente, Boolean criptato, String tipoDocumento,
			String idRepository, String documentoDipartimentale, String codiceRuolo, String codiceAppVerticale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		this.idDocumento = idDocumento;
		this.idEpisodio = idEpisodio;
		this.componenteLocale = componenteLocale; 
		this.firmatoDigitalmente = firmatoDigitalmente; 
		this.criptato = criptato;
		this.idRepository = idRepository; 
		this.documentoDipartimentale = documentoDipartimentale;
		this.tipoDocumento = tipoDocumento;
		this.codiceRuolo = codiceRuolo;
		this.codiceAppVerticale = codiceAppVerticale;
	}


	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(xRequestID, "Valorizzare xRequestid");
		checkNotBlank(xForwardedFor, "Valorizzare ipclient");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identita");
		checkNotBlank(idDocumento, "Valorizzare id Documento");
		checkNotBlank(idEpisodio, "Valorizzare id episodio");
		checkNotBlank(componenteLocale, "Valorizzare componente locale");
		checkNotNull(firmatoDigitalmente, "Valorizzare il flag firmato digitalmente");
		checkNotNull(criptato, "Valorizzare il flag criptato");
		
		
		GetDocumentoResponse res = documentiService.getDocumento(createDocumentoRequest(codiceAppVerticale));
		
		
		//09/06/2021 Verifica con Veronica se err_185 rifare la chiamata con ritiro referti 
		if(isErrore185or188(res)) {
			res = documentiService.getDocumento(createDocumentoRequest(serviceROLName));
		}
			
		checkSuccessoServiceDocumenti(res);
		
		ModelDocumentoResponse response = new ModelDocumentoResponseGetDocumentoResponseMapper().from(res);
		
		return Response.ok().entity(response).build();
	}
	
	
	
	
	private GetDocumento createDocumentoRequest(String appVerticale) {
		GetDocumento request = new GetDocumento();
		RichiedenteInfo richiedenteInfo = newRichiedenteInfo(appVerticale);
		if(this.codiceRuolo!=null) {
			richiedenteInfo.getRuolo().setCodice(this.codiceRuolo);
		}
		request.setRichiedente(richiedenteInfo);
		request.setCfPaziente(citId);
		request.setMetadatiDocumento(createMetadatiDocumento());
		request.setCriptato(firmatoDigitalmente? SiNo.SI : SiNo.NO );
		request.setFirmatoDigitalmente(firmatoDigitalmente? SiNo.SI : SiNo.NO);
		
		return request;
	}
	
	private MetadatiDocumento createMetadatiDocumento() {
		MetadatiDocumento metadati = new MetadatiDocumento();
		metadati.setIdEpisodio(idEpisodio);
		metadati.setIdDocumento(idDocumento);
		metadati.setFirmatoDigitalmente(firmatoDigitalmente? SiNo.SI : SiNo.NO);
		ComponenteLocale cl = new ComponenteLocale();
		cl.setCodice(componenteLocale);
		metadati.setComponenteLocale(cl);
		metadati.setOidDocumento(documentoDipartimentale);
		metadati.setOidRepository(idRepository);
		
		metadati.setTipoDocumento(createTipoDocumento());
		return metadati;
	}
	
	private TipoDocumento createTipoDocumento() {
		TipoDocumento tipoDoc = new TipoDocumento();
		tipoDoc.setCodice(tipoDocumento);
		return tipoDoc;
	}
}
