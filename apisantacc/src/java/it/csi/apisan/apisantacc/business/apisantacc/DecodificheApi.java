/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc;

import it.csi.apisan.apisantacc.dto.apisantacc.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisantacc.dto.apisantacc.Errore;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContattoStrutturaTipo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContattoTipo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDoloreIntensita;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneModalita;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelUnitaMisuraDecodifica;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/decodifiche")


@io.swagger.annotations.Api(description = "the decodifiche API")

public interface DecodificheApi  {
   
    @GET
    @Path("/contatto-tipi")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista tipi di contatto", notes = "Permette di ottenere l'elenco delle tipologie di contatto con le strutture ", response = ModelContattoTipo.class, responseContainer = "List", tags={ "Decodifiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelContattoTipo.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response decodificheContattoTipiGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/descrittori-misurazione")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista descrittori misura", notes = "Permette di ottenere l'elenco dei descrittori delle misurazioni ", response = ModelUnitaMisuraDecodifica.class, responseContainer = "List", tags={ "Decodifiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelUnitaMisuraDecodifica.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response decodificheDescrittoriMisurazioneGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/intensita-dolore")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista intensità dolore", notes = "Permette di ottenere l'elenco delle intensità del dolore ", response = ModelDoloreIntensita.class, responseContainer = "List", tags={ "Decodifiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelDoloreIntensita.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response decodificheIntensitaDoloreGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/modalita-rilevazione")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista modalità rilevazione", notes = "Permette di ottenere l'elenco delle modalità di rilevazione' ", response = ModelRilevazioneModalita.class, responseContainer = "List", tags={ "Decodifiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelRilevazioneModalita.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response decodificheModalitaRilevazioneGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/struttura-tipi")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista tipi di strutture", notes = "Permette di ottenere l'elenco delle tipologie di strutture ", response = ModelContattoStrutturaTipo.class, responseContainer = "List", tags={ "Decodifiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelContattoStrutturaTipo.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response decodificheStrutturaTipiGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
