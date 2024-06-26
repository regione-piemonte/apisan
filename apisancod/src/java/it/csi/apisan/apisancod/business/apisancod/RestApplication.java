/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;

import it.csi.apisan.apisancod.business.apisancod.exceptionmapper.BadRequestExceptionMapper;
import it.csi.apisan.apisancod.business.apisancod.exceptionmapper.InternalServerErrorExceptionMapper;
import it.csi.apisan.apisancod.business.apisancod.exceptionmapper.MethodNotAllowedExceptionMapper;
import it.csi.apisan.apisancod.business.apisancod.exceptionmapper.NotFoundExceptionMapper;
import it.csi.apisan.apisancod.business.apisancod.exceptionmapper.UnauthorizedExceptionMapper;
import it.csi.apisan.apisancod.util.LogUtil;
import it.csi.apisan.apisancod.util.SpringApplicationContextProvider;



@ApplicationPath("api/v1")
public class RestApplication extends Application {
	private LogUtil log = new LogUtil(RestApplication.class);
	
	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> empty = new HashSet<>();

	public RestApplication() {
		final String METHOD_NAME = "RestApplication";
		log.debug(METHOD_NAME, "init RestApplication.");
		
		ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();
		Map<String, Object> beans = appContext.getBeansWithAnnotation(Path.class);
		
		log.debug(METHOD_NAME, "Discovering @Path annotated beans... ");
		Collection<Object> values = beans.values();
		values.stream().forEach(this::register);
		
		
		register(new InternalServerErrorExceptionMapper());
		register(new NotFoundExceptionMapper());
		register(new BadRequestExceptionMapper());
		register(new UnauthorizedExceptionMapper());
		register(new MethodNotAllowedExceptionMapper()); 
		//register(new FailureMapper());

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
