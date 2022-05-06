/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.rest;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.ResponseErrorHandler;

import it.csi.apisan.apisanpag.dto.ptw.ResponseErrore;
import it.csi.apisan.apisanpag.dto.ptw.ResponsePost;
import it.csi.apisan.apisanpag.exception.ErroreBuilder;
import it.csi.apisan.apisanpag.exception.RESTException;
import it.csi.apisan.apisanpag.util.LogUtil;

public class RestResponseErrorHandler implements ResponseErrorHandler {
	private static LogUtil log = new LogUtil(RestResponseErrorHandler.class);
	
	private List<HttpStatus> httpStatus;
	private boolean isRespErroreGet = false;
	private boolean isRespErrorePost = false;
	private ErroreBuilder erroreBuilder;
	private boolean isList = false;
	private List listaRit;
	
	public RestResponseErrorHandler(HttpStatus status){
		if(this.httpStatus == null) {
			this.httpStatus = new ArrayList();
		}
		this.httpStatus.add(status);
	}
	
	public RestResponseErrorHandler httpStatus (HttpStatus status){
		if(this.httpStatus == null) {
			this.httpStatus = new ArrayList();
		}
		this.httpStatus.add(status);
		return this;
	}
	
	public RestResponseErrorHandler(List<HttpStatus> status){
		this.httpStatus= status;
	}
	
	
	public RestResponseErrorHandler isRespList(boolean isList) {
		this.isList = isList;
		return this;
	}	
	
	public RestResponseErrorHandler listRit(List<?> lista) {
		this.listaRit = new ArrayList();
		return this;
	}		
	
	public RestResponseErrorHandler isRespErroreGet(boolean respErrore) {
		this.isRespErroreGet = respErrore;
		return this;
	}
	
	public RestResponseErrorHandler isRespErrorePost(boolean respErrore) {
		this.isRespErrorePost = respErrore;
		return this;
	}
	
	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		if(!httpStatus.contains(response.getStatusCode())  ) {
			log.debug("hasError", "response.getStatusCode() %s", response.getStatusCode());
			return true;
		}
		return false;
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException, RESTException {
	 
		if( (response.getStatusCode() == HttpStatus.NO_CONTENT )) {
			
			throw ErroreBuilder.from(404, "Non trovato").exception();
			
		} 
		else {
			throw getErroreBuilder(response).exception();
		}
	}
	
	
	private ErroreBuilder getErroreBuilder(ClientHttpResponse response) throws IOException{
		if(isRespErroreGet) {
			try {
				String error = StreamUtils.copyToString(response.getBody(), Charset.defaultCharset());
				log.debug("getErroreBuilder", "messaggio errore: %s", error);
				ResponseErrore errore = mapObject(ResponseErrore.class, error);
				erroreBuilder = ErroreBuilder.from(Integer.parseInt(errore.getCodice()), errore.getMessaggio());
				
			} catch(Exception e) {
				log.error("getErroreBuilder", "Impossibile ottenere il bean ResponseErrore ", e);
				erroreBuilder = ErroreBuilder.from(response.getRawStatusCode(), response.getStatusText());
			}
		}else if(isRespErrorePost) {
			try {
				//System.out.println("****************** getErroreBuilder **************** prima di ResponsePost errore");
				ResponsePost errore =  mapObject(ResponsePost.class, StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
				//StreamUtils.copy(respWrapper.getContentAsByteArray(), respWrapper.getResponse().getOutputStream());
				//System.out.println("****************** getErroreBuilder **************** dopo di ResponsePost errore");				
				erroreBuilder = ErroreBuilder.from(errore.getCode(), errore.getDescription());
				
			} catch(Exception e) {
				log.error("getErroreBuilder", "Impossibile ottenere il bean ResponseErrore ", e);
				erroreBuilder = ErroreBuilder.from(response.getRawStatusCode(), response.getStatusText());
			}
		}
		else {
			erroreBuilder = ErroreBuilder.from(response.getRawStatusCode(), response.getStatusText());
		}
		
		return erroreBuilder;
	}
	
	private static <T> T mapObject(Class<T> clazz, String json) throws JsonParseException, JsonMappingException, IOException {
		T result;
		//System.out.println("************************      Stringa body errore: ***************" + json);
		ObjectMapper objectMapper = new ObjectMapper();
		result = objectMapper.readValue(json, clazz);
		return result;
	}
}
