/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/cache")
public interface CacheApi  {
   
    @GET
    @Produces({ "application/json" })
    public Response init(@QueryParam("bean") String bean,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    
    
    @DELETE
    @Produces({ "application/json" })
    public Response refresh(@QueryParam("bean") String bean,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    
    
}
