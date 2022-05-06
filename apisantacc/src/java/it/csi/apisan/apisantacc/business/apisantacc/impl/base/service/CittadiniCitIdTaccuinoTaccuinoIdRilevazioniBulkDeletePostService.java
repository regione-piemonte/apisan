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
import it.csi.apisan.apisantacc.business.dto.CancellaRilevazioniRequestExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.CancellaRilevazioniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuinoTaccuinoIdRilevazioniBulkDeletePostService extends TaccTaccuinoRESTBaseServiceExt{
	
	private List<String> payloadRilevazioniEliminaMassiva;

	public CittadiniCitIdTaccuinoTaccuinoIdRilevazioniBulkDeletePostService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<String> payloadRilevazioniEliminaMassiva, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadRilevazioniEliminaMassiva=payloadRilevazioniEliminaMassiva;		
	}

	@Override
	protected Response execute() {	
				
		checkNotNull(this.payloadRilevazioniEliminaMassiva, "Dati rilevazione da eliminare non impostati");										
		
		GenericRequestExt<CancellaRilevazioniRequestExt> genericRequestExt = 
				new GenericRequestExt<CancellaRilevazioniRequestExt>(new CancellaRilevazioniRequestExt(payloadRilevazioniEliminaMassiva.stream().map(s ->				
				StringUtils.isNumeric(s)?new Long(s):null				
				).collect(Collectors.toList())),this);
		CancellaRilevazioniRequestExt request = genericRequestExt.getRequest();				
		CancellaRilevazioniResponse response = taccuinoService.cancellaRilevazioni(request);

		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok().build();
		}
	}
}
