/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpresc.business.apisanpresc.CittadiniApi;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.CittadiniCitIdRicetteNrePdfGetService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.DettaglioNRE;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.ElencoRicette;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.NascondiNRE;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.ServiceExecutor;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Payload;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiImpl implements CittadiniApi {


    @Override public Response cittadiniCitIdRicetteGet(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        return ServiceExecutor.execute(ElencoRicette.class, shibIdentitaCodiceFiscale, xCodiceServizio, xRequestID, xForwardedFor, citId, filter, securityContext, httpHeaders, request);
    }

    @Override public Response cittadiniCitIdRicetteNreGet(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String nre, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        return ServiceExecutor.execute(DettaglioNRE.class, shibIdentitaCodiceFiscale, xCodiceServizio, xRequestID, xForwardedFor, citId, nre, filter, securityContext, httpHeaders, request);
    }

    @Override public Response nascondiRicetta(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String nre, Payload payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        return ServiceExecutor.execute(NascondiNRE.class, shibIdentitaCodiceFiscale, xCodiceServizio, xRequestID, xForwardedFor, citId, nre, payload, securityContext, httpHeaders, request);
    }

    @Override public Response cittadiniCitIdRicetteNrePdfGet(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String nre, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        return ServiceExecutor.execute(CittadiniCitIdRicetteNrePdfGetService.class, shibIdentitaCodiceFiscale, xCodiceServizio, xRequestID, xForwardedFor, citId, nre, filter, securityContext, httpHeaders, request);
    }

}