/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.apisanprof;

import it.csi.apisan.apisanprof.dto.apisanprof.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanprof.dto.apisanprof.Errore;
import it.csi.apisan.apisanprof.dto.apisanprof.Profilo;
import it.csi.apisan.apisanprof.dto.apisanprof.StudioMedico;
import it.csi.apisan.apisanprof.dto.apisanprof.VerificaTeam;

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
    @Path("/{cf}/medico/studi_medici")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Restituisce i dati relativi agli studi medici dove opera il medico associato al cittadino passato come parametro.  ", response = StudioMedico.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = StudioMedico.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCfMedicoStudiMediciGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/profilo")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Restituisce i dati relativi al profilo anagrafico e sanitario del cittadino orchestra due chiamate ai servizi di aura ", response = Profilo.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = Profilo.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response cittadiniCfProfiloGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/verifica-team")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Restituisce se la tessera sanitaria passata in input corrisponde o meno al cf passato in path param ", response = VerificaTeam.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = VerificaTeam.class) })
    public Response cittadiniCfVerificaTeamGet(@ApiParam(value = "Contiene il codice fiscale dell'utente loggato ottenuto tramite shibboleth" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "Contiene un id univoco (`uuid v4`) della chiamata HTTP" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @NotNull @QueryParam("team") String team, @QueryParam("servizio") String servizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
