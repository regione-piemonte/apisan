/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util.interceptor;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.common.util.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.PostProcessInterceptor;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;
import org.springframework.context.ApplicationContext;

import it.csi.apisan.apisanvac.integration.dao.dto.ApisanTrace;
import it.csi.apisan.apisanvac.integration.util.trace.ApisanTraceOperationDB;
import it.csi.apisan.apisanvac.util.Constants;
import it.csi.apisan.apisanvac.util.ConstantsVac;
import it.csi.apisan.apisanvac.util.LogUtil;
import it.csi.apisan.apisanvac.util.SpringApplicationContextProvider;



@Provider
@ServerInterceptor
public class TraceRequestInterceptor implements PreProcessInterceptor, PostProcessInterceptor {
	
	private LogUtil log = new LogUtil(TraceRequestInterceptor.class);
	private @Context HttpServletRequest httpRequest;
	private @Context SecurityContext secContext;
	ApisanTraceOperationDB dbOperation;
	
	public TraceRequestInterceptor() {
		ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();
		dbOperation = appContext.getBean(ApisanTraceOperationDB.class);
		
	}

	@Override
	public ServerResponse preProcess(HttpRequest request, ResourceMethod arg1) throws Failure, WebApplicationException {
		final String METHOD_NAME =  "preProcess";
		ApisanTrace tr = new ApisanTrace(); 

		try {
			tr.setCfRichiedente(httpRequest.getHeader("Shib-Identita-CodiceFiscale"));
			tr.setxRequestId(httpRequest.getHeader("X-Request-ID"));
			tr.setComponente(Constants.COMPONENT_NAME);
			tr.setIpChiamante(httpRequest.getHeader("X-Forwarded-For"));
			tr.setxCodiceServizio(httpRequest.getHeader("X-Codice-Servizio"));
			tr.setMetodo(httpRequest.getMethod());
			tr.setRequestUri(httpRequest.getRequestURI() + (StringUtils.isEmpty(httpRequest.getQueryString())?"":"?"+httpRequest.getQueryString()));
			if(secContext.getUserPrincipal() != null) {
				tr.setCfChiamante(secContext.getUserPrincipal().getName());
			}
			 
			
			/*InputStream in = request.getInputStream();
			byte[] bb = null; 
			try {
				bb = org.apache.commons.io.IOUtils.toByteArray(in);
			} catch (IOException e) {
				log.error(METHOD_NAME, "Errore nell'interceptor", e);
			}
			tr.setRequestPayload(bb);*/

			/*			String text = new BufferedReader(
					new InputStreamReader(inputStream, StandardCharsets.UTF_8)))
					.lines()
					.collect(Collectors.joining("\n"));*/

			BufferedInputStream bis = new BufferedInputStream(request.getInputStream());
			ByteArrayOutputStream buf = new ByteArrayOutputStream();
			String content = "";
			int result;
			try {
				result = bis.read();
				while (result != -1) {
					byte b = (byte) result;
					buf.write(b);
					result = bis.read();
				}
				tr.setRequestPayload( buf.toByteArray());
			} catch (IOException ex) {
				log.error(METHOD_NAME, "", ex);
			}
			try {
				content = buf.toString("UTF-8");

				ByteArrayInputStream bi = new ByteArrayInputStream(buf.toByteArray());
				request.setInputStream(bi);
			} catch (UnsupportedEncodingException ex) {
				log.error(METHOD_NAME, "", ex);
			}




			long id = dbOperation.traceRequest(tr);


			httpRequest.setAttribute("chiaveid", new Long(id));
			httpRequest.setAttribute("tempoPartenza", new Long(System.currentTimeMillis()));
		} catch (Exception e) {
			log.error(METHOD_NAME, "Errore nell'interceptor", e);
		}

		return null;
	}

	@Override
	public void postProcess(ServerResponse response) {
		final String METHOD_NAME =  "postProcess";
		try {
			
			Long chiave = (Long) httpRequest.getAttribute("chiaveid");
			Long tempoPartenza = (Long) httpRequest.getAttribute("tempoPartenza");
			
			
			ApisanTrace tr = new ApisanTrace();
			tr.setEsitoChiamata(response.getStatus());
			tr.setMillisResponse(System.currentTimeMillis() - tempoPartenza);
			if(response.getMetadata().get("Content-Type") != null &&  response.getMetadata().get("Content-Type").toString().equals("[application/json]")) {
				ObjectMapper mapper = new ObjectMapper();
				ByteArrayOutputStream os = new ByteArrayOutputStream(); 
				mapper.writeValue(os, response.getEntity());
				tr.setResponsePayload(os.toByteArray());
			}
			//tr.setRequestPayload(IOUtils.serialize(response.getEntity()));
			if(chiave != null) {
				dbOperation.traceResponse(tr, chiave);
			}
			
		} catch (Exception e) {
			log.error(METHOD_NAME, "Errore nell'interceptor", e);
		}
		
	}
	
	
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
	
	private String getHeaderParam(HttpHeaders httpHeaders, String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}

/*	@Override
	public void write(MessageBodyWriterContext context) throws IOException, WebApplicationException {
		System.out.println("context.getMediaType()" + context.getMediaType());
		
		
	}

	@Override
	public Object read(MessageBodyReaderContext context) throws IOException, WebApplicationException {
		System.out.println("context.getMediaType(): " + context.getMediaType());
		context.proceed();
		return null;
	}

/*	@Override
	public void write(MessageBodyWriterContext mbwc) throws IOException, WebApplicationException {
		  OutputStream oStream = mbwc.getOutputStream();
	        ByteArrayOutputStream buf = new ByteArrayOutputStream();
	        mbwc.setOutputStream(buf);
	        mbwc.proceed();
	        String content = buf.toString("UTF-8");
	        oStream.write(buf.toByteArray());
	        mbwc.setOutputStream(oStream);
	        System.out.println("Content: " + content);
		
	}

*/


}
