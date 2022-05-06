/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.setdisassociadevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma.farmab.interfacews.msg.setdisassociadevice package. 
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

    private final static QName _SetDisassociaDevice_QNAME = new QName("http://setdisassociadevice.msg.interfacews.farmab.dma.csi.it/", "setDisassociaDevice");
    private final static QName _SetDisassociaDeviceResponse_QNAME = new QName("http://setdisassociadevice.msg.interfacews.farmab.dma.csi.it/", "setDisassociaDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma.farmab.interfacews.msg.setdisassociadevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetDisassociaDeviceRequest }
     * 
     */
    public SetDisassociaDeviceRequest createSetDisassociaDeviceRequest() {
        return new SetDisassociaDeviceRequest();
    }

    /**
     * Create an instance of {@link SetDisassociaDeviceResponse }
     * 
     */
    public SetDisassociaDeviceResponse createSetDisassociaDeviceResponse() {
        return new SetDisassociaDeviceResponse();
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
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link ElencoErroriType }
     * 
     */
    public ElencoErroriType createElencoErroriType() {
        return new ElencoErroriType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDisassociaDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://setdisassociadevice.msg.interfacews.farmab.dma.csi.it/", name = "setDisassociaDevice")
    public JAXBElement<SetDisassociaDeviceRequest> createSetDisassociaDevice(SetDisassociaDeviceRequest value) {
        return new JAXBElement<SetDisassociaDeviceRequest>(_SetDisassociaDevice_QNAME, SetDisassociaDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDisassociaDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://setdisassociadevice.msg.interfacews.farmab.dma.csi.it/", name = "setDisassociaDeviceResponse")
    public JAXBElement<SetDisassociaDeviceResponse> createSetDisassociaDeviceResponse(SetDisassociaDeviceResponse value) {
        return new JAXBElement<SetDisassociaDeviceResponse>(_SetDisassociaDeviceResponse_QNAME, SetDisassociaDeviceResponse.class, null, value);
    }

}
