/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api;

import it.csi.apisan.apisanesenpat.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanesenpat.model.ModelInfoServizio;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.*;

@Path("/servizio-attivo")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the servizio-attivo API")

public interface ServizioAttivoApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Serve per verificare se il servizio risponde o meno ", response = ModelInfoServizio.class, tags={ "Statiche", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK, servizio online", response = ModelInfoServizio.class) })
    public Response servizioAttivoGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP che viene generato dal front-end, viene propagato agli strati successivi e viene restituito al front-end assieme alla response, permettendo così di tracciare l'intero ciclo di vita della richiesta" ,required=true)@HeaderParam("X-Request-Id") String xRequestId,@ApiParam(value = "Contiene l'elenco degli ip che hanno gestito la richiesta. Utile per i log e l'audit. Il formato della stringa è  ``` <ip-front-end>, <ip-primo-server>, ..., <ip-ultimo-server> ``` Es. `10.10.10.10, 10.38.45.68, 10.128.69.244` " ,required=true)@HeaderParam("X-Forwarded-For") String xForwardedFor,@ApiParam(value = "Contiene una stringa identificativa del servizio chiamante (es.SANSOL)" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response );
}
