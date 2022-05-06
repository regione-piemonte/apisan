/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen;

import it.csi.apisan.apisanesen.dto.apisanesen.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanesen.dto.apisanesen.CodiceEsenzione;
import it.csi.apisan.apisanesen.dto.apisanesen.Errore;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/codici-esenzione")


@io.swagger.annotations.Api(description = "the codici-esenzione API")

public interface CodiciEsenzioneApi  {
   
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Lista codici esenzione", notes = "Lista codici esenzione", response = CodiceEsenzione.class, responseContainer = "List", tags={ "Necessari", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restituisce la lista dei codici delle esenzioni.", response = CodiceEsenzione.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Generico errore relativo al client (richiesta errata)", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Generico errore relativo al server (risposta errata)", response = Errore.class) })
    public Response codiciEsenzioneGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
