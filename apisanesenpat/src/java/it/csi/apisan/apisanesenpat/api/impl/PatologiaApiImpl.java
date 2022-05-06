/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import it.csi.apisan.apisanesenpat.api.PatologiaApi;
import it.csi.apisan.apisanesenpat.model.*;
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

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PatologiaApiImpl implements PatologiaApi {

    @Override public Response annullaEsenzioneGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, Payload4 payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        service.set_payload4(payload);
        return service.executeService();
    }

    @Override public Response dettaglioEsenzioneGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        return service.executeService();
    }

    @Override public Response downloadAttestatiGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_isPdf(true);
        return service.executeService();
    }

    @Override public Response listaEsenzioniGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_filter(filter);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdCertificatiCertificatoIdGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String certificatoId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_certificatoId(certificatoId);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdCertificatiCertificatoIdPdfGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String certificatoId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_certificatoId(certificatoId);
        service.set_isPdf(true);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdCertificatiGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_filter(filter);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdEsenzioniEsenzioneIdPdfGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, String documentType, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        service.set_documentType(documentType);
        service.set_isPdf(true);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdEsenzioniEsenzioneIdStoricoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdEsenzioniEsenzioneIdZipGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        service.set_isZip(true);
        return service.executeService();
    }

    @Override public Response patologiaCittadiniCitIdEsenzioniPost(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Payload payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_payload(payload);
        return service.executeService();
    }

    @Override public Response rettificaEsenzioneGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, Payload1 payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        service.set_payload1(payload);
        return service.executeService();
    }

    @Override public Response revocaEsenzioneGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, Payload3 payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        service.set_payload3(payload);
        return service.executeService();
    }

    @Override public Response rinnovoEsenzioneGiallo(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, Payload2 payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_esenzioneId(esenzioneId);
        service.set_payload2(payload);
        return service.executeService();
    }
}
