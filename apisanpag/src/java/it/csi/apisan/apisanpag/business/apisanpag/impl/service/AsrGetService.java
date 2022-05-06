/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AsrGetService extends PagRESTBaseService {
	
//	@Autowired
//	PresidiAsrMock asr;
	
	@Autowired
	PtwServiceClient ptwServiceClient;
	
	public AsrGetService( SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}

	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		log.debug(METHOD_NAME, "xRequestID: %s, xCodiceServizio: %s", xRequestID, xCodiceServizio);
		
		checkNotBlank(xRequestID, "Request non valorizzata");
		checkNotBlank(xCodiceServizio, "Request non valorizzata");
		
		List<Asr> result = ptwServiceClient.getAsr(xRequestID, xCodiceServizio);
		
		return Response.ok(result).build();
	}

}
