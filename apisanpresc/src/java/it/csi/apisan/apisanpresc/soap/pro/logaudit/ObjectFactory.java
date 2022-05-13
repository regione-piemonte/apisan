/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanpresc.soap.pro.logaudit package. 
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

    private final static QName _Errori_QNAME = new QName("http://dma.csi.it/", "errori");
    private final static QName _LogAuditRequest_QNAME = new QName("http://dmapro.csi.it/", "logAuditRequest");
    private final static QName _Esito_QNAME = new QName("http://dma.csi.it/", "esito");
    private final static QName _LogAuditResponse_QNAME = new QName("http://dmapro.csi.it/", "logAuditResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanpresc.soap.pro.logaudit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link UtenteRichiedente }
     * 
     */
    public UtenteRichiedente createUtenteRichiedente() {
        return new UtenteRichiedente();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link SistemaRichiedente }
     * 
     */
    public SistemaRichiedente createSistemaRichiedente() {
        return new SistemaRichiedente();
    }

    /**
     * Create an instance of {@link LogAuditRequest }
     * 
     */
    public LogAuditRequest createLogAuditRequest() {
        return new LogAuditRequest();
    }

    /**
     * Create an instance of {@link LogAuditResponse }
     * 
     */
    public LogAuditResponse createLogAuditResponse() {
        return new LogAuditResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "errori")
    public JAXBElement<Errore> createErrori(Errore value) {
        return new JAXBElement<Errore>(_Errori_QNAME, Errore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogAuditRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmapro.csi.it/", name = "logAuditRequest")
    public JAXBElement<LogAuditRequest> createLogAuditRequest(LogAuditRequest value) {
        return new JAXBElement<LogAuditRequest>(_LogAuditRequest_QNAME, LogAuditRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "esito")
    public JAXBElement<String> createEsito(String value) {
        return new JAXBElement<String>(_Esito_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogAuditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmapro.csi.it/", name = "logAuditResponse")
    public JAXBElement<LogAuditResponse> createLogAuditResponse(LogAuditResponse value) {
        return new JAXBElement<LogAuditResponse>(_LogAuditResponse_QNAME, LogAuditResponse.class, null, value);
    }

}
