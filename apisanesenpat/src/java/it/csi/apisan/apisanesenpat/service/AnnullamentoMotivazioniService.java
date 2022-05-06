/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.service;

import it.csi.apisan.apisanesenpat.exception.RESTException;
import it.csi.apisan.apisanesenpat.middleware.InboundMiddleware;
import it.csi.apisan.apisanesenpat.middleware.MiddlewareInvocation;
import it.csi.apisan.apisanesenpat.middleware.OutboundMiddleware;
import it.csi.apisan.apisanesenpat.middleware.RestExecutorMiddleware;
import it.csi.apisan.apisanesenpat.util.Chain;
import it.csi.apisan.apisanesenpat.util.ChainBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AnnullamentoMotivazioniService extends RESTBaseService {

    @Value("${basePath}")                             String basePath;
    @Value("${contextPath}")                          String contextPath;
    @Value("${serviceAnnulamentoMotivazioniService}") String servicePath;

    protected String _shibIdentitaCodiceFiscale = null;
    protected String _xRequestId                = null;
    protected String _xForwardedFor             = null;
    protected String _xCodiceServizio           = null;
    protected String _citId                     = null;
    protected String _esenzioneId               = null;


    public AnnullamentoMotivazioniService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String esenzioneId, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);

        this._shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
        this._xRequestId                = xRequestId;
        this._xForwardedFor             = xForwardedFor;
        this._xCodiceServizio           = xCodiceServizio;
        this._citId                     = citId;
        this._esenzioneId               = esenzioneId;
    }


    @Override
    protected Response execute() {

        /* Validazione */
        checkNotNull(_shibIdentitaCodiceFiscale, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_shibIdentitaCodiceFiscale non valorizzato"));
        checkNotNull(_xRequestId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_xRequestId non valorizzato"));
        checkNotNull(_xCodiceServizio, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_xCodiceServizio non valorizzato"));
        checkNotNull(_xForwardedFor, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_xForwardedFor non valorizzato"));
        checkNotNull(_citId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_citId non valorizzato"));
        checkNotNull(_esenzioneId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_esenzioneId non valorizzato"));


        //final String uri = basePath + contextPath + servicePath + _citId + "/esenzioni"; // TODO da checkare

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
                }).build();


        /* Prepare request for chain */
        MiddlewareInvocation middlewareInvocation = new MiddlewareInvocation();
        middlewareInvocation.setShibIdentitaCodiceFiscale(_shibIdentitaCodiceFiscale);
        middlewareInvocation.setxRequestId(_xRequestId);
        middlewareInvocation.setxForwardedFor(_xForwardedFor);
        middlewareInvocation.setxCodiceServizio(_xCodiceServizio);
        middlewareInvocation.setCitId(_citId);
        middlewareInvocation.setEsenzioneId(_esenzioneId);
        middlewareInvocation.setServletRequest(request);
        middlewareInvocation.setServletResponse(response);

        /* Excecute chain */
        chain.handle(middlewareInvocation);

        /* Manage results */
        Response.ResponseBuilder builder = Response.status(Response.Status.OK);
        middlewareInvocation.getHeaderResponse().entrySet().forEach(header -> {
            builder.header(header.getKey(), StringUtils.join(header.getValue(), " "));
        });
        builder.header("X-Request-ID", _xRequestId);
        Response result = builder.build();

        return result;
    }
}
