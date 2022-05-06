/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-03-24T11:59:49.021+01:00
 * Generated source version: 2.7.14
 */

@WebFault(name = "GetElencoDocumentiDigitaliFault", targetNamespace = "http://www.csi.it/ScreenServiziWebSOL/")
public class GetElencoDocumentiDigitaliFaultException extends Exception {
    
    private it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliFault getElencoDocumentiDigitaliFault;

    public GetElencoDocumentiDigitaliFaultException() {
        super();
    }
    
    public GetElencoDocumentiDigitaliFaultException(String message) {
        super(message);
    }
    
    public GetElencoDocumentiDigitaliFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetElencoDocumentiDigitaliFaultException(String message, it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliFault getElencoDocumentiDigitaliFault) {
        super(message);
        this.getElencoDocumentiDigitaliFault = getElencoDocumentiDigitaliFault;
    }

    public GetElencoDocumentiDigitaliFaultException(String message, it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliFault getElencoDocumentiDigitaliFault, Throwable cause) {
        super(message, cause);
        this.getElencoDocumentiDigitaliFault = getElencoDocumentiDigitaliFault;
    }

    public it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliFault getFaultInfo() {
        return this.getElencoDocumentiDigitaliFault;
    }
}