/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.dto.CancellaSintomiRequestExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.CancellaSintomiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuinoTaccuinoIdSintomiBulkDeletePostService extends TaccTaccuinoRESTBaseServiceExt {
	
	private List<String> payloadSintomoEliminaMassiva;
	
	public CittadiniCitIdTaccuinoTaccuinoIdSintomiBulkDeletePostService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<String> payloadSintomoEliminaMassiva, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadSintomoEliminaMassiva=payloadSintomoEliminaMassiva;
	}

	@Override
	protected Response execute() {

		checkNotNull(this.payloadSintomoEliminaMassiva, "Dati sintomi da eliminare non impostati");										
		
		GenericRequestExt<CancellaSintomiRequestExt> genericRequestExt = 
				new GenericRequestExt<CancellaSintomiRequestExt>(new CancellaSintomiRequestExt(payloadSintomoEliminaMassiva.stream().map(s ->				
				StringUtils.isNumeric(s)?new Long(s):null				
				).collect(Collectors.toList())),this);
		CancellaSintomiRequestExt request = genericRequestExt.getRequest();			
		CancellaSintomiResponse response = taccuinoService.cancellaSintomi(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok().build();
		}
	}

}
