/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base.service.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.HttpHeaders;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import it.csi.apisan.apisancod.util.ConstantsCod;
import it.csi.apisan.apisancod.util.LogUtil;
import it.csi.apisan.apisancod.util.rest.BasicAuthInterceptor;
import it.csi.apisan.apisancod.util.rest.ResponseRest;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class RestServiceClient {
	protected LogUtil log = new LogUtil(this.getClass());
	private OkHttpClient okHttpClient;
	@Value("${codcituser}")
	protected String codcituser;
	@Value("${codcitpass}")
	protected String codcitpass;	

	@PostConstruct
	public void init() {
		//okHttpClient = new OkHttpClient();
		//Se serve basic auth
		okHttpClient = new OkHttpClient.Builder()
			    .addInterceptor(new BasicAuthInterceptor(codcituser, codcitpass))
			    .build();
		
	}
	
	public ResponseRest eseguiGet(HttpHeaders headers, String url, boolean shibboleth) throws Exception{

		return eseguiGet(headers, url, shibboleth, null) ;
	}	
	
	public ResponseRest eseguiGet(HttpHeaders headers, String url, boolean shibboleth, List<String> headerName) throws Exception{
		
		Request request = createGetRequest(headers, url, shibboleth);
		Response resp = execute(request);
		ResponseRest response = new ResponseRest(); 
		response.setStatusCode(resp.code());
		String jsonRit = resp.body().string(); //con questa chiamata ho chiuso la response
		response.setJson(jsonRit);
		if(headerName != null) {
			headerName.stream().forEach(c -> response.addHeaders(c, resp.header(c)) );
		}
		
		return response;
	}
	
	
	public ResponseRest eseguiPost(HttpHeaders headers, String url, String jsonBody, boolean shibboleth) throws Exception{
		
		Request request = createPostRequest(headers, url, jsonBody, shibboleth);
		Response resp = execute(request);
		ResponseRest response = new ResponseRest(); 
		response.setStatusCode(resp.code());
		String jsonRit = resp.body().string(); //con questa chiamata ho chiuso la response
		response.setJson(jsonRit);
		return response;
	}
	
	public ResponseRest eseguiPut(HttpHeaders headers, String url, String jsonBody, boolean shibboleth) throws Exception{
		
		Request request = createPutRequest(headers, url, jsonBody, shibboleth);
		Response resp = execute(request);
		ResponseRest response = new ResponseRest(); 
		response.setStatusCode(resp.code());
		String jsonRit = resp.body().string(); //con questa chiamata ho chiuso la response
		response.setJson(jsonRit);
		return response;
	}	
	
	private Request.Builder addCustomHeaders(HttpHeaders httpHeaders, Request.Builder reqBuilder, boolean shibboleth) {

		reqBuilder.addHeader(ConstantsCod.X_CODICE_SERVIZIO, getHeaderParam(httpHeaders, ConstantsCod.X_CODICE_SERVIZIO))
		.addHeader(ConstantsCod.X_REQUEST_ID, getHeaderParam(httpHeaders, ConstantsCod.X_REQUEST_ID));

		if(shibboleth) {
			reqBuilder.addHeader(ConstantsCod.SHIB_IDENTITA_CODICE_FISCALE, getHeaderParam(httpHeaders, ConstantsCod.SHIB_IDENTITA_CODICE_FISCALE));
		}
		String xForwardedFor = getHeaderParam(httpHeaders, ConstantsCod.X_FORWARDED_FOR);
		if(!StringUtils.isEmpty(xForwardedFor) ) {
			reqBuilder.addHeader(ConstantsCod.X_FORWARDED_FOR, xForwardedFor);
		}
		return reqBuilder;
	}

	private Response execute(Request request) throws Exception {
		final String METHOD_NAME =  "execute";
		try{
			return okHttpClient.newCall(request).execute();
		}catch (Exception e){
			log.error(METHOD_NAME, "OkHttp post error", e);
			throw new Exception("OkHttp post error", e);
		}
	}

	private String getHeaderParam(HttpHeaders httpHeaders, String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}
	
	private Request createGetRequest(HttpHeaders headers, String url, boolean shibboleth){
		Request request = addCustomHeaders(headers, new Request.Builder(), shibboleth)
				.url(url)
				.build();
		log.info("createGetRequest", "url: %s", url);
		return request;
	}
	private String getStringFromBody(Object body) {
		String jsonFromBody = null;
		try {
			if(body != null) {
				ObjectMapper mapper = new ObjectMapper();
				jsonFromBody = mapper.writeValueAsString(body);
				log.debug("getStringFromBody", "jsonFromBody: %s", jsonFromBody);
			}
		}catch(Exception e) {
			String msg =  String.format("Error in body class %s ", body!= null?body.getClass():null);
			log.error("getStringFromBody", msg, e);
			throw new RestClientException(msg, e);
		}
		return jsonFromBody;
	}
	
    private Request createPostRequest(HttpHeaders headers, String url, String json, boolean shibboleth){
    	log.info("createPostRequest", "url: %s, body: %s", url, json);
        RequestBody body = RequestBody.create(json, MediaType.parse("application/json; charset=utf-8") );
        Request request = addCustomHeaders(headers, new Request.Builder(), shibboleth)
                .url(url)
                .post(body)
                .build();

        return request;
    }
    
    private Request createPutRequest(HttpHeaders headers, String url, String json, boolean shibboleth){
    	log.info("createPostRequest", "url: %s, body: %s", url, json);
    	RequestBody	body = RequestBody.create(json, MediaType.parse("application/json; charset=utf-8") );
    	Request request = addCustomHeaders(headers, new Request.Builder(), shibboleth)
    			.url(url)
    			.put(body)
    			.build();

    	return request;
    }    
    
    private Request createDeleteRequest(HttpHeaders headers, String url, boolean shibboleth) {
    	log.info("createDeleteRequest", "url: %s", url);
    	 Request request = addCustomHeaders(headers, new Request.Builder(), shibboleth)
    			 .url(url)
    			 .delete()
    			 .build();
    	 return request;
    }
    
    
}
