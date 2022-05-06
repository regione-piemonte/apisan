/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.*;


import it.csi.apisan.apisanceliachia.dto.apisanceliachia.Errore;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelCedolino;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelCodiceQr;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelErogazione;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelPin;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/cittadini")




public interface CittadiniApi  {
   
    @GET
    @Path("/{cit_id}/cedolini/corrente")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdCedoliniCorrenteGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/codice-qr")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdCodiceQrGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/erogazioni")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdErogazioniGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @QueryParam("da") String da, @QueryParam("a") String a,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/pin")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdPinGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/pin")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdPinPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
