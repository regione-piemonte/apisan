/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelDietaDietaMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDieta;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetDieteRequest;
import it.csi.dma.dmaclbluc.GetDieteResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdDieteGetService extends TaccTaccuinoRESTBaseService {
	
	String citId; 
	GetDieteRequest dieteRequest;
	
	

	
	public CittadiniCitIdTaccuiniTaccuinoIdDieteGetService(String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		dieteRequest = newRequestCommonGet(taccuinoId, limit, offset, ordinamento, da, a);
		
		
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "xRequestID non impostato");
		checkNotBlank(xCodiceServizio, "xRequestID non impostato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotBlank(xForwardedFor, "xForwardedFor non impostato");
		//checkNotNull(requestCommonGet.get, re);
		
		GetDieteResponse response = taccuinoService.getDiete(dieteRequest);
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			toRESTException(response.getErrori());
		} else {
			if (response.getListaDiete()!=null ) {
				List<ModelDieta> diete =  new ModelDietaDietaMapper().fromList(response.getListaDiete().getDieta());
				return Response.ok(diete).build();
			}
		}
		return null;
		
	}
	
	
	private GetDieteRequest newRequestCommonGet( 
	Long taccuinoId, 
	Integer limit,
	Integer offset, 
	String ordinamento, 	
	String da, 
	String a) {
		GetDieteRequest request = new GetDieteRequest();
		request= (GetDieteRequest)setGenericGetRequest(request, taccuinoId, limit, offset, ordinamento, da, a);
		request.setPaziente(citId);				
		return request;
	}
}
