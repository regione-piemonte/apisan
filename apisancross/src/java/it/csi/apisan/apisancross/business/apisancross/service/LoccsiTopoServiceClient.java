/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.service;

import javax.annotation.PostConstruct;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.impl.service.ApiManagerServiceClient;
import it.csi.apisan.apisancross.dto.apimanager.TokenApiManager;
import it.csi.apisan.apisancross.exception.ErroreBuilder;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.rest.BasicAuthInterceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;




@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class LoccsiTopoServiceClient {
	protected LogUtil log = new LogUtil(this.getClass());
	@Value("${loccsiTopoBaseurl}")
	private String loccsiMediciBaseurl;
	private OkHttpClient okHttpClient ;
	@Autowired
	ApiManagerServiceClient tokenApiManager;
	
	
	
	@PostConstruct
	public void init() {
		okHttpClient = new OkHttpClient();
	}
	
	
	public String getIndirizzi(String indirizzo, Integer limit, Integer offset) {
		final String methodName = "getToponomastica";
		log.debug(methodName, "BEGIN");
		String risposta = null;
		StringBuilder urlBuilder  = new StringBuilder();
		urlBuilder.append(loccsiMediciBaseurl)
		.append("?q=")
		.append(indirizzo)
		.append("&limit=")
		.append(limit.toString())
		.append("&offset=")
		.append(offset.toString());
		Response response = null;
		try {
			response = createGetRequest(urlBuilder.toString());
			//response = okHttpClient.newCall(request).execute();
			risposta = response.body().string();
		}catch(Exception e) {
			log.error(methodName, "Errore nella chiamata a loccsi", e);
			throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
		}
		
		return risposta;	
	}
	
	
	
	private Response createGetRequest(String url) throws Exception{
		Request request = new Request.Builder()
				.addHeader("Authorization", tokenApiManager.getAccessToken())
				.url(url)
				.build();
		log.info("createGetRequest", "url: %s", url);
		Response res = okHttpClient.newCall(request).execute();
		if(res.code() == 401) {
			String token = tokenApiManager.refreshToken();
			request =new Request.Builder()
					.addHeader("Authorization", token)
					.url(url)
					.build();
			res = okHttpClient.newCall(request).execute();
		}
		return res;
	}
}
