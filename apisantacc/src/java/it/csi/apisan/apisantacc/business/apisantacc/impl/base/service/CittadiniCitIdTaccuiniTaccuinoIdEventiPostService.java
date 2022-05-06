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
import it.csi.apisan.apisantacc.business.mapper.ModelEventoEventoMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadEventoNuovoEventoMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelEvento;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadEventoNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetEventoRequest;
import it.csi.dma.dmaclbluc.SetEventoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdEventiPostService extends TaccTaccuinoRESTBaseServiceExt {
	
	private PayloadEventoNuovo payloadEventoNuovo;
	
	public CittadiniCitIdTaccuiniTaccuinoIdEventiPostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadEventoNuovo payloadEventoNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadEventoNuovo=payloadEventoNuovo;		
	}

	@Override
	protected Response execute() {

		checkNotNull(this.payloadEventoNuovo, "Dati evento da inserire non impostati");										
		
		GenericRequestExt<SetEventoRequest> genericRequestExt = new GenericRequestExt<SetEventoRequest>(new SetEventoRequest(),this);
		SetEventoRequest request = genericRequestExt.getRequest();
		request.setEvento(new PayloadEventoNuovoEventoMapper().to(this.payloadEventoNuovo));		
		SetEventoResponse response = taccuinoService.setEvento(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelEvento evento =  new ModelEventoEventoMapper().from(response.getEvento());
			return Response.status(Status.CREATED).entity(evento).build();
		}
	}

}
