/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.util.LogUtil;
import it.csi.apisan.apisanvac.util.MapperUtils;
import it.csi.apisan.apisanvac.util.RestTemplateUtils;
import org.codehaus.jettison.json.JSONObject;
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

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdPromemoriaGetService extends DelegheRESTBaseService {

    @Value("${basePath}")                String basePath;
    @Value("${contextPath}")             String contextPath;
    @Value("${serviceStampaPromemoria}") String servicePath;
    @Value("${authHeaderName}")          String authHeaderName;
    @Value("${authHeaderValue}")         String authHeaderValue;

    private String _appuntamentoId;
    private String _citId;
    private String _contentDisposition;


    public CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdPromemoriaGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId, String contentDisposition, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(xRequestId, securityContext, httpHeaders, request, response);
        this._appuntamentoId            = appuntamentoId;
        this._citId                     = citId;
        this._contentDisposition        = contentDisposition;
    }

    @Override protected Response execute() {

        /* Validazione */
        checkNotNull(_appuntamentoId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_cittadinoId non valorizzato"));
        checkNotNull(_citId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_cittadinoId non valorizzato"));
        checkUtenteAutorizzatoOrDelegato(_citId);


        /* Execute Call To Service Appuntamento */
        /* Invocazione con REST Template */


        final String serviceUrl = basePath + contextPath + servicePath + "?IdAppuntamento=" + _appuntamentoId;
        byte[]       streamPDF  = null;

        String nameOutput = "stampaPromemoriaAppuntamento_n" + _appuntamentoId + ".pdf";

        /* Response */
        try {
            ResponseEntity<String> respEntity = RestTemplateUtils.invokeUrlWithRestTemplate(serviceUrl, authHeaderName, authHeaderValue, HttpMethod.GET);
            String                 result     = respEntity.getBody();

            JSONObject jsonObject = new JSONObject(result);
            String     pdfEncoded = jsonObject.getString("AvvisoPdf");

            streamPDF = MapperUtils.base64toPDF(pdfEncoded);
        } catch (Exception e) {
            log.error("StampaAppuntamento", e.getMessage());

            return Response.serverError().entity(e.getMessage())
                    .status(500)
                    .type(MediaType.APPLICATION_JSON)
                    .header("X-Request-ID", xRequestId)
                    .build();
        }

        /* Gestione dell'errore */
        // TODO In attesa che arrivino i dettagli dal cliente

        return Response.ok(streamPDF, MediaType.APPLICATION_OCTET_STREAM_TYPE).header("Content-Type", "application/pdf").header("Content-Disposition", "attachment; filename=" + nameOutput).build();
    }

}
