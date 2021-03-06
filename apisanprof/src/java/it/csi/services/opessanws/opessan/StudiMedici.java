/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.services.opessanws.opessan;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudiMedici", targetNamespace = "http://opessan.opessanws.def.csi.it/")
@XmlSeeAlso({
    it.csi.def.opessanws.opessan.ObjectFactory.class,
    it.csi.dto.opessanws.opessan.common.request.ObjectFactory.class,
    it.csi.dto.opessanws.opessan.common.response.ObjectFactory.class
})
public interface StudiMedici {


    /**
     * 
     * @param arg0
     * @return
     *     returns it.csi.def.opessanws.opessan.GetElencoStudiResponse.Return
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getElencoStudi", targetNamespace = "http://opessan.opessanws.def.csi.it/", className = "it.csi.def.opessanws.opessan.GetElencoStudi")
    @ResponseWrapper(localName = "getElencoStudiResponse", targetNamespace = "http://opessan.opessanws.def.csi.it/", className = "it.csi.def.opessanws.opessan.GetElencoStudiResponse")
    public it.csi.def.opessanws.opessan.GetElencoStudiResponse.Return getElencoStudi(
        @WebParam(name = "arg0", targetNamespace = "")
        it.csi.def.opessanws.opessan.GetElencoStudi.Arg0 arg0);

}
