/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2020-06-26T15:12:51.962+02:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "Set_Situazione_Ass_Ind_WEBFault", targetNamespace = "http://www.csi.it/ScreenServiziWebSOL/")
public class SetSituazioneAssIndWEBFault_Exception extends Exception {
    
    private it.csi.screenserviziwebsol.SetSituazioneAssIndWEBFault setSituazioneAssIndWEBFault;

    public SetSituazioneAssIndWEBFault_Exception() {
        super();
    }
    
    public SetSituazioneAssIndWEBFault_Exception(String message) {
        super(message);
    }
    
    public SetSituazioneAssIndWEBFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SetSituazioneAssIndWEBFault_Exception(String message, it.csi.screenserviziwebsol.SetSituazioneAssIndWEBFault setSituazioneAssIndWEBFault) {
        super(message);
        this.setSituazioneAssIndWEBFault = setSituazioneAssIndWEBFault;
    }

    public SetSituazioneAssIndWEBFault_Exception(String message, it.csi.screenserviziwebsol.SetSituazioneAssIndWEBFault setSituazioneAssIndWEBFault, Throwable cause) {
        super(message, cause);
        this.setSituazioneAssIndWEBFault = setSituazioneAssIndWEBFault;
    }

    public it.csi.screenserviziwebsol.SetSituazioneAssIndWEBFault getFaultInfo() {
        return this.setSituazioneAssIndWEBFault;
    }
}
