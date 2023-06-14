/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancod.exception.ErroreBuilder;
import it.csi.apisan.apisancod.exception.RESTException;
import it.csi.apisan.apisancod.util.LogUtil;

public abstract class RESTBaseService {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	protected Response res;
	
	protected SecurityContext securityContext;
	protected HttpHeaders httpHeaders;
	protected HttpServletRequest httpRequest;
	
	public RESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		this.securityContext = securityContext;
		this.httpHeaders = httpHeaders;
		this.httpRequest = httpRequest;
	}
	
	
	public Response executeService() {
		final String METHOD_NAME = "executeService";
		
		log.info(METHOD_NAME, "Start. Service: %s", this.getClass().getSimpleName());
		long startTime = System.currentTimeMillis();
		try {
			res = execute();
		} catch (Exception e) {
			handleException(e);
		} finally {
			long elapsedTimeMillis = System.currentTimeMillis() - startTime;
			log.info(METHOD_NAME, "End. Service: %s. Elapsed time: %s ms.", this.getClass().getSimpleName(), elapsedTimeMillis);
		}
		return res;
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
		
		String msg = "Errore generico nell'esecuzione del servizio " + this.getClass().getSimpleName(); //+ ": "+e.getMessage();
		log.error(METHOD_NAME, msg.replaceAll("%", "%%"), e);
		
		ErroreBuilder erroreBuilder = ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title(msg);
		
		if("true".equalsIgnoreCase(System.getProperty("devmode"))) {
			erroreBuilder.throwable(e);
		}
		
		res = erroreBuilder.response();
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

}