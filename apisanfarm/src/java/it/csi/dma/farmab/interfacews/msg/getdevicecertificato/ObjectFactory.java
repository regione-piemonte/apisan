/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.getdevicecertificato;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma.farmab.interfacews.msg.getdevicecertificato package. 
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

    private final static QName _GetDeviceCertificatoResponse_QNAME = new QName("http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/", "getDeviceCertificatoResponse");
    private final static QName _GetDeviceCertificato_QNAME = new QName("http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/", "getDeviceCertificato");
    private final static QName _GetDeviceCertificatoRequest_QNAME = new QName("http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/", "getDeviceCertificatoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma.farmab.interfacews.msg.getdevicecertificato
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeviceCertificatoResponse }
     * 
     */
    public GetDeviceCertificatoResponse createGetDeviceCertificatoResponse() {
        return new GetDeviceCertificatoResponse();
    }

    /**
     * Create an instance of {@link GetDeviceCertificatoRequest }
     * 
     */
    public GetDeviceCertificatoRequest createGetDeviceCertificatoRequest() {
        return new GetDeviceCertificatoRequest();
    }

    /**
     * Create an instance of {@link Dispositivo }
     * 
     */
    public Dispositivo createDispositivo() {
        return new Dispositivo();
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
     * Create an instance of {@link CertificazioneType }
     * 
     */
    public CertificazioneType createCertificazioneType() {
        return new CertificazioneType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCertificatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/", name = "getDeviceCertificatoResponse")
    public JAXBElement<GetDeviceCertificatoResponse> createGetDeviceCertificatoResponse(GetDeviceCertificatoResponse value) {
        return new JAXBElement<GetDeviceCertificatoResponse>(_GetDeviceCertificatoResponse_QNAME, GetDeviceCertificatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCertificatoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/", name = "getDeviceCertificato")
    public JAXBElement<GetDeviceCertificatoRequest> createGetDeviceCertificato(GetDeviceCertificatoRequest value) {
        return new JAXBElement<GetDeviceCertificatoRequest>(_GetDeviceCertificato_QNAME, GetDeviceCertificatoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCertificatoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/", name = "getDeviceCertificatoRequest")
    public JAXBElement<GetDeviceCertificatoRequest> createGetDeviceCertificatoRequest(GetDeviceCertificatoRequest value) {
        return new JAXBElement<GetDeviceCertificatoRequest>(_GetDeviceCertificatoRequest_QNAME, GetDeviceCertificatoRequest.class, null, value);
    }

}
