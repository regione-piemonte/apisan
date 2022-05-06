/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.integration.util.trace;

import it.csi.apisan.apisanpag.business.integration.dao.dto.ApisanTrace;

public interface ApisanTraceOperationDataBase {
	
	long traceRequest(ApisanTrace at);
	
	void traceResponse(ApisanTrace at, Long id);
	
	long traceAll(ApisanTrace at);

}
