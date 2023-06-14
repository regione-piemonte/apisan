/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancod.exception.ErroreBuilder;
import it.csi.apisan.apisancod.util.ApisanCodStatus;
import it.csi.apisan.apisancod.util.rest.ResponseRest;

public abstract class CodCitPaginazioneRESTBaseService extends CodCitCodRESTBaseService {
	
	private ResponseRest responseRest;
	
	public CodCitPaginazioneRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		// TODO Auto-generated constructor stub
	}

	protected void setResponseRest(ResponseRest responseRest) {
		this.responseRest = responseRest;
	}
	
	public Response executeService() {
		super.executeService();
		if(responseRest != null)
			responseRest.getHeaders().entrySet().stream().forEach(c -> {
				if(c.getKey() != null && c.getValue()!=null) {
					res.getMetadata().add(c.getKey(), c.getValue());
				}
			});
		return res;
	}

}
