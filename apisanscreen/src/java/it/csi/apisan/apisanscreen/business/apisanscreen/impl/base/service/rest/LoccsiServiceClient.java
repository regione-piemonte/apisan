/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.rest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.business.mapper.ModelUnitaOperativaLoccsiFeatureMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLoccsi;
import it.csi.apisan.apisanscreen.dto.loccsi.Loccsi;
import it.csi.apisan.apisanscreen.dto.loccsi.ResponseService;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.exception.RESTException;
import it.csi.apisan.apisanscreen.util.LogUtil;
import it.csi.apisan.apisanscreen.util.rest.UrlLoccsiBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class LoccsiServiceClient {
	protected LogUtil log = new LogUtil(this.getClass());
	@Value("${loccsiBaseurl}")
	private String loccsiMediciBaseurl;
	OkHttpClient okHttpClient ;
	@Autowired
	ApiManagerServiceClient tokenApiManager;
	
	
	@PostConstruct
	public void init() {
		okHttpClient = new OkHttpClient();
	}
	
	
	public ResponseService<List<ModelUnitaOperativaLoccsi>> getUnitaOperative(String query,
			String longitudine, String latitudine, BigDecimal distanza, Integer limit, Integer offset){
		final String methodName = "getUnitaOperative";
		log.debug(methodName, "BEGIN");
		List<ModelUnitaOperativaLoccsi> listaUnitaOperative = new ArrayList<ModelUnitaOperativaLoccsi>();
		ResponseService<List<ModelUnitaOperativaLoccsi>> resp = new ResponseService<List<ModelUnitaOperativaLoccsi>>();
		UrlLoccsiBuilder urlBuilder  = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("screening");
		if(checkCoordinate(longitudine, latitudine, distanza)) {	
			urlBuilder.path("buffer").query("x", longitudine)
					.query("y", latitudine).query("dist", distanza.toString());
		}
		urlBuilder.query("q", query);
		urlBuilder.limitOffset("limit", limit).limitOffset("offset", offset);
		String url =  urlBuilder.buildUrl();
		Response response = null;
		Loccsi loccsi = null;
        try {
        	response = createGetRequest(url);
        	String json = response.body().string();  
            if(response.isSuccessful()) {
               ObjectMapper mapper = new ObjectMapper();        		
         	   loccsi = mapper.readValue(json ,new TypeReference<Loccsi>() {
     			});
         	  resp.setHeaders(response.headers());
         	 listaUnitaOperative = new ModelUnitaOperativaLoccsiFeatureMapper().fromList(loccsi.getFeatureCollection().getFeatures());
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error(methodName, "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
		resp.setBody(listaUnitaOperative);
		
		return resp;
	}
	

	
	private Response createGetRequest(String url) throws Exception{
		Request request =new Request.Builder()
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
	
	private boolean checkCoordinate(String longitudine, String latitudine, BigDecimal distanza) {
		return (!StringUtils.isEmpty(longitudine) && ! StringUtils.isEmpty(latitudine) && distanza != null);
	}

}
