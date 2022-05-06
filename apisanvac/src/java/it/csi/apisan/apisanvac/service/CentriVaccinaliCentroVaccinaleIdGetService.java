/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanvac.common.ApisanVacStatus;
import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.ErroreBuilder;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinale;
import it.csi.apisan.apisanvac.util.MapperUtils;
import it.csi.apisan.apisanvac.util.RestTemplateUtils;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CentriVaccinaliCentroVaccinaleIdGetService extends DelegheRESTBaseService {


    @Value("${basePath}")                        String basePath;
    @Value("${contextPath}")                     String contextPath;
    @Value("${serviceDettaglioCentroVaccinale}") String servicePath;
    @Value("${authHeaderName}")                  String authHeaderName;
    @Value("${authHeaderValue}")                 String authHeaderValue;

    private String _centroVaccinaleId;

    public CentriVaccinaliCentroVaccinaleIdGetService(String shibIdentitaCodiceFiscale, 
    		String xRequestId, String xForwardedFor, String xCodiceServizio, 
    		String centroVaccinaleId, 
    		SecurityContext securityContext, HttpHeaders httpHeaders, 
    		HttpServletRequest request, HttpServletResponse response) {
        super(xRequestId, securityContext, httpHeaders, request, response);
        this._centroVaccinaleId         = centroVaccinaleId;
    }

    @Override
	protected Response execute() {
    	final String METHOD_NAME = "execute";
		/* Validazione */
		checkNotBlank(_centroVaccinaleId, "_centroVaccinaleId non valorizzato");

		/* Execute Call To Service DettaglioCentroVaccinale */
		/* Invocazione con REST Template */
		// http://lb-webtst-sirva.nivolapiemonte.it/OnVacAPI/api/CentriVaccinali/Get?CodiceAzienda=010210
		// http://lb-webtst-sirva.nivolapiemonte.it/OnVacAPI/api/CentroVaccinale/GetContattiCentroVaccinale?id=04023801
		final String serviceUrl = basePath + contextPath + servicePath + "?id=" + _centroVaccinaleId;

		ModelCentroVaccinale centroVaccinale = null;

		ResponseEntity<String> respEntity = RestTemplateUtils.invokeUrlWithRestTemplate(serviceUrl, authHeaderName,
				authHeaderValue, HttpMethod.GET);
		String result = respEntity.getBody();
		
		log.info(METHOD_NAME, "result: %s", result);

		try {
			centroVaccinale = MapperUtils.createModelCentroVaccinale(result);
		} catch (JSONException e) {
			log.error("CentriVaccinaliCentroVaccinaleIdGetService", e.getMessage());
			return Response.serverError().entity(e.getMessage()).status(500).type(MediaType.APPLICATION_JSON)
					.header("X-Request-ID", xRequestId).build();
		}

		if (centroVaccinale == null) {
			throw ErroreBuilder.from(ApisanVacStatus.ENTITA_NON_TROVATA).exception();
		}

		return Response.ok(centroVaccinale, MediaType.APPLICATION_JSON_TYPE).build();
	}

}
