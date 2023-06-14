/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.dto.apisancod;

import javax.ws.rs.core.Response.Status;

import it.csi.apisan.apisancod.util.ApisanCodStatus;

public class ResponsesNotFound extends Errore{

	public ResponsesNotFound() {
		super.setCode("" + Status.NOT_FOUND.getStatusCode());
		super.setTitle("Risorsa non trovata");
	}

}
