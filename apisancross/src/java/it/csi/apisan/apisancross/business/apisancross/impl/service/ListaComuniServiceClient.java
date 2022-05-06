/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.util.LogUtil;

/**
 * Client per il servizio esterno di lista comuni.
 * 
 * @author Domenico
 *
 */
@Component
public class ListaComuniServiceClient {

	private static final int PAGE_SIZE = 1000;
	private static final int MAX_ATTEMPT = 20;
	
	private static final long RETRY_INITIAL_INTERVAL = 2*1000; //2 secondi
	private static final long RETRY_MAX_INTERVAL =  15*60*1000; //15 minuti
	private static final double RETRY_MULTIPLIER = 2;


	protected LogUtil log = new LogUtil(this.getClass());
	
	
	@Value("${smartDatanetBaseUrl}")
	private String smartDatanetBaseUrl;
	
	
	@PostConstruct
	public void init() {
		final String METHOD_NAME = "init";
		log.info(METHOD_NAME, "smartDatanetBaseUrl: %s", smartDatanetBaseUrl);
	}
	
	/**
	 * Ottiene la lista comuni completa invocando il servizio in pagine da 
	 * 1000 elementi (ovvero il massimo consentito dal servizio)
	 * 
	 * @return lista dei comuni
	 */
	public List<Comune> getListaComuni() {
		int top = PAGE_SIZE;
		int skip = 0;
		
		Integer totalCount = 0;
		List<Comune> result = new ArrayList<>();
		
		do {
			String json = callService(top, skip);
			ListaComuniFactory lcf = ListaComuniFactory.of(json);
			
			List<Comune> comuni = lcf.getListaComuni();
			result.addAll(comuni);
			
			totalCount = lcf.getTotalCount();

			skip = skip + top;
			

		} while (totalCount /*13880*/ > skip /*13879*/);
		
		return result;
	}


	private String callService(int top, int skip) {
		final String METHOD_NAME = "callService";
		log.debug(METHOD_NAME, "invoked with params: top:%s, skip:%s)", top, skip);
		
		String url = smartDatanetBaseUrl + "Limiti_ammin_1239/DataEntities?$format=json&$top="+top+"&$skip="+skip+"&$orderby=Desc_comune";
		
		RetryTemplate retryTempalte = newRetryTemplate();
		
		
		
		return retryTempalte.execute( new RetryCallback<String, RestClientException>() {
			@Override
			public String doWithRetry(RetryContext retryContext) throws RestClientException {
				if(retryContext.getRetryCount()>0) {
					log.debug(METHOD_NAME, "retryCount: %s", retryContext.getRetryCount());
				}
				
				RestTemplate rt = new RestTemplate();
				String json;
				try {
					StringHttpMessageConverter stringHttpMessageConverter  = new StringHttpMessageConverter(Charset.forName("UTF-8"));
					stringHttpMessageConverter.setWriteAcceptCharset(true);
					for (int i = 0; i < rt.getMessageConverters().size(); i++) {
					    if (rt.getMessageConverters().get(i) instanceof StringHttpMessageConverter) {
					    	rt.getMessageConverters().remove(i);
					    	rt.getMessageConverters().add(i, stringHttpMessageConverter);
					        break;
					    }
					}
					json = rt.getForObject(url, String.class);
					
				} catch (RestClientException rae) {
					log.error(METHOD_NAME, "RestClientException. retryCount: "+retryContext.getRetryCount(), rae);
					throw rae;
				}
				return json;
			}
		});
	}

	private RetryTemplate newRetryTemplate() {
		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
	    retryPolicy.setMaxAttempts(MAX_ATTEMPT);

	    ExponentialBackOffPolicy backOffPolicy = new ExponentialBackOffPolicy();
	    backOffPolicy.setInitialInterval(RETRY_INITIAL_INTERVAL);
	    backOffPolicy.setMaxInterval(RETRY_MAX_INTERVAL);
	    backOffPolicy.setMultiplier(RETRY_MULTIPLIER);

	    RetryTemplate rt = new RetryTemplate();
	    rt.setRetryPolicy(retryPolicy);
	    rt.setBackOffPolicy(backOffPolicy);
	    return rt;
	}


	public void setSmartDatanetBaseUrl(String smartDatanetBaseUrl) {
		this.smartDatanetBaseUrl = smartDatanetBaseUrl;
	}
	
	
	
	
	
	
	
}
