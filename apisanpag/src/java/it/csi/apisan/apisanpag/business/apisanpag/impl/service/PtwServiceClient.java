/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpag.business.mapper.PagamentoSanitarioBodyMapper;
import it.csi.apisan.apisanpag.business.mapper.PagamentoSanitarioMapper;
import it.csi.apisan.apisanpag.business.mapper.PagamentoSpontaneoBodyMapper;
import it.csi.apisan.apisanpag.business.mapper.RicevutaPagamentoMapper;
import it.csi.apisan.apisanpag.business.mapper.RispostaServizioRispostaServizioMapper;
import it.csi.apisan.apisanpag.business.mapper.StatoTransazioneStatoTransazioneMapper;
import it.csi.apisan.apisanpag.business.mapper.TicketTicketMapper;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSpontaneoBody;
import it.csi.apisan.apisanpag.dto.apisanpag.RicevutaPagamento;
import it.csi.apisan.apisanpag.dto.apisanpag.RispostaServizio;
import it.csi.apisan.apisanpag.dto.apisanpag.StatoTransazione;
import it.csi.apisan.apisanpag.dto.apisanpag.Ticket;
import it.csi.apisan.apisanpag.dto.ptw.ListaTicket;
import it.csi.apisan.apisanpag.dto.ptw.ResponsePost;
import it.csi.apisan.apisanpag.util.FiltroRimborsiWrapper;
import it.csi.apisan.apisanpag.util.LogUtil;
import it.csi.apisan.apisanpag.util.rest.RestCaller;
import it.csi.apisan.apisanpag.util.rest.RestResponseErrorHandler;
import it.csi.apisan.apisanpag.util.rest.RestStatusCodeResponseErrorHandler;

@Component
public class PtwServiceClient {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	@Value("${apisanpagBaseUrl}")
	private String apisanpagBaseUrl;
	
	public List<Asr> getAsr(String xRequestId, String xCodiceServizio) {
		return new RestCaller(HttpMethod.GET, apisanpagBaseUrl, "asr")
				.headers(xRequestId, xCodiceServizio)
				.call(new TypeReference<List<Asr>>(){});
	}
	
	public List<Ticket> getListaRimborsi(String xRequestId, String xCodiceServizio, String codiceFiscale,FiltroRimborsiWrapper filtro) {
		List<Ticket> lista = new ArrayList<Ticket>();
		RestResponseErrorHandler restResponseHandler = new RestResponseErrorHandler(HttpStatus.OK).isRespErroreGet(true).httpStatus(HttpStatus.NOT_FOUND);
		/**
		 * id_asr=?&stato_ticket=?&in_erogazione=?&motivo_pagamento=?&codice_versamento=?&codice_servizio=?&modalita_rimborso=?&data_dal=?&data_al
		 */
		ListaTicket list = new RestCaller(HttpMethod.GET, apisanpagBaseUrl, "utenti/"+codiceFiscale+"/getListaRimborsi")
				.headers(xRequestId, xCodiceServizio)
				.httpStatusNotMapping(HttpStatus.NOT_FOUND)
				.queryParam("id_asr", filtro.getIdAsr())
				.queryParam("stato_ticket", filtro.getStatoTicket())
				.queryParam("in_erogazione", filtro.getInErogazione())
				.queryParam("motivo_pagamento", filtro.getMotivoPagamento())
				.queryParam("codice_versamento", filtro.getCodiceVersamento())
				.queryParam("codice_servizio", filtro.getCodiceServizio())
				.queryParam("modalita_rimborso", filtro.getModalitaRimborso())
				.queryParam("data_dal", filtro.getDataDal())
				.queryParam("data_al", filtro.getDataAl())
				.responseErrorHandler(restResponseHandler)
				.call(new TypeReference<ListaTicket>(){});
		if(list != null) {
			lista = new TicketTicketMapper().fromList(list.getListaTicket());
		}
		
		return  lista;
	}
	
	
	public RispostaServizio putStatoTransazione(String xRequestId, String xCodiceServizio, String idTransazione, StatoTransazione payload) {
		RestResponseErrorHandler restResponseHandler = new RestResponseErrorHandler(HttpStatus.OK).isRespErroreGet(true);
		
		it.csi.apisan.apisanpag.dto.ptw.StatoTransazione body = new StatoTransazioneStatoTransazioneMapper().to(payload);
		it.csi.apisan.apisanpag.dto.ptw.RispostaServizio risposta = new RestCaller(HttpMethod.PUT, apisanpagBaseUrl, "/setStatoErogazioneRimborsiInCarrello/"+idTransazione)
				.headers(xRequestId, xCodiceServizio)
				.body(body)
				.contentType(MediaType.APPLICATION_JSON)
				.responseErrorHandler(restResponseHandler)
				.call(new TypeReference<it.csi.apisan.apisanpag.dto.ptw.RispostaServizio>(){});
		
		RispostaServizio res = new RispostaServizioRispostaServizioMapper().from(risposta); 
		
		return res;
	}
	
