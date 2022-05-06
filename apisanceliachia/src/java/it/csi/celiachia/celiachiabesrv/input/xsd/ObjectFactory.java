/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.input.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.celiachia.celiachiabesrv.input.xsd package. 
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

    private final static QName _VerificaErogazioniFarmacieRichiedente_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "richiedente");
    private final static QName _UsaPinDaQRCodeCitId_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "citId");
    private final static QName _UsaPinDaQRCodeQrCode_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "qrCode");
    private final static QName _BoRigeneraPinEmail_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "email");
    private final static QName _BoRigeneraPinTelefono_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "telefono");
    private final static QName _RicercaErogazioniAssistitoDataFine_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "dataFine");
    private final static QName _RicercaErogazioniAssistitoDataInizio_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "dataInizio");
    private final static QName _BasicInfoInputXForwardedFor_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "xForwardedFor");
    private final static QName _BasicInfoInputXRequestId_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "xRequestId");
    private final static QName _BasicInfoInputShibIdentitaCodiceFiscale_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "shibIdentitaCodiceFiscale");
    private final static QName _BasicInfoInputXCodiceServizio_QNAME = new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "xCodiceServizio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.celiachia.celiachiabesrv.input.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RigeneraPinRequest }
     * 
     */
    public RigeneraPinRequest createRigeneraPinRequest() {
        return new RigeneraPinRequest();
    }

    /**
     * Create an instance of {@link VerificaSaldoAssistito }
     * 
     */
    public VerificaSaldoAssistito createVerificaSaldoAssistito() {
        return new VerificaSaldoAssistito();
    }

    /**
     * Create an instance of {@link BoRigeneraPin }
     * 
     */
    public BoRigeneraPin createBoRigeneraPin() {
        return new BoRigeneraPin();
    }

    /**
     * Create an instance of {@link RicercaErogazioniAssistito }
     * 
     */
    public RicercaErogazioniAssistito createRicercaErogazioniAssistito() {
        return new RicercaErogazioniAssistito();
    }

    /**
     * Create an instance of {@link BasicInfoInput }
     * 
     */
    public BasicInfoInput createBasicInfoInput() {
        return new BasicInfoInput();
    }

    /**
     * Create an instance of {@link GetPinAssistito }
     * 
     */
    public GetPinAssistito createGetPinAssistito() {
        return new GetPinAssistito();
    }

    /**
     * Create an instance of {@link UsaPinDaQRCode }
     * 
     */
    public UsaPinDaQRCode createUsaPinDaQRCode() {
        return new UsaPinDaQRCode();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link VerificaErogazioniFarmacie }
     * 
     */
    public VerificaErogazioniFarmacie createVerificaErogazioniFarmacie() {
        return new VerificaErogazioniFarmacie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Richiedente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "richiedente", scope = VerificaErogazioniFarmacie.class)
    public JAXBElement<Richiedente> createVerificaErogazioniFarmacieRichiedente(Richiedente value) {
        return new JAXBElement<Richiedente>(_VerificaErogazioniFarmacieRichiedente_QNAME, Richiedente.class, VerificaErogazioniFarmacie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "citId", scope = UsaPinDaQRCode.class)
    public JAXBElement<String> createUsaPinDaQRCodeCitId(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeCitId_QNAME, String.class, UsaPinDaQRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "qrCode", scope = UsaPinDaQRCode.class)
    public JAXBElement<String> createUsaPinDaQRCodeQrCode(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeQrCode_QNAME, String.class, UsaPinDaQRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "citId", scope = VerificaSaldoAssistito.class)
    public JAXBElement<String> createVerificaSaldoAssistitoCitId(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeCitId_QNAME, String.class, VerificaSaldoAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "email", scope = BoRigeneraPin.class)
    public JAXBElement<String> createBoRigeneraPinEmail(String value) {
        return new JAXBElement<String>(_BoRigeneraPinEmail_QNAME, String.class, BoRigeneraPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "citId", scope = BoRigeneraPin.class)
    public JAXBElement<String> createBoRigeneraPinCitId(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeCitId_QNAME, String.class, BoRigeneraPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "telefono", scope = BoRigeneraPin.class)
    public JAXBElement<String> createBoRigeneraPinTelefono(String value) {
        return new JAXBElement<String>(_BoRigeneraPinTelefono_QNAME, String.class, BoRigeneraPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "dataFine", scope = RicercaErogazioniAssistito.class)
    public JAXBElement<XMLGregorianCalendar> createRicercaErogazioniAssistitoDataFine(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RicercaErogazioniAssistitoDataFine_QNAME, XMLGregorianCalendar.class, RicercaErogazioniAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "citId", scope = RicercaErogazioniAssistito.class)
    public JAXBElement<String> createRicercaErogazioniAssistitoCitId(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeCitId_QNAME, String.class, RicercaErogazioniAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "dataInizio", scope = RicercaErogazioniAssistito.class)
    public JAXBElement<XMLGregorianCalendar> createRicercaErogazioniAssistitoDataInizio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RicercaErogazioniAssistitoDataInizio_QNAME, XMLGregorianCalendar.class, RicercaErogazioniAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "citId", scope = GetPinAssistito.class)
    public JAXBElement<String> createGetPinAssistitoCitId(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeCitId_QNAME, String.class, GetPinAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "xForwardedFor", scope = BasicInfoInput.class)
    public JAXBElement<String> createBasicInfoInputXForwardedFor(String value) {
        return new JAXBElement<String>(_BasicInfoInputXForwardedFor_QNAME, String.class, BasicInfoInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "xRequestId", scope = BasicInfoInput.class)
    public JAXBElement<String> createBasicInfoInputXRequestId(String value) {
        return new JAXBElement<String>(_BasicInfoInputXRequestId_QNAME, String.class, BasicInfoInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "shibIdentitaCodiceFiscale", scope = BasicInfoInput.class)
    public JAXBElement<String> createBasicInfoInputShibIdentitaCodiceFiscale(String value) {
        return new JAXBElement<String>(_BasicInfoInputShibIdentitaCodiceFiscale_QNAME, String.class, BasicInfoInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "xCodiceServizio", scope = BasicInfoInput.class)
    public JAXBElement<String> createBasicInfoInputXCodiceServizio(String value) {
        return new JAXBElement<String>(_BasicInfoInputXCodiceServizio_QNAME, String.class, BasicInfoInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", name = "citId", scope = RigeneraPinRequest.class)
    public JAXBElement<String> createRigeneraPinRequestCitId(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeCitId_QNAME, String.class, RigeneraPinRequest.class, value);
    }

}
