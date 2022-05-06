/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import static it.csi.apisan.apisancross.util.ApisanCrossUtil.applyOffsetAndLimit;

import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancross.business.apisancross.impl.base.CrossRESTBaseService;
import it.csi.apisan.apisancross.business.cache.AppCacheManager;
import it.csi.apisan.apisancross.business.cache.initiator.ListaComuniCache;
import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.filter.ComuniFilter;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ComuniGetService extends CrossRESTBaseService {

	private Integer offset;
	private Integer limit;
	private String filter;
	private String descrizione;
	private static final Charset UTF_8 = Charset.forName("UTF-8");
	private static final Charset ISO = Charset.forName("ISO-8859-1");
    
    @Autowired
    AppCacheManager cacheManager;

	public ComuniGetService(Integer offset, Integer limit, String filter, String descrizione, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.offset = offset;
		this.limit = limit;
		this.filter = filter;
		this.descrizione = descrizione;
	}

	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";

		log.debug(METHOD_NAME, "xRequestID: %s, xCodiceServizio: %s, filter: %s", xRequestID, xCodiceServizio, filter);

		List<Comune> comuni = cacheManager.get(ListaComuniCache.class); //MockComuniJSON.getInstance().getComuni();

		List<Comune> comuniFiltrati = filtraComuni(comuni, filter, offset, limit);
		
		//provo a filttrare qui
		if(descrizione != null) {
			String si =  new String(descrizione.getBytes(ISO), UTF_8);
			log.debug("ComuniGetService", "descrizione : %s ", si);
			
			comuniFiltrati = comuniFiltrati.stream().filter(c -> c.getDesc().toUpperCase().startsWith(descrizione)).collect(Collectors.toList());
			
		}
		
//		testCache();

		return Response.ok(comuniFiltrati).header("X-Totale-Elementi", comuni.size()).build();
	}

	private List<Comune> filtraComuni(List<Comune> comuni, String filter, Integer offset, Integer limit) {
		final String METHOD_NAME = "filtraComuni";
		log.debug(METHOD_NAME, "invoked with Filter: %s, offset: %s, limit: %s", filter, offset, limit);

		List<Comune> result;

		try {
			result = new ComuniFilter().doFilter(comuni, filter);

		} catch (IllegalArgumentException e) {
			// caso in cui sono stati impostati dei filtri non consensentiti ritorno la lista
			log.warn(METHOD_NAME, "Filtro non applicabile: %s. Verranno restituiti tutti i risultati. Filter: %s",
					e.getMessage(), filter);
			result = comuni;
		}

		return applyOffsetAndLimit(result, offset, limit);
	}
	
	
//  @Resource(lookup="java:jboss/infinispan/container/cross")
//  CacheContainer container;
//
//	private void testCache() {
//		System.out.println("normal version");
//		// TODO Auto-generated method stub
//		System.out.println("CacheContainer: "+container!=null?container.getClass().getName():"null");
//		if(container==null) {
//			System.out.println("CacheContainer is null!!!!! :-( ");
//			return;
//		}
//		Cache<Object, Object> cache = container.getCache();
//		
//		cache.put("TEST", "Test1 value");
//		System.out.println("put TEST in cache!");
//		
//		cache.compute("TEST", (k,v)-> {
//			System.out.println("key: "+k);
//			System.out.println("value: "+v);
//			String result = "TEST1Compute";
//			System.out.println("return: "+result);
//			return result;});
//		
//		Object object = cache.get("TEST");
//		
//		System.out.println("get TEST in cache: "+object);
//
//	}


}
