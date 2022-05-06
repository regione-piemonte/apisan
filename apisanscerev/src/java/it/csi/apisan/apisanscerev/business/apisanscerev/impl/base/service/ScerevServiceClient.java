/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.CittadinanzaCittadinanzaMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelCittadinoInfoModelCittadinoInfoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoMonitoratoModelMedicoMonitoratoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.MotivazioneDomicilioMotivazioneDomicilioMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.MotivazioneSoggiornoMotivazioneSoggiornoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.TipologiaMedicoTipologiaMedicoMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.Errore;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoInfo;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoMonitorato;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoTipologia;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneDomicilio;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneSoggiorno;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta;
import it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati;
import it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione;
import it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMonitoraMedico;
import it.csi.apisan.apisanscerev.dto.scerev.Payload;
import it.csi.apisan.apisanscerev.dto.scerev.Payload1;
import it.csi.apisan.apisanscerev.dto.scerev.Payload2;
import it.csi.apisan.apisanscerev.dto.scerev.Payload3;
import it.csi.apisan.apisanscerev.dto.scerev.Payload4;
import it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico;
import it.csi.apisan.apisanscerev.exception.ErroreBuilder;
import it.csi.apisan.apisanscerev.exception.ErroreRESTException;
import it.csi.apisan.apisanscerev.exception.RESTException;
import it.csi.apisan.apisanscerev.util.LogUtil;
import it.csi.apisan.apisanscerev.util.ScerevConstants;
import it.csi.apisan.apisanscerev.util.rest.ResponseService;
import kotlin.Pair;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ScerevServiceClient {
	protected LogUtil log = new LogUtil(this.getClass());
	@Value("${scerevBaseurl}")
	private String scerevBaseurl;
	@Value("${scerevusername}")
	private String username;
	@Value("${scerevpassword}")
	private String password;
	private OkHttpClient okHttpClient;


	@PostConstruct
	public void init() {
		//inserire qui eventuali variabili di autenticazione
		//okHttpClient = new OkHttpClient ();
		
		okHttpClient = new OkHttpClient.Builder()
		        .connectTimeout(45, TimeUnit.SECONDS)
		        .writeTimeout(45, TimeUnit.SECONDS)
		        .readTimeout(45, TimeUnit.SECONDS)
		        .build();
		/*
		 * metodo 1
		okHttpClient = new OkHttpClient.Builder()
	    .addInterceptor(new BasicAuthInterceptor("", ""))
	    .build();
		 */
		/* metodo 2
		 * okHttpClient.authenticator(new Authenticator() {

			@Override
			public Request authenticate(Route var1, Response var2) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
		};() {
	        @Override
	        public Request authenticate(Route route, Response response) throws IOException {
	            if (responseCount(response) >= 3) {
	                return null; // If we've failed 3 times, give up. - in real life, never give up!!
	            }
	            String credential = Credentials.basic("name", "password");
	            return response.request().newBuilder().header("Authorization", credential).build();
	        }
	    });*/

	}

	
	public List<ModelDisponibilita> postDisponibilita(List<ModelAmbulatorioLoccsiMedico> listaMedici, HttpHeaders httpHeaders ){
		final String METHOD_NAME  =  "getDisponibilita";
		List<ModelDisponibilita> listaRitorno = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "disponibilita";
		Request request = null;
		try {
			String bodyjson = getStringFromBody(listaMedici);
			//TODO FIXME il true diventera false quando si toglierà l'obbligatorieta su shibidentitacodicefiscale e l'header Shib-Identita-CodiceFiscale deve essere tolto
			//httpHeaders.getRequestHeaders().add("Shib-Identita-CodiceFiscale", "BSOGDE76D20L219N");
			request = createPostRequest(httpHeaders, url, bodyjson, false);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				listaRitorno = mapper.readValue(json ,new TypeReference<List<ModelDisponibilita>>() {
				});
			}else {
				throw throwErrore(json, METHOD_NAME);
			}
		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getDisponibilita").exception();
		}
		return listaRitorno;
	}
	
	public void postMedicoMonitorato(String citId, ModelMonitoraMedico payload, HttpHeaders httpHeaders) {
		final String METHOD_NAME  = "postMedicoMonitorato";
		ModelCambioMedicoRichiesta resp = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini"  + "/" + citId  + "/" + "medici-monitorati";
		Request request = null;
		try {
			String bodyjson = getStringFromBody(payload);
			request = createPostRequest(httpHeaders, url, bodyjson, true);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			if(!response.isSuccessful()) {
				throw throwErrore(json, METHOD_NAME);
			}			
		} catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a postmedici-monitorati").exception();
		}
	}
	
	public ModelCambioMedicoRichiesta postCambioMedicoRichiesta(String citId, Payload1 payload, HttpHeaders httpHeaders) {
		final String METHOD_NAME  = "postCambioMedicoRichiesta";
		ModelCambioMedicoRichiesta resp = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini"  + "/" + citId  + "/" + "cambio-medico" + "/" + "richiesta";
		Request request = null;
		try {
			String bodyjson = getStringFromBody(payload);
			request = createPostRequest(httpHeaders, url, bodyjson, true);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				resp = mapper.readValue(json ,new TypeReference<ModelCambioMedicoRichiesta>() {
				});
			}else {

				throw throwErrore(json, METHOD_NAME);
			}			
			
		} catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a postCambioMedicoRichiesta").exception();
		}
		return resp;		
	}
	
	
	public ModelControlloAllegati postControlloAllegati(String citId, Payload4 payload, HttpHeaders httpHeaders) {
		final String METHOD_NAME  = "postControlloAllegati";
		ModelControlloAllegati resp = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini"  + "/" + citId  + "/" + "controllo-allegati";
		Request request = null;
		try {
			String bodyjson = getStringFromBody(payload);
			request = createPostRequest(httpHeaders, url, bodyjson, true);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				resp = mapper.readValue(json ,new TypeReference<ModelControlloAllegati>() {
				});
			}else {
				throw throwErrore(json, METHOD_NAME);
			}						
		}
		 catch(RESTException e) {
				throw e;
			}
			catch(Exception e) {
				log.error(METHOD_NAME, "ERROR", e);
				throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a postControlloAllegati").exception();
			}
			return resp;		
	}
	
	public ModelCambioMedicoRichiesta postRettificaCambioMedicoRichiesta(String citId, String richiestaId, Payload2 payload, HttpHeaders httpHeaders) {
		final String METHOD_NAME  = "postRettificaCambioMedicoRichiesta";
		ModelCambioMedicoRichiesta resp = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini"  + "/" + citId  + "/" + "cambio-medico" + "/" + "richiesta" + "/" + richiestaId + "/" + "rettifica";
		Request request = null;
		try {
			String bodyjson = getStringFromBody(payload);
			request = createPostRequest(httpHeaders, url, bodyjson, true);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				resp = mapper.readValue(json ,new TypeReference<ModelCambioMedicoRichiesta>() {
				});
			}else {

				throw throwErrore(json, METHOD_NAME);
			}			
			
		} catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a postCambioMedicoRichiestaRettifica").exception();
		}
		return resp;		
	}
	
	public ModelControlloCombinazione postControlloCombinazione(String citId, Payload payload, HttpHeaders httpHeaders){
		final String METHOD_NAME  = "postControlloCombinazione";
		ModelControlloCombinazione resp = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini"  + "/" + citId  + "/" + "controllo-combinazione";
		Request request = null;
		try {
			String bodyjson = getStringFromBody(payload);
			request = createPostRequest(httpHeaders, url, bodyjson, true);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				resp = mapper.readValue(json ,new TypeReference<ModelControlloCombinazione>() {
				});
			}else {

				throw throwErrore(json, "controllo-combinazione");
			}			
			
		} catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "ERROR", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getControlloCombinazione").exception();
		}
		return resp;
	}
	
	public List<ModelMedicoMonitorato> getMediciMonitorati(String citId,  HttpHeaders httpHeaders){
		final String METHOD_NAME = "getMediciMonitorati";
		List<ModelMedicoMonitorato> lista = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini"  + "/" + citId + "/" + "medici-monitorati";
		Request request = null;

		try {
			request = createGetRequest(httpHeaders, url, true);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			List<it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoMonitorato> listaMedici = null;
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				listaMedici = mapper.readValue(json ,new TypeReference<List<it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoMonitorato>>() {
				});

				lista = new ModelMedicoMonitoratoModelMedicoMonitoratoMapper().fromList(listaMedici);
			}else {
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			log.error(METHOD_NAME, "Errore", e);
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);			
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a medici-monitorati").exception();
		}
		return lista;
	}
	
	public ModelCittadinoInfo getCittadinoInfo(String citId,  HttpHeaders httpHeaders) {
		final String METHOD_NAME  = "getCittadinoInfo";
		ModelCittadinoInfo resp = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + citId + "/" + "info";
		Request request = null;

		try {
			request = createGetRequest(httpHeaders, url, true);
			response = execute(request);
			String json = response.body().string(); 
			it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo respServizio = null;
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				respServizio = mapper.readValue(json ,new TypeReference<it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo>() {
				});

				resp = new ModelCittadinoInfoModelCittadinoInfoMapper().from(respServizio);
			}else {

				throw throwErrore(json, METHOD_NAME);
				//throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
			}

		}catch(RESTException e) {
			log.error(METHOD_NAME, "Errore", e);
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getCittadinoInfo").exception();
		}
		return resp;
	}
	
	public List<ModelCittadinanza> getCittadinanze(HttpHeaders httpHeaders){
		final String METHOD_NAME = "getCittadinanze";
		List<ModelCittadinanza> lista = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadinanze";
		Request request = null;

		try {
			request = createGetRequest(httpHeaders, url, false);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			List<it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza> listaCitt = null;
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				listaCitt = mapper.readValue(json ,new TypeReference<List<it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza>>() {
				});

				lista = new CittadinanzaCittadinanzaMapper().fromList(listaCitt);
			}else {

				throw throwErrore(json, METHOD_NAME);
				//throw ErroreBuilder.from(response.code(), response.message()).title("Errore nella chiamata a loccsi").exception();
			}

		}catch(RESTException e) {
			log.error(METHOD_NAME, "Errore", e);
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);			
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a cittadinanze").exception();
		}

		return lista;
	}


	public List<ModelMotivazioneSoggiorno> getMotivazioniSoggiorno(HttpHeaders httpHeaders){
		final String METHOD_NAME = "getMotivazioniSoggiorno";
		List<ModelMotivazioneSoggiorno> lista = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "motivazioni-soggiorno";
		Request request = null;   
		try {
			request = createGetRequest(httpHeaders, url, false);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			List<it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno> listaMotivazioniSoggiorno = null;
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				listaMotivazioniSoggiorno = mapper.readValue(json ,new TypeReference<List<it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno>>() {
				});

				lista = new MotivazioneSoggiornoMotivazioneSoggiornoMapper().fromList(listaMotivazioniSoggiorno);
			}else {

				throw throwErrore(json, "motivazioni-soggiorno");
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a motivazioni-soggiorno").exception();
		}

		return lista;		
	}
		
	
	public List<ModelMotivazioneDomicilio> getMotivazioniDomicilio(HttpHeaders httpHeaders){
		final String METHOD_NAME = "getMotivazioniDomicilio";
		List<ModelMotivazioneDomicilio> lista = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "motivazioni-domicilio";
		Request request = null;   
		try {
			request = createGetRequest(httpHeaders, url, false);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			List<it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio> listaMotivazioniDomicilio = null;
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				listaMotivazioniDomicilio = mapper.readValue(json ,new TypeReference<List<it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio>>() {
				});

				lista = new MotivazioneDomicilioMotivazioneDomicilioMapper().fromList(listaMotivazioniDomicilio);
			}else {
				throw throwErrore(json, "motivazioni-domicilio");
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a motivazioni-domicilio").exception();
		}

		return lista;				
	}
	
	public List<ModelMedicoTipologia> getMedicoTipologie(HttpHeaders httpHeaders){
		final String METHOD_NAME = "getMedicoTipologie";
		List<ModelMedicoTipologia> lista = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "tipologie-medico";
		Request request = null;   
		try {
			request = createGetRequest(httpHeaders, url, false);
			response = execute(request);
			String json = response.body().string(); //con questa chiamata ho chiuso la response
			List<it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia> listaMedicoTipologia = null;
			if(response.isSuccessful()) {
				ObjectMapper mapper = new ObjectMapper();        		
				listaMedicoTipologia = mapper.readValue(json ,new TypeReference<List<it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia>>() {
				});

				lista = new TipologiaMedicoTipologiaMedicoMapper().fromList(listaMedicoTipologia);
			}else {

				throw throwErrore(json, "tipologie-medico");
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a tipologie-medico").exception();
		}

		return lista;						
	}
	
	public byte[] postModuloDelegantePdf(HttpHeaders httpHeaders, String cidId, Payload3 payloadStampa, String contentDisposition) {
		final String METHOD_NAME = "postModuloDelegantePdf";
		byte[] byteRet = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "modulo-delegante" + "/" + "pdf";
		Request request = null;   
		try {
			String bodyjson = getStringFromBody(payloadStampa);
			request = createPostRequest(httpHeaders, url, bodyjson, true);
			response = execute(request);
			if(response.isSuccessful()) {
				byteRet = response.body().bytes();
			}else {
				String json = response.body().string();
				throw throwErrore(json, "postModuloDelegantePdf");
			}			
		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a postModuloDelegantePdf").exception();
		}
		return byteRet;		
	}
	
	public byte[] getTesserinoMedicoPdf(HttpHeaders httpHeaders, String cidId, String contentDisposition){
		final String METHOD_NAME = "getTesserinoMedicoPdf";
		byte[] byteRet = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "tesserino-medico" + "/" + "pdf";
		Request request = null;   
		try {
			request = createGetRequest(httpHeaders, url, true);
			response = execute(request);
			
			if(response.isSuccessful()) {
				byteRet = response.body().bytes(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getTesserinoMedicoPdf").exception();
		}

		return byteRet;		
	}	
	
	
	public byte[] getCertificatoRevocaPdf(HttpHeaders httpHeaders, String cidId, String contentDisposition){
		final String METHOD_NAME = "getCertificatoRevocaPdf";
		byte[] byteRet = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "certificato-revoca" + "/" + "pdf";
		Request request = null;   
		try {
			request = createGetRequest(httpHeaders, url, true);
			response = execute(request);
			
			if(response.isSuccessful()) {
				byteRet = response.body().bytes(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getCertificatoRevocaPdf").exception();
		}

		return byteRet;		
	}
	
	public byte[] getRichiestaCambioMedicoPdf(HttpHeaders httpHeaders, String cidId, String richiestaId, String contentDisposition){
		final String METHOD_NAME = "getRichiestaCambioMedicoPdf";
		byte[] byteRet = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "cambio-medico" + "/" + "richiesta" + "/" + richiestaId + "/" + "pdf";
		Request request = null;   
		try {
			request = createGetRequest(httpHeaders, url, true);
			response = execute(request);
			
			if(response.isSuccessful()) {
				byteRet = response.body().bytes(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getRichiestaCambioMedicoPdf").exception();
		}

		return byteRet;		
	}	
	
	public ResponseService<byte[]> getAllegato(HttpHeaders httpHeaders, String cidId, String allegatoId) {
		final String METHOD_NAME = "getAllegato";
		byte[] byteRet = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "allegato" + "/" + allegatoId;
		Request request = null;   
		ResponseService<byte[]> resp = new ResponseService<byte[]>();
		try {
			request = createGetRequest(httpHeaders, url, true);
			response = execute(request);
			if(response.isSuccessful()) {
				byteRet = response.body().bytes(); //con questa chiamata ho chiuso la response
				resp.setBody(byteRet);
				resp.setHeaders(response.headers()) ;			
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a getAllegato").exception();
		}
		return resp;		
	}	
		
	
	
	public String deleteInfoRichiestaCambio(HttpHeaders httpHeaders, String cidId, String richiestaId){
		final String METHOD_NAME = "deleteInfoRichiestaCambio";
		String ret = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "info" + "/" + "richiesta_cambio" + "/" + richiestaId;
		Request request = null;   
		try {
			request = createDeleteRequest(httpHeaders, url, true);
			response = execute(request);
			if(response.isSuccessful()) {
				ret = response.body().string(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a deleteInfoRichiestaCambio").exception();
		}

		return ret;		
	}	
	
	
	public String deleteMonitoraMedico(HttpHeaders httpHeaders, String cidId, String medicoId) {
		final String METHOD_NAME = "deleteMonitoraMedico";
		String ret = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "medici-monitorati" + "/" + medicoId;
		Request request = null;   
		try {
			request = createDeleteRequest(httpHeaders, url, true);
			response = execute(request);
			if(response.isSuccessful()) {
				ret = response.body().string(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a deleteMonitoraMedico").exception();
		}
		return ret;				
	}
	
	public String postRevocaMedico(HttpHeaders httpHeaders, String cidId, PayloadRevocaMedico  payloadRevocaMedico) {
		final String METHOD_NAME = "postRevocaMedico";
		String ret = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "revoca-medico";
		Request request = null;   
		try {
			String jsonBody = getStringFromBody(payloadRevocaMedico);
			request = createPostRequest(httpHeaders, url, jsonBody, true);
			response = execute(request);
			if(response.isSuccessful()) {
				ret = response.body().string(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a postRevocaMedico").exception();
		}
		return ret;				
	}
	
	
	public String deleteAssistenza(HttpHeaders httpHeaders, String cidId) {
		final String METHOD_NAME = "deleteAssistenza";
		String ret = null;
		Response response = null;
		String url = scerevBaseurl + "/" + "cittadini" + "/" + cidId + "/" + "assistenza";
		Request request = null;   
		try {
			request = createDeleteRequest(httpHeaders, url, true);
			response = execute(request);
			if(response.isSuccessful()) {
				ret = response.body().string(); //con questa chiamata ho chiuso la response
			}else {
				String json = response.body().string();
				throw throwErrore(json, METHOD_NAME);
			}

		}catch(RESTException e) {
			throw e;
		}
		catch(Exception e) {
			log.error(METHOD_NAME, "Errore", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata a deleteAssistenza").exception();
		}
		return ret;						
	}
	
	private ErroreRESTException throwErrore(String jsonBodyErr, String nomeMetodo) {
		try {
			ObjectMapper mapper = new ObjectMapper();        		
			Errore errore = mapper.readValue(jsonBodyErr ,new TypeReference<Errore>() {
			});

			return new ErroreRESTException(errore); 

		}catch(Exception e) {
			return ErroreBuilder.from(502, nomeMetodo).title(nomeMetodo).exception();
		}
	}

	

	private Request.Builder addCustomHeaders(HttpHeaders httpHeaders, Request.Builder reqBuilder, boolean shibboleth) {

		reqBuilder.addHeader(ScerevConstants.X_CODICE_SERVIZIO, getHeaderParam(httpHeaders, ScerevConstants.X_CODICE_SERVIZIO))
		.addHeader(ScerevConstants.X_CODICE_SERVIZIO, getHeaderParam(httpHeaders, ScerevConstants.X_CODICE_SERVIZIO))
		.addHeader(ScerevConstants.X_REQUEST_ID, getHeaderParam(httpHeaders, ScerevConstants.X_REQUEST_ID));

		if(shibboleth) {
			reqBuilder.addHeader(ScerevConstants.SHIB_IDENTITA_CODICE_FISCALE, getHeaderParam(httpHeaders, ScerevConstants.SHIB_IDENTITA_CODICE_FISCALE));
		}
		String xForwardedFor = getHeaderParam(httpHeaders, ScerevConstants.X_FORWARDED_FOR);
		if(!StringUtils.isEmpty(xForwardedFor) ) {
			reqBuilder.addHeader(ScerevConstants.X_FORWARDED_FOR, xForwardedFor);
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
    
    private Request createDeleteRequest(HttpHeaders headers, String url, boolean shibboleth) {
    	log.info("createDeleteRequest", "url: %s", url);
    	 Request request = addCustomHeaders(headers, new Request.Builder(), shibboleth)
    			 .url(url)
    			 .delete()
    			 .build();
    	 return request;
    }

}
