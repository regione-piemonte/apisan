/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.cache.initiator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.impl.service.ListaComuniFactory;
import it.csi.apisan.apisancross.business.apisancross.impl.service.ListaComuniServiceClient;
import it.csi.apisan.apisancross.business.cache.CacheInitiator;
import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.LogUtil.ToLog;

@Component
public class ListaComuniCache implements CacheInitiator<String, List<Comune>> {
	
	private static LogUtil log = new LogUtil(ListaComuniFactory.class);
	
	@Autowired
	private ListaComuniServiceClient listaComuniServiceClient;
	
	@Override
	public List<Comune> init(String key) {
		final String METHOD_NAME = "init";
		log.debug(METHOD_NAME, "ListaComuniCache for key: %s", key);
		
		//List<Comune> result = MockComuniJSON.getInstance().getComuni();
		List<Comune> result = listaComuniServiceClient.getListaComuni();
		
		log.info(METHOD_NAME, "ListaComuniCache for key: %s. Numero comuni in cache: %s", key, (ToLog) ()->result.size());
		return result;
	}

	
	

	

	
}

