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
public class CittadiniCitIdDocumentiDataDocumentoPdfGetService extends DelegheRESTBaseService {


    @Value("${basePath}")               String basePath;
    @Value("${contextPath}")            String contextPath;
    @Value("${serviceStampaDocumento}") String servicePath;
    @Value("${authHeaderName}")         String authHeaderName;
    @Value("${authHeaderValue}")        String authHeaderValue;


    private String _citId;
    private String _dataDocumento;
    private String _contentDisposition;

    public CittadiniCitIdDocumentiDataDocumentoPdfGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String dataDocumento, String contentDisposition, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(xRequestId, securityContext, httpHeaders, request, response);
        this._dataDocumento             = dataDocumento;
        this._citId                     = citId;
        this._contentDisposition        = contentDisposition;
    }

    @Override protected Response execute() {

        /* Validazione */
        checkNotNull(_dataDocumento, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "dataDocumento non valorizzato"));
        checkDateFormat(_dataDocumento, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Formato Data Errato per la data data del documento. Es: yyyy-MM-dd'T'HH:mm:ss"));
        checkNotNull(_citId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_citId non valorizzato"));
        checkUtenteAutorizzatoOrDelegato(_citId);


        /* Execute Call To Service Appuntamento */
        /* Invocazione con REST Template */

        // TODO da validare
        final String serviceUrl = basePath + contextPath + servicePath + "?CodiceFiscale=" + _citId +"&Data="+_dataDocumento;
        byte[]       streamPDF  = null;

        /* Response */
        try {
            ResponseEntity<String> respEntity = RestTemplateUtils.invokeUrlWithRestTemplate(serviceUrl, authHeaderName, authHeaderValue, HttpMethod.GET);
            String                 result     = respEntity.getBody();

            JSONObject jsonObject = new JSONObject(result);
            String     pdfEncoded = jsonObject.getString("SchedaVaccinale64");

            streamPDF = MapperUtils.base64toPDF(pdfEncoded);
//            streamPDF = MapperUtils.base64toPDF(result);

        } catch (Exception e) {
            log.error("StampaDocumento", e.getMessage());

            return Response.serverError().entity(e.getMessage())
                    .status(500)
                    .type(MediaType.APPLICATION_JSON)
                    .header("X-Request-ID", xRequestId)
                    .build();
        }

        /* Gestione dell'errore */
        // TODO In attesa che arrivino i dettagli dal cliente

        //TODO CONTROLLARE SE IL RETURN E' GIUSTO
        return Response.ok(streamPDF, MediaType.APPLICATION_OCTET_STREAM_TYPE).header("Content-Type", "application/pdf").header("Content-Disposition", "attachment; filename=output.pdf").build();
    }

}
