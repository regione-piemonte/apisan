/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.integration.util.trace;

import java.util.Random;

import it.csi.apisan.apisanassistenza.integration.dao.dto.ApisanTrace;
import it.csi.apisan.apisanassistenza.util.trace.ApisanTraceOperation;

public class ApisanTraceOperationMock implements ApisanTraceOperation {
	
	public ApisanTraceOperationMock() {
	}

	@Override
	public long traceRequest(ApisanTrace at) {
		return new Random().nextLong();
	}

	@Override
	public void traceResponse(ApisanTrace at, Long id) {
	}

	@Override
	public long traceAll(ApisanTrace at) {
		return new Random().nextLong();
	}


}
