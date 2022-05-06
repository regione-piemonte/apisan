/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse;

import java.util.HashMap;

public class TraceSingleton {

	private static TraceSingleton instance;
	
	
	private HashMap<String,Object> map = new HashMap<String,Object>();  

	private TraceSingleton() {
	}

	public static synchronized TraceSingleton getInstance() {
		if (instance == null) {
			instance = new TraceSingleton();
		}
		return instance;
	}

	public HashMap<String, Object> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	
	

}
