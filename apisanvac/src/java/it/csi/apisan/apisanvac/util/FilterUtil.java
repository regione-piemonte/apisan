/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import it.csi.apisan.apisanvac.model.FiltriStringhe;



public class FilterUtil {

		/**
		 * Inizializza l'oggetto filter per la classe il JSON specificati.
		 * 
		 * @param clazz Classe di filtro.
		 * @param filter Dati del Filtro in formato JSON.
		 * @return
		 */
		public static <T> T init(Class<T> clazz, String filter) {
			if(StringUtils.isBlank(filter)) {
				Constructor<T> constructor;
				try {
					constructor = clazz.getConstructor();
				} catch (NoSuchMethodException | SecurityException e) {
					throw new IllegalStateException("Impossibile ottenere il costruttore vuoto della classe: "+ clazz.getSimpleName());
				}
				try {
					return constructor.newInstance();
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					throw new IllegalStateException("Impossibile ottenere una nuova istanza della classe: "+ clazz.getSimpleName());
				}
			}
			ObjectMapper mapper = new ObjectMapper();
			T f;
			try {
				f = mapper.reader(clazz).readValue(filter.getBytes());
			} catch (IOException e) {
				throw new IllegalArgumentException("Filtro errato per " + clazz.getSimpleName() 
					+ ": " + filter + ". " + e.getMessage(), e);
			}
			return f;
		}
		
		/**
		 * Converte in una lista per criterio di "in".
		 * Se specificato solo "eq" crea la lista con un solo elemento
		 * 
		 * @param sc
		 * @return lista dei valori in "in", null altrimenti.
		 */
		public static List<String> in(FiltriStringhe sc) {
			return in(sc, null);
		}
		/**
		 * Converte in una lista per criterio di "in".
		 * Se specificato solo "eq" crea la lista con un solo elemento
		 * 
		 * @param sc
		 * @param defaultResult
		 * 
		 * @return lista dei valori in "in", defaultResult altrimenti.
		 */
		public static List<String> in(FiltriStringhe sc, List<String> defaultResult) {
			if(sc==null) {
				return defaultResult;
			}
			if(sc.getIn() != null && !sc.getIn().isEmpty()){
				return sc.getIn();
			}
			if(StringUtils.isNotBlank(sc.getEq())){
				return Arrays.asList(sc.getEq());
			}
			return defaultResult;
		}
		
	}
