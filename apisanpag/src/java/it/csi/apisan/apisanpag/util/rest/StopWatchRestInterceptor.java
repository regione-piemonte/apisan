/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.rest;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisanpag.util.Constants;
import it.csi.apisan.apisanpag.util.Constants.HeaderParam;
import it.csi.util.performance.StopWatch;

/**
 * Aggiunge il log di {@link StopWatch} per le chiamate REST effettuate con {@link RestTemplate}.
 *
 */
public class StopWatchRestInterceptor implements ClientHttpRequestInterceptor {
	

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		StopWatch stopWatch = new StopWatch(Constants.STOP_WATCH_CATEGORY);
		stopWatch.start();
		ClientHttpResponse response = null;
		try {
			response = execution.execute(request, body);
		} finally {
			stopWatch.stop();
			stopWatch.dumpElapsed(StopWatchRestInterceptor.class.getSimpleName(), "intercept", context(request,body), message(request,body, response));
		}
		 
		return response;
	}

	private String context(HttpRequest request, byte[] body) {
		return String.format("%s - %s", 
				request.getMethod(),
				request.getURI()
				);
	}

	
	private String message(HttpRequest request, byte[] body, ClientHttpResponse response) {
			return String.format("Response Status: %s - %s - request.%s: %s - response.%s: %s - request.%s: %s - response.%s: %s - request.%s: %s - response.%s: %s", 
					statusCode(response), 
					statusText(response),
					
					HeaderParam.X_REQUEST_ID.paramName(),
					request.getHeaders().get(HeaderParam.X_REQUEST_ID.paramName()),
					HeaderParam.X_REQUEST_ID.paramName(),
					response.getHeaders().get(HeaderParam.X_REQUEST_ID.paramName()),
					
					HeaderParam.X_CODICE_SERVIZIO.paramName(),
					request.getHeaders().get(HeaderParam.X_CODICE_SERVIZIO.paramName()),
					HeaderParam.X_CODICE_SERVIZIO.paramName(),
					response.getHeaders().get(HeaderParam.X_CODICE_SERVIZIO.paramName()),
					
					HeaderParam.SHIB_IDENTITA_CODICEFISCALE.paramName(),
					request.getHeaders().get(HeaderParam.SHIB_IDENTITA_CODICEFISCALE.paramName()),
					HeaderParam.SHIB_IDENTITA_CODICEFISCALE.paramName(),
					response.getHeaders().get(HeaderParam.SHIB_IDENTITA_CODICEFISCALE.paramName())
					
					);
	}

	private HttpStatus statusCode(ClientHttpResponse response) {
		try {
			return response.getStatusCode();
		} catch (IOException e) {
			return null;
		}
	}
	
	private String statusText(ClientHttpResponse response) {
		try {
			return response.getStatusText();
		} catch (IOException e) {
			return null;
		}
	}

}
