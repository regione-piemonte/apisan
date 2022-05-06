/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.api.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanvac.api.CittadiniApi;
import it.csi.apisan.apisanvac.common.ServiceExecutor;
import it.csi.apisan.apisanvac.model.ModelCittadinoContatti;
import it.csi.apisan.apisanvac.model.PayloadAutocontribuzione;
import it.csi.apisan.apisanvac.model.PayloadModificaIndirizzo;
import it.csi.apisan.apisanvac.model.PayloadReazioneAvversa;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamento;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoPrenotazione;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoPrenotazioneRichiesta;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoSpostamento;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoSpostamentoRichiesta;
import it.csi.apisan.apisanvac.service.CittadiniCitIdContattiTemporaneiGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdContattiVaccinazioniPutService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdDocumentiCertificatoPdfGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdDocumentiDataDocumentoPdfGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdDocumentiGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdDomicilioVaccinazioniPutService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdReazioneAvversaPostService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdReazioniAvverseGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdPromemoriaGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRangeDateGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaPost;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaRichiestaPost;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoPutService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoRichiestaPostService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiPostService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAppuntamentiRichiestaPostService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAutocontribuzioniPostService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniAutocontribuzioniTipologieGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniConvocazioniGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniImmunizzateGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniIstanzeAutocontribuzioneTipologiaIstanzaGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniIstanzeModificaPrenotazioneTipologiaIstanzaGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniIstanzePrenotazioneIdIstanzaGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniIstanzePrenotazioneServiceGet;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniIstanzeTipologiaIdStatiGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniSomministrazioniGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniVacciniFuturiGetService;
import it.csi.apisan.apisanvac.service.CittadiniCitIdVaccinazioniVolontarieGetService;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiImpl implements CittadiniApi {

	@Override
	public Response cittadiniCitIdDocumentiCertificatoPdfGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String contentDisposition,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiCertificatoPdfGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, contentDisposition, securityContext, httpHeaders,
				request, response);
	}

	@Override
	public Response cittadiniCitIdDocumentiDataDocumentoPdfGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String dataDocumento, String contentDisposition,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiDataDocumentoPdfGetService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, dataDocumento,
				contentDisposition, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdDocumentiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, filter, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdDomicilioVaccinazioniPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadModificaIndirizzo payloadModificaIndirizzo, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdDomicilioVaccinazioniPutService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, payloadModificaIndirizzo, securityContext,
				httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdPromemoriaGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			String contentDisposition, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdPromemoriaGetService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, appuntamentoId,
				contentDisposition, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiGetService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, filter, securityContext,
				httpHeaders, request, response);
	}

	/*
	 *  @Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	 * 
	 * */
	
	@Override
	public Response cittadiniCitIdVaccinazioniConvocazioniGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniConvocazioniGetService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext,
				httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniImmunizzateGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniImmunizzateGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniSomministrazioniGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniSomministrazioniGetService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext,
				httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniVolontarieGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniVolontarieGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdContattiVaccinazioniPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, ModelCittadinoContatti payload,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdContattiVaccinazioniPutService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, payload, securityContext, httpHeaders, request,
				response);
	}

	@Override
	public Response cittadiniCitIdReazioneAvversaPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, PayloadReazioneAvversa payload,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdReazioneAvversaPostService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, payload, securityContext, httpHeaders, request,
				response);
	}

	@Override
	public Response cittadiniCitIdReazioniAvverseGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdReazioniAvverseGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAutocontribuzioniTipologieGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAutocontribuzioniTipologieGetService.class,
				 shibIdentitaCodiceFiscale,
				 xRequestId,  xForwardedFor,  xCodiceServizio,  citId,
				 securityContext,  httpHeaders,  request,
				 response);
		
		
	}
/*
 * 
 * TODO Verificare se variata o se tolta
	@Override
	public Response cittadiniCitIdVaccinazioniIstanzePrenotazioneGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniIstanzePrenotazioneServiceGet.class,

				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext,
				httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniIstanzePrenotazioneIdIstanzaGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String idIstanza,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniIstanzePrenotazioneIdIstanzaGetService.class,

				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, idIstanza,
				securityContext, httpHeaders, request, response);

	}

*/
	@Override
	public Response cittadiniCitIdVaccinazioniVacciniFuturiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniVacciniFuturiGetService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, securityContext,
				httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoAnnullamento payloadVaccinazioneAppuntamentoAnnullamentoRichiesta,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaPost.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, appuntamentoId,
				payloadVaccinazioneAppuntamentoAnnullamentoRichiesta, securityContext, httpHeaders, request, response);
	}
	
	/*
	 * 
	 * @Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoAnnullamento payloadVaccinazioneAppuntamentoAnnullamento,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	 * 
	 * */
	
	
	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoPut(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoSpostamento payloadVaccinazioneAppuntamentoSpostamento,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoPutService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, appuntamentoId,
				payloadVaccinazioneAppuntamentoSpostamento, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoRichiestaPost(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoSpostamentoRichiesta payloadVaccinazioneAppuntamentoSpostamentoRichiesta,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(
				CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoRichiestaPostService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, appuntamentoId,
				payloadVaccinazioneAppuntamentoSpostamentoRichiesta, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadVaccinazioneAppuntamentoPrenotazione payloadVaccinazioneAppuntamentoPrenotazione,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiPostService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId,
				payloadVaccinazioneAppuntamentoPrenotazione, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiRichiestaPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId,
			PayloadVaccinazioneAppuntamentoPrenotazioneRichiesta payloadVaccinazioneAppuntamentoPrenotazioneRichiesta,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiRichiestaPostService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId,
				payloadVaccinazioneAppuntamentoPrenotazioneRichiesta, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAutocontribuzioniPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadAutocontribuzione payloadAutocontribuzione, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAutocontribuzioniPostService.class,
				shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio, citId, payloadAutocontribuzione,
				securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaRichiestaPost(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaRichiestaPost.class,  shibIdentitaCodiceFiscale,  xRequestId,  xForwardedFor,  xCodiceServizio,
				 citId,  appuntamentoId,
				 payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza,
				 securityContext,  httpHeaders,  request,
				 response);
	}

	
	@Override
	public Response cittadiniCitIdVaccinazioniIstanzeTipologiaIdStatiGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String tipologiaId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {

		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniIstanzeTipologiaIdStatiGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, tipologiaId,
				securityContext, httpHeaders, request,response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniIstanzeAutocontribuzioneTipologiaIstanzaGet(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String tipologiaIstanza, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniIstanzeAutocontribuzioneTipologiaIstanzaGetService.class, 	shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,  xCodiceServizio,
				 citId,  tipologiaIstanza,  securityContext,  httpHeaders, request,  response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniIstanzeModificaPrenotazioneTipologiaIstanzaGet(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String tipologiaIstanza, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniIstanzeModificaPrenotazioneTipologiaIstanzaGetService.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor, xCodiceServizio,
				 citId,  tipologiaIstanza,  securityContext,  httpHeaders, request,  response);
	}

	@Override
	public Response cittadiniCitIdContattiTemporaneiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		
		return ServiceExecutor.execute(CittadiniCitIdContattiTemporaneiGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, securityContext, httpHeaders, request, response);
	}

	@Override
	public Response cittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRangeDateGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		
		return ServiceExecutor.execute(CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRangeDateGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, appuntamentoId,
				securityContext, httpHeaders, request, response) ;
	}

	

}
