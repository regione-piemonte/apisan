/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.loccsi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanscerev.dto.loccsi.InfoServizio;

@Path("/servizio-attivo")


@io.swagger.annotations.Api(description = "the servizio-attivo API")

public interface ServizioAttivoApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Restituisce informazioni sull'ambiente su cui sta girando il back-end. Es. variabili ambiente, header http ricevuti ecc. ", response = InfoServizio.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce un oggetto JSON contenente i dati dell'env su cui sta girando il servizio ", response = InfoServizio.class) })
    public Response servizioAttivoGet(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
