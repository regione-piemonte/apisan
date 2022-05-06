/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.util;

import java.util.concurrent.ConcurrentHashMap;

public class ScerevConstants {
	public static final String COMPONENT_NAME = "apisanscerev";
	public static final String INTERVALLO_ORARIO = " $$$ ###";
	
	public static final String SHIB_IDENTITA_CODICE_FISCALE ="Shib-Identita-CodiceFiscale";
	public static final String X_REQUEST_ID =  "X-Request-ID";
	public static final String X_CODICE_SERVIZIO = "X-Codice-Servizio";
	public static final String X_FORWARDED_FOR = "X-Forwarded-For";
	public static final String RUOLO_MONITORAGGIO = "monitoring";
	public static final String TABELLA_LOG = "apisan_scerev_t_log_chiamate";
	
	public static ConcurrentHashMap<String, String> MAP_FILTRI = new ConcurrentHashMap<String, String>() 
	{
		private static final long serialVersionUID = 5145550441064399351L;

	{
		put("M", "__MSCH__");
		put("F", "__FMNA__");
		put("MMG", "__MMG__");
		put("PLS", "__PLS__");
	}
	};
	
	public static ConcurrentHashMap<String, String> MAP_DECODIFICHE = new ConcurrentHashMap<String, String>() 
	{
		private static final long serialVersionUID = 5145550441064399351L;

	{
		put("__MSCH__", "M");
		put("__FMNA__", "F");
		put("__MMG__", "MMG");
		put("__PLS__", "PLS");
		put("MMG", "Medico di Medicina Generale");
		put("PLS", "Pediatra di Libera Scelta");
	}
	};
	
	public enum HeaderParam  {
		SHIB_IDENTITA_CODICEFISCALE("Shib-Identita-CodiceFiscale"),
		X_REQUEST_ID("X-Request-ID"),
		X_CODICE_SERVIZIO("X-Codice-Servizio");
		
		
		String paramName;
		HeaderParam(String paramName){
			this.paramName = paramName;
		}
		public String paramName() {
			return paramName;
		}
		
	}
}
