/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse;

import it.csi.apisan.apisanfse.dto.apisanfse.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import it.csi.apisan.apisanfse.dto.apisanfse.CittadinoArruolabile;
import it.csi.apisan.apisanfse.dto.apisanfse.ConsensoFse;
import it.csi.apisan.apisanfse.dto.apisanfse.Errore;
import java.io.File;
import it.csi.apisan.apisanfse.dto.apisanfse.ImmagineRete;
import it.csi.apisan.apisanfse.dto.apisanfse.Informativa;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelConteggio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoPersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoResponse;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoScaricabileExt;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEpisodio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsenzione;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelInformazioniSistemiScreening;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelResponseAccessi;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRispostaDettaglioDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRispostaTuttiDocs;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaStatoRichiesta;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaStatoRichiesta2;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadAssociaEtichette;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadDocumentoPersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadEtichetta;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadOscuramento;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadPrenotaImmagine;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadRegistraDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchConteggi;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchDocumenti;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchEpisodi;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSetAudit;
import it.csi.apisan.apisanfse.dto.apisanfse.Referto;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/cittadini")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cittadini API")

public interface CittadiniApi  {
   
    @GET
    @Path("/{cf}/arruolamento")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Il servizio restituisce l’informazione (risposta+codice) relativa all’arruolabilità dell’utente. Se la risposta del servizio è ‘SI’ allora all’utente può essere proposta l’apertura del FSE. I codici di ritorno possibili sono        * 000 Assistito NON è piemontese        * 003 -Assistito piemontese con consenso all'alimentazione a SI;       * 000-Assistito piemontese con consenso all'alimentazione a NO che non ha optato per \"non chiedermelo più\";       * 005-Assistito piemontese con consenso all'alimentazione a NO e ha optato per \"non chiedermelo più\" ", response = CittadinoArruolabile.class, tags={ "Arruolamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CittadinoArruolabile.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfArruolamentoGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @QueryParam("servizio") String servizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/arruolamento")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Il servizio permette di registrare la preferenza dell’utente in merito alla scelta di ‘non essere più disturbato’ con la proposta di apertura del FSE. Dopo aver richiamato questo servizio non sarà più possibile aprire il fascicolo tramite l’accesso ai verticali poiché il servizio GetArruolamento non restituirà più la risposta ‘SI’.", response = Void.class, tags={ "Arruolamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Preferenza arruolabilita registrata", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfArruolamentoPut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/consenso")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Restituisce i valori dei consensi generali (alimentazione, consultazione e recupero del pregresso) impostati dal cittadino", response = ConsensoFse.class, tags={ "Consenso", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Preferenze FSE registrate", response = ConsensoFse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCfConsensoGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @QueryParam("servizio") String servizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{cf}/consenso")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Registra i valori dei consensi generali del FSE (alimentazione, consultazione e recupero del pregresso).", response = ConsensoFse.class, tags={ "Consenso", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Preferenze FSE registrate", response = ConsensoFse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCfConsensoPost(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf,@ApiParam(value = "" ,required=true) ConsensoFse consensoFse, @QueryParam("servizio") String servizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/consultazione-preferenze")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Il servizio permetta di registrare la scelta dell'assistito di 'non essere più disturbato' con la richiesta di proposta di modifica del consenso alla consultazione.", response = Void.class, tags={ "Arruolamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Preferenza consultazione registrata", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfConsultazionePreferenzePut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/informativa/{id_informativa}/pdf")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Serve per ricercare l'id dell'ultima informativa valida. Al momento non ancora implementato ritorna quindi codice 421 ", response = File.class, tags={ "Arruolamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce uno stream di tipo pdf .", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfInformativaIdInformativaPdfGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @PathParam("id_informativa") String idInformativa,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/informativa-ultima")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Serve per ricercare l'id dell'ultima informativa valida ", response = Informativa.class, tags={ "Arruolamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Informativa.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfInformativaUltimaGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/informativa-ultima/pdf")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Restituisce il pdf dell'ultima informativa ", response = File.class, tags={ "Arruolamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce uno stream di tipo pdf .", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfInformativaUltimaPdfGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/accessi")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get accessi", notes = "Ritorna l'elenco degli accessi effettuati dal cittadino", response = ModelResponseAccessi.class, responseContainer = "List", tags={ "Paziente", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelResponseAccessi.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdAccessiGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @NotNull @QueryParam("data_inizio_ricerca") String dataInizioRicerca, @NotNull @QueryParam("data_fine_ricerca") String dataFineRicerca,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/audit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "setaudit", notes = "Scrive nella tabella di audit ogni volta che l'utente esegue l'accesso a un verticale", response = Void.class, tags={ "Paziente", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdAuditPost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId,@ApiParam(value = "Payload per eseguire una set audit " ) PayloadSetAudit payloadSetAudit, @QueryParam("ruolo") String ruolo,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documenti/{codice_documento_dipartimentale}/prenotazione")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Prenota il pacchetto immagini per renderlo poi disponibile allo scarico. La prenotazione viene effettuata usando il Codice Documento Dipartimentale ricevuto in input. ", notes = "Permette all'utente di registrare un avvenimento di ritiro di documento. I dati del payload obbligatori sono codice componente locale e accession numbers ", response = Void.class, tags={ "Immagini", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentalePrenotazionePost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("codice_documento_dipartimentale") String codiceDocumentoDipartimentale,@ApiParam(value = "Payload per la prenotazione delle immagini. Obbligatorio solo il codice della componente locale e gli accession numbers . " ) PayloadPrenotaImmagine payloadPrenotaImmagine,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{codice_documento_dipartimentale}/stato-immagine")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Stato richiesta immagine", notes = "Ritorna i dati riguardanti la richiesta dell'immagine", response = ModelVerificaStatoRichiesta.class, tags={ "Immagini", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelVerificaStatoRichiesta.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentaleStatoImmagineGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("codice_documento_dipartimentale") String codiceDocumentoDipartimentale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{codice_documento_dipartimentale}/verifica-documento-scaricabile")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Verifica-documento-scaricabile", notes = "Il servizio restituisce l’informazione al verticale Covid-19 se il documento per cui è stato invocato può essere restituito o meno al richiedente e su quale tabella (ROL o FSE) può essere recuperato. ", response = ModelVerificaDocumento.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelVerificaDocumento.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaDocumentoScaricabileGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("codice_documento_dipartimentale") String codiceDocumentoDipartimentale, @NotNull @QueryParam("codice_app_verticale") String codiceAppVerticale, @NotNull @QueryParam("componente_locale") String componenteLocale, @NotNull @QueryParam("codice_ruolo") String codiceRuolo,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{codice_documento_dipartimentale}/verifica-stato-richiesta-2")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Verifica Stato Richiesta 2", notes = "Ritorna lo stato della richiesta, se presente torna il nome e la directory del file zip contenente le immagini da scaricare, e l'idDocumentoIlec del referto", response = ModelVerificaStatoRichiesta2.class, tags={ "Immagini", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelVerificaStatoRichiesta2.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaStatoRichiesta2Get(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("codice_documento_dipartimentale") String codiceDocumentoDipartimentale, @NotNull @QueryParam("codice_cl") String codiceCl,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documenti/conteggi/_search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get conteggi", notes = "Restituisce il conteggio dei documenti per episodio, per documenti area blu per etichette fisse", response = ModelConteggio.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelConteggio.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiConteggiSearchPost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId,@ApiParam(value = "Payload per la ricerca dei conteggi " ) PayloadSearchConteggi payloadSearchConteggi,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documenti/documento-personale")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Inserimento documento personale", notes = "Inserice il documento personale per il cittadino passato nel payload, ritorna l'id del documento", response = String.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiDocumentoPersonalePost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId,@ApiParam(value = "Tutti i dati che servono per inserire un documento personale di un cittadino " ,required=true) PayloadDocumentoPersonale payloadDocumentoPersonale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/episodi/{id_episodio}/documenti-episodio")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get documenti episodio", notes = "Il servizio restituisce i documenti associati ad un episodio passato in input ", response = ModelDocumento.class, responseContainer = "List", tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelDocumento.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiEpisodiIdEpisodioDocumentiEpisodioGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_episodio") BigDecimal idEpisodio, @NotNull @QueryParam("componente_locale") String componenteLocale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documenti/episodi/_search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get episodi", notes = "Restituisce l'elenco degli episodi", response = ModelEpisodio.class, responseContainer = "List", tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelEpisodio.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiEpisodiSearchPost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@ApiParam(value = "payload per la ricerca degli episodi " ) PayloadSearchEpisodi payloadSearchEpisodi,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{id_documento}/dettaglio-documento")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get dettaglio documento", notes = "Ritorna il documento personale passato nella uri", response = ModelRispostaDettaglioDocumento.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelRispostaDettaglioDocumento.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento, @NotNull @QueryParam("categoria") String categoria, @NotNull @QueryParam("componente_locale") String componenteLocale, @QueryParam("flag_rol") String flagRol,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{id_documento}/documenti-correlati")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista documenti correlati", notes = "Ritorna l'elenco dei documenti correlati al documento passato nalla uri", response = ModelDocumento.class, responseContainer = "List", tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelDocumento.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoDocumentiCorrelatiGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento, @NotNull @QueryParam("codice_cl") String codiceCl, @NotNull @QueryParam("tipo_correlazione_documento") String tipoCorrelazioneDocumento,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{id_documento}/documenti-oscurati")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista documenti oscurati", notes = "Il servizio restituisce l'elenco dei documenti correlati al documento passato in input cui verrà esteso il cambio di visibilità (perché aventi lo stesso NRE o appartenenti alla tipologia PSS, PCP, BDS)", response = ModelDocumento.class, responseContainer = "List", tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelDocumento.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoDocumentiOscuratiGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento, @NotNull @QueryParam("codice_cl") String codiceCl, @NotNull @QueryParam("azione") String azione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{id_documento}/documento")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get documento", notes = "Ritorna il documento", response = ModelDocumentoResponse.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelDocumentoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoDocumentoGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento, @NotNull @QueryParam("id_episodio") String idEpisodio, @NotNull @QueryParam("componente_locale") String componenteLocale, @NotNull @QueryParam("firmato_digitalmente") Boolean firmatoDigitalmente, @NotNull @QueryParam("criptato") Boolean criptato, @NotNull @QueryParam("tipo_documento") String tipoDocumento, @NotNull @QueryParam("codice_ruolo") String codiceRuolo, @NotNull @QueryParam("codice_app_verticale") String codiceAppVerticale, @QueryParam("id_repository") String idRepository, @QueryParam("documento_dipartimentale") String documentoDipartimentale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @DELETE
    @Path("/{citId}/documenti/{id_documento}/documento-personale")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancellazione documento personale", notes = "Ritorna il documento personale passato nella uri", response = Void.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleDelete(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{id_documento}/documento-personale")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Documento personale", notes = "Ritorna il documento personale passato nella uri", response = ModelDocumentoPersonale.class, responseContainer = "List", tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelDocumentoPersonale.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documenti/{id_documento}/registra-ritiro")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Registra ritiro documento", notes = "Permette all'utente di registrare un avvenimento di ritiro di documento ", response = Void.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoRegistraRitiroPost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento,@ApiParam(value = "Dati da inserite per a registrazione del documento " ,required=true) PayloadRegistraDocumento payloadRegistraDocumento,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/documenti/{id_documento}/zip")
    
    @Produces({ "application/zip" })
    @io.swagger.annotations.ApiOperation(value = "Restituisce ZIP con allegati", notes = "Restituisce il path nell'header", response = Void.class, tags={ "Immagini", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 303, message = "Redirect a scarico imr", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdDocumentiIdDocumentoZipGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento, @NotNull @QueryParam("codice_cl") String codiceCl, @QueryParam("archivio_documento_Ilec") String archivioDocumentoIlec,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documenti/_search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get tutti i docs", notes = "Ritorna tutti i docs a seconda dei parametri impostati nel payload", response = ModelRispostaTuttiDocs.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelRispostaTuttiDocs.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentiSearchPost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@ApiParam(value = "Payload per la ricerca dei documenti " ) PayloadSearchDocumenti payloadSearchDocumenti,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/documento/{id_documento}/associa-etichette")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Associa Etichette", notes = "Permette all'utente di registrare una o più etichette al documento. In generale il servizio consente di associare al documento    * una etichetta fissa   * una o più etichette personali   * una etichetta fissa e più etichette personali ", response = Void.class, tags={ "Etichette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdDocumentoIdDocumentoAssociaEtichettePost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_documento") String idDocumento,@ApiParam(value = "Dati da inserire per associare le etichette a un documento " ,required=true) PayloadAssociaEtichette payloadAssociaEtichette,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/esenzioni")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista esenzioni", notes = "Se il servizio e' chiamato dall'applicazione Sansol e con il ruolo CIT allora restituisce solamente il valore dell'oscuramento delle esenzioni", response = ModelEsenzione.class, responseContainer = "List", tags={ "Esenzioni", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelEsenzione.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdEsenzioniGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @NotNull @QueryParam("servizio") String servizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/etichette")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista etichette", notes = "Restituisce l'elenco delle etichette che appartengono al cittadino ", response = ModelEtichetta.class, responseContainer = "List", tags={ "Etichette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelEtichetta.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdEtichetteGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @DELETE
    @Path("/{citId}/etichette/{id_etichetta}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancella etichetta", notes = "Permette all'utente di cancellare un'etichetta di tipo personale ", response = Void.class, tags={ "Etichette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response cittadiniCitIdEtichetteIdEtichettaDelete(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_etichetta") Long idEtichetta,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/etichette/{id_etichetta}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Ritorna una singola etichetta", notes = "Get singola etichetta ", response = ModelEtichetta.class, tags={ "Etichette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelEtichetta.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdEtichetteIdEtichettaGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_etichetta") Long idEtichetta, @NotNull @QueryParam("tipologia_etichetta") String tipologiaEtichetta,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{citId}/etichette/{id_etichetta}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifica etichetta", notes = "Permette all'utente di modificare la descrizione di un\\'etichetta di tipo etichetta_personale  ", response = Void.class, tags={ "Etichette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdEtichetteIdEtichettaPut(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @PathParam("id_etichetta") Long idEtichetta,@ApiParam(value = "I dati che il cittadino deve inserire quano inserisce un'etichetta necessario solo la descrizione dell'etichetta in quanto la tipologia è personale per default e il codice lo ricava da una sequence del database " ,required=true) PayloadEtichetta payloadEtichetta,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/etichette")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Insserisci etichetta personale", notes = "Permette all'utente di inserire un'etichetta di tipo etichetta_personale,  (` chiave unica su cit_id e descrizione e data_fine_validita a null`), la descrizione è in minuscolo (lower case). Nel payload passato è presente solo la descrizione in quanto la tipologia è di default etichetta_personale e l'id  viene calcolato dalla sequence presente sul database. Per raggruppare le etichette 'tag_fissi' si `propone di valorizzare il campo codice anteponendovi la parte anatomica di riferimento nella quale verrà raggruppata seguita dal _ e il nome dell'etichetta fissa` (esempio Testa_occhi) ", response = ModelEtichetta.class, tags={ "Etichette", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelEtichetta.class) })
    public Response cittadiniCitIdEtichettePost(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId,@ApiParam(value = "I dati che il cittadino deve inserire quano inserisce un'etichetta necessario solo la descrizione dell'etichetta in quanto la tipologia è personale per default e il codice lo ricava da una sequence del database " ,required=true) PayloadEtichetta payloadEtichetta,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{citId}/oscuramento")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifica Oscuramento documento, esenzione, esame screening", notes = "Oscura uno o più documenti, esenzioni o esami screening. A seconda del valore del tipo di dato il cui codice può essere    * DOCPER (in caso di documenti personali)   * DOC (in caso di valorizzazione dell'oscuramento su singolo documento)   * ESE (in caso di valorizzazione dell'oscuramento sulle esenzioni)   * SCR (screening) saranno obbligatori alcuni campi o meno del payload. Esempio nel caso di oscuramento screening dovranno essere valorizzati i campi del payload tipo screening, data esame e tipo esame,  N.B. DA VALUTARE ANCORA SE INSERIRE PIU' API DI OSCURAMENTO (UNA PER TIPO) SAREBBE CORETTO SECONDO UNA LOGICA REST. ", response = Void.class, tags={ "Oscuramento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdOscuramentoPut(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @NotNull @QueryParam("servizio") String servizio,@ApiParam(value = "Payload per oscurare un dosumento o uno screening " ) PayloadOscuramento payloadOscuramento,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/referti")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista referti", notes = "Restituisce un elenco (lista) di metadati (quadro sinottico di tutti i referti disponibili)", response = Referto.class, responseContainer = "List", tags={ "Referti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of Referto.", response = Referto.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{citId}/referti/{idReferto}/annullamento")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Referto Types", notes = "Cambia lo stato del Referto eliminandolo logicamente( Inserisce data di cancellazione). ", response = Void.class, tags={ "Referti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Referto cancellato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiIdRefertoAnnullamentoPut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("idReferto") String idReferto,@ApiParam(value = "" ,required=true)@HeaderParam("pin") String pin,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/referti/{idReferto}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Referto Types", notes = "Restituisce una solo referto. Se refertoId vale last restituisce l'ultimo referto ovvero il referto con  dataRefertazione massima, indipendentem se l'ho già visualizzato oppure no o se è pagato o no (condizione vincolante solo per la visualizzazione del referto). ", response = Referto.class, responseContainer = "List", tags={ "Referti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array di referti", response = Referto.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiIdRefertoGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("idReferto") String idReferto,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/referti/{idReferto}/pdf")
    
    @Produces({ "application/pdf", "application/pkcs7-mime" })
    @io.swagger.annotations.ApiOperation(value = "Referto in formato pdf", notes = "Restituisce uno stream di tipo pdf .", response = File.class, tags={ "Referti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Return PDF", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiIdRefertoPdfGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("idReferto") String idReferto, @QueryParam("pin") String pin, @QueryParam("firmato") String firmato,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{citId}/referti/{idReferto}/prenotazione")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Prenota immagine", notes = "Prenota il pacchetto immagini per renderlo poi disponibile allo scarico. In questo caso viene effettuata dapprima una chiamata a newGetListaRefertiSR per recuperare, partendo dall'IdReferto ricevuto in input il Codice Documento Dipartimentale necessario per effettuare la chiamata al servizio di prenotazione dell'immagine. ", response = Void.class, tags={ "Immagini", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Prenotazione effettuata", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiIdRefertoPrenotazionePost(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("idReferto") String idReferto,@ApiParam(value = "sono da valorizzare e_mail e sistema_operatino non il pin in quanto ne viene usato uno di default" ,required=true) ImmagineRete prenotazioneImmagine,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/referti/{idReferto}/zip/{idpacchetto}")
    
    @Produces({ "application/zip" })
    @io.swagger.annotations.ApiOperation(value = "Restituisce ZIP con allegati", notes = "Restituisce il path nell'header", response = File.class, tags={ "Immagini", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Return ZIP da implementare", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 303, message = "Redirect a scarico imr", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiIdRefertoZipIdpacchettoGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("citId") String citId, @PathParam("idReferto") String idReferto, @PathParam("idpacchetto") String idpacchetto, @QueryParam("pin") String pin,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/referti/pdf")
    
    @Produces({ "application/pdf", "application/pkcs7-mime" })
    @io.swagger.annotations.ApiOperation(value = "Referto in formato pdf", notes = "Restituisce uno stream di tipo pdf .", response = File.class, tags={ "Referti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Return PDF", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCitIdRefertiPdfGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @NotNull @QueryParam("componente_locale") String componenteLocale, @NotNull @QueryParam("id_documento_cl") String idDocumentoCl, @NotNull @QueryParam("pin") String pin, @NotNull @QueryParam("firmato") String firmato,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{citId}/screening")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista esami screening", notes = "Restituisce l'elenco degli esami citologico , mammagrafico e colon con le informazioni di dettaglio visualizzate nel portale, incluso l'oscuramento ", response = ModelInformazioniSistemiScreening.class, responseContainer = "List", tags={ "Screening", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelInformazioniSistemiScreening.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniCitIdScreeningGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("citId") String citId, @NotNull @QueryParam("servizio") String servizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{tax_code}/documenti/{codice_azione}/documento-scaricabile-ext")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "documento-scaricabile-ext", notes = "Il servizio restituisce l’informazione al verticale Covid-19 sul servizio da invocare per il recuperato del documento da scaricare. ", response = ModelDocumentoScaricabileExt.class, tags={ "Documenti", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ModelDocumentoScaricabileExt.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response cittadiniTaxCodeDocumentiCodiceAzioneDocumentoScaricabileExtGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale, @PathParam("tax_code") String taxCode, @PathParam("codice_azione") String codiceAzione, @NotNull @QueryParam("codice_app_verticale") String codiceAppVerticale, @NotNull @QueryParam("documento_id") String documentoId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
