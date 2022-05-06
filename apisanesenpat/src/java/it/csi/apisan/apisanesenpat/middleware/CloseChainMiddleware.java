/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.util.LogUtil;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

import static it.csi.apisan.apisanesenpat.util.Chain.CHAIN_OK;

public class CloseChainMiddleware extends BaseMiddleware {
    protected static LogUtil log = new LogUtil(CloseChainMiddleware.class);

    public CloseChainMiddleware(MiddlewareInvocation middlewareInvocation) {
        super(middlewareInvocation);
    }

    @Override
    boolean executeMiddleware() throws MiddlewareException {
        HttpServletRequest  httpServletRequest  = this.middlewareInvocation.getServletRequest();
        HttpServletResponse httpServletResponse = this.middlewareInvocation.getServletResponse();

        try {
            //Payload
            if (!this.middlewareInvocation.getStreamClosed() && this.middlewareInvocation.getExceptions().size() == 0) {

                //Header Response
                ResponseEntity<String> response    = this.middlewareInvocation.getResponse();

                // Write the content to servlet
                if (response != null) {
                    this.middlewareInvocation.setBodyResponse(response.getBody());
                }

                this.middlewareInvocation.setStreamClosed(true);

            } else {
                // Another chain writed and closed the servlet output stream
            }

        } catch (Exception e) {
            log.error("CloseChainMiddleware", e.getMessage());
            throw new MiddlewareException("Errore durante la chiusura dello stream", e.getCause());
        }

        return CHAIN_OK;
    }
}
