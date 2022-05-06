/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.util;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;

/**
 * @author CSI-Piemonte
 */
public abstract class SpringSupportedResource {

	public boolean springBeansInjected = false;
	
	protected ServletContext sc = null;
	
	private static Logger logger = Logger.getLogger(SpringSupportedResource.class);

	public void contextInitialized(ServletContext sc) {
		logger.info("inizializzo risorsa " + this.getClass().getSimpleName());
		this.sc = sc;
	}

	public boolean isSpringBeansInjected() {
		return springBeansInjected;
	}

	public void setSpringBeansInjected(boolean springBeansInjected) {
		this.springBeansInjected = springBeansInjected;
	}

	/**
	 * 
	 * @param name il nome del servizio jax-rs. In caso di implememtazione diretta coincide con il nome della classe, mentre
	 * in caso di implementazione indiretta (ovvero interface annotata alla jax-rs + classe di implementazione che estende da essa)
	 * occorre verificare il match del nome servizio con il nome dell'interfaccia impleentata.
	 * @return true se il servizio matcha con il nome fornito
	 */
	public boolean matchesServiceName(String name) {
		// prima verifico se il nome coincide direttamente
		if (this.getClass().getName().equals(name)) {
			return true;
		} else {
			// se non coincide direttamente, cerco tra le interfacce implementate
			Class[] interfaces = this.getClass().getInterfaces();
			if (interfaces != null && interfaces.length > 0) {
				for (int i = 0; i < interfaces.length; i++) {
					Class currIntf = interfaces[i];
					if (currIntf.getName().equals(name)) {
						return true;
					}
				}
				// se non trovato
				return false;
			} else {
				return false;
			}
		}
	}
}
