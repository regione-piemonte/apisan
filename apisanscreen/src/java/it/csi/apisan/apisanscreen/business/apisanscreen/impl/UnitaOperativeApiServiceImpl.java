/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl;

import java.math.BigDecimal;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.business.apisanscreen.UnitaOperativeApi;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.UnitaOperativeGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.UnitaOperativeUnitaOperativaIdGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class UnitaOperativeApiServiceImpl implements UnitaOperativeApi {




	@Override
	public Response unitaOperativeUnitaOperativaIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String unitaOperativaId, String tipologia,
			String codiceInterno, String codiceInternoPrefisso, String asl, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(UnitaOperativeUnitaOperativaIdGetService.class, unitaOperativaId, tipologia,
				 codiceInterno,  codiceInternoPrefisso,  asl,  securityContext, httpHeaders);
	}

	@Override
	public Response unitaOperativeGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String tipologia, String lat, String lon, BigDecimal distanza, Integer limit,
			Integer offset, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(UnitaOperativeGetService.class, tipologia, lat, lon, distanza, limit,
				offset, securityContext,  httpHeaders);
	}





}
