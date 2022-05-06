/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.zip.Checksum;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelCategoriaTipologiaCategoriaTipologiaMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelConteggiGetConteggiResponseMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoriaTipologia;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelConteggio;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchConteggi;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetConteggiRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetConteggiResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.TipoConteggio;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiConteggiSearchPostService extends FseDocumentiRESTBaseService {
	
	private String citId;
	private PayloadSearchConteggi payloadSearchConteggi;
	
	public CittadiniCitIdDocumentiConteggiSearchPostService(String citId,
			PayloadSearchConteggi payloadSearchConteggi, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.payloadSearchConteggi = payloadSearchConteggi;
	}

	

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xRequestID, "Requestid non valorizzata");
		checkNotBlank(xForwardedFor, "Ip client non valorizzato");
		checkNotNull(payloadSearchConteggi, "Valorizzare i campi di ricerca");
		checkNotNull(payloadSearchConteggi.getCategoriaTipologia(), "Valorizzare categoria e tipologia");
		checkNotNull(payloadSearchConteggi.getTipoConteggio(), "Valorizzare tipo conteggio");
		
		GetConteggiResponse response = documentiService.getConteggi(createConteggiRequest());
		
		checkSuccessoServiceDocumenti(response);
		
		ModelConteggio res = new ModelConteggiGetConteggiResponseMapper().from(response);
		
		return Response.ok(res).build();
	}
	
	
	private GetConteggiRequest createConteggiRequest() {
		GetConteggiRequest request = new GetConteggiRequest();
		request.setRichiedente(newRichiedenteInfo());
		request.setCfPaziente(citId);
		for(ModelCategoriaTipologia categoriaTipo : payloadSearchConteggi.getCategoriaTipologia()) {
			request.getCategoriaTipologia().add(new ModelCategoriaTipologiaCategoriaTipologiaMapper().to(categoriaTipo));
		}
		
		try {
			for(String tipoConteggio : payloadSearchConteggi.getTipoConteggio()) {
				request.getTipoConteggio().add(TipoConteggio.valueOf(tipoConteggio));
			}
		} catch (IllegalArgumentException  e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipo conteggio non valido").exception();
		}
		
		return request;
	}

}
