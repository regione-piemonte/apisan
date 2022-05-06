/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelAmbulatorioLoccsiFeatureMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiAmbulatorioFeatureMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiFeatureMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.loccsi.Loccsi;
import it.csi.apisan.apisanscerev.exception.ErroreBuilder;
import it.csi.apisan.apisanscerev.exception.RESTException;
import it.csi.apisan.apisanscerev.util.LogUtil;
import it.csi.apisan.apisanscerev.util.ScerevConstants;
import it.csi.apisan.apisanscerev.util.rest.ResponseService;
import it.csi.apisan.apisanscerev.util.rest.UrlLoccsiBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class LoccsiServiceClient {
	protected LogUtil log = new LogUtil(this.getClass());
	@Value("${loccsiMediciBaseurl}")
	private String loccsiMediciBaseurl;
	OkHttpClient okHttpClient ;
	@Autowired
	ApiManagerServiceClient tokenApiManager;

	
	@PostConstruct
	public void init() {
		okHttpClient = new OkHttpClient();
	}
	
	private UrlLoccsiBuilder aggiungiTipologiaSesso(UrlLoccsiBuilder urlBuilder, String tipologia, String sesso) {
		
		if(sesso != null) {
			urlBuilder = urlBuilder.query(ScerevConstants.MAP_FILTRI.get(sesso));
		}
		
		if(tipologia != null) {
			urlBuilder = urlBuilder.query(ScerevConstants.MAP_FILTRI.get(tipologia));
		}

		return urlBuilder;
	}
	
	public ResponseService<List<ModelAmbulatorioLoccsi>> getAmbulatori(String nomeMedico, String sesso, String tipologia,
			String longitudine, String latitudine, BigDecimal distanza, Integer limit, Integer offset) {
		
		List<ModelAmbulatorioLoccsi> listaAmbulatori = new ArrayList<ModelAmbulatorioLoccsi>();
		ResponseService<List<ModelAmbulatorioLoccsi>> resp = new ResponseService<List<ModelAmbulatorioLoccsi>>();
		//costruisco la url
		UrlLoccsiBuilder urlBuilder = null;
		
		if(checkCoordinate(longitudine, latitudine, distanza)) {
			urlBuilder = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici").path(longitudine)
					.path(latitudine).path(distanza.toString()).query(nomeMedico);
			urlBuilder = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici").path("buffer").query(nomeMedico);
			urlBuilder = aggiungiTipologiaSesso(urlBuilder, tipologia, sesso).query("x", longitudine).query("y", latitudine).query("dist", distanza.toString());
					
		}else {
			urlBuilder = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici")
			.query(nomeMedico);
			urlBuilder = aggiungiTipologiaSesso(urlBuilder, tipologia, sesso);
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
         	  listaAmbulatori = new ModelAmbulatorioLoccsiFeatureMapper().fromList(loccsi.getFeatureCollection().getFeatures());
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error("getAmbulatori", "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
        resp.setBody(listaAmbulatori);
		return resp; 
	}
	
	
	public ResponseService<List<String>> getNomiMedici(String nomeMedico, Integer limit, Integer offset){

		ResponseService<List<String>> resp = new ResponseService<List<String>>(); 
		UrlLoccsiBuilder urlBuilder  = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici")
				.query(nomeMedico)
				.limitOffset("limit", limit)
				.limitOffset("offset", offset);	
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
				//mappo la risposta
				List<ModelAmbulatorioLoccsi> listaAmbulatori = new ModelAmbulatorioLoccsiFeatureMapper().fromList(loccsi.getFeatureCollection().getFeatures());
				//prendo tutti i medici
				List<ModelAmbulatorioLoccsiMedico> listaMedici = listaAmbulatori.stream().map(c -> c.getMedico()).collect(Collectors.toList());
				//faccio l distinct per id medico (idaura)
				List<ModelAmbulatorioLoccsiMedico> listaMediciDistinct = getMediciDistinctId(listaMedici);
				//raggruppo una lista di nome e cognome 
				List<String> body = new ArrayList<String>(); 
				body = listaMediciDistinct.stream().map(c -> c.getNome() + " " + c.getCognome()).collect(Collectors.toList());
				resp.setBody(body);
				resp.setHeaders(response.headers());
				
			}else {
				throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
			}

		} catch(RESTException e) {
			throw e;
		} 
		catch(Exception e) {
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}

		return resp;
	}
	
	public ModelMedicoLoccsi getMedicoLoccsi(String idMedico) {
		
		ModelMedicoLoccsi medico = null;
		String url = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici_cf")
				.query(idMedico).buildUrl();
        Response response = null;
        Loccsi loccsi = null;
        
        try {
            response = createGetRequest(url);
            String json = response.body().string(); //con questa chiamata ho chiuso la response 
            if(response.isSuccessful()) {
               ObjectMapper mapper = new ObjectMapper();        		
         	   loccsi = mapper.readValue(json ,new TypeReference<Loccsi>() {});
         	   
         	   if(loccsi.getFeatureCollection().getFeatures() != null && loccsi.getFeatureCollection().getFeatures().size() > 0) {
         		  medico  = new ModelMedicoLoccsiFeatureMapper().from(loccsi.getFeatureCollection().getFeatures().get(0).getProperties());
         		  
         		  medico.setAmbulatori(new ModelMedicoLoccsiAmbulatorioFeatureMapper().fromList(loccsi.getFeatureCollection().getFeatures()));
         	   }else {
         		  throw ErroreBuilder.from(Status.NOT_FOUND).code("Non trovato").title("Medico non trovato").exception();
         	   }
         		   
            }else {
            	throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
            }
            
        } catch(RESTException e) {
			throw e;
		} 
        catch(Exception e) {
        	log.error("getMedicoLoccsi", "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a loccsi").exception();	
		}
		
		return medico;
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
	
	
	public List<ModelAmbulatorioLoccsiMedico> getMediciDistinctId(List<ModelAmbulatorioLoccsiMedico> listaMedici) {
		return listaMedici.stream()
				.map(ModelAmbulatorioLoccsiMedicoWrapper::new)
				.sorted()
				.distinct()
				.map(ModelAmbulatorioLoccsiMedicoWrapper::unwrap)
				.collect(Collectors.toList());
	}
	
	class ModelAmbulatorioLoccsiMedicoWrapper implements Comparable<ModelAmbulatorioLoccsiMedicoWrapper>{
		private final ModelAmbulatorioLoccsiMedico modelmedico;
		
		
		public ModelAmbulatorioLoccsiMedicoWrapper(ModelAmbulatorioLoccsiMedico  medico){
			this.modelmedico = medico;
		}
		
		public ModelAmbulatorioLoccsiMedico unwrap() {
			return this.modelmedico;
		}
		
		@Override
		public int hashCode() {
			return modelmedico.getId().hashCode();
		}


		@Override
		public boolean equals(Object other) {
			if (other instanceof ModelAmbulatorioLoccsiMedicoWrapper) {
				return ((ModelAmbulatorioLoccsiMedicoWrapper) other).modelmedico.getId()
						.equals(this.modelmedico.getId());
			}
			return false;
		}

		@Override
		public int compareTo(ModelAmbulatorioLoccsiMedicoWrapper o) {
			return o.modelmedico.getId()
					.compareTo(this.modelmedico.getId());
		}
		
	}
}
