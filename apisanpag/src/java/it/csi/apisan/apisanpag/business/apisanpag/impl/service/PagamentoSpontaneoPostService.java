/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSpontaneoBody;
import it.csi.apisan.apisanpag.dto.ptw.ResponsePost;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PagamentoSpontaneoPostService extends PagRESTBaseService {

	@Autowired
	private PtwServiceClient ptwServiceClient;
	
	private PagamentoSpontaneoBody pagamentoSpontaneo;

	
	public PagamentoSpontaneoPostService(String xRequestID, String xCodiceServizio, String xForwardedFor,
			PagamentoSpontaneoBody pagamentoSpontaneo,  SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(null, xRequestID, xCodiceServizio, xForwardedFor, securityContext, httpHeaders);
		this.pagamentoSpontaneo = pagamentoSpontaneo;
	}

	@Override
	protected Response execute() {
		checkNotNull(pagamentoSpontaneo, "Pagamento spontaneo non valorizzato.");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkPagamentoSpontaneoBody(pagamentoSpontaneo);
		ResponsePost res = ptwServiceClient.inserisciPagamentoSpontaneo(xRequestID, xCodiceServizio, pagamentoSpontaneo);
		
		return Response.status(res.getCode()).type(MediaType.APPLICATION_JSON).entity(res.getDescription()).build();
	}
	
	
	private void checkPagamentoSpontaneoBody(PagamentoSpontaneoBody body) {
		checkCondition(body.getIdAsr() != null, "IdAsr non valorizzato");
		checkCondition(body.getIdAsr().intValue() <= 999, "IdAsr non valido");
		checkCondition(body.getCausaleVersamento() != null, "Causale versamento non valorizzata");
		checkCondition(body.getPagato() != null, "Importo non valorizzato");
	}
}
