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

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.CancellaEventoRequest;
import it.csi.dma.dmaclbluc.CancellaEventoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdEventiEventoIdDeleteService extends TaccTaccuinoRESTBaseServiceExt{
	
	private Long eventoId;
	
	public CittadiniCitIdTaccuiniTaccuinoIdEventiEventoIdDeleteService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			Long eventoId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);		
		this.eventoId=eventoId;
		
	}
	
	@Override
	protected Response execute() {
				
		checkNotNull(this.eventoId, "Dati evento da rimuovere non impostati");										

		GenericRequestExt<CancellaEventoRequest> genericRequestExt = new GenericRequestExt<CancellaEventoRequest>(new CancellaEventoRequest(),this);
		genericRequestExt.getRequest().setIdEvento(this.eventoId);				
		CancellaEventoResponse response = taccuinoService.cancellaEvento(genericRequestExt.getRequest());
	    
	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok().build();
		}

	}

}
