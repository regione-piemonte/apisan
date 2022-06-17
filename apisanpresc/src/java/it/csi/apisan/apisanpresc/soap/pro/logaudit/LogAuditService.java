/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2019-09-24T16:00:08.653+02:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmapro.csi.it/", name = "LogAuditService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LogAuditService {

    @WebMethod
    @WebResult(name = "logAuditResponse", targetNamespace = "http://dmapro.csi.it/", partName = "logAuditResponse")
    public LogAuditResponse logAudit(
        @WebParam(partName = "logAuditRequest", name = "logAuditRequest", targetNamespace = "http://dmapro.csi.it/")
        LogAuditRequest logAuditRequest
    );
}