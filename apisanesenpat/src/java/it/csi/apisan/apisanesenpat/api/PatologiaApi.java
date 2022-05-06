/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api;

import io.swagger.annotations.ApiParam;
import it.csi.apisan.apisanesenpat.model.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/")

@io.swagger.annotations.Api(description = "the patologia API")

public interface PatologiaApi {

    @PUT
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/annullamento")
    @io.swagger.annotations.ApiOperation(value = "Annulla esenzione", notes = "Permette di annullare un'esenzione ", response = ModelEsenzione.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzione.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response annullaEsenzioneGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @ApiParam(value = "", required = true) Payload4 payload, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}")
    @io.swagger.annotations.ApiOperation(value = "Dettaglio esenzione", notes = "Permette di ottenere la singola esenzione ", response = ModelEsenzione.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzione.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response dettaglioEsenzioneGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/esenzioni/pdf")
    @Produces({"application/pdf"})
    @io.swagger.annotations.ApiOperation(value = "Download attestati", notes = "Permette di scaricare l'attestato di tutte le esenzioni associate al cittadino ", response = Void.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo. Restituisce il .pdf con tutti gli attestati ", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response downloadAttestatiGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/esenzioni")
    @io.swagger.annotations.ApiOperation(value = "Lista esenzioni", notes = "Permette di ottenere la lista delle esenzioni associate al cittadino ed eventualmente di filtrarle tramite il parametro `filter` nella query string ", response = ModelEsenzione.class, responseContainer = "List", tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzione.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response listaEsenzioniGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @QueryParam("filter") String filter, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/certificati/{certificato_id}")
    @io.swagger.annotations.ApiOperation(value = "Dettaglio certificato", notes = "Permette di ottenere il singolo certificato ", response = ModelCertificato.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelCertificato.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdCertificatiCertificatoIdGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("certificato_id") String certificatoId, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/certificati/{certificato_id}/pdf")
    @Produces({"application/pdf"})
    @io.swagger.annotations.ApiOperation(value = "Download certificato", notes = "Permette di ottenere il PDF del certificato ", response = Void.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce il PDF con il certificato della dichiarazione ", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdCertificatiCertificatoIdPdfGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("certificato_id") String certificatoId, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/certificati")
    @io.swagger.annotations.ApiOperation(value = "Lista certificati", notes = "Permette di ottenere la lista dei certificati associati al cittadino eventualmente filtrabili tramite il parametro `filter` presente nella query string ", response = ModelCertificato.class, responseContainer = "List", tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelCertificato.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdCertificatiGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @QueryParam("filter") String filter, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/pdf")
    @Produces({"application/pdf"})
    @io.swagger.annotations.ApiOperation(value = "Download attestato", notes = "Permette di ottenere il PDF dell'attestato per la singola esenzione ", response = Void.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce il PDF con l'attestato della dichiarazione ", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdEsenzioniEsenzioneIdPdfGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @NotNull @QueryParam("document_type") String documentType, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/storico")
    @io.swagger.annotations.ApiOperation(value = "Storico esenzione", notes = "Permette di ottenere lo storico della singola esenzione ", response = ModelEsenzioneCambioStato.class, responseContainer = "List", tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzioneCambioStato.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdEsenzioniEsenzioneIdStoricoGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @GET
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/zip")
    @Produces({"application/zip"})
    @io.swagger.annotations.ApiOperation(value = "Download allegati", notes = "Permette di ottenere lo zip della documentazione allegata dal cittadino ", response = Void.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce lo zip con la documentazione allegata dall'utente ", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdEsenzioniEsenzioneIdZipGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @POST
    @Path("/cittadini/{cit_id}/esenzioni")
    @io.swagger.annotations.ApiOperation(value = "Nuova esenzione", notes = "Permette di creare una nuova esenzione ", response = ModelEsenzione.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Operazione eseguita con successo ", response = ModelEsenzione.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response patologiaCittadiniCitIdEsenzioniPost(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @ApiParam(value = "L'utente può richiedere l'esenzione in 2 modi:  1. **Usando un certificato già validato**     In questo caso i dati obbligatori nel payload sono:     * certificato_id  2. **Caricando il certificato al momento della richiesta di esenzione**     In questo caso i dati obbligatori nel payload sono:     * file_base64     * data_rilascio     * tipologia     * malattia     * tipologia_documento      3. **Senza documentazione e recandosi all'ASL**     In questo caso i dati obbligatori sono:     * tipologia     * malattia ", required = true) Payload payload, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @PUT
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/rettifica")
    @io.swagger.annotations.ApiOperation(value = "Rettifica esenzione", notes = "Permette di modificare la singola esenzione tramite il processo di rettifica ", response = ModelEsenzione.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzione.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response rettificaEsenzioneGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @ApiParam(value = "La rettifica avviene solo per richieste di esenzione con caricamento del certificato manuale. ", required = true) Payload1 payload, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @PUT
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/revoca")
    @io.swagger.annotations.ApiOperation(value = "Revoca esenzione", notes = "Permette di revocare un'esenzione ", response = ModelEsenzione.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzione.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response revocaEsenzioneGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @ApiParam(value = "", required = true) Payload3 payload, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);

    @PUT
    @Path("/cittadini/{cit_id}/esenzioni/{esenzione_id}/rinnovo")
    @io.swagger.annotations.ApiOperation(value = "Rinnovo esenzione", notes = "Permette di rinnovare un'esenzione ", response = ModelEsenzione.class, tags = {"Giallo",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEsenzione.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "La risorsa cercata non è stata trovata. <br> Questo errore viene restituito quando si prova ad accedere alla singola risorsa e questa non esiste. <br> Nel caso in cui si prova ad ottenere una lista e non ci sono elementi, restituire 200 con un array vuoto", response = Errore.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class)})
    public Response rinnovoEsenzioneGiallo(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth", required = true) @HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta", required = true) @HeaderParam("X-Request-Id") String xRequestId, @ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end> | <ip-primo-server> | ... | <ip-ultimo-server> ``` Es. `10.10.10.10 | 10.38.45.68 | 10.128.69.244` ", required = true) @HeaderParam("X-Forwarded-For") String xForwardedFor, @ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)", required = true) @HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("esenzione_id") String esenzioneId, @ApiParam(value = "L'utente può richiedere il rinnovo dell'esenzione in 2 modi  1. **Usando un certificato già validato**     In questo caso i dati obbligatori nel payload sono     * certificato_id  2. **Caricando il certificato al momento della richiesta di esenzione**     In questo caso i dati obbligatori nel payload sono     * file_base64     * data_rilascio     * tipologia_documento ", required = true) Payload2 payload, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response);
}
