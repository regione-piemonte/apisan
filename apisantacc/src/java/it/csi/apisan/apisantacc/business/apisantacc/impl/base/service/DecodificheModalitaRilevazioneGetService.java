/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetDecodificaModalitaRilevazioneRequest;
import it.csi.dma.dmaclbluc.GetDecodificheModalitaRilevazioneResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheModalitaRilevazioneGetService extends TaccTaccuinoRESTBaseService {

	
	
	public DecodificheModalitaRilevazioneGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	@Override
	protected Response execute() {

		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		GetDecodificaModalitaRilevazioneRequest request = new GetDecodificaModalitaRilevazioneRequest();				
		
		GetDecodificheModalitaRilevazioneResponse response = taccuinoService.getDecodificaModalitaRilevazione(request);
		
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok(response.getListaModalitaRilevazione().getModalitaRilevazione()).build();
		}
	}

	
	
}
