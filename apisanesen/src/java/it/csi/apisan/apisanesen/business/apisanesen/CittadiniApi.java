/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen;

import it.csi.apisan.apisanesen.dto.apisanesen.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanesen.dto.apisanesen.Cittadino;
import it.csi.apisan.apisanesen.dto.apisanesen.Errore;
import it.csi.apisan.apisanesen.dto.apisanesen.Esenzione;
import it.csi.apisan.apisanesen.dto.apisanesen.EsenzionePost;
import it.csi.apisan.apisanesen.dto.apisanesen.Info;
import it.csi.apisan.apisanesen.dto.apisanesen.Revoca;

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


@io.swagger.annotations.Api(description = "the cittadini API")

public interface CittadiniApi  {
   
    @GET
    @Path("/{cf}/beneficiari")
    
    
    @io.swagger.annotations.ApiOperation(value = "Lista beneficiari", notes = "Restituisce l'elenco di beneficiari delle esenzioni relative al cittadino con il `{cf}` passato nel path", response = Cittadino.class, responseContainer = "List", tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce l'elenco dei beneficiari del cittadino identificato dal {cf} nel path.", response = Cittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfBeneficiariGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/esenzioni")
    
    
    @io.swagger.annotations.ApiOperation(value = "Lista esenzioni", notes = "Lista esenzioni con ricerca", response = Esenzione.class, responseContainer = "List", tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce l'elenco delle esenzioni relative al cittadino identificato dal {cf} che rispettano i filtri passati nella querystring tramite il parametro `filter`.", response = Esenzione.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfEsenzioniGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/esenzioni/{id}")
    
    @Produces({ "application/json", "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "Esenzione", notes = "Corrisponde alla singola esenzione. Se invocato con il paramentro __`format=pdf`__ restituisce il PDF dell'esenzione. ", response = Esenzione.class, tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce l'esenzione identificata tramite `{id}` nel path. Attenzione che sull'id viene effettuata una trasformazione nel richiamo del servizio di back end. Se ricevo solo l'identificativo antepongo 000- all'identificativo e l'id diventa 000- + id, se riceve numero protocollo, codice esenzione e data inizio validita verifico se il numero protocollo inizia per 010 o no.  se inizia per 010 antepongo 002- e passo tutti e tre i dati separati dal trattino  se non inizia per 010 antepongo 001- e passo soltanto il numero protocollo. L'id passato nel path param deve essere composto da id (se presente nella get precedente) oppure da {protocollo}-{codice_esenzione}-{data_inizio_validita} nel caso in cui l'id nella get precedente non fosse presente Se invece viene valorizzato l'header `Accept: application/pdf`, ritorna il PDF dell'esenzione. ", response = Esenzione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfEsenzioniIdGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf, @PathParam("id") String id, @NotNull @QueryParam("cf_beneficiario") String cfBeneficiario,@ApiParam(value = "Stabilisce qual è il tipo di ritorno atteso (`application/json`, `application/pdf`, ecc)" )@HeaderParam("Accept") String accept,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/esenzioni/{id}/revoca")
    
    
    @io.swagger.annotations.ApiOperation(value = "Revoca esenzione", notes = "Revoca esenzione", response = Esenzione.class, tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce l'esenzione revocata con le modifiche apportate dal backend", response = Esenzione.class),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "L'esenzione è in stato \"in verifica\",  la modifica verrà effettuata appena possibile.", response = Esenzione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfEsenzioniIdRevocaPut(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf, @PathParam("id") String id,@ApiParam(value = "Servizio di revoca; deve essere passato l'id dell'esenzione che deve essere composto da id (se presente nella get precedente) oppure da {protocollo}-{codice_esenzione}-{data_inizio_validita} nel caso in cui l'id nella get precedente non fosse presente." ) Revoca revoca,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{cf}/esenzioni")
    
    
    @io.swagger.annotations.ApiOperation(value = "Crea esenzione", notes = "Crea una nuova esenzione", response = Esenzione.class, tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Crea l'esenzione e la restituisce.", response = Esenzione.class),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "L'esenzione è in stato \"in verifica\".", response = Esenzione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfEsenzioniPost(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf,@ApiParam(value = "Il payload necessario alla creazione di una nuova esenzione. Gli altri campi (`id`, `protocollo`, `data_scadenza`, ecc) vengono generati automaticamente in base alla logica di business. Il codice fiscale dell'utente che ha creato l'esenzione è un'informazione abbastanza forte dal momento che viene fornita dal provider di autenticazione (SPID ecc.). Il cittadino per cui stiamo creando l'esenzione, invece, viene creato tramite dati inseriti dall'utente.  " ) EsenzionePost esenzione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/info")
    
    
    @io.swagger.annotations.ApiOperation(value = "Informazioni", notes = "Contiene informazioni inerenti all'utente per il servizio ma che non si riferiscono a nessuna delle risorse", response = Info.class, tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce le informazioni.", response = Info.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfInfoGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/titolari")
    
    
    @io.swagger.annotations.ApiOperation(value = "Lista titolari", notes = "Restituisce l'elenco dei titolari delle esenzioni relative al cittadino con il `{cf}` passato nel path", response = Cittadino.class, responseContainer = "List", tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce l'elenco dei titolari delle esenzioni del cittadino identificato dal {cf} nel path.", response = Cittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response cittadiniCfTitolariGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
