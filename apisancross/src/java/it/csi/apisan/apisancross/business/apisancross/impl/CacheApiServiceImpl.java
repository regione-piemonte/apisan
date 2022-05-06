/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.CacheApi;
import it.csi.apisan.apisancross.business.apisancross.impl.base.ServiceExecutor;
import it.csi.apisan.apisancross.business.apisancross.impl.service.CacheInitService;
import it.csi.apisan.apisancross.business.apisancross.impl.service.CacheRefreshService;

@Component
public class CacheApiServiceImpl implements CacheApi {
		

	@Override
	public Response init(String bean, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CacheInitService.class, bean, securityContext, httpHeaders);
	}

	@Override
	public Response refresh(String bean, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CacheRefreshService.class, bean, securityContext, httpHeaders);
		
	}
	
	
	


}
