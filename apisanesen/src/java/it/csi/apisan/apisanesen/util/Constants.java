/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.util;

public class Constants {
	public static final String COMPONENT_NAME = "apisanesen";
	public static final String SERVICE_NAME = "ESENRED";
	public static final String RUOLO_MONITORAGGIO = "monitoring"; 
	
	/**
	 * Nome dell'appender utilizzato da {@link StopWatch}
	 */
	public static final String STOP_WATCH_CATEGORY = "apisanpagesenWatch";
	
	
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
