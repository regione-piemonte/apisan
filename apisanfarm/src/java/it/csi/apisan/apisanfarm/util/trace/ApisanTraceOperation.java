/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.util.trace;

import it.csi.apisan.apisanfarm.business.integration.dao.dto.ApisanTrace;

public interface ApisanTraceOperation {
	
	long traceRequest(ApisanTrace at);
	
	void traceResponse(ApisanTrace at, Long id);
	
	long traceAll(ApisanTrace at);

}
