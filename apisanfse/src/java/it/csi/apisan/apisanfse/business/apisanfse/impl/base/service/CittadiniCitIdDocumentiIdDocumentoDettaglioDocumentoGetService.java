/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.math.BigDecimal;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;
import org.springframework.util.StringUtils;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoAreaRossaDocumentoAreaRossaMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoDocumentoMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRispostaDettaglioDocumento;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.documenti.dma.Documento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Categoria;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDettaglioDocumentoRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDettaglioDocumentoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGetService extends FseDocumentiRESTBaseService {
	
	private String citId; 
	private String idDocumento;
	private String categoria; 
	private String componenteLocale;
	@Value("${serviceROLName}")
	private String serviceROLName;
	private String flagRol;
	
	public CittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGetService(String citId, String idDocumento,
			String categoria, String componenteLocale, String flagRol, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		this.idDocumento = idDocumento;
		this.categoria = categoria; 
		this.componenteLocale = componenteLocale;
		this.flagRol = flagRol;
	}


	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xRequestID, "Requestid non valorizzata");
		checkNotBlank(xForwardedFor, "Ip client non valorizzato");
		checkNotBlank(idDocumento, "Id Documento non valorizzato");
		checkNotBlank(categoria, "Categoria non valorizzata");
		//mettere codice componente locale obbligatorio se passo una categoria diversa da personale
		if(!categoria.equals(Categoria.PERSONALE.value())) {
			checkNotBlank(componenteLocale, "Componente locale non valorizzata");
		}
		
		GetDettaglioDocumentoResponse response = documentiService.getDettaglioDocumento(createRequestDettaglioDoc(null));
		
		//09/06/2021 Verifica con Veronica se err_185 rifare la chiamata con ritiro referti 
		if(isErrore185or188(response)) {
			response = documentiService.getDettaglioDocumento(createRequestDettaglioDoc(serviceROLName));
		}
		
		
		checkSuccessoServiceDocumenti(response);
		
		ModelRispostaDettaglioDocumento res = new ModelRispostaDettaglioDocumento();
		
		if(response.getDocumentoAreaRossa()!=null) {
			res.setDocumentoAreaRossa(new ModelDocumentoAreaRossaDocumentoAreaRossaMapper().from(response.getDocumentoAreaRossa()));
		}
		
		if(response.getDocumento()!=null) {
			ModelDocumento modelDocumento = new ModelDocumentoDocumentoMapper().from(response.getDocumento());
			arricchisciScaricoStudi(modelDocumento, citId);
			res.setDocumento(modelDocumento);
		}
		
		return Response.ok(res).build();
	}
	
	private GetDettaglioDocumentoRequest createRequestDettaglioDoc(String applicativoVerticale) {
		GetDettaglioDocumentoRequest request = new GetDettaglioDocumentoRequest();
		
		request.setRichiedente(newRichiedenteInfo(applicativoVerticale));
		request.setCfPaziente(citId);
		if(!StringUtils.isEmpty(flagRol)) {
			if(!flagRol.equalsIgnoreCase("N") && !flagRol.equals("S")) {
				throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Flag Rol").exception();
			}
			request.setFlagROL(flagRol);
		}
		
		
		Documento doc = new Documento();
		doc.setCodiceComponenteLocale(componenteLocale);
		try {
			doc.setCategoria(Categoria.valueOf(categoria));
		} catch (Exception e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Categoria non valida").exception();
		}
		
		try {
			doc.setId(NumberUtils.parseNumber(idDocumento, BigDecimal.class));
		} catch (Exception e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Id documento formato non valido").exception();
		}
		
		request.setDocumento(doc);
		
		return request;
	}

}
