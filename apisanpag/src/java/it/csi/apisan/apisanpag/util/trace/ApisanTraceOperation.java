/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.trace;

/**
 * Interfaccia generica per l'implementazione della tracciatura.
 * Ad esempio Log, DB oppure code JMS.
 *
 */
public interface ApisanTraceOperation {
	
	void traceRequest(ApisanTrace at);
	
	void traceResponse(ApisanTrace at);

}