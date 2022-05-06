/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.facade;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.jboss.resteasy.annotations.interception.ServerInterceptor;

@Provider
@ServerInterceptor
public class SoapActionInInterceptor extends AbstractPhaseInterceptor<Message> {
	
	@Context 
	HttpHeaders httpHeaders;

	public SoapActionInInterceptor() {
		super(Phase.RECEIVE);
	     
    }
	@Override
	public void handleMessage(Message message) throws Fault {
	
		Object obj = message.getExchange().get("my-object");
		System.out.println(obj);				
		
		InputStream is = message.getContent(InputStream.class);
	    if (is != null) {
	        CachedOutputStream bos = new CachedOutputStream();
	        try {
	            IOUtils.copy(is, bos);

	            bos.flush();
	            is.close();
	            message.setContent(InputStream.class, bos.getInputStream());
	            bos.close();
	            String soapMessage = new String(bos.getBytes());// here you get the soap message
	            
	            System.out.println(soapMessage);
	        }catch(Exception ex) {
	        	
	        }
	        
	    }	

	}
}