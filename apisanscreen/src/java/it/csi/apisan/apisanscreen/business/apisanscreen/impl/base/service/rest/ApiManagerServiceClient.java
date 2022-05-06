/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.rest;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.dto.apimanager.TokenApiManager;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.LogUtil;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ApiManagerServiceClient {
	protected LogUtil log = new LogUtil(this.getClass());
	@Value("${consumerKey}")
	private String consumerKey;
	@Value("${consumerSecret}")
	private String consumerSecret;
	@Value("${apiManagerUrl}")	
	private String apiManagerUrl;
	
	private volatile String token = null;
	OkHttpClient okHttpToken;
	
	
	@PostConstruct
	public void init() throws Exception{
		okHttpToken = new OkHttpClient().newBuilder().addInterceptor(new BasicAuthInterceptor(consumerKey, consumerSecret))
			    .build();
		callToken();
	}
	
	private synchronized void callToken() throws IOException{
		final String methodName = "callToken"; 
		log.info(methodName, "BEGIN");
		String strBody = "grant_type=client_credentials";
		RequestBody body = RequestBody.create(strBody, MediaType.parse("application/x-www-form-urlencoded") );
		Request reqToken = new Request.Builder().url(apiManagerUrl).post(body).build();
		Response respToken;
		try {
			respToken = okHttpToken.newCall(reqToken).execute();
		} catch (IOException e) {
			log.error(methodName, "okHttpToken.newCall Exception", e);
			throw e;
		}
		String json = respToken.body().string();
		if(respToken.isSuccessful()) {
			ObjectMapper mapper = new ObjectMapper();        		
			TokenApiManager tokenApi = mapper.readValue(json ,new TypeReference<TokenApiManager>() {
			});
			token =  new StringBuffer("Bearer").append(" ").append(tokenApi.getAccessToken()).toString() ;
		}else{
			log.error("callToken", "Errore nella chiamata a api manager");
			throw ErroreBuilder.from(respToken.code(), respToken.message()).title("Errore nella chiamata all'api manager").exception(); 
		}

	}
	
	
	public String getAccessToken()  throws IOException{
		final String methodName = "getAccessToken";
		log.info(methodName, "BEGIN");
		if(this.token == null) {
			callToken();
		}
		return this.token;
	}
	
	public String refreshToken() throws IOException{
		callToken();
		return this.token;
	}

	
	
}
