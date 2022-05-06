/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.apimanager.TokenApiManager;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.BasicAuthInterceptor;
import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;
import it.csi.apisan.apisanassistenza.util.LogUtil;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;

public class httpClient {
	
	protected LogUtil log = new LogUtil(this.getClass());

	public static final MediaType APPLICATION_JSON = MediaType.get("application/json; charset=utf-8");
	public static final Integer CONNECT_TIMEOUT = 10;	
	public static final Integer WRITE_TIMEOUT = 10;
	public static final Integer READ_TIMEOUT = 30;
	public static final Integer HTTP_STATUS_UNAUTHORIZED= 401;

	private OkHttpClient clientForToken;
	private OkHttpClient client;
	private volatile String accessToken = null;
	String consumerKey;
	String consumerSecret;
	String urlCreateToken;

	public httpClient(String accessToken) {
		this.client = new OkHttpClient.Builder()
			    .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
			    .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
			    .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
			    .build();
		this.accessToken = accessToken;
	}

	public httpClient(String consumerKey, String consumerSecret, String urlCreateToken) throws IOException {
		super();
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
		this.urlCreateToken = urlCreateToken;
		this.clientForToken = new OkHttpClient.Builder()
				.addInterceptor(new BasicAuthInterceptor(consumerKey, consumerSecret))
				.connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
			    .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
			    .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)				
			    .build();
		this.client = new OkHttpClient.Builder()
			    .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
			    .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
			    .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
			    .build();		
		// getAccessToken();
	}

	public Response get(String url) throws IOException {
		Request request = buildGetRequest(url, getAccessToken());
		Response response = client.newCall(request).execute();
		if (response.code() == HTTP_STATUS_UNAUTHORIZED) {
			log.info("get", "call UNAUTHORIZED");
			request = buildGetRequest(url, refreshToken());
			return client.newCall(request).execute();
		}
		return response;		
	}

	public Response put(String url, String payloadInJson) throws IOException {
		Request request = buildPutRequest(url, getAccessToken(), payloadInJson);
		Response response = client.newCall(request).execute();
		if (response.code() == HTTP_STATUS_UNAUTHORIZED) {
			request = buildPutRequest(url, refreshToken(), payloadInJson);
			return client.newCall(request).execute();
		}
		return response;
	}
	
	public Response post(String url, String payloadInJson) throws IOException {
		Request request = buildPostRequest(url, getAccessToken(), payloadInJson);
		Response response = client.newCall(request).execute();
		if (response.code() == HTTP_STATUS_UNAUTHORIZED) {
			request = buildPostRequest(url, refreshToken(), payloadInJson);
			return client.newCall(request).execute();
		}
		return response;
	}

	/*
	private void dumpHeaders(Response response) {
		Headers responseHeaders = response.headers();
		for (int i = 0; i < responseHeaders.size(); i++) {
			System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
		}
	}
	*/
	
	private Builder buildRequest(String url, String accessToken) {
		return new Request.Builder().addHeader("Authorization", buildBearerToken(accessToken)).url(url);
	}	
	private Request buildGetRequest(String url, String accessToken) {
		return buildRequest(url, accessToken).build();
	}
	
	private Request buildPutRequest(String url, String accessToken, String payloadInJson) {
		RequestBody body = RequestBody.create(payloadInJson, APPLICATION_JSON);
		return buildRequest(url, accessToken).put(body).build();		
	}	
	
	private Request buildPostRequest(String url, String accessToken, String payloadInJson) {
		RequestBody body = RequestBody.create(payloadInJson, APPLICATION_JSON);
		return buildRequest(url, accessToken).post(body).build();		
	}
	
	private String buildBearerToken(String accessToken) {
		return new StringBuffer("Bearer").append(" ").append(accessToken).toString();
	}
	
	private synchronized void callToken() throws IOException{
		log.info("callToken", "BEGIN");
		String strBody = "grant_type=client_credentials";
		RequestBody body = RequestBody.create(strBody, MediaType.parse("application/x-www-form-urlencoded"));
		Request reqToken = new Request.Builder().url(urlCreateToken).post(body).build();
		Response response;
		try {
			response = clientForToken.newCall(reqToken).execute();
		} catch (IOException e) {
			log.error("callToken", "okHttpToken.newCall Exception", e);
			throw e;
		}
		String json = response.body().string();
		if (response.isSuccessful()) {
			ObjectMapper mapper = new ObjectMapper();        		
			TokenApiManager tokenApi = mapper.readValue(json ,new TypeReference<TokenApiManager>() {
			});
			accessToken = tokenApi.getAccessToken().toString();
			log.info("callToken", "dump token %s ", accessToken);
		} else {
			log.error("callToken", "Errore nella chiamata a api manager");
			throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata all'api manager").exception(); 
		}

	}
	
	public String getAccessToken()  throws IOException{
		log.info("getAccessToken", "BEGIN, token: %s", this.accessToken);
		if (this.accessToken == null) {
			callToken();
		}
		return this.accessToken;
	}
	
	public String refreshToken() throws IOException{
		log.info("refreshToken", "BEGIN");
		callToken();
		return this.accessToken;
	}
	
}
