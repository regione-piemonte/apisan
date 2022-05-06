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
import it.csi.apisan.apisantacc.business.mapper.ModelSintomoSintomoMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadSintomoNuovoSintomoMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelSintomo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadSintomoNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetSintomoRequest;
import it.csi.dma.dmaclbluc.SetSintomoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdSintomiPostService extends TaccTaccuinoRESTBaseServiceExt {
	
	private PayloadSintomoNuovo payloadSintomoNuovo;
	
	public CittadiniCitIdTaccuiniTaccuinoIdSintomiPostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadSintomoNuovo payloadSintomoNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadSintomoNuovo=payloadSintomoNuovo;
		
	}

	@Override
	protected Response execute() {

		checkNotNull(this.payloadSintomoNuovo, "Dati sintomo da inserire non impostati");										
		
		GenericRequestExt<SetSintomoRequest> genericRequestExt = new GenericRequestExt<SetSintomoRequest>(new SetSintomoRequest(),this);
		SetSintomoRequest request = genericRequestExt.getRequest();
		request.setSintomo(new PayloadSintomoNuovoSintomoMapper().to(this.payloadSintomoNuovo));		
		SetSintomoResponse response = taccuinoService.setSintomo(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelSintomo sintomo =  new ModelSintomoSintomoMapper().from(response.getSintomo());
			return Response.status(Status.CREATED).entity(sintomo).build();
		}
	}

}
