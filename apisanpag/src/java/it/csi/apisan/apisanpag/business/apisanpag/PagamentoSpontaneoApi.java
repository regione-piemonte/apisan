/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag;

import it.csi.apisan.apisanpag.dto.apisanpag.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanpag.dto.apisanpag.Errore;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSpontaneoBody;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pagamento-spontaneo")


@io.swagger.annotations.Api(description = "the pagamento-spontaneo API")

public interface PagamentoSpontaneoApi  {
   
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "informazioni necessarie ad effettuare il pagamento spontaneo", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "operazione eseguita con successo restituisce la URL del Wisp2 di AgID sul Wisp2 il paziente esegue il pagamento PagoPA", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 424, message = "codice servizio non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response pagamentoSpontaneoPost(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "elenco delle pratiche da pagare con i dati del versante" ,required=true) PagamentoSpontaneoBody pagamentoSpontaneo,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
