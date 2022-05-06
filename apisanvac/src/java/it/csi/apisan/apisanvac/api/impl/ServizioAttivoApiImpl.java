/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.api.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanvac.api.ServizioAttivoApi;
import it.csi.apisan.apisanvac.common.ServiceExecutor;
import it.csi.apisan.apisanvac.service.ServizioAttivoGetService;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiImpl implements ServizioAttivoApi {
    @Override 
    public Response servizioAttivoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
    	return ServiceExecutor.execute(ServizioAttivoGetService.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio,  securityContext, httpHeaders, request, response);
    }

}
