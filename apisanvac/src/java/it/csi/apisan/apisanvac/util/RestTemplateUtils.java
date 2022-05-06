/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;

import javax.ws.rs.core.Application;

public class RestTemplateUtils {
	
	private static LogUtil log = new LogUtil(RestTemplateUtils.class);
    /**
     * Implementare l'eventuale paylod quando post
     * @param serviceUrl
     * @param authHeaderName
     * @param authHeaderValue
     * @param method
     * @return
     */
    public static ResponseEntity<String> invokeUrlWithRestTemplate(String serviceUrl, String authHeaderName, String authHeaderValue, HttpMethod method) {
    	final String METHOD_NAME = "invokeUrlWithRestTemplate";
        RestTemplate restTemplate = new RestTemplate();

        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        headers.set(authHeaderName, authHeaderValue);
        HttpEntity<String> entity = new HttpEntity<String>("", headers);
        log.info(METHOD_NAME, "url: %s", serviceUrl);
        return restTemplate.exchange(serviceUrl, method, entity, String.class);
    }
    
    /**
     * @param serviceUrl
     * @param authHeaderName
     * @param authHeaderValue
     * @param method
     * @param payload
     * @return
     */
    public static ResponseEntity<String> invokeUrlWithRestTemplate(String serviceUrl, String authHeaderName, String authHeaderValue, HttpMethod method, String payload) {
    	final String METHOD_NAME = "invokeUrlWithRestTemplate";
        RestTemplate restTemplate = new RestTemplate();

        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        headers.set(authHeaderName, authHeaderValue);
        
        HttpEntity<Object> entity = new HttpEntity<>(payload, headers);
        log.info(METHOD_NAME, "url: %s", serviceUrl);
        return restTemplate.exchange(serviceUrl, method, entity, String.class);
    }
    
}
