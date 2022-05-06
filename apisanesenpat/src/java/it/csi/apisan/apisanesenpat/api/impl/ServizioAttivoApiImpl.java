/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanesenpat.api.ServizioAttivoApi;
import it.csi.apisan.apisanesenpat.service.ServiceExecutor;
import it.csi.apisan.apisanesenpat.service.ServizioAttivoGetService;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiImpl implements ServizioAttivoApi {
    @Override public Response servizioAttivoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
    	return ServiceExecutor.execute(ServizioAttivoGetService.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio,  securityContext, httpHeaders, request, response);
    }
}
