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
import it.csi.dma.dmaclbluc.CancellaDietaRequest;
import it.csi.dma.dmaclbluc.CancellaDietaResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdDieteDietaIdDeleteService extends TaccTaccuinoRESTBaseServiceExt{
	
	private Long dietaId;

	public CittadiniCitIdTaccuiniTaccuinoIdDieteDietaIdDeleteService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			Long dietaId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);		
		this.dietaId=dietaId;
		
	}

	@Override
	protected Response execute() {
				
		checkNotNull(this.dietaId, "Dati dieta da rimuovere non impostati");										

		GenericRequestExt<CancellaDietaRequest> genericRequestExt = new GenericRequestExt<CancellaDietaRequest>(new CancellaDietaRequest(),this);
		genericRequestExt.getRequest().setIdentificativoDieta(this.dietaId);				
	    CancellaDietaResponse response = taccuinoService.cancellaDieta(genericRequestExt.getRequest());
	    
	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok().build();
		}

	}
}
