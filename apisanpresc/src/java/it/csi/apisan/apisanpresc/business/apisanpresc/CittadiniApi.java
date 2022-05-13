/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;
import it.csi.apisan.apisanpresc.dto.apisanpresc.InlineResponse200;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelRicetta;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Payload;

@Path("/cittadini")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cittadini API")

public interface CittadiniApi  {
   
    @GET
    @Path("/{citId}/ricette")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista ricette", notes = "Dato un cittadino, il cui codice fiscale è quello presente nel path {citId}, restituisce la lista delle ricette in cui lui è l'assistito. Inoltre nella querystring dev'essere presente il parametro `tipologia` che indica quale lista di ricette vogliamo richiedere ed il parametro `regionale` che indica se vogliamo richiedere le ricette regionali o meno. ", response = ModelRicetta.class, responseContainer = "List", tags={ "Ricette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisce un'array contenente le ricette elettroniche in cui l'assistito è l'utente con il codice_fiscale={citId}", response = ModelRicetta.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdRicetteGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @NotNull @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request);
    @GET
    @Path("/{citId}/ricette/{nre}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Dettaglio ricetta", notes = "Permette di ottenere una singola ricetta per {nre} ", response = ModelRicetta.class, tags={ "Ricette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La chiamata è andata a buon fine, e viene restituito l'oggetto che rappresenta la ricetta elettronica avente nre={nre}", response = ModelRicetta.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdRicetteNreGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("nre") String nre, @NotNull @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request);
    @GET
    @Path("/{citId}/ricette/{nre}/pdf")
    
//    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "Ricetta in formato pdf", notes = "Permette di ottenere il PDF dellla ricetta. Questa funzionalità permetterà all'utente di salvare il PDF o stamparlo. ", response = File.class, tags={ "Ricette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La chiamata è andata a buon fine e viene restituito il PDF della ricetta elettronica avente nre={nre}", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdRicetteNrePdfGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("nre") String nre, @NotNull @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request);
    @PUT
    @Path("/{citId}/ricette/{nre}/nascosta")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Nascondi ricetta", notes = "Cambia lo stato del flag nascosta dalla ricetta.  Esempi  1. Impostare una ricetta come nascosta   ```   POST /cittadini/{cit}/ricette/{nre}/nascosta    {nascosta: true}   ```  2. Ripristinare una ricetta nascosta   ```   POST /cittadini/{cit}/ricette/{nre}/nascosta    {nascosta: false}   ``` ", response = InlineResponse200.class, tags={ "Ricette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La ricetta è stata modificata con successo e viene restituito un oggetto che rappresenta il nuovo stato del flag \"nascosta\".", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response nascondiRicetta(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("nre") String nre,@ApiParam(value = "" ) Payload payload,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request);
}
