/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import it.csi.apisan.apisanesenpat.api.TipologieEsenzioneApi;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import io.swagger.annotations.ApiParam;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Deprecated
@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TipologieEsenzioneApiImpl implements TipologieEsenzioneApi {

    @Override public Response tipologieEsenzioneGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }

    @Override public Response tipologieEsenzioneTipologiaCodiceEsenzioniEsenzioneCodiceGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String tipologiaCodice, String esenzioneCodice, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }

    @Override public Response tipologieEsenzioneTipologiaCodiceEsenzioniGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String tipologiaCodice, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }

    @Override public Response tipologieEsenzioneTipologiaCodiceMalattieGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String tipologiaCodice, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }

    @Override public Response tipologieEsenzioneTipologiaCodiceMalattieMalattiaCodiceGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String tipologiaCodice, String malattiaCodice, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }

    @Override public Response tipologieEsenzioneTipologiaCodiceTipologieDocumentoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String tipologiaCodice, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }
}
