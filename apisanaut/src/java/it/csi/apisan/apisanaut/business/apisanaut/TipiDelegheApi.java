/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut;

import it.csi.apisan.apisanaut.dto.apisanaut.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanaut.dto.apisanaut.DelegaTipo;
import it.csi.apisan.apisanaut.dto.apisanaut.Errore;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/tipi-deleghe")


@io.swagger.annotations.Api(description = "the tipi-deleghe API")

public interface TipiDelegheApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ricerca tutti i possibili tipi di deleghe es AMMSOSTEGNO, TUTELA_MAG18", response = DelegaTipo.class, responseContainer = "List", tags={ "Decodifiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = DelegaTipo.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response tipiDelegheGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
