/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.arruolamento.dmacc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-09-09T15:25:23.721+02:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmacc.csi.it/", name = "ArruolabileFSEService")
@XmlSeeAlso({it.csi.apisan.apisanfse.integration.arruolamento.dma.ObjectFactory.class, ObjectFactory.class})
public interface ArruolabileFSEService {

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "getPreferenzeArruolabilitaResponse", targetNamespace = "http://dmacc.csi.it/", partName = "getPreferenzeArruolabilitaResponse")
    public java.lang.String getPreferenzeArruolabilita(
        @WebParam(partName = "getPreferenzeArruolabilita", name = "getPreferenzeArruolabilita", targetNamespace = "http://dmacc.csi.it/")
        java.lang.String getPreferenzeArruolabilita
    );

    @WebMethod
    @RequestWrapper(localName = "isArruolabile", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.arruolamento.dma.IsArruolabile")
    @ResponseWrapper(localName = "isArruolabileResponse", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.arruolamento.dma.IsArruolabileResponse")
    @WebResult(name = "fascicoloArruolabile", targetNamespace = "")
    public it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile isArruolabile(
        @WebParam(name = "codiceFiscale", targetNamespace = "")
        java.lang.String codiceFiscale,
        @WebParam(name = "richiedente", targetNamespace = "")
        it.csi.apisan.apisanfse.integration.arruolamento.dma.RichiedenteArruolamento richiedente
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "setPreferenzeConsultazioneResponse", targetNamespace = "http://dmacc.csi.it/", partName = "setPreferenzeConsultazioneResponse")
    public java.lang.String setPreferenzeConsultazione(
        @WebParam(partName = "setPreferenzeConsultazione", name = "setPreferenzeConsultazione", targetNamespace = "http://dmacc.csi.it/")
        java.lang.String setPreferenzeConsultazione
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "setPreferenzeArruolabilitaResponse", targetNamespace = "http://dmacc.csi.it/", partName = "setPreferenzeArruolabilitaResponse")
    public java.lang.String setPreferenzeArruolabilita(
        @WebParam(partName = "setPreferenzeArruolabilita", name = "setPreferenzeArruolabilita", targetNamespace = "http://dmacc.csi.it/")
        java.lang.String setPreferenzeArruolabilita
    );
}
