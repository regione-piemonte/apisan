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
import it.csi.apisan.apisantacc.business.mapper.ModelFarmacoAssunzioneFarmacoMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelFarmaco;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetFarmaciRequest;
import it.csi.dma.dmaclbluc.GetFarmaciResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdFarmaciGetService extends TaccTaccuinoRESTBaseService {

	String citId; 
	GetFarmaciRequest farmaciRequest;
	
	
	public CittadiniCitIdTaccuiniTaccuinoIdFarmaciGetService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		farmaciRequest=newRequestCommonGet(taccuinoId, limit, offset, ordinamento, da, a);
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "xRequestID non impostato");
		checkNotBlank(xCodiceServizio, "xRequestID non impostato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotBlank(xForwardedFor, "xForwardedFor non impostato");
		//checkNotNull(requestCommonGet.get, re);
		
		GetFarmaciResponse response = taccuinoService.getFarmaci(farmaciRequest);
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			toRESTException(response.getErrori());
		} else {
			List<ModelFarmaco> farmaci =  new ModelFarmacoAssunzioneFarmacoMapper().fromList(response.getListaAssunzioneFarmaci().getAssunzioneFarmaco());
			return Response.ok(farmaci).build();
		}
		return null;
		
	}
	
	
	private GetFarmaciRequest newRequestCommonGet( 
	Long taccuinoId, 
	Integer limit,
	Integer offset, 
	String ordinamento, 	
	String da, 
	String a) {
		GetFarmaciRequest request = new GetFarmaciRequest();
		request= (GetFarmaciRequest)setGenericGetRequest(request, taccuinoId, limit, offset, ordinamento, da, a);
		request.setPaziente(citId);				
		return request;
	}
}
