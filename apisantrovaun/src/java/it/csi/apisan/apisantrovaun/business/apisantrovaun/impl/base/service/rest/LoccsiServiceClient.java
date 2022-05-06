/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service.rest;

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

import it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper.ModelFarmaciaFeatureMapper;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper.ModelOspedaleFeatureMapper;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper.ModelPuntoVenditaCeliachiaFeatureMapper;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper.ModelStruttureSanitarieMapper;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelFarmacia;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelOspedale;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelPuntoVenditaCeliachia;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelStrutturaSanitaria;
import it.csi.apisan.apisantrovaun.dto.loccsi.Loccsi;
import it.csi.apisan.apisantrovaun.dto.loccsi.ResponseService;
import it.csi.apisan.apisantrovaun.exception.ErroreBuilder;
import it.csi.apisan.apisantrovaun.exception.RESTException;
import it.csi.apisan.apisantrovaun.util.LogUtil;
import it.csi.apisan.apisantrovaun.util.rest.UrlLoccsiBuilder;
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
	
	
	public ResponseService<List<ModelStrutturaSanitaria>> getStruttureSanitarie(String query,
			String longitudine, String latitudine, BigDecimal distanza, Integer limit, Integer offset, String tipologiaAssistenza){
		List<ModelStrutturaSanitaria> listaStruttureSanitarie = new ArrayList<ModelStrutturaSanitaria>();
		ResponseService<List<ModelStrutturaSanitaria>> resp = new ResponseService<List<ModelStrutturaSanitaria>>();
		//costruisco la url
		UrlLoccsiBuilder urlBuilder  = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("strutture_territoriali");
		
		if(checkCoordinate(longitudine, latitudine, distanza)) {
		
			urlBuilder.path("buffer").query("x", longitudine)
					.query("y", latitudine).query("dist", distanza.toString());
					
		}
		if(! StringUtils.isEmpty(query) && ! StringUtils.isEmpty(tipologiaAssistenza)){
			urlBuilder.query("q", query).query(tipologiaAssistenza);
		}else if(! StringUtils.isEmpty(query)) {
			urlBuilder.query("q", query);
		}
		else if(! StringUtils.isEmpty(tipologiaAssistenza)) {
			urlBuilder.query("q",tipologiaAssistenza);
		}
		
		urlBuilder = urlBuilder.limitOffset("limit", limit).limitOffset("offset", offset);
		
		String url =  urlBuilder.buildUrl();
		Response response = null;
		Loccsi loccsi = null;
        try {
            response = createGetRequest(url);
            String json = response.body().string(); //con questa chiamata ho chiuso la response 
            if(response.isSuccessful()) {
               ObjectMapper mapper = new ObjectMapper();        		
         	   loccsi = mapper.readValue(json ,new TypeReference<Loccsi>() {
     			});
         	  resp.setHeaders(response.headers());
         	  listaStruttureSanitarie = new ModelStruttureSanitarieMapper().fromList(loccsi.getFeatureCollection().getFeatures());
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error("getStruttureSanitarie", "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
        resp.setBody(listaStruttureSanitarie);
		
		return resp;
	}
	
	
	public ResponseService<List<ModelOspedale>> getOspedali(String query,
			String longitudine, String latitudine, BigDecimal distanza, Integer limit, Integer offset, String tipologia){
		ResponseService<List<ModelOspedale>> resp = new ResponseService<List<ModelOspedale>>();
		List<ModelOspedale> ospedali = new ArrayList<ModelOspedale>();
		//costruisco la url
		UrlLoccsiBuilder urlBuilder  = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("ospedali");
		
		if(checkCoordinate(longitudine, latitudine, distanza)) {
		
			urlBuilder.path("buffer").query("x", longitudine)
					.query("y", latitudine).query("dist", distanza.toString());
					
		}
		if(! StringUtils.isEmpty(query) && ! StringUtils.isEmpty(tipologia)){
			urlBuilder.query("q", query).query(tipologia);
		}else if(! StringUtils.isEmpty(query)) {
			urlBuilder.query("q", query);
		}
		else if(! StringUtils.isEmpty(tipologia)) {
			urlBuilder.query("q",tipologia);
		}
		urlBuilder = urlBuilder.limitOffset("limit", limit).limitOffset("offset", offset);
		
		String url =  urlBuilder.buildUrl();
		Response response = null;
		Loccsi loccsi = null;
        try {
            response = createGetRequest(url);
            String json = response.body().string(); //con questa chiamata ho chiuso la response 
            if(response.isSuccessful()) {
               ObjectMapper mapper = new ObjectMapper();        		
         	   loccsi = mapper.readValue(json ,new TypeReference<Loccsi>() {
     			});
         	  resp.setHeaders(response.headers());
         	  ospedali = new ModelOspedaleFeatureMapper().fromList(loccsi.getFeatureCollection().getFeatures());
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error("getOspedali", "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
        resp.setBody(ospedali);
		return resp;		
		
	}
	
	
	public ResponseService<List<ModelPuntoVenditaCeliachia>> getPuntiVenditaCeliachia(String query,
			String longitudine, String latitudine, BigDecimal distanza, Integer limit, Integer offset, String tipologia){
		ResponseService<List<ModelPuntoVenditaCeliachia>> resp = new ResponseService<List<ModelPuntoVenditaCeliachia>>();
		List<ModelPuntoVenditaCeliachia> puntiVenditaCeliachia = new ArrayList<ModelPuntoVenditaCeliachia>();
		//costruisco la url
		UrlLoccsiBuilder urlBuilder  = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("celiachia");
		
		if(checkCoordinate(longitudine, latitudine, distanza)) {
		
			urlBuilder.path("buffer").query("x", longitudine)
					.query("y", latitudine).query("dist", distanza.toString());
					
		}
		if(! StringUtils.isEmpty(query) && ! StringUtils.isEmpty(tipologia)){
			urlBuilder.query("q", query).query(tipologia);
		}else if(! StringUtils.isEmpty(query)) {
			urlBuilder.query("q", query);
		}
		else if(! StringUtils.isEmpty(tipologia)) {
			urlBuilder.query("q",tipologia);
		}
		urlBuilder = urlBuilder.limitOffset("limit", limit).limitOffset("offset", offset);
		
		String url =  urlBuilder.buildUrl();
		Response response = null;
		Loccsi loccsi = null;
        try {
            response = createGetRequest(url);
            String json = response.body().string(); //con questa chiamata ho chiuso la response 
            if(response.isSuccessful()) {
               ObjectMapper mapper = new ObjectMapper();        		
         	   loccsi = mapper.readValue(json ,new TypeReference<Loccsi>() {
     			});
         	  resp.setHeaders(response.headers());
         	 puntiVenditaCeliachia = new ModelPuntoVenditaCeliachiaFeatureMapper().fromList(loccsi.getFeatureCollection().getFeatures());
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error("getOspedali", "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
        resp.setBody(puntiVenditaCeliachia);
		return resp;		
		
	}	
	
	
	public ResponseService<List<ModelFarmacia>> getFarmacie(String query,
			String longitudine, String latitudine, BigDecimal distanza, Integer limit, Integer offset){
		List<ModelFarmacia> listaFarmacie = new ArrayList<ModelFarmacia>();
		ResponseService<List<ModelFarmacia>> resp = new ResponseService<List<ModelFarmacia>>();
		//costruisco la url
		UrlLoccsiBuilder urlBuilder  = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("farmacie");
		
		if(checkCoordinate(longitudine, latitudine, distanza)) {
		
			urlBuilder.path("buffer").query("x", longitudine)
					.query("y", latitudine).query("dist", distanza.toString());
					
		}
		urlBuilder.query("q", query);
		urlBuilder = urlBuilder.limitOffset("limit", limit).limitOffset("offset", offset);
		
		String url =  urlBuilder.buildUrl();
		Response response = null;
		Loccsi loccsi = null;
        try {
            response = createGetRequest(url);
            String json = response.body().string(); //con questa chiamata ho chiuso la response 
            if(response.isSuccessful()) {
               ObjectMapper mapper = new ObjectMapper();        		
         	   loccsi = mapper.readValue(json ,new TypeReference<Loccsi>() {
     			});
         	  resp.setHeaders(response.headers());
         	 listaFarmacie = new ModelFarmaciaFeatureMapper("U").fromList(loccsi.getFeatureCollection().getFeatures());
         	 /*
         	  if(! datiAggiuntiviCeliachia) {
         		 listaFarmacie = new ModelFarmaciaFeatureMapper("U").fromList(loccsi.getFeatureCollection().getFeatures());
         	  }else {
         		 listaFarmacie = new ModelFarmaciaFeatureMapper(null).fromList(loccsi.getFeatureCollection().getFeatures());
         	  }
         	  */
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error("getFarmacie", "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
        resp.setBody(listaFarmacie);
		
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
