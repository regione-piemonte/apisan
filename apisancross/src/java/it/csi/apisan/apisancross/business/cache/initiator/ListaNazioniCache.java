/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.cache.initiator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.impl.service.ListaComuniFactory;
import it.csi.apisan.apisancross.business.apisancross.impl.service.ListaNazioniServiceClient;
import it.csi.apisan.apisancross.business.cache.CacheInitiator;
import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.LogUtil.ToLog;

@Component
public class ListaNazioniCache implements CacheInitiator<String, List<Nazione>> {
	
	private static LogUtil log = new LogUtil(ListaComuniFactory.class);
	
	@Autowired
	private ListaNazioniServiceClient listaNazioniServiceClient;
	
	@Override
	public List<Nazione> init(String key) {
		final String METHOD_NAME = "init";
		log.debug(METHOD_NAME, "ListaNazioniCache for key: %s", key);
		
		List<Nazione> result = listaNazioniServiceClient.getListaNazioni();
		
		log.info(METHOD_NAME, "ListaNazioniCache for key: %s. Numero nazioni in cache: %s", key, (ToLog) ()->result.size());
		return result;
	}

	
	

	

	
}

