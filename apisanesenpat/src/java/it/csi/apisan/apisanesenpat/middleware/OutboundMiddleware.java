/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.util.LogUtil;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import java.util.Enumeration;

import static it.csi.apisan.apisanesenpat.util.Chain.CHAIN_OK;

public class OutboundMiddleware extends BaseMiddleware {
    protected static LogUtil log = new LogUtil(OutboundMiddleware.class);

    public OutboundMiddleware(MiddlewareInvocation middlewareInvocation) {
        super(middlewareInvocation);
    }

    @Override
    boolean executeMiddleware() throws MiddlewareException {
        HttpServletRequest  httpServletRequest  = this.middlewareInvocation.getServletRequest();
        HttpServletResponse httpServletResponse = this.middlewareInvocation.getServletResponse();

        try {

            // Log Metodo HTTP
            String method = httpServletRequest.getMethod();
            log.info("HttpMethod", method);

            // Log Headers
            Enumeration headerNames = httpServletRequest.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String headerName = (String) headerNames.nextElement();
                log.info(headerName, httpServletRequest.getHeader(headerName));
            }

            // Log QueryParameters
            String queryParams = httpServletRequest.getQueryString();
            log.info("QueryParameters", queryParams);

            // Log Payload
            if ("POST".equalsIgnoreCase(method) || "PUT".equalsIgnoreCase(method)) {
//            HashMap<String, Object> payload = ApisanEsenPatUtility.getJSONFromRequest(httpServletRequest);
//            log.info("Payload", payload.toString());
            }
        } catch (Exception e) {
            log.error("OutboundMiddleware error", e.getMessage());
            throw new MiddlewareException("OutboundMiddleware error", e.getCause());
        }

        return CHAIN_OK;
    }
}

