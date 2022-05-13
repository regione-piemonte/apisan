/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.api;

import io.swagger.annotations.ApiParam;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelTipologiaRicetta;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/tipologie-ricette")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the tipologie-ricette API")

public interface TipologieRicetteApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista tipologie ricette", notes = "Restituisce la lista delle possibili tipologie delle ricette elettroniche. Utile per mostrare dei filtri ", response = ModelTipologiaRicetta.class, responseContainer = "List", tags={ "Ricette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisce l'array contenente le tipologie di ricette", response = ModelTipologiaRicetta.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response tipologieRicetteGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
