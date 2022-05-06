/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


public class SpringApplicationContextHelper implements ApplicationContextAware {

	private static ApplicationContext appContext;

	private static Map<String, Object> beanCache = new HashMap<>();

	private static Map<String, Object> restEasyServiceCache = new HashMap<>();
	
	// Private constructor prevents instantiation from other classes
    private SpringApplicationContextHelper() {}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext = applicationContext;
	}
	

	public static void injectSpringBeansIntoRestEasyService(SpringSupportedResource ps) {
		ServletContext sc = AppServletContextListener.getServletContext();
		if (!ps.isSpringBeansInjected()) {
			ps.contextInitialized(sc);
			SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(ps, sc);
			ps.setSpringBeansInjected(true);
		}
	}

	/**
	 * 
	 * @param resteasyServiceName nome della resource class in cui iniettare i bean di spring
	 */
	public static void injectSpringBeansIntoRestEasyService(String resteasyServiceName) {
		for (Object service : restEasyServiceCache.values()) {
			if (service instanceof SpringSupportedResource && 
				((SpringSupportedResource)service).matchesServiceName(resteasyServiceName)) {
				SpringSupportedResource ps = ((SpringSupportedResource)service);
				injectSpringBeansIntoRestEasyService(ps);
				return;
			}
		}
	}
	
	public static void registerRestEasyController(Object service) {
		restEasyServiceCache.put(service.getClass().getSimpleName(), service);
	}

	public static Object getBean(String beanName, boolean cacheable) {

		if (cacheable && beanCache.containsKey(beanName)) {
			return beanCache.get(beanName);
		}
		
		Object bean = null;
		
		if (appContext.containsBean(beanName)) {
			bean = appContext.getBean(beanName);
		} else {
			bean = appContext.getBean(beanName.substring(0, 1).toLowerCase() + beanName.substring(1));
		}
		
		if (cacheable) {
			beanCache.put(beanName, bean);
		}
		
		return bean;
	}

	public static Object getBean(String beanName) {
		return getBean(beanName, true);
	}

}
