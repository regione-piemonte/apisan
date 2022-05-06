/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.service;



import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisanesen.business.mapper.EsenzionePostEsenzionePostMapper;
import it.csi.apisan.apisanesen.business.mapper.RevocaRevocaMapper;
import it.csi.apisan.apisanesen.dto.apisanesen.EsenzionePost;
import it.csi.apisan.apisanesen.dto.apisanesen.Revoca;
import it.csi.apisan.apisanesen.dto.esen.Disclaimer;
import it.csi.apisan.apisanesen.util.RestResponseErrorHandler;
import it.csi.apisan.apisanesen.util.rest.RestCaller;



@Component
public class EsenServiceClient {
	
	@Value("${esenBaseUrl}")
	private String esenBaseUrl;
	@Value("${esenUser}")
	private String user;
	@Value("${esenPassword}")
	private String password;
	
	
	public String modificaEsenzione(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String id,  Revoca revocaBody, String cfBeneficiario) {
		List<HttpStatus> stati = new ArrayList();
		stati.add(HttpStatus.OK);
		stati.add(HttpStatus.CREATED);
		stati.add(HttpStatus.ACCEPTED);
		RestResponseErrorHandler handler = new RestResponseErrorHandler(stati);
				
		it.csi.apisan.apisanesen.dto.red.Revoca revBody = new RevocaRevocaMapper().to(revocaBody);
		
		return new RestCaller(HttpMethod.PUT, esenBaseUrl , "cittadini/" + cf + "/esenzioni/" + id + "/revoca")
				.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
				.contentType(MediaType.APPLICATION_JSON)
				.responseErrorHandler(handler)
				.mapObject(false)
				//da call 29/05/2020 con Tom e Santina cf beneficiario non deve essere passato
				//.queryParam("cf_beneficiario", cfBeneficiario)
				.body(revBody)
				.call(new TypeReference<String>(){});
		
	}
	
	
	
	public String modificaEsenzioneCertificata(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String codiceEsenzione, String dataInizio, Revoca revocaBody) {
		List<HttpStatus> stati = new ArrayList();
		stati.add(HttpStatus.OK);
		stati.add(HttpStatus.CREATED);
		stati.add(HttpStatus.ACCEPTED);
		RestResponseErrorHandler handler = new RestResponseErrorHandler(stati);
		it.csi.apisan.apisanesen.dto.red.Revoca revBody = new RevocaRevocaMapper().to(revocaBody);
		
		return new RestCaller(HttpMethod.PUT, esenBaseUrl , "cittadini/" + cf + "/esenzioni/" +codiceEsenzione + "/" + dataInizio + "/revocacertificata")
				.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
				.contentType(MediaType.APPLICATION_JSON)
				.responseErrorHandler(handler)
				.mapObject(false)
				.body(revBody)
				.call(new TypeReference<String>(){});
		
	}
	
	public String inserisciEsenzioni(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String endPath, EsenzionePost esenBody) {
		List<HttpStatus> stati = new ArrayList();
		stati.add(HttpStatus.OK);
		stati.add(HttpStatus.CREATED);
		stati.add(HttpStatus.ACCEPTED);
		RestResponseErrorHandler handler = new RestResponseErrorHandler(stati);
		
		it.csi.apisan.apisanesen.dto.red.EsenzionePost redBody = new EsenzionePostEsenzionePostMapper().to(esenBody);
		
		return new RestCaller(HttpMethod.POST, esenBaseUrl , "cittadini/" + cf + "/" + endPath)
				.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
				.contentType(MediaType.APPLICATION_JSON)
				.responseErrorHandler(handler)
				.mapObject(false)
				.body(redBody)
				.call(new TypeReference<String>(){});
	}
	
	
	public String getServiceEsenzioni(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String filter, String accept){
		RestResponseErrorHandler handler = new RestResponseErrorHandler(HttpStatus.OK);
		
		RestCaller rest = new RestCaller(HttpMethod.GET, esenBaseUrl ,  "cittadini/" + cf + "/esenzioni?filter=" + filter)
		.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
		.contentType(MediaType.TEXT_PLAIN)
		.mapObject(false)
		.encodingUTF8(true)
		.responseErrorHandler(handler);
		if(accept != null) {
			rest.headerParam("Accept", accept);
		}
		
		return rest.call(new TypeReference<String>(){});

	}
	
	
	public byte[] getServiceEsenzioniByIdPdf(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String endPath, String accept, String cfBeneficiario){
		RestResponseErrorHandler handler = new RestResponseErrorHandler(HttpStatus.OK);
		
		RestCaller rest = new RestCaller(HttpMethod.GET, esenBaseUrl ,  "cittadini/" + cf + endPath)
		.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
		.contentType(MediaType.APPLICATION_OCTET_STREAM)
		.mapObject(false)
		.responseErrorHandler(handler)
		.queryParam("cf_beneficiario", cfBeneficiario);
		if(accept != null) {
			rest.headerParam("Accept", accept);
		
		}
		byte[] rit = rest.callGeneric(new TypeReference<byte[]>(){}, byte[].class);
		return rit;

	}	
	
