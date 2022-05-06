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
import it.csi.apisan.apisantacc.business.dto.CancellaContattiStruttureRequestExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.CancellaContattiStruttureRequest;
import it.csi.dma.dmaclbluc.CancellaContattiStruttureResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuinoTaccuinoIdContattiStruttureBulkDeletePostService extends TaccTaccuinoRESTBaseServiceExt{
	
	private List<String> payloadContattoConStrutturaEliminaMassiva;

	public CittadiniCitIdTaccuinoTaccuinoIdContattiStruttureBulkDeletePostService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<String> payloadContattoConStrutturaEliminaMassiva, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadContattoConStrutturaEliminaMassiva=payloadContattoConStrutturaEliminaMassiva;		
	}

	@Override
	protected Response execute() {	
				
		checkNotNull(this.payloadContattoConStrutturaEliminaMassiva, "Dati contatti con struttuta da eliminare non impostati");										
		
		GenericRequestExt<CancellaContattiStruttureRequestExt> genericRequestExt = 
				new GenericRequestExt<CancellaContattiStruttureRequestExt>(new CancellaContattiStruttureRequestExt(payloadContattoConStrutturaEliminaMassiva.stream().map(s ->				
				StringUtils.isNumeric(s)?new Long(s):null				
				).collect(Collectors.toList())),this);
		CancellaContattiStruttureRequest request = genericRequestExt.getRequest();				
		CancellaContattiStruttureResponse response = taccuinoService.cancellaContattiStrutture(request);

		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {			
			return Response.ok().build();
		}
	}
}
