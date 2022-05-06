/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import it.csi.apisan.apisanesenpat.api.TipologieDocumentoApi;
import it.csi.apisan.apisanesenpat.service.ApisanEsenPatService;
import it.csi.apisan.apisanesenpat.service.ServiceExecutor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Deprecated
@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TipologieDocumentApiImpl implements TipologieDocumentoApi {
    @Override
    public Response tipologieDocumentoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        return ServiceExecutor.execute(ApisanEsenPatService.class,shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, securityContext, httpHeaders, request, response);
    }
}
