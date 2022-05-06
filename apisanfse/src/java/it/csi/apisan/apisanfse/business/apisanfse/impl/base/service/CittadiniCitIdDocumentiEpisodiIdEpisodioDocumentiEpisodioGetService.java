/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.math.BigDecimal;
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
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentiEpisodioRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentiEpisodioResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiEpisodiIdEpisodioDocumentiEpisodioGetService extends FseDocumentiRESTBaseService {

	private String citId;
	private BigDecimal idEpisodio; 
	private String componenteLocale; 
	
	public CittadiniCitIdDocumentiEpisodiIdEpisodioDocumentiEpisodioGetService(String citId,
			BigDecimal idEpisodio, String componenteLocale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.idEpisodio = idEpisodio; 
		this.componenteLocale = componenteLocale; 
	}



	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xRequestID, "Requestid non valorizzata");
		checkNotBlank(xForwardedFor, "Ip client non valorizzato");
		checkNotBlank(citId, "valorizzare il cf del paziente");
		checkNotNull(idEpisodio, "Id Documento non valorizzato");
		checkNotBlank(componenteLocale, "Componente locale non valorizzata");
		
		
		GetDocumentiEpisodioResponse response = documentiService.getDocumentiEpisodio(createRequestDocumentiEpisodio());
		
		checkSuccessoServiceDocumenti(response);
		/*List<ModelDocumento> res = new ModelDocumentoDocumentoMapper().fromList(response.getDocumenti());
		res.stream().forEach(c -> arricchisciScaricoStudi(c, citId));*/
		
		List<ModelDocumento> res = response.getDocumenti().stream().map(c -> {
			ModelDocumento modelDocumento =	new ModelDocumentoDocumentoMapper().from(c);	
			arricchisciScaricoStudi(modelDocumento, citId);
			return modelDocumento;

		}).collect(Collectors.toList());
		
		
		return Response.ok(res).build();
	}
	
	private GetDocumentiEpisodioRequest createRequestDocumentiEpisodio() {
		GetDocumentiEpisodioRequest request = new GetDocumentiEpisodioRequest();
		
		request.setCfPaziente(citId);
		request.setCodiceCL(componenteLocale);
		request.setIdEpisodio(idEpisodio);
		request.setRichiedente(newRichiedenteInfo());
		
		return request;
	}

}
