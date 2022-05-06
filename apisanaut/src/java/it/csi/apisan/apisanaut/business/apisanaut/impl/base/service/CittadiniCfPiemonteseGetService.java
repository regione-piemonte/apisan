/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AuraAutRESTBaseService;

public class CittadiniCfPiemonteseGetService extends AuraAutRESTBaseService {

	public CittadiniCfPiemonteseGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		// TODO Auto-generated constructor stub
	}

	public CittadiniCfPiemonteseGetService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Response execute() {
		// TODO Auto-generated method stub
		return null;
	}

}
