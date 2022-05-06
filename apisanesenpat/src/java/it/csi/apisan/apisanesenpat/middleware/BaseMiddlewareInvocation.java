/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.model.Errore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public abstract class BaseMiddlewareInvocation {

    public abstract HttpServletRequest getServletRequest();
    public abstract HttpServletResponse getServletResponse();

    private HttpServletRequest servletRequest;

    private String  xCodiceServizio;
    private String  xRequestID;
    private Errore errore           = new Errore();
    private String                                  ipRequest;

    public BaseMiddlewareInvocation() {
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
        return xRequestID;
    }

    public void setxRequestId(String xRequestId) {
        this.xRequestID = xRequestId;
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

   /* public HttpServletRequest getServletRequest() {
        return servletRequest;
    }*/

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

}
