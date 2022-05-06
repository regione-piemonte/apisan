/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe;

import it.csi.apisan.apisanffe.dto.apisanffe.*;


import it.csi.apisan.apisanffe.dto.apisanffe.Errore;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelListaTicket;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelPraticaRicevuta;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagato;
import it.csi.apisan.apisanffe.dto.apisanffe.PayloadRimborsoNuovo;
import it.csi.apisan.apisanffe.dto.apisanffe.PayloadStampaRichiestaRimborso;

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
    @Path("/{cit_id}/rimborsi")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdRimborsiGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @QueryParam("data_dal") String dataDal, @QueryParam("data_al") String dataAl, @QueryParam("stato_ticket") Integer statoTicket, @QueryParam("in_erogazione") Integer inErogazione, @QueryParam("modalita_rimborso") Integer modalitaRimborso, @QueryParam("id_asr") String idAsr, @QueryParam("motivo_pagamento") String motivoPagamento, @QueryParam("codice_versamento") String codiceVersamento, @QueryParam("codice_servizio") String codiceServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/ticket-pagati")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdTicketPagatiGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @NotNull @QueryParam("anno_pagamento") Integer annoPagamento,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/ticket-pagati/{ticket_id}/ricevute-pagamento/{ricevuta_id}/pdf")
    
    @Produces({ "application/pdf" })

    public Response cittadiniCitIdTicketPagatiTicketIdRicevutePagamentoRicevutaIdPdfGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("ticket_id") String ticketId, @PathParam("ricevuta_id") String ricevutaId, @QueryParam("id_asr") String idAsr,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{cit_id}/ticket-pagati/{ticket_id}/ricevute-rimborso/{ricevuta_id}/pdf")
    
    @Produces({ "application/pdf" })

    public Response cittadiniCitIdTicketPagatiTicketIdRicevuteRimborsoRicevutaIdPdfGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("ticket_id") String ticketId, @PathParam("ricevuta_id") String ricevutaId, @QueryParam("rimborso_modalita_codice") String rimborsoModalitaCodice,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/ticket-pagati/{ticket_id}/richiesta-rimborso/pdf")
    
    @Produces({ "application/pdf", "application/zip", "application/json" })

    public Response cittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("ticket_id") String ticketId, PayloadStampaRichiestaRimborso payloadStampaRichiestaRimborso,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @POST
    @Path("/{cit_id}/ticket-pagati/{ticket_id}/rimborso")
    
    @Produces({ "application/json" })

    public Response cittadiniCitIdTicketPagatiTicketIdRimborsoPost(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Request-Id") String xRequestId,@HeaderParam("X-Forwarded-For") String xForwardedFor,@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId, @PathParam("ticket_id") String ticketId, PayloadRimborsoNuovo payloadRimborsoNuovo,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
