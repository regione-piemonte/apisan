/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api;

import it.csi.apisan.apisanesenpat.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanesenpat.model.Errore;
import it.csi.apisan.apisanesenpat.model.ModelTipologiaDocumento;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/tipologie-documento")


@io.swagger.annotations.Api(description = "the tipologie-documento API")

public interface TipologieDocumentoApi  {
   
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Lista tipologie documento", notes = "Permette di ottenere la lista dei tipi di documento che l'utente può inserire in fase di creazione esenzione ", response = ModelTipologiaDocumento.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelTipologiaDocumento.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response tipologieDocumentoGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response );
}
