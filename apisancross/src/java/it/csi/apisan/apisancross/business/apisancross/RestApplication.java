/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;

import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.SpringApplicationContextProvider;



@ApplicationPath("api/v1")
public class RestApplication extends Application{
	private LogUtil log = new LogUtil(RestApplication.class);
	
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RestApplication() {
		log.debug("RestApplication", "init RestApplication.");
		
		ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();
		Map<String, Object> beans = appContext.getBeansWithAnnotation(Path.class);
		
		log.debug("RestApplication", "Discovering @Path annotated beans... ");
		Collection<Object> values = beans.values();
		values.stream().forEach(bean -> register(bean));

	}
	
	private void register(Object serviceImpl) {
		if(serviceImpl == null) {
			return;
		}
		log.info("RestApplication", "Registering Rest bean: %s", serviceImpl.getClass().getName());
		singletons.add(serviceImpl);
	}
	

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	

}
