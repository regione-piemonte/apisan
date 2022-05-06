/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.trace;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StreamUtils;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import it.csi.apisan.apisanpag.util.Constants;
import it.csi.apisan.apisanpag.util.LogUtil;
import it.csi.apisan.apisanpag.util.SpringApplicationContextProvider;


public class TraceFilter implements Filter {
	
	private LogUtil log = new LogUtil(this.getClass());
	
	private ApisanTraceOperation apisanTraceOperation;
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		final String METHOD_NAME = "init";
		
		ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();
		try {
			this.apisanTraceOperation = appContext.getBean(ApisanTraceOperation.class);
			log.info(METHOD_NAME, "apisanTraceOperation ottenuto: %s", apisanTraceOperation.getClass().getName());
		} catch (BeansException be) {
			log.error(METHOD_NAME, "Impossibile ottenere il bean che implementa ApisanTraceOperation per la tracciatura. "+be.getMessage(), be);
			throw be;
		}
	}

	@Override
	public void destroy() {
		// Nessuna operazione
	}
	

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		boolean isHttpReqRes = req instanceof HttpServletRequest && resp instanceof HttpServletResponse;
		if(!isHttpReqRes) {
			//vado avanti nella catena di filtri ed esco.
			chain.doFilter(req, resp);
			return;
		}
		
		HttpServletRequest hreq = (HttpServletRequest) req;
		HttpServletResponse hresp = (HttpServletResponse) resp;
		
		ContentCachingRequestWrapper reqWrapper = new ContentCachingRequestWrapper(hreq);
		ContentCachingResponseWrapper respWrapper = new ContentCachingResponseWrapper(hresp);
		
		
		ApisanTrace at = traceRequest(reqWrapper);
		try {
			chain.doFilter(reqWrapper, respWrapper);
		} finally {
			copyBodyToResponse(respWrapper);
			//respWrapper.copyBodyToResponse(); //NOT visible!!?!?!?
			
			traceResponse(reqWrapper, respWrapper, at);
		}
		
		
	}
	
	private void copyBodyToResponse(ContentCachingResponseWrapper respWrapper) throws IOException {
		if (respWrapper.getContentAsByteArray().length > 0) {
			respWrapper.getResponse().setContentLength(respWrapper.getContentAsByteArray().length);
			StreamUtils.copy(respWrapper.getContentAsByteArray(), respWrapper.getResponse().getOutputStream());
		}
	}


	
	/**
	 * Tracciatura dell'input (Request).
	 * 
	 * @param request
	 * @param body
	 */
	private ApisanTrace traceRequest(ContentCachingRequestWrapper request) {
		
		ApisanTrace at = new ApisanTrace();
		
		at.setCodiceFiscaleChiamante(request.getHeader("Shib-Identita-CodiceFiscale"));
		at.setxCodiceServizio(request.getHeader("X-Codice-Servizio"));
		at.setxRequestId(request.getHeader("X-Request-ID"));
		at.setComponente(Constants.COMPONENT_NAME);
		at.setCodiceFiscaleRichiedente(getRichiedenteFromURL(request.getRequestURL().toString()));
		
		at.setIpChiamante(request.getLocalAddr()); //TODO -verificare a runtime.
		at.setIpChiamanteClient(request.getHeader("X-Forwarded-For")); //TODO verificare parametro dell'header
		
		//La request in questo istante non è stata ancora letta dal servizio sottostante quindi sarà vuota. E' inutile leggerla.
		//at.setPayloadRequest(new String(request.getContentAsByteArray())); 
		at.setRequestDate(new Date());
		
		at.setRequestHeaders(getHeaders(request));
		at.setRequestPath(request.getRequestURL().toString() + (request.getQueryString()!=null?"?"+ request.getQueryString():""));
		
		apisanTraceOperation.traceRequest(at);
		
		return at;
		
	}

	
	
	/**
	 * Tracciatura dell'output (Response).
	 * 
	 * @param response
	 * @return 
	 */
	private ApisanTrace traceResponse(ContentCachingRequestWrapper request, ContentCachingResponseWrapper responseWrapper, ApisanTrace at) {
		
		at.setRequestPayload(new String(request.getContentAsByteArray()));
		at.setResponsePayload(new String(responseWrapper.getContentAsByteArray()));
		at.setResponseDate(new Date());
		at.setEsitoChiamata(responseWrapper.getStatusCode());
		
		
		apisanTraceOperation.traceResponse(at);
		
		return at;
		
	}
	
	
	
	private Map<String, String> getHeaders(HttpServletRequest request) {
		Map<String,String> headers = new HashMap<>();
		@SuppressWarnings("unchecked")
		Enumeration<String> e = request.getHeaderNames();
		while(e.hasMoreElements()) {
			String headerName = e.nextElement();
			String headerValue = request.getHeader(headerName);
			headers.put(headerName, headerValue);
		}
		
		return headers;
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
