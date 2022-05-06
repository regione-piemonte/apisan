/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-03-24T11:59:49.008+01:00
 * Generated source version: 2.7.14
 */

@WebFault(name = "Scr_Cit_01Fault", targetNamespace = "http://www.csi.it/ScreenServiziWebSOL/")
public class ScrCit01FaultException extends Exception {
    
    private it.csi.screenserviziwebsol.ScrCit01Fault scrCit01Fault;

    public ScrCit01FaultException() {
        super();
    }
    
    public ScrCit01FaultException(String message) {
        super(message);
    }
    
    public ScrCit01FaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScrCit01FaultException(String message, it.csi.screenserviziwebsol.ScrCit01Fault scrCit01Fault) {
        super(message);
        this.scrCit01Fault = scrCit01Fault;
    }

    public ScrCit01FaultException(String message, it.csi.screenserviziwebsol.ScrCit01Fault scrCit01Fault, Throwable cause) {
        super(message, cause);
        this.scrCit01Fault = scrCit01Fault;
    }

    public it.csi.screenserviziwebsol.ScrCit01Fault getFaultInfo() {
        return this.scrCit01Fault;
    }
}
