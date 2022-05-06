/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali package. 
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

    private final static QName _GetElencoFarmacieAbituali_QNAME = new QName("http://getelencofarmacieabituali.msg.interfacews.farmab.dma.csi.it/", "getElencoFarmacieAbituali");
    private final static QName _GetElencoFarmacieAbitualiResponse_QNAME = new QName("http://getelencofarmacieabituali.msg.interfacews.farmab.dma.csi.it/", "getElencoFarmacieAbitualiResponse");
    private final static QName _FarmaciaIndirizzoFarmacia_QNAME = new QName("", "indirizzoFarmacia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetElencoFarmacieAbitualiResponse }
     * 
     */
    public GetElencoFarmacieAbitualiResponse createGetElencoFarmacieAbitualiResponse() {
        return new GetElencoFarmacieAbitualiResponse();
    }

    /**
     * Create an instance of {@link GetElencoFarmacieAbitualiRequest }
     * 
     */
    public GetElencoFarmacieAbitualiRequest createGetElencoFarmacieAbitualiRequest() {
        return new GetElencoFarmacieAbitualiRequest();
    }

    /**
     * Create an instance of {@link IndirizzoType }
     * 
     */
    public IndirizzoType createIndirizzoType() {
        return new IndirizzoType();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link TipoCodice }
     * 
     */
    public TipoCodice createTipoCodice() {
        return new TipoCodice();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link ElencoFarmacieType }
     * 
     */
    public ElencoFarmacieType createElencoFarmacieType() {
        return new ElencoFarmacieType();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link Farmacia }
     * 
     */
    public Farmacia createFarmacia() {
        return new Farmacia();
    }

    /**
     * Create an instance of {@link ElencoErroriType }
     * 
     */
    public ElencoErroriType createElencoErroriType() {
        return new ElencoErroriType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElencoFarmacieAbitualiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getelencofarmacieabituali.msg.interfacews.farmab.dma.csi.it/", name = "getElencoFarmacieAbituali")
    public JAXBElement<GetElencoFarmacieAbitualiRequest> createGetElencoFarmacieAbituali(GetElencoFarmacieAbitualiRequest value) {
        return new JAXBElement<GetElencoFarmacieAbitualiRequest>(_GetElencoFarmacieAbituali_QNAME, GetElencoFarmacieAbitualiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElencoFarmacieAbitualiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getelencofarmacieabituali.msg.interfacews.farmab.dma.csi.it/", name = "getElencoFarmacieAbitualiResponse")
    public JAXBElement<GetElencoFarmacieAbitualiResponse> createGetElencoFarmacieAbitualiResponse(GetElencoFarmacieAbitualiResponse value) {
        return new JAXBElement<GetElencoFarmacieAbitualiResponse>(_GetElencoFarmacieAbitualiResponse_QNAME, GetElencoFarmacieAbitualiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndirizzoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "indirizzoFarmacia", scope = Farmacia.class)
    public JAXBElement<IndirizzoType> createFarmaciaIndirizzoFarmacia(IndirizzoType value) {
        return new JAXBElement<IndirizzoType>(_FarmaciaIndirizzoFarmacia_QNAME, IndirizzoType.class, Farmacia.class, value);
    }

}
