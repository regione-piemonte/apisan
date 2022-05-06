/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import it.csi.apisan.apisanesenpat.api.StatiEsenzioneApi;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Deprecated
@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StatiEsenzioneApiImpl implements StatiEsenzioneApi {

    @Override public Response statiEsenzioneGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
        return null;
    }
}
