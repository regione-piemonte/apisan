/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.cache;

import java.util.Collection;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.infinispan.Cache;
import org.jboss.as.clustering.infinispan.CacheContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.util.LogUtil;

/**
 * Gestore della cache.
 * 
 * @author Domenico Lisi
 *
 */
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AppCacheManager {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
    @Resource(lookup="java:jboss/infinispan/container/cross")
    private CacheContainer cacheContainer;
    
    @Autowired
    ApplicationContext appCtx;
    
    
    @PostConstruct
    public void init() {
    	
    	@SuppressWarnings("rawtypes")
		Collection<CacheInitiator> values = getCacheInitatorsBeans();
		values.stream().forEach(bean -> initCache(bean));
		
    }
    
    /**
     * Ottiene tutti i bean che implementano l'interfaccia {@link CacheInitiator}.
     * @return elenco dei bean inizializzati.
     */
    @SuppressWarnings("rawtypes") 
	private Collection<CacheInitiator> getCacheInitatorsBeans() {
    	String METHOD_NAME = "getCacheInitatorsBeans";
		Map<String, CacheInitiator> beans = appCtx.getBeansOfType(CacheInitiator.class);
    	log.debug(METHOD_NAME, "Discovering CacheInitiator beans... ");
		Collection<CacheInitiator> values = beans.values();
		log.debug(METHOD_NAME, "Trovati %s beans.", beans.size());
		return values;
	}
    

	@SuppressWarnings("unchecked")
	public void initCache(@SuppressWarnings("rawtypes") CacheInitiator bean) {
		String METHOD_NAME = "initCache";
		log.debug(METHOD_NAME, "for bean: %s", bean.getClass().getName());
		Cache<Object, Object> cache = cacheContainer.getCache();
    	cache.computeIfAbsent(bean.getClass().getName(), bean::init); //ListaComuniCache::apply//(k)-> { return getListaComuni(); }
	}


	/**
	 * Ottiene un valore in cache.
	 * 
	 * @param clazz classe Inizializzatrice del valore in cache che si vuole ottenere.
	 * 
	 * @return valore in cache inizializzato dalla classe clazz.
	 */
	@SuppressWarnings("unchecked")
	public <K,V> V get(Class<? extends CacheInitiator<K,V>> clazz) {
		String METHOD_NAME = "initCache";
		log.debug(METHOD_NAME, "AppCacheManager - get Key: %s", clazz);
		Cache<Object, Object> cache = cacheContainer.getCache();
		return (V) cache.get(clazz.getName());
	}
	
	@Scheduled(cron="0 0 20 * * *")
	public void refresh() {
		@SuppressWarnings("rawtypes")
		Collection<CacheInitiator> values = getCacheInitatorsBeans();
		values.stream().forEach(bean -> refreshCache(bean));
	}
	
	@SuppressWarnings("unchecked")
	public void refreshCache(@SuppressWarnings("rawtypes") CacheInitiator bean) {
		String METHOD_NAME = "refreshCache";
		log.debug(METHOD_NAME, "for bean: %s", bean.getClass().getName());
		Cache<Object, Object> cache = cacheContainer.getCache();
    	cache.compute(bean.getClass().getName(), (k,v) -> {return bean.init(k);}); //ListaComuniCache::apply//(k)-> { return getListaComuni(); }
	}
    

}
