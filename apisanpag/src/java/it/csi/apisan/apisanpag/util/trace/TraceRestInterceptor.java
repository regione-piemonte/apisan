/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.trace;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisanpag.util.Constants;
import it.csi.apisan.apisanpag.util.LogUtil;

/**
 * Aggiunge la tracciatura a DB di Request e Response per le chiamate REST effettuate con {@link RestTemplate}.
 *
 */
@Component
public class TraceRestInterceptor implements ClientHttpRequestInterceptor {
	
	private LogUtil log = new LogUtil(this.getClass());
	
	@Autowired
	private ApisanTraceOperation apisanTraceOperation;

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		
		ApisanTrace at = traceRequest(request, body);
		ClientHttpResponse response = null;
		try {
			response = execution.execute(request, body);
		} finally {
			traceResponse(request, response, at);
		}
		return response;
	}

	
	/**
	 * Tracciatura dell'input (Request).
	 * 
	 * @param request
	 * @param body
	 */
	private ApisanTrace traceRequest(HttpRequest request, byte[] body) {
		ApisanTrace at = new ApisanTrace();
		
		at.setCodiceFiscaleChiamante(request.getHeaders().getFirst("Shib-Identita-CodiceFiscale"));
		at.setxCodiceServizio(request.getHeaders().getFirst("X-Codice-Servizio"));
		at.setxRequestId(request.getHeaders().getFirst("X-Request-ID"));
		at.setComponente(Constants.COMPONENT_NAME);
		at.setCodiceFiscaleRichiedente(getRichiedenteFromURL(request.getURI().getRawPath()));
		
		at.setIpChiamante(request.getURI().getHost()); //TODO -verificare a runtime.
		at.setIpChiamanteClient(request.getHeaders().getFirst("X-Forwarded-For")); //TODO verificare parametro dell'header
		
		at.setRequestPayload(new String(body, StandardCharsets.UTF_8));
		
		at.setRequestHeaders(request.getHeaders().toSingleValueMap());
		at.setRequestPath(request.getURI().getRawPath() + (request.getURI().getQuery()!=null?"?"+ request.getURI().getQuery():""));
		
		
		apisanTraceOperation.traceRequest(at);
		return at;
		
	}

	/**
	 * Tracciatura dell'output (Response).
	 * 
	 * @param response
	 * @return 
	 */
	private ApisanTrace traceResponse(HttpRequest request, ClientHttpResponse response, ApisanTrace at) {
		
		String responsePayload;
		try {
			InputStream body = response.getBody();
			responsePayload = IOUtils.toString(body, StandardCharsets.UTF_8.name());
		} catch (IOException e) {
			log.error("traceResponse", "Impossibile ottenere il body della response", e);
			responsePayload = e.getMessage();
		}
		
		at.setResponsePayload(responsePayload);
		at.setResponseDate(new Date());
		
		try {
			at.setEsitoChiamata(response.getStatusCode().ordinal());
		} catch (IOException e) {
			log.error("traceResponse", "Impossibile ottenere lo status code della response", e);
		}
		
		
		apisanTraceOperation.traceResponse(at);		
		return at;
	}
	
	
	/**
	 * Ottiene il codiceFiscale del Richiedente se presente nell'URL, null altrimenti.
	 * 
	 * @param url
	 * @return codiceFiscale, null altrimenti.
	 */
	private static String getRichiedenteFromURL(String url) {
		String[] regexs = new String[] {".*/cittadini/(.+)/.*", ".*/utenti/(.+)/.*"};
		
		for (String regex : regexs) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(url);
			if(matcher.matches()) {
				return matcher.group(1);
			}
		}
		return null;
	}
}
