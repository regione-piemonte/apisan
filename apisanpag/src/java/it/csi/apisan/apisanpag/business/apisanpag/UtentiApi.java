/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag;

import it.csi.apisan.apisanpag.dto.apisanpag.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanpag.dto.apisanpag.Errore;
import java.io.File;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.apisan.apisanpag.dto.apisanpag.Ticket;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/utenti")


@io.swagger.annotations.Api(description = "the utenti API")

public interface UtentiApi  {
   
    @GET
    @Path("/{cf}/avviso-pagamento/{numero_pratica_regionale}")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Metodo che richiede il pdf della stampa dell'avviso di pagamento Quanto il paziente  richiederà la stampa dell'avviso di pagamento passerà all'Api i dati dell'avviso di pagamento e otterrà come risposta il pdf.  Possibili code dell'errore http 500  * 999 errore generico  * 888 campo che serve alla stampa manca su db  * 777  campo che serve alla stama non corretto su db", response = File.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response utentiCfAvvisoPagamentoNumeroPraticaRegionaleGet(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @PathParam("numero_pratica_regionale") String numeroPraticaRegionale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/pagamenti-sanitari")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ritorna un elenco di pagamenti sanitari per il codice fiscale passato come path param.  il filtro consentito è di tipo pagamento_filter (la cui definizione è in fondo) i criteri supportati per i singoli campi del filtro sono impostati nella description di ogni singolo campo del filtro. Obbligatorio visualizzare solo le pratiche che sono interamente da pagare  pratiche interamente da pagare ovvero con la regola 'stato ci (000) pagato eq 0 e da_pagare gt 0'. ", response = PagamentoSanitario.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = PagamentoSanitario.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response utentiCfPagamentiSanitariGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/pagamenti-sanitari/{numero_pratica_regionale}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "specializzazione dell'api di ricerca dei pagamenti-sanitari da definire i codici di errore possibili", response = PagamentoSanitario.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = PagamentoSanitario.class) })
    public Response utentiCfPagamentiSanitariNumeroPraticaRegionaleGet(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @PathParam("numero_pratica_regionale") String numeroPraticaRegionale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/ricevute-pagamenti-sanitari/")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "L'Api consentirà di ricercare dentro la base dati del PTW le ricevute di pagamento corrispondenti al codice fiscale presente nel path param e al        numero pratica regionale o nre presente nel filter dell'Api stesso. Verrà  inserito nel filter anche l'id_ricevuta per consentire alla web app di  stampare la ricevuta per id. Il filtro che può essere utilizzato è di tipo ricevuta_filter definito in fondo; il criterio supportato per i filtri è eq", response = File.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 424, message = "codice servizio non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response utentiCfRicevutePagamentiSanitariGet(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/ricevute-pagamenti-sanitari/{id_ricevuta}")
    
    @Produces({ "application/pdf" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "L'api resituirà il pdf relativo al cf e id_ricevuta in input. Attenzione la ricevuta sarà valida ai fini fiscali", response = File.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 424, message = "codice servizio non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response utentiCfRicevutePagamentiSanitariIdRicevutaGet(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @PathParam("id_ricevuta") String idRicevuta,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/rimborsi")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Recuperare l'elenco dei ticket da rimborsare per il cittadino, il filtro consentito e obbligatorio e' di tipo rimborso_filter (la cui definizione è in fondo) i criteri supportati per i singoli campi del filtro sono impostati nella description di ogni singolo campo del filtro. Obbligatorio visualizzare solo i rimborsi che sono non erogati (in_erogazione = 0) da rimborsare (stato_ticket = 802) e modalita borsellino (modalita_rimborso = 3).", response = Ticket.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = Ticket.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "endpoint gpr non trovatp", response = Errore.class) })
    public Response utentiCfRimborsiGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
