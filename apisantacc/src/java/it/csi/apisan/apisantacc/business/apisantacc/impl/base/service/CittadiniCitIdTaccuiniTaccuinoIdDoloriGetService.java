/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelDoloreDoloreMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDolore;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetDoloriRequest;
import it.csi.dma.dmaclbluc.GetDoloriResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdDoloriGetService extends TaccTaccuinoRESTBaseService {
	
	String citId; 
	GetDoloriRequest doloriRequest;
	
	

	
	public CittadiniCitIdTaccuiniTaccuinoIdDoloriGetService(String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		doloriRequest = newRequestCommonGet(taccuinoId, limit, offset, ordinamento, da, a);
		
		
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "xRequestID non impostato");
		checkNotBlank(xCodiceServizio, "xRequestID non impostato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotBlank(xForwardedFor, "xForwardedFor non impostato");
		//checkNotNull(requestCommonGet.get, re);
		
		GetDoloriResponse response = taccuinoService.getDolori(doloriRequest);
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			List<ModelDolore> dolori =  new ModelDoloreDoloreMapper().fromList(response.getListaDolori().getDolore());
			return Response.ok(dolori).build();
		}
		
		
	}
	
	
	private GetDoloriRequest newRequestCommonGet( 
	Long taccuinoId, 
	Integer limit,
	Integer offset, 
	String ordinamento, 	
	String da, 
	String a) {
		GetDoloriRequest request = new GetDoloriRequest();
		request= (GetDoloriRequest)setGenericGetRequest(request, taccuinoId, limit, offset, ordinamento, da, a);
		request.setPaziente(citId);				
		return request;
	}
}