	public List<PagamentoSanitario> getPagamentiSanitari(String xRequestId, String xCodiceServizio, String codiceFiscale, String idAsr, String numeroPratica, String nre) {
		//Se vengono passati nre o numero pratica devo trasformare il
		RestResponseErrorHandler restResponseHandler = new RestResponseErrorHandler(HttpStatus.OK).isRespErroreGet(true);
		if(StringUtils.isBlank(numeroPratica) && StringUtils.isBlank(nre) ) {
			restResponseHandler = restResponseHandler.httpStatus(HttpStatus.NO_CONTENT);
		}
		
		List<it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario> list = new RestCaller(HttpMethod.GET, apisanpagBaseUrl, "utenti/"+codiceFiscale+"/pagamenti-sanitari")
				.headers(xRequestId, xCodiceServizio)
				.queryParam("id_asr", idAsr)
				.queryParam("numero_pratica", numeroPratica) //TODO il servizio di PTW intende il "numero_pratica_regionale"!!! ma ci aspettiamo numero_pratica_asr!
				.queryParam("nre", nre)
				.responseErrorHandler(restResponseHandler)
				.call(new TypeReference<List<it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario>>(){});
		
		return new PagamentoSanitarioMapper().fromList(list);
	}

	public PagamentoSanitario getPagamentiSanitario(String xRequestId, String xCodiceServizio, String codiceFiscale, String numeroPratica, String idAsr) { 
		
		List<PagamentoSanitario> pagamentiSanitari = getPagamentiSanitari(xRequestId, xCodiceServizio, codiceFiscale, idAsr, numeroPratica, null);
		return pagamentiSanitari.stream()
				//.filter(c -> numeroPratica.equalsIgnoreCase(c.getNumeroPraticaRegionale())) tolto per mail di Falcone del 21/11/2019 ore 10:06 oggetto   Eliminazione controllo su numero pratica dall'orchestratore
				.findFirst().orElse(null);
	}


	public ResponsePost inserisciPagamento(String xRequestId, String xCodiceServizio, PagamentoSanitarioBody pagamentoSanitarioBody) {
		
		//metto i codici da mappare
		HashMap<Integer, Integer> hashCodiciMapping =  new HashMap();
		hashCodiciMapping.put(245, 400);
		hashCodiciMapping.put(246, 400);
		hashCodiciMapping.put(251, 400);
		hashCodiciMapping.put(252, 400);

		hashCodiciMapping.put(255, 503);
		hashCodiciMapping.put(256, 503);
		hashCodiciMapping.put(257, 503);
		
		RestStatusCodeResponseErrorHandler responseErrorHandler = new RestStatusCodeResponseErrorHandler(HttpStatus.CREATED.value())
				.isRespErrorePost(true)
				.httpStatus(HttpStatus.OK.value())
				.mapStatusResp(hashCodiciMapping);
		
		it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitarioBody pagBody = new PagamentoSanitarioBodyMapper().to(pagamentoSanitarioBody);
		
		
		
		return new RestCaller(HttpMethod.POST, apisanpagBaseUrl, "pagamento")
				.headers(xRequestId, xCodiceServizio)
				.contentType(MediaType.APPLICATION_JSON)
				.body(pagBody)
				.responseErrorHandler(responseErrorHandler)
				.call(new TypeReference<ResponsePost>(){});
		
		
	}
	