	public String getServiceEsenzioniById(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String endPath, String accept, String cfBeneficiario){
		RestResponseErrorHandler handler = new RestResponseErrorHandler(HttpStatus.OK);
		
		RestCaller rest = new RestCaller(HttpMethod.GET, esenBaseUrl ,  "cittadini/" + cf + endPath)
		.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
		.contentType(MediaType.TEXT_PLAIN)
		.mapObject(false)
		.encodingUTF8(true)
		.responseErrorHandler(handler)
		.queryParam("cf_beneficiario", cfBeneficiario);
		if(accept != null) {
			rest.headerParam("Accept", accept);
		}
		return rest.call(new TypeReference<String>(){});

	}	
	
	public String getServiceWithPathCf(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String cf, String endPath) {
		RestResponseErrorHandler handler = new RestResponseErrorHandler(HttpStatus.OK);
		return new RestCaller(HttpMethod.GET, esenBaseUrl , "cittadini/" + cf + "/" + endPath)
				.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
				.contentType(MediaType.TEXT_PLAIN)
				.mapObject(false)
				.encodingUTF8(true)
				.responseErrorHandler(handler)
				.call(new TypeReference<String>(){});		
	}
	
	public String getServiceWithoutParam(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String endPath) {
		RestResponseErrorHandler handler = new RestResponseErrorHandler(HttpStatus.OK);
		return new RestCaller(HttpMethod.GET, esenBaseUrl ,  endPath)
				.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
				.contentType(MediaType.TEXT_PLAIN)
				.mapObject(false)
				.encodingUTF8(true)
				.responseErrorHandler(handler)
				.call(new TypeReference<String>(){});		
	}
	
	
	public String getServiceStatiEsenzione(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio, String endPath) {
		RestResponseErrorHandler handler = new RestResponseErrorHandler(HttpStatus.OK);
		return new RestCaller(HttpMethod.GET, esenBaseUrl ,  endPath)
				.headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
				.contentType(MediaType.APPLICATION_JSON)
				.mapObject(false)
				.encodingUTF8(true)
				.responseErrorHandler(handler)
				.call(new TypeReference<String>(){});		
	}	
	
	private String callService(String shibIdentitaCodiceFiscale, String xRequestId, String xCodiceServizio) {
		RestTemplate restTemplate = new RestTemplate();
		//HttpHeaders headers = createHeaders("user_apisan", "mypass");
			
		/*HttpHeaders headers =  new HttpHeaders();
		
        String auth = "user_apisan" + ":" + "mypass";
        String encodedAuth = Base64.encode(auth.getBytes( ));
        
      
        String authHeader = "Basic " + new String( encodedAuth );
        
		
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add("X-Request-ID", xRequestId);
		headers.add("X-Codice-Servizio", xCodiceServizio);
		headers.add("Shib-Identita-CodiceFiscale", shibIdentitaCodiceFiscale);
		headers.add( "Authorization", authHeader );
		
		HttpEntity<String> entity = new HttpEntity<>(headers);*/
		
		/*
		 * da spring 4.3
		 * restTemplate.getInterceptors().add(
				  new BasicAuthorizationInterceptor("username", "password"));
				

				*ResponsePost ret = new RestCaller(HttpMethod.POST, apisanpagBaseUrl, "pagamento")
				.headers(xRequestId, xCodiceServizio)
				.contentType(MediaType.APPLICATION_JSON)
				.body(pagBody)
				.call(new TypeReference<ResponsePost>(){});

				*/
		
		List<Disclaimer> result = new RestCaller(HttpMethod.GET, esenBaseUrl, "disclaimer").headersBasicAuth(user, password).headers(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale)
		.contentType(MediaType.APPLICATION_JSON)
		
		.call(new TypeReference<List<Disclaimer>>(){});
		
		//ResponseEntity<String> result = restTemplate.exchange(esenBaseUrl + "disclaimer", HttpMethod.GET, entity, String.class);
		
		//return result.getBody();
		return result.get(0).getDescrizione();
	}
}
