/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.util;

public enum Page {
	DEFAULT_OFFSET(0),
	DEFAULT_LIMIT(10);
	
	private final Integer value;
	
	Page(final Integer newValue){
		this.value = newValue;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
