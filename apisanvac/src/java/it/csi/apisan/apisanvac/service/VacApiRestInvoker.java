/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asText;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.common.ErroreBuilder;

@Component
public class VacApiRestInvoker extends RestInvoker {
	
	@Value("${basePath}")
	String basePath;
	
	@Value("${contextPath}")
	String contextPath;
	
	@Value("${authHeaderName}")
	String authHeaderName;
	
	@Value("${authHeaderValue}")
	String authHeaderValue;
	
	
	@Override
	public ResponseEntity<String> invoke(String servicePath, HttpMethod method, String payload,
			Map<String, String> headersParams, Map<String, ?> uriVariable) {
		
		String serviceUrl = basePath + contextPath + servicePath;
		
		if(headersParams==null) {
			headersParams = new HashMap<>();
		}
		headersParams.put(authHeaderName, authHeaderValue);
		
		return super.invoke(serviceUrl, method, payload, headersParams, uriVariable);
	}
	
	
	public JsonNode invoke(String servicePath, HttpMethod method, JsonNode jsonPayload,
			Map<String, String> headersParams, Map<String, ?> uriVariable)  {
		final String METHOD_NAME = "invoke";
		
		if(headersParams==null) {
			headersParams = new HashMap<>();
		}
		headersParams.put("Accept", MediaType.APPLICATION_JSON_VALUE);
		headersParams.put("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		if(uriVariable==null) {
			uriVariable = new HashMap<>();
		}
		
		String jsonString;
		try {
			jsonString = toString(jsonPayload);
			log.info(METHOD_NAME, "payload: %s", jsonString);
		} catch (JsonProcessingException e) {
			String msg = "Errore di conversione del payload in stringa per il servizio: "+servicePath;
			log.error(METHOD_NAME, msg, e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR)
				.dettaglio("JP1", msg)
				.throwable(e)
				.exception();
		}
		
		ResponseEntity<String> re = this.invoke(servicePath, method, jsonString, headersParams, uriVariable);
		
		String jsonResponse = re.getBody();
		try {
			return toJsonNode(jsonResponse);
		} catch (IOException e) {
			String msg =  "Errore di lettura della response in Json per il servizio: "+servicePath +  " jsonResponse: "+jsonResponse;
			log.error(METHOD_NAME, msg, e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR)
			.dettaglio("IO1", msg)
			.throwable(e)
			.exception();
		}
	}
	
	
	private static String toString(JsonNode jn) throws JsonProcessingException {
		if (jn == null) {
			return null;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(jn);
	}
	
	private static JsonNode toJsonNode(String s) throws IOException {
		if (s == null) {
			return null;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readTree(s);
	}
	
	public static void main(String[] args) throws IOException {
		String s = "{ \"f1\" : \"v1\" } ";
		JsonNode jsonNode = toJsonNode(s);
		
		String s2 = "{\"IndirizzoTemporaneo\": \"via valle 13\", \"InizioIT\": \"2020-07-15T00:00:00\", \"FineIT\": \"2020-07-26T00:00:00\", \"Telefono\": \"\", \"Mail\": \"\"}";
		
		JsonNode resp = toJsonNode(s2);
		System.out.println("FineIT: "  + resp.get("FineIT").asText());
		System.out.println("FineIT: "  + (asText(resp, "FineIT")));
		
		System.out.println();
		
		System.out.println(jsonNode.get("f1").asText());
		
	
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode parentNode = objectMapper.createObjectNode();
		
		parentNode.put("f2", "v2");
		
		System.out.println("  >>>>>>>>>> " + parentNode.toString());
		
		System.out.println("  >>>>>>>>>> " + toString(parentNode));
	}
	
	
	public boolean isSuccess(JsonNode resp) {
		boolean isSuccess = false;
		if(resp!=null ) {
			JsonNode successNode = resp.get("Success");
			if(successNode!=null) {
				isSuccess = successNode.asBoolean(false);
			}
		}
		return isSuccess;
	}
	
	
	public boolean isFailed(JsonNode resp) {
		boolean isFailed = false;
		if(resp!=null ) {
			JsonNode successNode = resp.get("Success");
			if(successNode!=null) {
				isFailed = (successNode.asBoolean(false) == false);
			}
		}
		return isFailed;
	}

}
