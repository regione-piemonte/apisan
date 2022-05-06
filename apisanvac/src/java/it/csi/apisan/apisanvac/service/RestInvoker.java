/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisanvac.util.LogUtil;

public class RestInvoker {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
    public ResponseEntity<String> invoke(String serviceUrl, HttpMethod method, String payload, Map<String, String> headersParams, Map<String,?> uriVariable) {
        final String METHOD_NAME = "invoke";
        
    	log.info(METHOD_NAME, "invoking service %s with url parameters: %s", serviceUrl, uriVariable);
    	
    	RestTemplate restTemplate = new RestTemplate();

        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        if(headersParams!=null) {
        	headers.setAll(headersParams);
        }
//        headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
//        headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
//        headers.set(authHeaderName, authHeaderValue);
        
        HttpEntity<String> entity = new HttpEntity<>(payload, headers);
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));

        return restTemplate.exchange(serviceUrl, method, entity, String.class, uriVariable);
    }
    
    

}
