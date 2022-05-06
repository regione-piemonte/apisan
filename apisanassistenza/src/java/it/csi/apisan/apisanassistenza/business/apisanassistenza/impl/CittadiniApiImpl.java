/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.CittadiniApi;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.CittadiniCitIdRichiesteGet;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.CittadiniCitIdRichiesteRichiestaIdArchiviataPut;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.CittadiniCitIdRichiesteRichiestaIdDelete;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.CittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.CittadiniCitIdRichiesteRichiestaIdGet;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.CittadiniCitIdRichiesteRichiestaIdMessaggiPost;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.ServiceExecutor;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadMessaggioNuovo;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaArchiviata;


@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)

public class CittadiniApiImpl implements CittadiniApi {

	@Override
	public Response cittadiniCitIdRichiesteGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Boolean archiviata, String applicazione,
			String parolaChiave, String da, String a, String id, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdRichiesteGet.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, archiviata, applicazione, parolaChiave, da, a, id, securityContext, httpHeaders,  httpRequest);
	}

	@Override
	public Response cittadiniCitIdRichiesteRichiestaIdArchiviataPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			PayloadRichiestaArchiviata payloadRichiestaArchiviata, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdRichiesteRichiestaIdArchiviataPut.class,  shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, richiestaId, payloadRichiestaArchiviata, securityContext, httpHeaders,  httpRequest);
	}

	@Override
	public Response cittadiniCitIdRichiesteRichiestaIdDelete(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdRichiesteRichiestaIdDelete.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, richiestaId, securityContext, httpHeaders,  httpRequest);
	}

	@Override
	public Response cittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			String documentoId, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdRichiesteRichiestaIdDocumentiDocumentoIdGet.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, richiestaId, documentoId, securityContext, httpHeaders,  httpRequest);
	}

	@Override
	public Response cittadiniCitIdRichiesteRichiestaIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdRichiesteRichiestaIdGet.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, richiestaId, securityContext, httpHeaders,  httpRequest);
	}

	@Override
	public Response cittadiniCitIdRichiesteRichiestaIdMessaggiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			PayloadMessaggioNuovo payloadMessaggioNuovo, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdRichiesteRichiestaIdMessaggiPost.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, richiestaId, payloadMessaggioNuovo, securityContext, httpHeaders,  httpRequest);
	}

}
