/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-01-18T09:57:06.356+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmacc.csi.it/", name = "DocumentoPersonaleService")
@XmlSeeAlso({it.csi.apisan.apisanfse.integration.documentoPersonale.dma.ObjectFactory.class, ObjectFactory.class})
public interface DocumentoPersonaleService {

    @WebMethod
    @RequestWrapper(localName = "getDocumentoPersonale", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.GetDocumentoPersonale")
    @ResponseWrapper(localName = "getDocumentoPersonaleResponse", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.GetDocumentoPersonaleResponse")
    public void getDocumentoPersonale(
        @WebParam(name = "idDocumento", targetNamespace = "")
        java.lang.String idDocumento,
        @WebParam(name = "cfPaziente", targetNamespace = "")
        java.lang.String cfPaziente,
        @WebParam(name = "richiedente", targetNamespace = "")
        it.csi.apisan.apisanfse.integration.documentoPersonale.dma.RichiedenteInfo richiedente,
        @WebParam(mode = WebParam.Mode.OUT, name = "errori", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore>> errori,
        @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "")
        javax.xml.ws.Holder<RisultatoCodice> esito,
        @WebParam(mode = WebParam.Mode.OUT, name = "documento", targetNamespace = "")
        javax.xml.ws.Holder<it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale> documento
    );

    @WebMethod 
    @RequestWrapper(localName = "setDocumentoPersonale", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.SetDocumentoPersonale")
    @ResponseWrapper(localName = "setDocumentoPersonaleResponse", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.SetDocumentoPersonaleResponse")
    public void setDocumentoPersonale(
        @WebParam(name = "richiedente", targetNamespace = "")
        it.csi.apisan.apisanfse.integration.documentoPersonale.dma.RichiedenteInfo richiedente,
        @WebParam(name = "cfPaziente", targetNamespace = "")
        java.lang.String cfPaziente,
        @WebParam(name = "documento", targetNamespace = "")
        it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale documento,
        @WebParam(name = "metadatiDocumento", targetNamespace = "")
        it.csi.apisan.apisanfse.integration.documentoPersonale.dma.MetadatiDocumentoPersonale metadatiDocumento,
        @WebParam(mode = WebParam.Mode.OUT, name = "errori", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore>> errori,
        @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "")
        javax.xml.ws.Holder<RisultatoCodice> esito,
        @WebParam(mode = WebParam.Mode.OUT, name = "idDocumento", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> idDocumento
    );

    @WebMethod
    @RequestWrapper(localName = "deleteDocumentoPersonale", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.DeleteDocumentoPersonale")
    @ResponseWrapper(localName = "deleteDocumentoPersonaleResponse", targetNamespace = "http://dmacc.csi.it/", className = "it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.DeleteDocumentoPersonaleResponse")
    public void deleteDocumentoPersonale(
        @WebParam(name = "idDocumento", targetNamespace = "")
        java.lang.String idDocumento,
        @WebParam(name = "richiedente", targetNamespace = "")
        it.csi.apisan.apisanfse.integration.documentoPersonale.dma.RichiedenteInfo richiedente,
        @WebParam(name = "cfPaziente", targetNamespace = "")
        java.lang.String cfPaziente,
        @WebParam(mode = WebParam.Mode.OUT, name = "errori", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore>> errori,
        @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "")
        javax.xml.ws.Holder<RisultatoCodice> esito
    );
}