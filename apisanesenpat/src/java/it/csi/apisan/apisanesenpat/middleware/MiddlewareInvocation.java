/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.model.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class MiddlewareInvocation extends BaseMiddlewareInvocation {

    private HttpServletRequest           servletRequest;
    private HttpServletResponse          servletResponse;
    private String                       methodName;
    private String                       xCodiceServizio;
    private String                       xRequestId;
    private Errore                       errore         = new Errore();
    private String                       ipRequest;
    private HttpHeaders                  headerResponse;
    private String                       shibIdentitaCodiceFiscale;
    private String                       xForwarddedFor;
    private String                       citId;
    private String                       certificatoId;
    private String 						 codEsenzione;
    private String 						 codMalattia;
	private String                       esenzioneId;
    private String                       filter;
    private Payload1                     payload1;
    private Payload2                     payload2;
    private Payload3                     payload3;
    private Payload4                     payload4;
    private javax.ws.rs.core.HttpHeaders httpHeaders;
    private String                       stratoGialloEndpoint;
    private String                       stratoGialloEndBasePath;
    private String                       stratoGialloElencoServiziAttivi;
    private String                       username;
    private String                       password;
    private Payload                      payload;
    private String                       documentType;
    private List<MiddlewareException>    exceptions     = new ArrayList<>();
    private ResponseEntity<String>       response;
    private Boolean                      isStreamClosed = false;
    private String                       settingFileNameToDownload;
    private String                       settingFileNameZipToDownload;
    private Integer                      statusCodeResponse;
    private String                       bodyResponse;
    private boolean                      isPdf          = false;
    private boolean                      isZip          = false;
    private ResponseEntity<byte[]> responseAsByte;

    public MiddlewareInvocation() {
        errore.setCode("0");
        errore.setDetail(new ArrayList<>());
        errore.setStatus(-1);
        errore.setLinks(new ArrayList<>());
    }

    public String getxCodiceServizio() {
        return xCodiceServizio;
    }

    public void setxCodiceServizio(String xCodiceServizio) {
        this.xCodiceServizio = xCodiceServizio;
    }

    public String getxRequestId() {
        return xRequestId;
    }

    public HttpServletResponse getServletResponse() {
        return servletResponse;
    }

    public void setServletResponse(HttpServletResponse servletResponse) {
        this.servletResponse = servletResponse;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setxRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public Errore getErrore() {
        return errore;
    }

    public void setErrore(Errore errore) {
        this.errore = errore;
    }

    public String getIpRequest() {
        return ipRequest;
    }

    public void setIpRequest(String ipRequest) {
        this.ipRequest = ipRequest;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    public void setHeaderResponse(HttpHeaders headerResponse) {
        this.headerResponse = headerResponse;
    }

    public HttpHeaders getHeaderResponse() {
        return headerResponse;
    }

    public void setShibIdentitaCodiceFiscale(String shibIdentitaCodiceFiscale) {
        this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
    }

    public String getShibIdentitaCodiceFiscale() {
        return shibIdentitaCodiceFiscale;
    }

    public void setxForwardedFor(String xForwarddedFor) {
        this.xForwarddedFor = xForwarddedFor;
    }

    public void setCitId(String citId) {
        this.citId = citId;
    }

    public void setCertificatoId(String certificatoId) {
        this.certificatoId = certificatoId;
    }

    public void setEsenzioneId(String esenzioneId) {
        this.esenzioneId = esenzioneId;
    }

    public String getEsenzioneId() {
        return esenzioneId;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFilter() {
        return filter;
    }

    public void setPayload1(Payload1 payload1) {
        this.payload1 = payload1;
    }

    public Payload1 getPayload1() {
        return payload1;
    }

    public void setPayload2(Payload2 payload2) {
        this.payload2 = payload2;
    }

    public Payload2 getPayload2() {
        return payload2;
    }

    public void setPayload3(Payload3 payload3) {
        this.payload3 = payload3;
    }

    public Payload3 getPayload3() {
        return payload3;
    }

    public void setPayload4(Payload4 payload4) {
        this.payload4 = payload4;
    }

    public Payload4 getPayload4() {
        return payload4;
    }

    public void setHttpHeaders(javax.ws.rs.core.HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public javax.ws.rs.core.HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public void setStratoGialloEndpoint(String stratoGialloEndpoint) {
        this.stratoGialloEndpoint = stratoGialloEndpoint;
    }

    public String getStratoGialloEndpoint() {
        return stratoGialloEndpoint;
    }

    public void setStratoGialloEndBasePath(String stratoGialloEndBasePath) {
        this.stratoGialloEndBasePath = stratoGialloEndBasePath;
    }

    public String getStratoGialloEndBasePath() {
        return stratoGialloEndBasePath;
    }

    public void setStratoGialloElencoServiziAttivi(String stratoGialloElencoServiziAttivi) {
        this.stratoGialloElencoServiziAttivi = stratoGialloElencoServiziAttivi;
    }

    public String getStratoGialloElencoServiziAttivi() {
        return stratoGialloElencoServiziAttivi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setResponse(ResponseEntity<String> response) {
        this.response = response;
    }

    public ResponseEntity<String> getResponse() {
        return response;
    }

    public Boolean getStreamClosed() {
        return isStreamClosed;
    }

    public void setStreamClosed(Boolean streamClosed) {
        isStreamClosed = streamClosed;
    }

    public String getSettingFileNameToDownload() {
        return settingFileNameToDownload;
    }

    public void setSettingFileNameToDownload(String settingFileNameToDownload) {
        this.settingFileNameToDownload = settingFileNameToDownload;
    }

    /**
	 * @return the settingFileNameZipToDownload
	 */
	public String getSettingFileNameZipToDownload() {
		return settingFileNameZipToDownload;
	}

	/**
	 * @param settingFileNameZipToDownload the settingFileNameZipToDownload to set
	 */
	public void setSettingFileNameZipToDownload(String settingFileNameZipToDownload) {
		this.settingFileNameZipToDownload = settingFileNameZipToDownload;
	}

	public List<MiddlewareException> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<MiddlewareException> exceptions) {
        this.exceptions = exceptions;
    }

    public Integer getStatusCodeResponse() {
        return statusCodeResponse;
    }

    public void setStatusCodeResponse(int statusCodeResponse) {
        this.statusCodeResponse = statusCodeResponse;
    }

    public void setBodyResponse(String bodyResponse) {
        this.bodyResponse = bodyResponse;
    }

    public String getBodyResponse() {
        return bodyResponse;
    }

    public void setIsPdf(boolean isPdf) {
        this.isPdf = isPdf;
    }

    public boolean getIsPdf() {
        return isPdf;
    }

    public boolean isZip() {
		return isZip;
	}

	public void setIsZip(boolean isZip) {
		this.isZip = isZip;
	}

	public void setResponseAsByte(ResponseEntity<byte[]> responseAsByte) {
        this.responseAsByte = responseAsByte;
    }

    public ResponseEntity<byte[]> getResponseAsByte() {
        return responseAsByte;
    }        

	public String getCodEsenzione() {
		return codEsenzione;
	}

	public void setCodEsenzione(String codEsenzione) {
		this.codEsenzione = codEsenzione;
	}
	
	public String getCodMalattia() {
		return codMalattia;
	}

	public void setCodMalattia(String codMalattia) {
		this.codMalattia = codMalattia;
	}

	public String getHeaderResponseGiallo(String header) {
		List<String> valori = responseAsByte.getHeaders().get(header);
		String result = "";
		if(valori != null) {
			for(String valore : valori) {
				result = result.concat(valore);
			}
		}
		return result;
	}

}
