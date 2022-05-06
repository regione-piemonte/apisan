/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons;

import it.csi.apisan.apisancons.dto.apisancons.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisancons.dto.apisancons.Errore;
import java.io.File;
import it.csi.apisan.apisancons.dto.apisancons.Informativa;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/informative")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the informative API")

public interface InformativeApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista delle informative valide", notes = "Restituisce la lista dele informative velide per le quali il cittadino puo' esprimere un consenso ", response = Informativa.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisce l'array contenente i consensi del cittadino", response = Informativa.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response informativeGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/informativa-html")
    
    @Produces({ "application/html" })
    @io.swagger.annotations.ApiOperation(value = "Download del pdf del consenso", notes = "Restituisce l'html del consenso dati il codice del tipo_consenso , il codice del sotto_tipo_consenso inseriti nel filter param (obbligatorio) di tipo informativa_filter.  ", response = File.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisce lo stream di dati del pdf.", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response informativeInformativaHtmlGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor, @QueryParam("filter") String filter,@ApiParam(value = "header che permette di richiedere l'header di risposta Content-Disposition: \"attachment\". Se questo header viene passato nella request con valore \"attachment\", allora nella response dovrà essere presente l'header con \"Content-Disposition: attachment\" magari aggiungendo il nome del file da scaricare. Se non viene passato nella request o passato con un valore diverso da \"attachment\", allora nella response non dovrà essere presente l'header \"Content-Disposition\" " )@HeaderParam("X-Content-Disposition") String xContentDisposition,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/informativa-pdf")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "Download del pdf del consenso", notes = "Restituisce il pdf del consenso dati il codice del tipo_consenso , il codice del sotto_tipo_consenso inseriti nel filter param (obbligatorio) di tipo informativa_filter. Al momento non so dire se possiamo ottenere il pdf o se c'è una redirect ", response = File.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisce lo stream di dati del pdf.", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response informativeInformativaPdfGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor, @QueryParam("filter") String filter,@ApiParam(value = "header che permette di richiedere l'header di risposta Content-Disposition: \"attachment\". Se questo header viene passato nella request con valore \"attachment\", allora nella response dovrà essere presente l'header con \"Content-Disposition: attachment\" magari aggiungendo il nome del file da scaricare. Se non viene passato nella request o passato con un valore diverso da \"attachment\", allora nella response non dovrà essere presente l'header \"Content-Disposition\" " )@HeaderParam("X-Content-Disposition") String xContentDisposition,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
