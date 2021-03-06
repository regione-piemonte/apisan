/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2020-06-26T15:12:51.995+02:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "GetDettaglioDocumentoDigitaleFault", targetNamespace = "http://www.csi.it/ScreenServiziWebSOL/")
public class GetDettaglioDocumentoDigitaleFault_Exception extends Exception {
    
    private it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleFault getDettaglioDocumentoDigitaleFault;

    public GetDettaglioDocumentoDigitaleFault_Exception() {
        super();
    }
    
    public GetDettaglioDocumentoDigitaleFault_Exception(String message) {
        super(message);
    }
    
    public GetDettaglioDocumentoDigitaleFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public GetDettaglioDocumentoDigitaleFault_Exception(String message, it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleFault getDettaglioDocumentoDigitaleFault) {
        super(message);
        this.getDettaglioDocumentoDigitaleFault = getDettaglioDocumentoDigitaleFault;
    }

    public GetDettaglioDocumentoDigitaleFault_Exception(String message, it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleFault getDettaglioDocumentoDigitaleFault, Throwable cause) {
        super(message, cause);
        this.getDettaglioDocumentoDigitaleFault = getDettaglioDocumentoDigitaleFault;
    }

    public it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleFault getFaultInfo() {
        return this.getDettaglioDocumentoDigitaleFault;
    }
}
