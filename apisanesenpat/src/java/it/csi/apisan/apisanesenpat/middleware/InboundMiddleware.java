/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.util.LogUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

import static it.csi.apisan.apisanesenpat.util.Chain.CHAIN_OK;

public class InboundMiddleware extends BaseMiddleware {
    protected static LogUtil log = new LogUtil(InboundMiddleware.class);

    public InboundMiddleware(MiddlewareInvocation middlewareInvocation) {
        super(middlewareInvocation);
    }


    @Override
    boolean executeMiddleware() throws MiddlewareException {

        try {
            HttpServletRequest httpServletRequest = this.middlewareInvocation.getServletRequest();

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
            log.error("InboundMiddleware error", e.getMessage());
            throw new MiddlewareException("InboundMiddleware error", e.getCause());
        }

        return CHAIN_OK;
    }

}
