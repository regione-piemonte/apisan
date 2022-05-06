/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl;

import java.math.BigDecimal;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscerev.business.apisanscerev.AmbulatoriApi;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.AmbulatoriGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AmbulatoriApiServiceImpl implements AmbulatoriApi {


	@Override
	public Response ambulatoriGet(String xRequestId, String xForwardedFor, String xCodiceServizio, String nomeMedico,
			String sesso, String tipologia, String longitudine, String latitudine, BigDecimal distanza, Integer limit,
			Integer offset, Boolean disponibilita, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(AmbulatoriGetService.class,  nomeMedico, sesso, tipologia, longitudine,latitudine, distanza, limit, offset, disponibilita, securityContext,  httpHeaders);
	}
	
	
	
	
    /*  public Response ambulatoriGet(String xRequestId,String xForwardedFor,String xCodiceServizio,String nomeMedico,String sesso,String tipologia,String coordinate,Integer distanza,Integer limit,Integer offset,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(AmbulatoriGetService.class,  nomeMedico, sesso, tipologia, coordinate, distanza, limit, offset, securityContext,  httpHeaders);
  }*/
}
