/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm;

import it.csi.apisan.apisanfarm.dto.apisanfarm.*;


import it.csi.apisan.apisanfarm.dto.apisanfarm.Errore;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadDeviceCertificatoOtp;

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

@Path("/device-certificato")




public interface DeviceCertificatoApi  {
   
    @POST
    
    
    @Produces({ "application/json" })

    public Response deviceCertificatoPost(@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @NotNull @QueryParam("codice_verticale_delega") String codiceVerticaleDelega, PayloadDeviceCertificatoOtp payloadDeviceCertificatoOtp,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
