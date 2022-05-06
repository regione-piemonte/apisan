/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.apisan.apisantacc.business.dto.ListaRilevazioniRequestExt;
import it.csi.apisan.apisantacc.business.mapper.ModelRilevazioneRilevazioneResponseMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadRilevazioniNuovoListaRilevazioniRequestMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazione;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadRilevazioniNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetRilevazioniRequest;
import it.csi.dma.dmaclbluc.SetRilevazioniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuinoTaccuinoIdRilevazioniPostService extends TaccTaccuinoRESTBaseServiceExt{
	
	private PayloadRilevazioniNuovo payloadRilevazioniNuovo;
	
	public CittadiniCitIdTaccuinoTaccuinoIdRilevazioniPostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadRilevazioniNuovo payloadRilevazioniNuovo, SecurityContext securityContext, HttpHeaders httpHeaders){
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadRilevazioniNuovo=payloadRilevazioniNuovo;		
	}

	@Override
	protected Response execute() {	
				
		checkNotNull(this.payloadRilevazioniNuovo, "Dati rilevazione  da inserire non impostati");										
		
		GenericRequestExt<SetRilevazioniRequest> genericRequestExt = new GenericRequestExt<SetRilevazioniRequest>(new SetRilevazioniRequest(),this);
		SetRilevazioniRequest request = genericRequestExt.getRequest();
		
		ListaRilevazioniRequestExt listaRilevazioniRequest = new ListaRilevazioniRequestExt(this.payloadRilevazioniNuovo.getLista().stream().map(
				r -> new PayloadRilevazioniNuovoListaRilevazioniRequestMapper().to(r)
		).collect(Collectors.toList()));		
		request.setListaRilevazioni(listaRilevazioniRequest);		
		SetRilevazioniResponse response = taccuinoService.setRilevazioni(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			List<ModelRilevazione> modelRilevazione = response.getListaRilevazioni().getRilevazione().stream().map(r -> new ModelRilevazioneRilevazioneResponseMapper().from(r)).collect(Collectors.toList());									
			return Response.status(Status.CREATED).entity(modelRilevazione).build();
		}
	}

}