	public ResponsePost inserisciPagamentoSpontaneo(String xRequestId, String xCodiceServizio,
			PagamentoSpontaneoBody pagamentoSpontaneoBody) {
		
		it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody pagBody = new PagamentoSpontaneoBodyMapper().to(pagamentoSpontaneoBody) ;
				
		return new RestCaller(HttpMethod.POST, apisanpagBaseUrl, "pagamento-spontaneo")
				.headers(xRequestId, xCodiceServizio)
				.contentType(MediaType.APPLICATION_JSON)
				.encodingUTF8(true)
				.body(pagBody)
				.call(new TypeReference<ResponsePost>(){});
	}
	
	public RicevutaPagamento inserisciPagamentoRicevuta(String xRequestID, String xCodiceServizio, String idTransazione) {
		
		RestResponseErrorHandler responseErrorHandler = new RestResponseErrorHandler(HttpStatus.CREATED).isRespErrorePost(true) ;
		it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento ricevutaPagamento = new RestCaller(HttpMethod.POST, apisanpagBaseUrl, "pagamento/" + idTransazione + "/ricevuta")
				.headers(xRequestID, xCodiceServizio)
				.contentType(MediaType.APPLICATION_JSON)
				.responseErrorHandler(responseErrorHandler)
				.call(new TypeReference<it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento>() {});
				
		RicevutaPagamento ricevutaPag = new RicevutaPagamentoMapper().from(ricevutaPagamento);
		
		
		return ricevutaPag;
		
	}
	
	public byte[] getMandatoPagamento(String xRequestID, String xCodiceServizio, String idRicevuta) {
		RestResponseErrorHandler responseErrorHandler = new RestResponseErrorHandler(HttpStatus.OK).isRespErroreGet(true);
		String rit = new RestCaller(HttpMethod.GET, apisanpagBaseUrl, "mandato-pagamento/" + idRicevuta)
				.headers(xRequestID, xCodiceServizio)
				.contentType(MediaType.TEXT_PLAIN)
				.responseErrorHandler(responseErrorHandler)
				.mapObject(false)
				.call(new TypeReference<String>() {});
		byte[] rit2 = rit.getBytes();
		
		return rit2;	
	}

	public byte[] getIcevutePagamentiSanitari(String xRequestID, String xCodiceServizio, String codiceFiscale, String idRicevuta) {
		RestResponseErrorHandler responseErrorHandler = new RestResponseErrorHandler(HttpStatus.OK).isRespErroreGet(true);
		String rit = new RestCaller(HttpMethod.GET, apisanpagBaseUrl, "utenti/" + codiceFiscale + "/ricevute-pagamenti-sanitari-id/" + idRicevuta)
				.headers(xRequestID, xCodiceServizio)
				.contentType(MediaType.TEXT_PLAIN)
				.responseErrorHandler(responseErrorHandler)
				.mapObject(false)
				.call(new TypeReference<String>() {});
		byte[] rit2 = rit.getBytes();
		return rit2;	
	}
	
	public byte[] getRIcevutePagamentiSanitariPerNumPratica(String xRequestID, String xCodiceServizio, String codiceFiscale, String numeroPratica) {
		RestResponseErrorHandler responseErrorHandler = new RestResponseErrorHandler(HttpStatus.OK).isRespErroreGet(true);
		String rit = new RestCaller(HttpMethod.GET, apisanpagBaseUrl, "utenti/" + codiceFiscale + "/ricevute-pagamenti-sanitari-numeropratica/" + numeroPratica)
				.headers(xRequestID, xCodiceServizio)
				.contentType(MediaType.TEXT_PLAIN)
				.responseErrorHandler(responseErrorHandler)
				.mapObject(false)
				.call(new TypeReference<String>() {});
		byte[] rit2 = rit.getBytes();
		return rit2;	
	}	
}
