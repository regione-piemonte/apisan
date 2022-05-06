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
import it.csi.apisan.apisantacc.business.mapper.ModelFarmacoAssunzioneFarmacoMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadFarmacoNuovoAssunzioneFarmacoMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelFarmaco;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadFarmacoNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetFarmacoRequest;
import it.csi.dma.dmaclbluc.SetFarmacoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdFarmaciPostService extends TaccTaccuinoRESTBaseServiceExt {

	private PayloadFarmacoNuovo payloadFarmacoNuovo;
	
	public CittadiniCitIdTaccuiniTaccuinoIdFarmaciPostService(String shibIdentitaCodiceFiscale, String xRequestId,
	String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
	PayloadFarmacoNuovo payloadFarmacoNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadFarmacoNuovo=payloadFarmacoNuovo;
	}
	
	@Override
	protected Response execute() {	
				
		checkNotNull(this.payloadFarmacoNuovo, "Dati farmaco da inserire non impostati");										
		
		GenericRequestExt<SetFarmacoRequest> genericRequestExt = new GenericRequestExt<SetFarmacoRequest>(new SetFarmacoRequest(),this);
		SetFarmacoRequest request = genericRequestExt.getRequest();
		request.setAssunzioneFarmaco(new PayloadFarmacoNuovoAssunzioneFarmacoMapper().to(this.payloadFarmacoNuovo));		
				
	    SetFarmacoResponse response = taccuinoService.setFarmaco(request);	    

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelFarmaco farmaco =  new ModelFarmacoAssunzioneFarmacoMapper().from(response.getAssunzioneFarmaco());
			
			return Response.status(Status.CREATED).entity(farmaco).build();
		}
	}
}
