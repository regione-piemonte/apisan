/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.RicevutaPagamento;
import it.csi.apisan.apisanpag.util.filter.TestApisanpag;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PagamentoIdTransazioneRicevutaPostService extends PagRESTBaseService {
	
	private String idTransazione;
	@Autowired
	private PtwServiceClient ptwServiceClient;

	public PagamentoIdTransazioneRicevutaPostService(String xRequestID, String xCodiceServizio, String xForwardedFor, String idTransazione,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(null, xRequestID, xCodiceServizio, xForwardedFor, securityContext, httpHeaders);
		this.idTransazione = idTransazione;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(idTransazione, "Id transazione non valorizzato");
		
		RicevutaPagamento ricevuta = ptwServiceClient.inserisciPagamentoRicevuta(xRequestID, xCodiceServizio, idTransazione);
		System.out.println("*****************+STRINGA FROM OBJECT *******************************");
		System.out.println(TestApisanpag.getStringFromObject(ricevuta));
		System.out.println("***************** FINE STRINGA FROM OBJECT *******************************");
		
		
		return Response.status(HttpStatus.CREATED.value()).entity(ricevuta).build();
	}

}
