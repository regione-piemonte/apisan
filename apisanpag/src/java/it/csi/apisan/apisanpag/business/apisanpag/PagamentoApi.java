/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag;

import it.csi.apisan.apisanpag.dto.apisanpag.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanpag.dto.apisanpag.Errore;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody;
import it.csi.apisan.apisanpag.dto.apisanpag.RicevutaPagamento;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pagamento")


@io.swagger.annotations.Api(description = "the pagamento API")

public interface PagamentoApi  {
   
    @POST
    @Path("/{id_transazione}/ricevuta")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Una volta che il paziente viene rediretto da MDP sulla landing page ...pagamentoOK.xml?tranId=TST000000000043015 la web app invoca quest'api per creare il pdf della ricevuta di pagamento e nel caso di pagamento POS registra il pagamento sul S.I. dell'Asr L'Api richiede nel path param {id_transazione} l'identificativo della transazione I possibili risultati sono il dettaglio del pagamento per consentire alla web app di produrre la pagina di pagamento terminato con successo, con l'elenco delle pratica presenti nel carrello. Se la pratica è stata pagata con POS verrà data evidenza. Da vedere il tipo di ritorno", response = RicevutaPagamento.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "operazione eseguita con successo", response = RicevutaPagamento.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 421, message = "codice fiscale non valido (controllo su lunghezza)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 424, message = "codice servizio non valido", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response pagamentoIdTransazioneRicevutaPost(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor, @PathParam("id_transazione") String idTransazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "informazioni necessarie ad effettuare il pagamento del carrello con l'aggiunta delle pratiche da rimborsare si sono aggiunti i seguenti possibili codici di errore.  Possibili codici di errore  * '245'  Ticket da rimborsare con modalita' erogazione diversa da 'borsellino'   * '246' Ticket da rimborsare con stato erogazione diverso da 'da rimborsare'   * '251' Ticket da rimborsare differenti tra loro   * '252' Ticket da pagare e ticket da rimborsare incompatibili   * '255' L'invocazione di SetStatoErogazioneRimborso per uno o più rimborsi e' fallita   * '256' L'invocazione di GetListaRimborsi e' fallita   * '257' Il salvataggio dei rimborsi su DB e' fallito", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "operazione eseguita con successo restituisce la URL del Wisp2 di AgID sul Wisp2 il paziente esegue il pagamento PagoPA", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "salvataggio non riuscito", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 512, message = "errore transazione già processata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 513, message = "errore transazione rifiutata", response = Errore.class) })
    public Response pagamentoPost(@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "elenco delle pratiche da pagare con i dati del versante" ,required=true) PagamentoSanitarioBody elencoPraticheEVersante,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
