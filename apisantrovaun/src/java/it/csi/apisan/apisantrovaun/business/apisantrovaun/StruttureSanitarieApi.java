/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun;

import it.csi.apisan.apisantrovaun.dto.apisantrovaun.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.Errore;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelStrutturaSanitaria;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/strutture-sanitarie")


@io.swagger.annotations.Api(description = "the strutture-sanitarie API")

public interface StruttureSanitarieApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista strutture sanitarie", notes = "Lista delle strutture sanitarie.  La lista è paginata tramite i query params opzionali `limit` ed `offset`.  Permette di filtrare la lista  per nome, vicinanza geografica, tipologia assistenza e tutte le combinazioni.  In particolare:   * Se viene passato solo il query param `s` allora viene eseguita la ricerca solo per full-text   * Se vengono passati solo i query params `latitudine`, `longitudine` e `distanza`, allora viene eseguita la ricerca per vicinanza geografica   * Se viene passato solo il query params `tipologia_assistenza` allora viene eseguita la ricerca solo per determinate tipologie di struttura    E' possibile poi combinare i query params per raffinare maggiormente la ricerca. ", response = ModelStrutturaSanitaria.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelStrutturaSanitaria.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response struttureSanitarieGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @QueryParam("s") String s, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("latitudine") String latitudine, @QueryParam("longitudine") String longitudine, @QueryParam("distanza") BigDecimal distanza, @QueryParam("tipologia_assistenza") String tipologiaAssistenza,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
