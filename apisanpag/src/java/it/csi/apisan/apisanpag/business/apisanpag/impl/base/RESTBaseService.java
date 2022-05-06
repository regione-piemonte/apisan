/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.base;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanpag.business.apisanpag.impl.service.ServizioAttivoGetService;
import it.csi.apisan.apisanpag.exception.ErroreBuilder;
import it.csi.apisan.apisanpag.exception.RESTException;
import it.csi.apisan.apisanpag.util.Constants;
import it.csi.apisan.apisanpag.util.Constants.HeaderParam;
import it.csi.apisan.apisanpag.util.LogUtil;
import it.csi.util.performance.StopWatch;


/**
 * Classe base dell'implementazione della business logic di un generico servizio REST.
 * 
 * Estendendo questa classe si possono aggiugere le seguenti annotazioni di Spring:
 * 
 * 		\@Service
 * 		\@Scope(BeanDefinition.SCOPE_PROTOTYPE)
 * 
 * 
 */
public abstract class RESTBaseService {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	protected Response res;
	
	protected SecurityContext securityContext;
	protected HttpHeaders httpHeaders;
	
	public RESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		this.securityContext = securityContext;
		this.httpHeaders = httpHeaders;
	}
	
	
	public Response executeService() {
		final String METHOD_NAME = "executeService";
		
		log.debug(METHOD_NAME, "Start. Service: %s", this.getClass().getSimpleName());
		StopWatch stopWatch = new StopWatch(Constants.STOP_WATCH_CATEGORY);
		stopWatch.start();
		long startTime = System.currentTimeMillis();
		
		try {
			if(this.securityContext.isUserInRole(Constants.RUOLO_MONITORAGGIO) && !this.getClass().getSimpleName().equals(ServizioAttivoGetService.class.getSimpleName())) {
				 throw ErroreBuilder.from(400, "UNAUTHORIZED").exception(); 
			}
			res = execute();
		} catch (Exception e) {
			handleException(e);
		} finally {
			stopWatch.stop();
			stopWatch.dumpElapsed(this.getClass().getSimpleName(), "executeService", stopWatchContext(), stopWatchMessage());
			long elapsedTimeMillis = System.currentTimeMillis() - startTime;
			log.debug(METHOD_NAME, "End. Service: %s. Elapsed time: %s ms.", this.getClass().getSimpleName(), elapsedTimeMillis);			
		}
		return res;
	}

	
	protected String stopWatchMessage() {
		return String.format("Response Status: %s - %s: %s - %s: %s - %s: %s - userPrincipal: %s", 
					res != null? res.getStatus(): null,
					HeaderParam.X_REQUEST_ID.paramName(),
					getHeaderParam(HeaderParam.X_REQUEST_ID),
					HeaderParam.SHIB_IDENTITA_CODICEFISCALE.paramName(),
					getHeaderParam(HeaderParam.SHIB_IDENTITA_CODICEFISCALE),
					HeaderParam.X_CODICE_SERVIZIO.paramName(),
					getHeaderParam(HeaderParam.X_CODICE_SERVIZIO),
					securityContext.getUserPrincipal()
				);
	}
	
	protected String stopWatchContext() {
		return "esecuzione del servizio";
	}
	
	protected String getHeaderParam(HeaderParam h) {
		return getHeaderParam(h.paramName());
	}

	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}
	


	/**
	 * Gestione di base degli errori. L'implementazione può fare evenualmete override.
	 * 
	 * @param e
	 */
	protected void handleException(Exception e) {
		final String METHOD_NAME = "handleException";
		if(e instanceof RESTException) {
			String msg = "Errore nell'esecuzione del servizio " + ((RESTException)e).getStatus() + ": "+e.getMessage();
			log.error(METHOD_NAME, msg.replaceAll("%", "%%"), e);
			res = ((RESTException) e).getResponse();
			return;
		}
		
		String msg = "Errore generico nell'esecuzione del servizio " + this.getClass().getSimpleName();
		log.error(METHOD_NAME, msg.replaceAll("%", "%%"), e);
		
		res = ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title(msg).throwable(e).response();
	}
	
	/**
	 * Implementa l'esecuzione della bussiness logic del servizio.
	 * E' demandato all'implementazione di questo metodo 
	 * l'impostazione della response del servizio.
	 *  
	 */
	protected abstract Response execute();
	
	/**
	 * Controlla che il parametro obj sia valorizzato;
	 * diversamente solleva una {@link RESTException} con Status.BAD_REQUEST e con il messaggio passato come parametro.
	 * 
	 * @param obj
	 * @param message
	 */
	protected void checkNotNull(Object obj, String message) {
		checkNotNull(obj, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", message).exception());
	}
	
	/**
	 * Controlla che il parametro obj sia valorizzato;
	 * diversamente solleva l'eccezione passata come parametro.
	 * 
	 * @param obj
	 * @param re
	 */
	protected void checkNotNull(Object obj, RESTException re) {
		checkCondition(obj!=null, re);
	}
	
	/**
	 * Controlla che il parametro str sia valorizzato;
	 * diversamente solleva una {@link RESTException} con Status.BAD_REQUEST e con il messaggio passato come parametro.
	 * 
	 * @param obj
	 * @param re
	 */
	protected void checkNotBlank(String str, String message) {
		checkNotBlank(str, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", message).exception());
	}
	
	
	/**
	 * Controlla che il parametro str sia valorizzato;
	 * diversamente solleva l'eccezione passata come parametro.
	 * 
	 * @param obj
	 * @param re
	 */
	protected void checkNotBlank(String str, RESTException re) {
		checkCondition(StringUtils.isNotBlank(str), re);
	}
	
	/**
	 * Controlla che la condizione isOk sia uguale a <code>true</code>;
	 * diversamente solleva l'eccezione passata come parametro.
	 * 
	 * @param isOk
	 * @param re
	 */
	protected void checkCondition(boolean isOk, RESTException re) {
		if(!isOk) {
			throw re;
		}
	}
	
	/**
	 * Controlla che la condizione isOk sia uguale a <code>true</code>;
	 * diversamente solleva una {@link RESTException} con Status.BAD_REQUEST e con il messaggio passato come parametro.
	 * 
	 * @param isOk
	 * @param re
	 */
	protected void checkCondition(boolean isOk, String message) {
		checkCondition(isOk, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", message).exception());
	}
}
