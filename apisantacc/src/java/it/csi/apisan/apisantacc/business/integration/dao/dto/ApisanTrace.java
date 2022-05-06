/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.integration.dao.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class ApisanTrace implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7579476023265193279L;
	private String     xRequestId   ;
	private String     cfChiamante  ;
	private String     xCodiceServizio ;
	private String     ipChiamante  ;
	private String     cfRichiedente ;
	private String     componente   ;
	private Integer    esitoChiamata ;
	private byte[]     requestPayload ;
	private byte[]     responsePayload ;
	private Date       requestDate  ;
	private Date       responseDate ;
	private String 	   metodo;
	private String     requestUri;
	private long       millisResponse;
	
	
	
	public String getxRequestId() {
		return xRequestId;
	}
	public void setxRequestId(String xRequestId) {
		this.xRequestId = xRequestId;
	}
	public String getCfChiamante() {
		return cfChiamante;
	}
	public void setCfChiamante(String cfChiamante) {
		this.cfChiamante = cfChiamante;
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
	public String getCfRichiedente() {
		return cfRichiedente;
	}
	public void setCfRichiedente(String cfRichiedente) {
		this.cfRichiedente = cfRichiedente;
	}
	public String getComponente() {
		return componente;
	}
	public void setComponente(String componente) {
		this.componente = componente;
	}
	public Integer getEsitoChiamata() {
		return esitoChiamata;
	}
	public void setEsitoChiamata(Integer esitoChiamata) {
		this.esitoChiamata = esitoChiamata;
	}
	public byte[] getRequestPayload() {
		return requestPayload;
	}
	public void setRequestPayload(byte[] requestPayload) {
		this.requestPayload = requestPayload;
	}
	public byte[] getResponsePayload() {
		return responsePayload;
	}
	public void setResponsePayload(byte[] responsePayload) {
		this.responsePayload = responsePayload;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
	public long getMillisResponse() {
		return millisResponse;
	}
	public void setMillisResponse(long millisResponse) {
		this.millisResponse = millisResponse;
	}
	@Override
	public String toString() {
		return "ApisanTrace [xRequestId=" + xRequestId + ", cfChiamante=" + cfChiamante + ", xCodiceServizio="
				+ xCodiceServizio + ", ipChiamante=" + ipChiamante + ", cfRichiedente=" + cfRichiedente
				+ ", componente=" + componente + ", esitoChiamata=" + esitoChiamata + ", requestPayload="
				+ Arrays.toString(requestPayload) + ", responsePayload=" + Arrays.toString(responsePayload)
				+ ", requestDate=" + requestDate + ", responseDate=" + responseDate + ", metodo=" + metodo
				+ ", requestUri=" + requestUri + ", millisResponse=" + millisResponse + "]";
	}
	
	

}
