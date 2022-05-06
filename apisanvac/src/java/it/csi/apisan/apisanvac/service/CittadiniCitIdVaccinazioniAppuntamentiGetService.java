/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.ModelAppuntamento;
import it.csi.apisan.apisanvac.util.FilterSoloCovid;
import it.csi.apisan.apisanvac.util.FilterUtil;
import it.csi.apisan.apisanvac.util.LogUtil;
import it.csi.apisan.apisanvac.util.MapperUtils;
import it.csi.apisan.apisanvac.util.RestTemplateUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiGetService extends DelegheRESTBaseService {

    @Value("${basePath}")                 String basePath;
    @Value("${contextPath}")              String contextPath;
    @Value("${serviceListaAppuntamento}") String servicePath;
    @Value("${authHeaderName}")           String authHeaderName;
    @Value("${authHeaderValue}")          String authHeaderValue;

    private String _cittadinoId;
    private String _cfPaziente;
    private String filter;

    ///cittadini/{cit_id}/vaccinazioni/appuntamenti
    public CittadiniCitIdVaccinazioniAppuntamentiGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, 
    		String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(xRequestId, securityContext, httpHeaders, request, response);
        this._cittadinoId               = citId;
        this.filter = filter;
    }

    @Override protected Response execute() {

        /* Validazione */
        checkNotNull(_cittadinoId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_cittadinoId non valorizzato"));
        checkUtenteAutorizzatoOrDelegato(_cittadinoId);


        /* Execute Call To Service DettaglioCentroVaccinale */
        /* Invocazione con REST Template */
        ///GetAppuntamenti?CodiceFiscale={cit_id}
        
        //prendo il filtro se impostato
        FilterSoloCovid filtroSoloCovid = FilterUtil.init(FilterSoloCovid.class, filter);
        
        String serviceUrl = basePath + contextPath + servicePath + "?CodiceFiscale=" + _cittadinoId;

        if(filtroSoloCovid != null  && filtroSoloCovid.getSoloCovid() != null && !StringUtils.isEmpty(filtroSoloCovid.getSoloCovid().getEq() )){
        	serviceUrl += "&soloCovid=" + filtroSoloCovid.getSoloCovid().getEq();
        }
        
        List<ModelAppuntamento> appuntamenti = null;

        /* Response */
        try {

            ResponseEntity<String> respEntity = RestTemplateUtils.invokeUrlWithRestTemplate(serviceUrl, authHeaderName, authHeaderValue, HttpMethod.GET);
            String                 result     = respEntity.getBody();

            appuntamenti = MapperUtils.createModelAppuntamento(result);

        } catch (org.springframework.web.client.HttpClientErrorException hcee) {
			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())
					&& (responseBodyAsString.contains("Codice fiscale non trovato") || responseBodyAsString.contains("nessun elemento"))) {
				appuntamenti = new ArrayList<ModelAppuntamento>();
			} else {
				throw hcee;
			}
		} 
        catch (Exception e) {
            log.error("CittadiniCitIdVaccinazioniAppuntamentiGetService", e.getMessage());
            return Response.serverError().entity(e.getMessage())
                    .status(500)
                    .type(MediaType.APPLICATION_JSON)
                    .header("X-Request-ID", xRequestId)
                    .build();
        }


        return Response.ok(appuntamenti, MediaType.APPLICATION_JSON_TYPE).build();
    }

}
