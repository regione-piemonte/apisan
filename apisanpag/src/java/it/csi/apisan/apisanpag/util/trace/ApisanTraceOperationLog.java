/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.trace;

import it.csi.apisan.apisanpag.util.LogUtil;

public class ApisanTraceOperationLog implements ApisanTraceOperation {
	protected LogUtil log = new LogUtil(this.getClass());
	
	@Override
	public void traceRequest(ApisanTrace at) {
		final String METHOD_NAME = "traceRequest";
		log.info(METHOD_NAME, "traceRequest: %s", at);
	}
	
	@Override
	public void traceResponse(ApisanTrace at) {
		final String METHOD_NAME = "traceResponse";
		log.info(METHOD_NAME, "traceResponse: %s", at);
	}

}
