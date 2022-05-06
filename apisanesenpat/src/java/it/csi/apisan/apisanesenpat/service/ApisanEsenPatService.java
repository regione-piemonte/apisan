/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.jboss.resteasy.util.HttpResponseCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanesenpat.exception.ErroreBuilder;
import it.csi.apisan.apisanesenpat.exception.RESTException;
import it.csi.apisan.apisanesenpat.middleware.CloseChainMiddleware;
import it.csi.apisan.apisanesenpat.middleware.InboundMiddleware;
import it.csi.apisan.apisanesenpat.middleware.MiddlewareInvocation;
import it.csi.apisan.apisanesenpat.middleware.OutboundMiddleware;
import it.csi.apisan.apisanesenpat.middleware.ProcessPDFMiddleware;
import it.csi.apisan.apisanesenpat.middleware.RestExecutorMiddleware;
import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.model.Errore;
import it.csi.apisan.apisanesenpat.model.ErroreDettaglio;
import it.csi.apisan.apisanesenpat.model.Payload;
import it.csi.apisan.apisanesenpat.model.Payload1;
import it.csi.apisan.apisanesenpat.model.Payload2;
import it.csi.apisan.apisanesenpat.model.Payload3;
import it.csi.apisan.apisanesenpat.model.Payload4;
import it.csi.apisan.apisanesenpat.util.ApisanEsenPatStatus;
import it.csi.apisan.apisanesenpat.util.Chain;
import it.csi.apisan.apisanesenpat.util.ChainBuilder;
import it.csi.apisan.apisanesenpat.util.LogUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ApisanEsenPatService extends EsenPatDelegheRESTBaseService {

    @Value("${stratoGialloEndpoint}")            String stratoGialloEndpoint;
    @Value("${stratoGialloEndBasePath}")         String stratoGialloEndBasePath;
    @Value("${stratoGialloElencoServiziAttivi}") String stratoGialloElencoServiziAttivi;
    @Value("${usernameStratoGiallo}")            String usernameStratoGiallo;
    @Value("${passwordStratoGiallo}")            String passwordStratoGiallo;
    @Value("${settingFileNameToDownload}")       String settingFileNameToDownload;
    @Value("${settingFileNameZipToDownload}")    String settingFileNameZipToDownload;

    private LogUtil _log = new LogUtil(ApisanEsenPatService.class);


    @Autowired ApplicationContext applicationContext;

    protected boolean  _isPdf           = false;
    protected boolean  _isZip           = false;
    protected String   _xRequestId      = null;
    protected String   _xForwardedFor   = null;
    protected String   _xCodiceServizio = null;
    protected String   _citId           = null;
    protected String   _certificatoId   = null;
    protected String   _esenzioneId     = null;
    protected String   _codEsenzione    = null;
    protected String   _codMalattia     = null;
        

	protected String   _filter          = null;
    protected Payload1 _payload1        = null;
    protected Payload2 _payload2        = null;
    protected Payload3 _payload3        = null;
    protected Payload4 _payload4        = null;
    private   Payload  _payload;
    private   String   _documentType;
    private   Response result;

    public ApisanEsenPatService(String _shibIdentitaCodiceFiscale, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(_shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
    }

    protected boolean isUtenteAutorizzato(String cf) {
        return _shibIdentitaCodiceFiscale != null && _shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
    }

    protected void checkUtenteAutorizzato(String cf) throws RESTException {
        checkCondition(isUtenteAutorizzato(cf), ErroreBuilder.from(ApisanEsenPatStatus.UTENTE_NON_AUTORIZZATO).exception());
    }

    protected boolean isCodiceFiscaleValido(String cf) {
        return cf != null && (cf.length() == 16);
        //return cf != null && cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
    }

    @Override
    protected Response execute() {

        /* Creating the chain */
        ChainBuilder<MiddlewareInvocation> chainBuilder = ChainBuilder.chainBuilder();
        Chain<MiddlewareInvocation> chain = chainBuilder
                .first(request -> {
                    InboundMiddleware inboundMiddleware = new InboundMiddleware(request);
                    return inboundMiddleware.executeAndCheckNext();
                })
                .successor(request -> {
                    RestExecutorMiddleware restExecutorMiddleware = new RestExecutorMiddleware(request);
                    return restExecutorMiddleware.executeAndCheckNext();
                })
                .successor(request -> {
                    OutboundMiddleware outboundMiddleware = new OutboundMiddleware(request);
                    return outboundMiddleware.executeAndCheckNext();
                })
                .successor(request -> {
                    ProcessPDFMiddleware processPDFMiddleware = new ProcessPDFMiddleware(request);
                    return processPDFMiddleware.executeAndCheckNext();
                })
                .successor(request -> {
                    CloseChainMiddleware closeChainMiddleware = new CloseChainMiddleware(request);
                    return closeChainMiddleware.executeAndCheckNext();
                })
                .build();


        /* MiddlewareInvocation - Prepare request for chain */
        MiddlewareInvocation middlewareInvocation = new MiddlewareInvocation();
        middlewareInvocation.setServletRequest(request);
        middlewareInvocation.setServletResponse(response);
        middlewareInvocation.setHttpHeaders(httpHeaders);
        middlewareInvocation.setShibIdentitaCodiceFiscale(_shibIdentitaCodiceFiscale);
        middlewareInvocation.setxRequestId(_xRequestId);
        middlewareInvocation.setxForwardedFor(_xForwardedFor);
        middlewareInvocation.setxCodiceServizio(_xCodiceServizio);
        middlewareInvocation.setCitId(_citId);
        middlewareInvocation.setCertificatoId(_certificatoId);
        middlewareInvocation.setEsenzioneId(_esenzioneId);
        middlewareInvocation.setCodMalattia(_codMalattia);
        middlewareInvocation.setFilter(_filter);
        middlewareInvocation.setPayload(_payload);
        middlewareInvocation.setPayload1(_payload1);
        middlewareInvocation.setPayload2(_payload2);
        middlewareInvocation.setPayload3(_payload3);
        middlewareInvocation.setPayload4(_payload4);
        middlewareInvocation.setDocumentType(_documentType);
        middlewareInvocation.setIsPdf(_isPdf);
        middlewareInvocation.setIsZip(_isZip);

        /* MiddlewareInvocation - Set data from properties */
        middlewareInvocation.setStratoGialloEndpoint(stratoGialloEndpoint);
        middlewareInvocation.setStratoGialloEndBasePath(stratoGialloEndBasePath);
        middlewareInvocation.setStratoGialloElencoServiziAttivi(stratoGialloElencoServiziAttivi);
        middlewareInvocation.setUsername(usernameStratoGiallo);
        middlewareInvocation.setPassword(passwordStratoGiallo);
        middlewareInvocation.setSettingFileNameToDownload(settingFileNameToDownload);
        middlewareInvocation.setSettingFileNameZipToDownload(settingFileNameZipToDownload);

        try {

            /* Check delega */
            checkUtenteAutorizzatoOrDelegato(_xRequestId, _xCodiceServizio, _citId);

            /* Excecute chain */
            chain.handle(middlewareInvocation);

            /* Manage results */
            processResponseAndCheckExceptions(middlewareInvocation);

            return result;

        } catch (RESTException e) {
            /* Set error message */
            returnErrorMessage(middlewareInvocation, "ApisanEsenPatService", e.getMessage(), HttpResponseCodes.SC_FORBIDDEN, "Errore");
            Response.ResponseBuilder builder = Response.status(Response.Status.fromStatusCode(HttpResponseCodes.SC_FORBIDDEN));
            if (middlewareInvocation.getHeaderResponse() != null) {
                middlewareInvocation.getHeaderResponse().entrySet().forEach(header -> {
                    builder.header(header.getKey(), StringUtils.join(header.getValue(), " "));
                });
            }
            builder.header("X-Request-ID", _xRequestId);
            builder.entity(e.getEntity() != null ? e.getEntity() : returnErrore(e.getStatus(), e.getMessage()));
            builder.type(MediaType.APPLICATION_JSON);

            result = builder.build();

            return result;
        }
    }


    private void processResponseAndCheckExceptions(MiddlewareInvocation middlewareInvocation) {
        if (middlewareInvocation.getExceptions() != null && middlewareInvocation.getExceptions().size() > 0) {

            /* Set error message */
            int    statusResponse = middlewareInvocation.getStatusCodeResponse() != null ? middlewareInvocation.getStatusCodeResponse() : 500;
            String errorMessage   = getErrorMessageFromExceptionsList(middlewareInvocation.getExceptions());


            returnErrorMessage(middlewareInvocation, "ApisanEsenPatService", errorMessage, statusResponse, "Errore");
            Response.ResponseBuilder builder = Response.status(Response.Status.fromStatusCode(statusResponse));
            if (middlewareInvocation.getHeaderResponse() != null) {
                middlewareInvocation.getHeaderResponse().entrySet().forEach(header -> {
                    builder.header(header.getKey(), StringUtils.join(header.getValue(), " "));
                });
            }
            builder.header("X-Request-ID", _xRequestId);
            builder.entity(middlewareInvocation.getErrore());
            builder.type(MediaType.APPLICATION_JSON);

            result = builder.build();
        } else {
            Response.ResponseBuilder builder = Response.status(Response.Status.OK);
            if (middlewareInvocation.getHeaderResponse() != null) {
                middlewareInvocation.getHeaderResponse().entrySet().forEach(header -> {
                    builder.header(header.getKey(), StringUtils.join(header.getValue(), " "));
                });
            }
            builder.entity(middlewareInvocation.getBodyResponse());
            builder.type(checkIfIsJson(middlewareInvocation.getBodyResponse()) ? MediaType.APPLICATION_JSON_TYPE : MediaType.TEXT_HTML_TYPE);
            builder.header("X-Request-ID", _xRequestId);
            result = builder.build();
        }
    }

    private boolean checkIfIsJson(String textToCheck) {
    	if(textToCheck == null)
    		return false;
        try {
            new JSONObject(textToCheck);
        } catch (JSONException ex) {
            // edited, to include @Arthur's comment
            // e.g. in case JSONArray is valid as well...
            try {
                new JSONArray(textToCheck);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }

    private String getErrorMessageFromExceptionsList(List<MiddlewareException> exceptions) {
        return Optional.ofNullable(exceptions)
                .orElse(new ArrayList<>())
                .stream()
                .map(Throwable::getMessage)
                .collect(Collectors.joining(","))
                .replaceAll("\\{|}|:|code|\"|,|title|status", "#");
    }

    private void returnErrorMessage(MiddlewareInvocation middlewareInvocation, String metodo, Exception e, int statusCode, String title) {
        ErroreDettaglio erroreDettaglio = new ErroreDettaglio();
        erroreDettaglio.put("metodo", metodo);
        erroreDettaglio.put("dettaglioErrore", e.getMessage());
        erroreDettaglio.put("causa", e.getCause() != null ? e.getCause().getMessage() : "");
        middlewareInvocation.getErrore().getDetail().add(erroreDettaglio);
        middlewareInvocation.getErrore().setStatus(statusCode);
        middlewareInvocation.getErrore().setTitle(title);
    }

    private void returnErrorMessage(MiddlewareInvocation middlewareInvocation, String metodo, String messageDettaglioErrore, int statusCode, String title) {
        ErroreDettaglio erroreDettaglio = new ErroreDettaglio();
        erroreDettaglio.put("metodo", metodo);
        erroreDettaglio.put("dettaglioErrore", messageDettaglioErrore);
        middlewareInvocation.getErrore().getDetail().add(erroreDettaglio);
        middlewareInvocation.getErrore().setStatus(statusCode);
        middlewareInvocation.getErrore().setTitle(title);
    }

    private Errore returnErrore(int statusCode, String valore) {
        Errore erroreResult = new Errore();
        erroreResult.setStatus(statusCode);
        erroreResult.setCode(HttpStatus.valueOf(statusCode).name());
        erroreResult.setTitle(valore);

        return erroreResult;
    }




    /* Get - Set */

    public String get_xRequestId() {
        return _xRequestId;
    }

    public void set_xRequestId(String _xRequestId) {
        this._xRequestId = _xRequestId;
    }

    public String get_xForwardedFor() {
        return _xForwardedFor;
    }

    public void set_xForwardedFor(String _xForwardedFor) {
        this._xForwardedFor = _xForwardedFor;
    }

    public String get_xCodiceServizio() {
        return _xCodiceServizio;
    }

    public void set_xCodiceServizio(String _xCodiceServizio) {
        this._xCodiceServizio = _xCodiceServizio;
    }

    public String get_citId() {
        return _citId;
    }

    public void set_citId(String _citId) {
        this._citId = _citId;
    }

    public String get_certificatoId() {
        return _certificatoId;
    }

    public void set_certificatoId(String _certificatoId) {
        this._certificatoId = _certificatoId;
    }

    public String get_esenzioneId() {
        return _esenzioneId;
    }

    public void set_esenzioneId(String _esenzioneId) {
        this._esenzioneId = _esenzioneId;
    }

    public String get_filter() {
        return _filter;
    }

    public void set_filter(String _filter) {
        this._filter = _filter;
    }

    public Payload1 get_payload1() {
        return _payload1;
    }

    public void set_payload1(Payload1 _payload1) {
        this._payload1 = _payload1;
    }

    public Payload2 get_payload2() {
        return _payload2;
    }

    public void set_payload2(Payload2 _payload2) {
        this._payload2 = _payload2;
    }

    public Payload3 get_payload3() {
        return _payload3;
    }

    public void set_payload3(Payload3 _payload3) {
        this._payload3 = _payload3;
    }

    public Payload4 get_payload4() {
        return _payload4;
    }

    public void set_payload4(Payload4 _payload4) {
        this._payload4 = _payload4;
    }

    public void set_payload(Payload payload) {
        this._payload = payload;
    }

    public Payload get_payload() {
        return _payload;
    }

    public void set_documentType(String documentType) {
        this._documentType = documentType;
    }

    public String get_documentType() {
        return _documentType;
    }

    public void set_isPdf(boolean isPdf) {
        this._isPdf = isPdf;
    }

    public boolean get_isPdf() {
        return _isPdf;
    }

	public boolean is_isZip() {
		return _isZip;
	}

	public void set_isZip(boolean _isZip) {
		this._isZip = _isZip;
	}
	
	public String get_codEsenzione() {
		return _codEsenzione;
	}

	public void set_codEsenzione(String _codEsenzione) {
		this._codEsenzione = _codEsenzione;
	}

	public String get_codMalattia() {
		return _codMalattia;
	}

	public void set_codMalattia(String _codMalattia) {
		this._codMalattia = _codMalattia;
	}
}
