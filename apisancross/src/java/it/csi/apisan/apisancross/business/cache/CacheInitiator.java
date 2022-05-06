/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.cache;

/**
 * Interfaccia comune per l'inizializzazione della cache.
 * 
 * @author Domenico Lisi
 *
 * @param <K>
 * @param <V>
 */
public interface CacheInitiator<K,V> {

	/**
	 * Metodo di inizializzazione della cache
	 * 
	 * @param key chiave della cache
	 * @return valore della cache
	 */
	V init(K key);

}