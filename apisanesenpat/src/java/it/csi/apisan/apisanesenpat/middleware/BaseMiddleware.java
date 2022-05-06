/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.util.LogUtil;

public abstract class BaseMiddleware {

    protected LogUtil              log = new LogUtil(this.getClass());
    private   BaseMiddleware       next;
    protected MiddlewareInvocation middlewareInvocation;

    public BaseMiddleware(MiddlewareInvocation middlewareInvocation) {
        this.middlewareInvocation = middlewareInvocation;
    }

    abstract boolean executeMiddleware() throws MiddlewareException;

    public boolean executeAndCheckNext() {
        boolean result = false;

        try {
            executeMiddleware();
        } catch (MiddlewareException e) {
            this.middlewareInvocation.getExceptions().add(e);
            log.error("BaseMiddleware", e.getMessage());
        }

        return result;
    }
}
