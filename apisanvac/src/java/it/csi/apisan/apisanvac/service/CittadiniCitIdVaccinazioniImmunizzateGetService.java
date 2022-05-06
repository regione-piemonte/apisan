/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.ModelVaccinazioneImmunizzata;
import it.csi.apisan.apisanvac.util.LogUtil;
import it.csi.apisan.apisanvac.util.MapperUtils;
import it.csi.apisan.apisanvac.util.RestTemplateUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniImmunizzateGetService extends DelegheRESTBaseService {

    @Value("${basePath}")                       String basePath;
    @Value("${contextPath}")                    String contextPath;
    @Value("${serviceListaVaccinazioniImmuni}") String servicePath;
    @Value("${authHeaderName}")                 String authHeaderName;
    @Value("${authHeaderValue}")                String authHeaderValue;

    private String _cittadinoId;

    public CittadiniCitIdVaccinazioniImmunizzateGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(xRequestId, securityContext, httpHeaders, request, response);
        this._cittadinoId               = citId;
    }

    @Override protected Response execute() {

        /* Validazione */
        checkNotNull(_cittadinoId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_cittadinoId non valorizzato"));
        checkUtenteAutorizzatoOrDelegato(_cittadinoId);



        /* Execute Call To Service DettaglioCentroVaccinale */
        /* Invocazione con REST Template */
        final String serviceUrl = basePath + contextPath + servicePath + "?CodiceFiscale=" + _cittadinoId;

        List<ModelVaccinazioneImmunizzata> vaccinazioniImmunizzate = null;

        /* Response */
        try {
            ResponseEntity<String> respEntity = RestTemplateUtils.invokeUrlWithRestTemplate(serviceUrl, authHeaderName, authHeaderValue, HttpMethod.GET);
            String                 result     = respEntity.getBody();

            vaccinazioniImmunizzate = MapperUtils.createModelVaccinazioneImmunizzata(result);
        } catch (Exception e) {
            log.error("CittadiniCitIdVaccinazioniImmunizzateGetService", e.getMessage());

            return Response.serverError().entity(e.getMessage())
                    .status(500)
                    .type(MediaType.APPLICATION_JSON)
                    .header("X-Request-ID", xRequestId)
                    .build();
        }

        /* Gestione dell'errore */
        // TODO In attesa che arrivino i dettagli dal cliente

        return Response.ok(vaccinazioniImmunizzate, MediaType.APPLICATION_JSON_TYPE).build();
    }

}
