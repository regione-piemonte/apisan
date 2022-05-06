/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanffe.business.apisanffe.CittadiniApi;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.ServiceExecutor;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.CittadiniCitIdRimborsiGetService;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.CittadiniCitIdTicketPagatiGetService;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.CittadiniCitIdTicketPagatiTicketIdRicevutePagamentoRicevutaIdPdfGetService;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.CittadiniCitIdTicketPagatiTicketIdRicevuteRimborsoRicevutaIdPdfGetService;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.CittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPostService;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.CittadiniCitIdTicketPagatiTicketIdRimborsoPostService;
import it.csi.apisan.apisanffe.dto.apisanffe.PayloadRimborsoNuovo;
import it.csi.apisan.apisanffe.dto.apisanffe.PayloadStampaRichiestaRimborso;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {
	public Response cittadiniCitIdRimborsiGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String dataDal,String dataAl,Integer statoTicket,Integer inErogazione,Integer modalitaRimborso,String idAsr,String motivoPagamento,String codiceVersamento,String codiceServizio,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest ) {
		
		return ServiceExecutor.execute(CittadiniCitIdRimborsiGetService.class, citId,dataDal,dataAl,statoTicket,inErogazione,modalitaRimborso,idAsr,motivoPagamento,codiceVersamento, codiceServizio,securityContext, httpHeaders , httpRequest);
	}


	public Response cittadiniCitIdTicketPagatiTicketIdRicevuteRimborsoRicevutaIdPdfGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String ticketId,String ricevutaId,String rimborsoModalitaCodice,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest ) {
		
		return ServiceExecutor.execute(CittadiniCitIdTicketPagatiTicketIdRicevuteRimborsoRicevutaIdPdfGetService.class, 
				citId, ticketId,ricevutaId,rimborsoModalitaCodice,securityContext, httpHeaders , httpRequest );
	}
	public Response cittadiniCitIdTicketPagatiTicketIdRimborsoPost(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String ticketId,PayloadRimborsoNuovo payloadRimborsoNuovo,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest ) {

		return ServiceExecutor.execute(CittadiniCitIdTicketPagatiTicketIdRimborsoPostService.class, citId,ticketId,payloadRimborsoNuovo,securityContext, httpHeaders , httpRequest);
	}

	@Override
	public Response cittadiniCitIdTicketPagatiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Integer annoPagamento,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdTicketPagatiGetService.class, citId, annoPagamento,
				securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdTicketPagatiTicketIdRicevutePagamentoRicevutaIdPdfGet(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String ticketId, String ricevutaId, String idAsr, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		return ServiceExecutor.execute(CittadiniCitIdTicketPagatiTicketIdRicevutePagamentoRicevutaIdPdfGetService.class, citId, ticketId,ricevutaId, idAsr, securityContext, httpHeaders , httpRequest);
	}


	@Override
	public Response cittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String ticketId,
			PayloadStampaRichiestaRimborso payloadStampaRichiestaRimborso, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPostService.class, citId, ticketId,
				payloadStampaRichiestaRimborso, securityContext, httpHeaders, httpRequest);
	}
}
