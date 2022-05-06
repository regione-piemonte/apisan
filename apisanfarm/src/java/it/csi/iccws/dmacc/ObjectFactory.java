/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.iccws.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.iccws.dmacc package. 
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

    private final static QName _VerificaFarmacistaResponse_QNAME = new QName("http://dmacc.csi.it/", "verificaFarmacistaResponse");
    private final static QName _VerificaFarmacistaRequest_QNAME = new QName("http://dmacc.csi.it/", "verificaFarmacistaRequest");
    private final static QName _GetFarmacieAderentiResponse_QNAME = new QName("http://dmacc.csi.it/", "getFarmacieAderentiResponse");
    private final static QName _GetFarmacieAderentiRequest_QNAME = new QName("http://dmacc.csi.it/", "getFarmacieAderentiRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.iccws.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Errori }
     * 
     */
    public Errori createErrori() {
        return new Errori();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link Farmacia }
     * 
     */
    public Farmacia createFarmacia() {
        return new Farmacia();
    }

    /**
     * Create an instance of {@link DatiFarmacia }
     * 
     */
    public DatiFarmacia createDatiFarmacia() {
        return new DatiFarmacia();
    }

    /**
     * Create an instance of {@link Farmacie }
     * 
     */
    public Farmacie createFarmacie() {
        return new Farmacie();
    }

    /**
     * Create an instance of {@link VerificaFarmacistaRequest }
     * 
     */
    public VerificaFarmacistaRequest createVerificaFarmacistaRequest() {
        return new VerificaFarmacistaRequest();
    }

    /**
     * Create an instance of {@link GetFarmacieAderentiRequest }
     * 
     */
    public GetFarmacieAderentiRequest createGetFarmacieAderentiRequest() {
        return new GetFarmacieAderentiRequest();
    }

    /**
     * Create an instance of {@link VerificaFarmacistaResponse }
     * 
     */
    public VerificaFarmacistaResponse createVerificaFarmacistaResponse() {
        return new VerificaFarmacistaResponse();
    }

    /**
     * Create an instance of {@link GetFarmacieAderentiResponse }
     * 
     */
    public GetFarmacieAderentiResponse createGetFarmacieAderentiResponse() {
        return new GetFarmacieAderentiResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Indirizzo }
     * 
     */
    public Indirizzo createIndirizzo() {
        return new Indirizzo();
    }

    /**
     * Create an instance of {@link EnsMessagebody }
     * 
     */
    public EnsMessagebody createEnsMessagebody() {
        return new EnsMessagebody();
    }

    /**
     * Create an instance of {@link EnsResponse }
     * 
     */
    public EnsResponse createEnsResponse() {
        return new EnsResponse();
    }

    /**
     * Create an instance of {@link FarmaciaAderente }
     * 
     */
    public FarmaciaAderente createFarmaciaAderente() {
        return new FarmaciaAderente();
    }

    /**
     * Create an instance of {@link EnsRequest }
     * 
     */
    public EnsRequest createEnsRequest() {
        return new EnsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaFarmacistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaFarmacistaResponse")
    public JAXBElement<VerificaFarmacistaResponse> createVerificaFarmacistaResponse(VerificaFarmacistaResponse value) {
        return new JAXBElement<VerificaFarmacistaResponse>(_VerificaFarmacistaResponse_QNAME, VerificaFarmacistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaFarmacistaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaFarmacistaRequest")
    public JAXBElement<VerificaFarmacistaRequest> createVerificaFarmacistaRequest(VerificaFarmacistaRequest value) {
        return new JAXBElement<VerificaFarmacistaRequest>(_VerificaFarmacistaRequest_QNAME, VerificaFarmacistaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFarmacieAderentiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getFarmacieAderentiResponse")
    public JAXBElement<GetFarmacieAderentiResponse> createGetFarmacieAderentiResponse(GetFarmacieAderentiResponse value) {
        return new JAXBElement<GetFarmacieAderentiResponse>(_GetFarmacieAderentiResponse_QNAME, GetFarmacieAderentiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFarmacieAderentiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getFarmacieAderentiRequest")
    public JAXBElement<GetFarmacieAderentiRequest> createGetFarmacieAderentiRequest(GetFarmacieAderentiRequest value) {
        return new JAXBElement<GetFarmacieAderentiRequest>(_GetFarmacieAderentiRequest_QNAME, GetFarmacieAderentiRequest.class, null, value);
    }

}
