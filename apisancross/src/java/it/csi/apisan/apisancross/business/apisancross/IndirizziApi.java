/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross;

import it.csi.apisan.apisancross.dto.apisancross.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisancross.dto.apisancross.Errore;
import it.csi.apisan.apisancross.dto.apisancross.ModelSuggestIndirizzo;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/indirizzi")


@io.swagger.annotations.Api(description = "the indirizzi API")

public interface IndirizziApi  {
   
    @GET
    @Path("/_search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Suggest indirizzi/comuni", notes = "Ricerca di indirizzi/comuni. Permette al front-end di fornire al cittadino un suggest con il nome degli indirizzi/comuni. Inoltre, grazie ai dati presenti nella response, permette al front-end di richiedere la lista dei medici. ", response = ModelSuggestIndirizzo.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelSuggestIndirizzo.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response indirizziSearchGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @QueryParam("indirizzo") String indirizzo, @QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
