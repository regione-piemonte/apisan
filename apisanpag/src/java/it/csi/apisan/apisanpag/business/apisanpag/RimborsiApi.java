/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag;

import it.csi.apisan.apisanpag.dto.apisanpag.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanpag.dto.apisanpag.Errore;
import it.csi.apisan.apisanpag.dto.apisanpag.RispostaServizio;
import it.csi.apisan.apisanpag.dto.apisanpag.StatoTransazione;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/rimborsi")


@io.swagger.annotations.Api(description = "the rimborsi API")

public interface RimborsiApi  {
   
    @PUT
    @Path("/{id_transazione}/stato-erogazione")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "L'Api consente di modificare lo stato in erogazione dei rimborsi a 0 nel caso in cui un precedente pagamento sia stato annullato dall'utente o non sia andato a buon fine. Possibili valori di ritorno  * codice 000  messaggio Lo stato di erogazione di tutti i rimborsi è stato aggiornato correttamente. * codice 001 messaggio  Lo stato di erogazione di alcuni rimborsi non è stato aggiornato correttamente.", response = RispostaServizio.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = RispostaServizio.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response rimborsiIdTransazioneStatoErogazionePut(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("id_transazione") String idTransazione,@ApiParam(value = "stato con il quale si vuole settare la transazione" ,required=true) StatoTransazione statoTransazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
