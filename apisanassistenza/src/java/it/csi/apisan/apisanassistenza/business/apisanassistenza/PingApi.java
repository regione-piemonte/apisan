/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/ping")
@Produces({ "application/json" })
public interface PingApi  {
	@GET
    @Produces({ "application/json" })
    public Response ping(
    		@Context SecurityContext securityContext,
    		@Context HttpHeaders httpHeaders,
    		@Context HttpServletRequest httpRequest);
}
