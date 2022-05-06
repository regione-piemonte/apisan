/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.14
 * 2020-06-03T16:52:25.932+02:00
 * Generated source version: 2.7.14
 */

@WebFault(name = "AvvisoPagamentoException", targetNamespace = "http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/")
public class AvvisoPagamentoException_Exception extends Exception {
    
    private it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.AvvisoPagamentoException avvisoPagamentoException;

    public AvvisoPagamentoException_Exception() {
        super();
    }
    
    public AvvisoPagamentoException_Exception(String message) {
        super(message);
    }
    
    public AvvisoPagamentoException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AvvisoPagamentoException_Exception(String message, it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.AvvisoPagamentoException avvisoPagamentoException) {
        super(message);
        this.avvisoPagamentoException = avvisoPagamentoException;
    }

    public AvvisoPagamentoException_Exception(String message, it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.AvvisoPagamentoException avvisoPagamentoException, Throwable cause) {
        super(message, cause);
        this.avvisoPagamentoException = avvisoPagamentoException;
    }

    public it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.AvvisoPagamentoException getFaultInfo() {
        return this.avvisoPagamentoException;
    }
}