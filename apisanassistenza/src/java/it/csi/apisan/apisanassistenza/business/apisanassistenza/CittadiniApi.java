/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadMessaggioNuovo;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaArchiviata;

@Path("/cittadini")

public interface CittadiniApi {

	@GET
	@Path("/{cit_id}/richieste")

	@Produces({ "application/json" })

	public Response cittadiniCitIdRichiesteGet(
			@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,
			@HeaderParam("X-Request-Id") String xRequestId, @HeaderParam("X-Forwarded-For") String xForwardedFor,
			@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,
			@QueryParam("archiviata") Boolean archiviata, @QueryParam("applicazione") String applicazione,
			@QueryParam("parola_chiave") String parolaChiave, @QueryParam("da") String da, @QueryParam("a") String a,
			@QueryParam("id") String id, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders,
			@Context HttpServletRequest httpRequest);

	@PUT
	@Path("/{cit_id}/richieste/{richiesta_id}/archiviata")

	@Produces({ "application/json" })

	public Response cittadiniCitIdRichiesteRichiestaIdArchiviataPut(
			@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,
			@HeaderParam("X-Request-Id") String xRequestId, @HeaderParam("X-Forwarded-For") String xForwardedFor,
			@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,
			@PathParam("richiesta_id") String richiestaId, PayloadRichiestaArchiviata payloadRichiestaArchiviata,
			@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders,
			@Context HttpServletRequest httpRequest);

	@DELETE
	@Path("/{cit_id}/richieste/{richiesta_id}")

	@Produces({ "application/json" })

	public Response cittadiniCitIdRichiesteRichiestaIdDelete(
			@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,
			@HeaderParam("X-Request-Id") String xRequestId, @HeaderParam("X-Forwarded-For") String xForwardedFor,
			@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,
			@PathParam("richiesta_id") String richiestaId, @Context SecurityContext securityContext,
			@Context HttpHeaders httpHeaders, @Context HttpServletRequest httpRequest);

	@GET
	@Path("/{cit_id}/richieste/{richiesta_id}/documenti/{documento_id}")

	@Produces({ "application/json" })

	public Response cittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet(
			@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,
			@HeaderParam("X-Request-Id") String xRequestId, @HeaderParam("X-Forwarded-For") String xForwardedFor,
			@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,
			@PathParam("richiesta_id") String richiestaId, @PathParam("documento_id") String documentoId,
			@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders,
			@Context HttpServletRequest httpRequest);

	@GET
	@Path("/{cit_id}/richieste/{richiesta_id}")

	@Produces({ "application/json" })

	public Response cittadiniCitIdRichiesteRichiestaIdGet(
			@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,
			@HeaderParam("X-Request-Id") String xRequestId, @HeaderParam("X-Forwarded-For") String xForwardedFor,
			@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,
			@PathParam("richiesta_id") String richiestaId, @Context SecurityContext securityContext,
			@Context HttpHeaders httpHeaders, @Context HttpServletRequest httpRequest);

	@POST
	@Path("/{cit_id}/richieste/{richiesta_id}/messaggi")

	@Produces({ "application/json" })

	public Response cittadiniCitIdRichiesteRichiestaIdMessaggiPost(
			@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,
			@HeaderParam("X-Request-Id") String xRequestId, @HeaderParam("X-Forwarded-For") String xForwardedFor,
			@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cit_id") String citId,
			@PathParam("richiesta_id") String richiestaId, PayloadMessaggioNuovo payloadMessaggioNuovo,
			@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders,
			@Context HttpServletRequest httpRequest);
}
