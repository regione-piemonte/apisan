/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util;

import it.csi.util.performance.StopWatch;

public class Constants {
	public static final String COMPONENT_NAME = "apisanpag";
	public static final String SERVICE_NAME = "PTW";
	public static final String RUOLO_MONITORAGGIO = "monitoring"; 
	
	/**
	 * Nome dell'appender utilizzato da {@link StopWatch}
	 */
	public static final String STOP_WATCH_CATEGORY = "apisanpagStopWatch";
	
	
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
