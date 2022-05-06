/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.cache.initiator;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.cache.CacheInitiator;
import it.csi.apisan.apisancross.util.LogUtil;

@Component
public class DummyCache implements CacheInitiator<String, String> {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	final static long SLEEP_MILLIS = 10 * 1000;
	
	@Override
	public String init(String key) {
		final String METHOD_NAME = "init";
		String threadName = Thread.currentThread().getName();
		log.debug(METHOD_NAME, "start sleep for key: %s, [thread:%s]", key, threadName);
		try {
			Thread.sleep(SLEEP_MILLIS);
		} catch (InterruptedException e) {
			e.printStackTrace();
			log.warn(METHOD_NAME, "interrupted sleep!!!!", e);
		}
		log.debug(METHOD_NAME, "End sleep for key: %s, after %s millis. [thread:%s]", key, SLEEP_MILLIS, threadName);
		
		return "Dummy cache value!";
		
	}

}
