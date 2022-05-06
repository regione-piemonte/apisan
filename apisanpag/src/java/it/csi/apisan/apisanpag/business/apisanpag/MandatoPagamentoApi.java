/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag;

import it.csi.apisan.apisanpag.dto.apisanpag.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanpag.dto.apisanpag.Errore;
import java.io.File;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/mandato-pagamento")


@io.swagger.annotations.Api(description = "the mandato-pagamento API")

public interface MandatoPagamentoApi  {
   
    @GET
    @Path("/{id_ricevuta}")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "L'Api è funzionale alla gestione della finalizzazione del pagamento. Quando il paziente, ritornato sulla landing page scatena la generazione della ricevuta con l'Api /pagamento/{id_transazione}/ricevuta, viene inserito nella tabella la ricevuta del mandato di pagamento del carrello, e l'Api ritorna l'id_ricevuta, per consentire la stampa del mandato", response = File.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 424, message = "codice servizio non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response mandatoPagamentoIdRicevutaGet(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("id_ricevuta") String idRicevuta,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
