/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancross.business.apisancross.impl.base.CrossRESTBaseService;
import it.csi.apisan.apisancross.business.cache.AppCacheManager;
import it.csi.apisan.apisancross.business.cache.CacheInitiator;
import it.csi.apisan.apisancross.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CacheRefreshService extends CrossRESTBaseService {

	private String bean;
	

    @Autowired
    AppCacheManager cacheManager;
    
    @Autowired
    ApplicationContext appCtx;
    

	public CacheRefreshService(String bean, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.bean = bean;
	}

	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		
		if(bean!=null && !bean.isEmpty()) {
			return refreshBean();
		}

		cacheManager.refresh();
		
		return Response.ok().build();
	}

	@SuppressWarnings("rawtypes")
	private Response refreshBean() {
		//final String METHOD_NAME = "refreshBean";
		Object beanInstance = getBeanInstance();
		cacheManager.refreshCache((CacheInitiator)beanInstance);
		return Response.ok().type(MediaType.TEXT_HTML).entity("Ok for bean: "+ bean).build();
	}

	private Object getBeanInstance() {
		final String METHOD_NAME = "getBeanInstance";
		Object beanInstance;
		try {
			beanInstance = appCtx.getBean(bean);
		} catch(RuntimeException re){
			String msg = "Impossibile ottenere il bean: "+bean;
			log.error(METHOD_NAME, msg, re);
			//throw new RESTException(Status.BAD_REQUEST, msg);
			throw ErroreBuilder.from(Status.BAD_REQUEST).title(msg).exception();
		}
		
		if(!(beanInstance instanceof CacheInitiator)) {
			String msg = "Il bean specificato deve essere di tipo "+CacheInitiator.class.getSimpleName()+". bean: "+bean;
			log.error(METHOD_NAME, msg);
			//throw new RESTException(Status.BAD_REQUEST, msg);
			throw ErroreBuilder.from(Status.BAD_REQUEST).title(msg).exception();
		}
		return beanInstance;
	}


}
