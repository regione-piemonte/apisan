/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.AlimentazioneElencoCodiciFiscali;
import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.AlimentazioneElencoCodiciFiscaliResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dmacc package. 
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

    private final static QName _NotificaOscuramentoNRERequest_QNAME = new QName("http://dmacc.csi.it/", "NotificaOscuramentoNRERequest");
    private final static QName _AlimentazioneElencoCodiciFiscaliResponse_QNAME = new QName("http://dmacc.csi.it/", "AlimentazioneElencoCodiciFiscaliResponse");
    private final static QName _NotificaDocumentoNonScaricabileResponse_QNAME = new QName("http://dmacc.csi.it/", "NotificaDocumentoNonScaricabileResponse");
    private final static QName _AlimentazioneElencoCodiciFiscaliRequest_QNAME = new QName("http://dmacc.csi.it/", "AlimentazioneElencoCodiciFiscaliRequest");
    private final static QName _NotificaOscuramentoNREResponse_QNAME = new QName("http://dmacc.csi.it/", "NotificaOscuramentoNREResponse");
    private final static QName _NotificaDocumentoNonScaricabileRequest_QNAME = new QName("http://dmacc.csi.it/", "NotificaDocumentoNonScaricabileRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificaOscuramentoNREResponse }
     * 
     */
    public NotificaOscuramentoNREResponse createNotificaOscuramentoNREResponse() {
        return new NotificaOscuramentoNREResponse();
    }

    /**
     * Create an instance of {@link NotificaDocumentoNonScaricabileRequest }
     * 
     */
    public NotificaDocumentoNonScaricabileRequest createNotificaDocumentoNonScaricabileRequest() {
        return new NotificaDocumentoNonScaricabileRequest();
    }

    /**
     * Create an instance of {@link NotificaDocumentoNonScaricabileResponse }
     * 
     */
    public NotificaDocumentoNonScaricabileResponse createNotificaDocumentoNonScaricabileResponse() {
        return new NotificaDocumentoNonScaricabileResponse();
    }

    /**
     * Create an instance of {@link NotificaOscuramentoNRERequest }
     * 
     */
    public NotificaOscuramentoNRERequest createNotificaOscuramentoNRERequest() {
        return new NotificaOscuramentoNRERequest();
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
     * Create an instance of {@link ApplicazioneRichiedente }
     * 
     */
    public ApplicazioneRichiedente createApplicazioneRichiedente() {
        return new ApplicazioneRichiedente();
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
     * Create an instance of {@link ApplicativoVerticale }
     * 
     */
    public ApplicativoVerticale createApplicativoVerticale() {
        return new ApplicativoVerticale();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link EnsRequest }
     * 
     */
    public EnsRequest createEnsRequest() {
        return new EnsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaOscuramentoNRERequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "NotificaOscuramentoNRERequest")
    public JAXBElement<NotificaOscuramentoNRERequest> createNotificaOscuramentoNRERequest(NotificaOscuramentoNRERequest value) {
        return new JAXBElement<NotificaOscuramentoNRERequest>(_NotificaOscuramentoNRERequest_QNAME, NotificaOscuramentoNRERequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlimentazioneElencoCodiciFiscaliResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "AlimentazioneElencoCodiciFiscaliResponse")
    public JAXBElement<AlimentazioneElencoCodiciFiscaliResponse> createAlimentazioneElencoCodiciFiscaliResponse(AlimentazioneElencoCodiciFiscaliResponse value) {
        return new JAXBElement<AlimentazioneElencoCodiciFiscaliResponse>(_AlimentazioneElencoCodiciFiscaliResponse_QNAME, AlimentazioneElencoCodiciFiscaliResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaDocumentoNonScaricabileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "NotificaDocumentoNonScaricabileResponse")
    public JAXBElement<NotificaDocumentoNonScaricabileResponse> createNotificaDocumentoNonScaricabileResponse(NotificaDocumentoNonScaricabileResponse value) {
        return new JAXBElement<NotificaDocumentoNonScaricabileResponse>(_NotificaDocumentoNonScaricabileResponse_QNAME, NotificaDocumentoNonScaricabileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlimentazioneElencoCodiciFiscali }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "AlimentazioneElencoCodiciFiscaliRequest")
    public JAXBElement<AlimentazioneElencoCodiciFiscali> createAlimentazioneElencoCodiciFiscaliRequest(AlimentazioneElencoCodiciFiscali value) {
        return new JAXBElement<AlimentazioneElencoCodiciFiscali>(_AlimentazioneElencoCodiciFiscaliRequest_QNAME, AlimentazioneElencoCodiciFiscali.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaOscuramentoNREResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "NotificaOscuramentoNREResponse")
    public JAXBElement<NotificaOscuramentoNREResponse> createNotificaOscuramentoNREResponse(NotificaOscuramentoNREResponse value) {
        return new JAXBElement<NotificaOscuramentoNREResponse>(_NotificaOscuramentoNREResponse_QNAME, NotificaOscuramentoNREResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaDocumentoNonScaricabileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "NotificaDocumentoNonScaricabileRequest")
    public JAXBElement<NotificaDocumentoNonScaricabileRequest> createNotificaDocumentoNonScaricabileRequest(NotificaDocumentoNonScaricabileRequest value) {
        return new JAXBElement<NotificaDocumentoNonScaricabileRequest>(_NotificaDocumentoNonScaricabileRequest_QNAME, NotificaDocumentoNonScaricabileRequest.class, null, value);
    }

}
