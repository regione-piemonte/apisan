/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons;

import it.csi.apisan.apisancons.dto.apisancons.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.dto.apisancons.ConsensoInformativa;
import it.csi.apisan.apisancons.dto.apisancons.Errore;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/cittadino")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cittadino API")

public interface CittadinoApi  {
   
    @GET
    @Path("/{cf}/consensi")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista consensi", notes = "Restituisce la lista dei consensi associati al cittadino con codice fiscale == {cf} che sono attivi quindi con tipo_stato = A. Parametro filter deve essere di tipo id_informativa_filter, necessario nel caso (praticamente sempre) in cui si cercano i consensi di un cittadino ", response = Consenso.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisce l'array contenente i consensi del cittadino", response = Consenso.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadinoCfConsensiGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId, @PathParam("cf") String cf,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/consensi/{id_informativa}/asl/{id_asl}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Singolo consenso", notes = "Restituisce il consenso con uuid_versione == {uuid_versione_consenso} ", response = Consenso.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "L'operazione è andata a buon fine e viene restituito l'oggetto del consenso", response = Consenso.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadinoCfConsensiIdInformativaAslIdAslGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId, @PathParam("cf") String cf, @PathParam("id_informativa") String idInformativa, @PathParam("id_asl") String idAsl,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/consensi/{id_informativa}/asl/{id_asl}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifica un consenso", notes = "Modifica del consenso con uuid  == {uuid_consenso}  Al momento è consentita solo la revoca di un consenso del cittadino. Dati obbligatori sono  * idAura * tipostato * valoreconsenso Possibili codici di errore lato server (codice 500) sono * ERR_0028 ID_AURA e cf non corrispondono * CONS.E09  Trovato piu' di un risultato * CONS.R08 Valore non previsto ", response = Consenso.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "la modifica è stata effettuata con successo e viene restituita la nuova versione del consenso ", response = Consenso.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "", response = Void.class) })
    public Response cittadinoCfConsensiIdInformativaAslIdAslPut(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId, @PathParam("cf") String cf, @PathParam("id_informativa") String idInformativa, @PathParam("id_asl") String idAsl,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Le modifiche da apportare al consenso" ) Consenso consenso,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/consensi-informative")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista dei consensi", notes = "Restituisce la lista dei consensi che il cittadino ha dato legati a un'informativa;  ", response = ConsensoInformativa.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "La richiesta è andata a buon fine e restituisc l'array contenente le informative e i relativi consensi espressi dal cittadino", response = ConsensoInformativa.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadinoCfConsensiInformativeGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId, @PathParam("cf") String cf,@ApiParam(value = "Contiene l'ip del client" )@HeaderParam("X-Forwarded-For") String xForwardedFor,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{cf}/consensi")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inserisce un consenso di un cittadino richeista di restituire al posto dell'errore il onsenso passato come post. I campi da valorizzare sono   * cfcittadino * idAura * tipostato * id informativa * Asr * valoreconsenso  Possibili codici di errore lato server (codice 500) sono * ERR_0028 ID_AURA e cf non corrispondono * CONS.E09  Trovato piu' di un risultato ", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "l'inserimento è andato a buon fine ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "", response = Void.class) })
    public Response cittadinoCfConsensiPost( @PathParam("cf") String cf,@ApiParam(value = "" ) Consenso cosenso,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
