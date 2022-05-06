/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.base;

import java.util.Arrays;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import it.csi.apisan.apisanesen.util.LogUtil;
import it.csi.apisan.apisanesen.util.SpringApplicationContextProvider;
import it.csi.apisan.apisanesen.util.LogUtil.ToLog;
import it.csi.apisan.apisanesen.exception.ErroreBuilder;

public class ServiceExecutor {
	protected static LogUtil log = new LogUtil(ServiceExecutor.class);
	
	public static <T extends RESTBaseService> Response execute (Class<T> serviceClass, Object...args ){
		log.debug("execute", "Service: (%s) with args: %s", serviceClass.getSimpleName(), (ToLog)()->Arrays.toString(args));
		
		T service = null;
		ApplicationContext context = SpringApplicationContextProvider.getApplicationContext();
		try {
			service = (T) context.getBean(serviceClass, args);
		}  catch (ClassCastException cce) {
			String msg = "Errore tecnico: Il bean specificato non e' di tipo RESTBaseService: " + (serviceClass!=null?serviceClass.getName():"null");
			log.error("execute", msg, cce);
			return ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title(msg).throwable(cce).response();
		} catch (BeansException be) {
			String msg = "Errore tecnico: Errore nel reperimento del Bean di Spring: " + (serviceClass!=null?serviceClass.getName():"null") +" "+be.getMessage();
			log.error("execute", msg, be);
			return ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title(msg).throwable(be).response();
		}
		
		
		return service.executeService();
	}
}
