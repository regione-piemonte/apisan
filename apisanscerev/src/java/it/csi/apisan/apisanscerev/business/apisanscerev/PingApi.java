/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/ping")


@io.swagger.annotations.Api(description = "the ping API")

public interface PingApi  {
   
    @GET
    
    
    @Produces({ "plain/text" })
    @io.swagger.annotations.ApiOperation(value = "effettua un ping del servizio", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok", response = String.class) })
    public Response pingGet(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
