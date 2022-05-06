/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelEpisodioEpisodioMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelFiltroEpisodiFiltroEpisodiMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEpisodio;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchEpisodi;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetSoloEpisodiRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetSoloEpisodiResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RisultatoCodice;
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiEpisodiSearchPostService extends FseDocumentiRESTBaseService {
	
	private String citId;
	private PayloadSearchEpisodi payloadSearchEpisodi; 
	private Integer limit;
	private Integer offset;
	
	
	public CittadiniCitIdDocumentiEpisodiSearchPostService(String citId, Integer limit, Integer offset,
			PayloadSearchEpisodi payloadSearchEpisodi, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		this.payloadSearchEpisodi = payloadSearchEpisodi;
		this.limit = limit; 
		this.offset = offset;
	}



	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xRequestID, "request id non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkNotNull(payloadSearchEpisodi, "Dati per la ricerca dei documenti non valorizzati");
		
		
		GetSoloEpisodiResponse response = documentiService.getSoloEpisodi(getRequestEpisodi());
		
		checkSuccessoServiceDocumenti(response);
		
 		List<ModelEpisodio> resp = new ModelEpisodioEpisodioMapper().fromList(response.getEpisodi());
		return Response.ok(resp).build();
	}
	
	private GetSoloEpisodiRequest getRequestEpisodi() {
		
		GetSoloEpisodiRequest request = new GetSoloEpisodiRequest();
		request.setCfPaziente(citId);
		request.setRichiedente(newRichiedenteInfo());
		request.setLimit(limit);
		request.setOffset(offset);
		request.setFiltroEpisodi(new ModelFiltroEpisodiFiltroEpisodiMapper().to(payloadSearchEpisodi.getFiltroEpisodi()));
		
		
		
		return request;
	}

}
