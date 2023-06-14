/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancod.business.apisancod;

import it.csi.apisan.apisancod.dto.apisancod.*;


import it.csi.apisan.apisancod.dto.apisancod.ModelInfoServizio;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/servizio-attivo")




public interface ServizioAttivoApi  {
   
    @GET
    
    
    @Produces({ "application/json" })

    public Response servizioAttivoGet(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
