/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.apisan.apisantacc.business.mapper.ModelDietaDietaMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadDietaNuovoDietaMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDieta;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadDietaNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetDietaRequest;
import it.csi.dma.dmaclbluc.SetDietaResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdDietePostService extends TaccTaccuinoRESTBaseServiceExt{
	
	private PayloadDietaNuovo payloadDietaNuovo;

	public CittadiniCitIdTaccuiniTaccuinoIdDietePostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadDietaNuovo payloadDietaNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadDietaNuovo=payloadDietaNuovo;
	}

	@Override
	protected Response execute() {	
				
		checkNotNull(this.payloadDietaNuovo, "Dati dieta da inserire non impostati");										
		
		GenericRequestExt<SetDietaRequest> genericRequestExt = new GenericRequestExt<SetDietaRequest>(new SetDietaRequest(),this);
		SetDietaRequest request = genericRequestExt.getRequest();
		request.setDieta(new PayloadDietaNuovoDietaMapper().to(this.payloadDietaNuovo));		
	    SetDietaResponse response = taccuinoService.setDieta(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelDieta dieta =  new ModelDietaDietaMapper().from(response.getDieta());
			return Response.status(Status.CREATED).entity(dieta).build();
		}
	}
		
}
