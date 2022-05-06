/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base;

import java.util.Arrays;

import javax.ws.rs.core.Response;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import it.csi.apisan.apisantacc.util.LogUtil;
import it.csi.apisan.apisantacc.util.LogUtil.ToLog;
import it.csi.apisan.apisantacc.util.SpringApplicationContextProvider;

public class ServiceExecutor {
	
	protected static LogUtil log = new LogUtil(ServiceExecutor.class);
	
	public static <T extends RESTBaseService> Response execute(Class<T> serviceClass, Object... args) {
		final String METHOD_NAME = "execute";
		
		log.info(METHOD_NAME, "Service: (%s) with args: %s", serviceClass.getSimpleName(), (ToLog)()->Arrays.toString(args));
		
		ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();
		
		T service;
		try {
			service = (T)appContext.getBean(serviceClass, args);
		} catch (ClassCastException cce) {
			String msg = "Errore tecnico: Il bean specificato non e' di tipo RESTBaseService: " + (serviceClass!=null?serviceClass.getName():"null");
			log.error(METHOD_NAME, msg, cce);
			return Response.status(500).entity(msg).build();
		} catch (BeansException be) {
			String msg = "Errore tecnico: Errore nel reperimento del Bean di Spring: " + (serviceClass!=null?serviceClass.getName():"null") +" "+be.getMessage();
			log.error(METHOD_NAME, msg, be);
			return Response.status(500).entity(msg).build();
		}
		
		return service.executeService();
	}
	

}
