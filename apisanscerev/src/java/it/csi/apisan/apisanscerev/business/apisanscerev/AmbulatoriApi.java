/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev;

import it.csi.apisan.apisanscerev.dto.apisanscerev.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import it.csi.apisan.apisanscerev.dto.apisanscerev.Errore;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsi;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/ambulatori")


@io.swagger.annotations.Api(description = "the ambulatori API")

public interface AmbulatoriApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lista ambulatori", notes = "Restituisce la lista degli ambulatori trovati.  Permette al front-end di richiedere una lista degli ambulatori con tutti i dati a corredo necessari per la visualizzazione della lista (medico, tipologia, specializzazione, ecc.).  Il front-end può richiedere la paginazione dei risultati per evitare di mostrare troppi risultati a schermo. La paginazione viene effettuata tramite i due query params opzionali della request \"limit\" ed \"offset\" ed i 4 header della che contengono metadati relativi alla paginazione \"X-Page\", \"X-Page-Size\", \"X-Total-Elements\" ed \"X-Total-Pages\"  Il front-end dovrà necessariamente passare almeno una delle seguenti combinazioni di query params facoltativi:  * nome_medico * coordinate + distanza  Sono presenti anche altri query params della request opzionali che permettono di filtrare maggiormente la lista dei risultati ", response = ModelAmbulatorioLoccsi.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = ModelAmbulatorioLoccsi.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La richiesta fatta dal client è errata. Ad esempio non sono stati passati tutti i campi obbligatori, uno dei campi è di un tipo non valido, formattazione dei filtri errata ecc.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "L'utente non ha i permessi necessari per visualizzare queste risorse. <br> Ad esempio un utente che sta provando ad ottenere le ricette di un altro utente senza averne la delega.", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Si è verificato un'errore interno del server. (es. null pointer exception, connessione al DB saltata ecc)", response = Errore.class) })
    public Response ambulatoriGet(@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @QueryParam("nome_medico") String nomeMedico, @QueryParam("sesso") String sesso, @QueryParam("tipologia") String tipologia, @QueryParam("longitudine") String longitudine, @QueryParam("latitudine") String latitudine, @QueryParam("distanza") BigDecimal distanza, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("disponibilita") Boolean disponibilita,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
