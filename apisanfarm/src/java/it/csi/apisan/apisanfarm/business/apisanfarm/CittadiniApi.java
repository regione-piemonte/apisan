/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm;

import it.csi.apisan.apisanfarm.dto.apisanfarm.*;


import it.csi.apisan.apisanfarm.dto.apisanfarm.Errore;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelDeviceCertificato;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmaciaAbituale;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadDeviceCertificato;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadFarmaciaAbituale;

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
   
    @DELETE
    @Path("/{cit_id}/device-certificato")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdDeviceCertificatoDelete(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("codice_verticale_delega") String codiceVerticaleDelega,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/device-certificato")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdDeviceCertificatoGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("codice_verticale_delega") String codiceVerticaleDelega,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/device-certificato")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdDeviceCertificatoPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("codice_verticale_delega") String codiceVerticaleDelega, PayloadDeviceCertificato payloadDeviceCertificato,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/farmacie-abituali")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdFarmacieAbitualiGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("codice_verticale_delega") String codiceVerticaleDelega,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/farmacie-abituali")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdFarmacieAbitualiPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("codice_verticale_delega") String codiceVerticaleDelega, PayloadFarmaciaAbituale payloadFarmaciaAbituale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
