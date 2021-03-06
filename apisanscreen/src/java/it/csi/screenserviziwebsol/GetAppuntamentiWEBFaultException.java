/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-03-24T11:59:49.044+01:00
 * Generated source version: 2.7.14
 */

@WebFault(name = "Get_Appuntamenti_WEBFault", targetNamespace = "http://www.csi.it/ScreenServiziWebSOL/")
public class GetAppuntamentiWEBFaultException extends Exception {
    
    private it.csi.screenserviziwebsol.GetAppuntamentiWEBFault getAppuntamentiWEBFault;

    public GetAppuntamentiWEBFaultException() {
        super();
    }
    
    public GetAppuntamentiWEBFaultException(String message) {
        super(message);
    }
    
    public GetAppuntamentiWEBFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAppuntamentiWEBFaultException(String message, it.csi.screenserviziwebsol.GetAppuntamentiWEBFault getAppuntamentiWEBFault) {
        super(message);
        this.getAppuntamentiWEBFault = getAppuntamentiWEBFault;
    }

    public GetAppuntamentiWEBFaultException(String message, it.csi.screenserviziwebsol.GetAppuntamentiWEBFault getAppuntamentiWEBFault, Throwable cause) {
        super(message, cause);
        this.getAppuntamentiWEBFault = getAppuntamentiWEBFault;
    }

    public it.csi.screenserviziwebsol.GetAppuntamentiWEBFault getFaultInfo() {
        return this.getAppuntamentiWEBFault;
    }
}
