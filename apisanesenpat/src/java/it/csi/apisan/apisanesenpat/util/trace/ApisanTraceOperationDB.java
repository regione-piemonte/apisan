/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.util.trace;

public interface ApisanTraceOperationDB {
	long traceRequest(ApisanTrace at);
	
	void traceResponse(ApisanTrace at, Long id);
	
	long traceAll(ApisanTrace at);

}
