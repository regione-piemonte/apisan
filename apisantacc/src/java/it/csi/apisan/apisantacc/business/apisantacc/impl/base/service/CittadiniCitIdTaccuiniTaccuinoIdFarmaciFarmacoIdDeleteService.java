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
import it.csi.dma.dmaclbluc.CancellaFarmacoRequest;
import it.csi.dma.dmaclbluc.CancellaFarmacoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdFarmaciFarmacoIdDeleteService extends TaccTaccuinoRESTBaseServiceExt {

	private Long farmacoId;
	
	public CittadiniCitIdTaccuiniTaccuinoIdFarmaciFarmacoIdDeleteService(String shibIdentitaCodiceFiscale,
	String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
	Long farmacoId, SecurityContext securityContext, HttpHeaders httpHeaders){
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);		
		this.farmacoId=farmacoId;
		
	}
	
	@Override
	protected Response execute() {
				
		checkNotNull(this.farmacoId, "Dati farmaco da rimuovere non impostati");										

		GenericRequestExt<CancellaFarmacoRequest> genericRequestExt = new GenericRequestExt<CancellaFarmacoRequest>(new CancellaFarmacoRequest(),this);
		genericRequestExt.getRequest().setIdentificativoFarmaco(this.farmacoId);			
		CancellaFarmacoResponse response = taccuinoService.cancellaFarmaco(genericRequestExt.getRequest());	
    
	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok().build();
		}

	}
}
