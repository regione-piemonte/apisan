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
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.RispostaServizio;
import it.csi.apisan.apisanpag.dto.apisanpag.StatoTransazione;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class RimborsiIdTransazioneStatoErogazionePutService extends PagRESTBaseService {
	private String idTransazione;
	private StatoTransazione statoTransazione;
	@Autowired
	PtwServiceClient serviceClient;
	
	public RimborsiIdTransazioneStatoErogazionePutService(String idTransazione, StatoTransazione statoTransazione,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.idTransazione = idTransazione;
		this.statoTransazione = statoTransazione;
		
	}



	@Override
	protected Response execute() {
		checkNotNull(xRequestID, "request id non valorizzato");
		checkNotNull(xCodiceServizio, "codice servizio non valorizzato");
		checkNotBlank(idTransazione, "Id transazione non valorizzato");
		
		RispostaServizio res = serviceClient.putStatoTransazione(xRequestID, xCodiceServizio, idTransazione, statoTransazione);
		return Response.ok(res).build();
	}

}
