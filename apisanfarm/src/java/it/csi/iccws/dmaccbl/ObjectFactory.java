/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.iccws.dmaccbl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.iccws.dmacc.GetFarmacieAderentiRequest;
import it.csi.iccws.dmacc.VerificaFarmacistaRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.iccws.dmaccbl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerificaFarmacistaRequest_QNAME = new QName("http://dmaccbl.csi.it/", "verificaFarmacistaRequest");
    private final static QName _GetFarmacieAderentiRequest_QNAME = new QName("http://dmaccbl.csi.it/", "getFarmacieAderentiRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.iccws.dmaccbl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaFarmacistaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "verificaFarmacistaRequest")
    public JAXBElement<VerificaFarmacistaRequest> createVerificaFarmacistaRequest(VerificaFarmacistaRequest value) {
        return new JAXBElement<VerificaFarmacistaRequest>(_VerificaFarmacistaRequest_QNAME, VerificaFarmacistaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFarmacieAderentiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getFarmacieAderentiRequest")
    public JAXBElement<GetFarmacieAderentiRequest> createGetFarmacieAderentiRequest(GetFarmacieAderentiRequest value) {
        return new JAXBElement<GetFarmacieAderentiRequest>(_GetFarmacieAderentiRequest_QNAME, GetFarmacieAderentiRequest.class, null, value);
    }

}
