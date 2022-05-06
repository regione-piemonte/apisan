/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.trace;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Oggetto di modello contenente i dati necessari per la Tracciatura.
 * 
 */
public class ApisanTrace implements Serializable{
	
	private static final long serialVersionUID = -730979534675201697L;
	private UUID uuid;
	private String xRequestId;
	private String codiceFiscaleChiamante;
	private String xCodiceServizio;
	private String ipChiamante;
	private String ipChiamanteClient;
	private String codiceFiscaleRichiedente;
	private String componente;
	
	private int esitoChiamata;
	
	// Request fields
	private Date requestDate;
	private String requestPayload;
	
	// Response fields
	private Date responseDate;
	private String responsePayload;
	
	
	private String requestPath;
	
	private Map<String, String> requestHeaders;

	
	
	public ApisanTrace() {
		this.uuid = UUID.randomUUID();
		this.requestDate = new Date();
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getxRequestId() {
		return xRequestId;
	}

	public void setxRequestId(String xRequestId) {
		this.xRequestId = xRequestId;
	}

	public String getCodiceFiscaleChiamante() {
		return codiceFiscaleChiamante;
	}

	public void setCodiceFiscaleChiamante(String codiceFiscaleChiamante) {
		this.codiceFiscaleChiamante = codiceFiscaleChiamante;
	}

	public String getxCodiceServizio() {
		return xCodiceServizio;
	}

	public void setxCodiceServizio(String xCodiceServizio) {
		this.xCodiceServizio = xCodiceServizio;
	}

	public String getIpChiamante() {
		return ipChiamante;
	}

	public void setIpChiamante(String ipChiamante) {
		this.ipChiamante = ipChiamante;
	}

	public String getIpChiamanteClient() {
		return ipChiamanteClient;
	}

	public void setIpChiamanteClient(String ipChiamanteClient) {
		this.ipChiamanteClient = ipChiamanteClient;
	}

	public String getCodiceFiscaleRichiedente() {
		return codiceFiscaleRichiedente;
	}

	public void setCodiceFiscaleRichiedente(String codiceFiscaleRichiedente) {
		this.codiceFiscaleRichiedente = codiceFiscaleRichiedente;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date dataRichiesta) {
		this.requestDate = dataRichiesta;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date dataRisposta) {
		this.responseDate = dataRisposta;
	}

	public int getEsitoChiamata() {
		return esitoChiamata;
	}

	public void setEsitoChiamata(int esitoChiamata) {
		this.esitoChiamata = esitoChiamata;
	}

	public String getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(String payloadRequest) {
		this.requestPayload = payloadRequest;
	}

	public String getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(String payloadResponse) {
		this.responsePayload = payloadResponse;
	}

	public void setRequestHeaders(Map<String, String> requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	public Map<String, String> getRequestHeaders() {
		return requestHeaders;
	}

	public String getRequestPath() {
		return requestPath;
	}

	public void setRequestPath(String requestPath) {
		this.requestPath = requestPath;
	}
	
	
	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	@Override
	public String toString() {
		return "ApisanTrace [uuid=" + uuid + ", xRequestId=" + xRequestId + ", codiceFiscaleChiamante="
				+ codiceFiscaleChiamante + ", xCodiceServizio=" + xCodiceServizio + ", ipChiamante=" + ipChiamante
				+ ", ipChiamanteClient=" + ipChiamanteClient + ", codiceFiscaleRichiedente=" + codiceFiscaleRichiedente
				+ ", componente=" + componente + ", esitoChiamata=" + esitoChiamata + ", requestDate=" + requestDate
				+ ", requestPayload=" + requestPayload + ", responseDate=" + responseDate + ", responsePayload="
				+ responsePayload + ", requestPath=" + requestPath + ", requestHeaders=" + requestHeaders + "]";
	}

	
	
	
	
	
	

}