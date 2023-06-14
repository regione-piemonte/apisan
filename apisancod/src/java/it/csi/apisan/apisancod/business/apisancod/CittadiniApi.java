/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
 package it.csi.apisan.apisancod.business.apisancod;

import it.csi.apisan.apisancod.dto.apisancod.*;


import it.csi.apisan.apisancod.dto.apisancod.Errore;
import it.csi.apisan.apisancod.dto.apisancod.ModelAbilitazione;
import it.csi.apisan.apisancod.dto.apisancod.ModelConversazione;
import it.csi.apisan.apisancod.dto.apisancod.ModelConversazioneNuova;
import it.csi.apisan.apisancod.dto.apisancod.ModelMedicoInfo;
import it.csi.apisan.apisancod.dto.apisancod.ModelMessaggio;
import it.csi.apisan.apisancod.dto.apisancod.PayloadConversazione;
import it.csi.apisan.apisancod.dto.apisancod.PayloadMessaggio;
import it.csi.apisan.apisancod.dto.apisancod.ResponsesNotFound;

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
    @Path("/{cit_id}/abilitazione")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdAbilitazioneGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("cf_medico") String cfMedico,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/conversazioni")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdConversazioniGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("sola_lettura") String solaLettura, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("offset") Integer offset, @QueryParam("cf_medico") String cfMedico, @QueryParam("argomento") String argomento, @QueryParam("id_conversazione") String idConversazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/conversazioni/{id_conversazione}/messaggi")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdConversazioniIdConversazioneMessaggiGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("id_conversazione") String idConversazione, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("offset") Integer offset,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @PUT
    @Path("/{cit_id}/conversazioni/{id_conversazione}/messaggi/{id_messaggio}/letto")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioLettoPut(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("id_conversazione") String idConversazione, @PathParam("id_messaggio") String idMessaggio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @PUT
    @Path("/{cit_id}/conversazioni/{id_conversazione}/messaggi/{id_messaggio}")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioPut(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("id_conversazione") String idConversazione, @PathParam("id_messaggio") String idMessaggio, PayloadMessaggio payloadMessaggio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/conversazioni/{id_conversazione}/messaggi")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdConversazioniIdConversazioneMessaggiPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("id_conversazione") String idConversazione, PayloadMessaggio payloadMessaggio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/conversazioni")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdConversazioniPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, PayloadConversazione payloadConversazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/info-medico")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdInfoMedicoGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
