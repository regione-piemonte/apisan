/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2019-09-24T15:17:30.659+02:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmapro.csi.it/", name = "ElencoNreNascostiService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ElencoNreNascostiService {

    @WebMethod
    @WebResult(name = "elencoNreNascostiResponse", targetNamespace = "http://dmapro.csi.it/", partName = "elencoNreNascostiResponse")
    public ElencoNreNascostiResponse elencoNreNascosti(
        @WebParam(partName = "elencoNreNascostiRequest", name = "elencoNreNascostiRequest", targetNamespace = "http://dmapro.csi.it/")
        ElencoNreNascosti elencoNreNascostiRequest
    );
}
