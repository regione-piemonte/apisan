/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.celiachia.celiachiabesrv.input.xsd.RigeneraPinRequest;
import it.csi.celiachia.celiachiabesrv.output.xsd.RigeneraPinResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.celiachia.celiachiabesrv.business package. 
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

    private final static QName _UsaPinDaQRCodeResponseReturn_QNAME = new QName("http://business.celiachiabesrv.celiachia.csi.it", "return");
    private final static QName _RicercaErogazioniAssistitoInput_QNAME = new QName("http://business.celiachiabesrv.celiachia.csi.it", "input");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.celiachia.celiachiabesrv.business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.BoRigeneraPin }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.BoRigeneraPin createBoRigeneraPin() {
        return new it.csi.celiachia.celiachiabesrv.business.BoRigeneraPin();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacieResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacieResponse createVerificaErogazioniFarmacieResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacieResponse();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.BoRigeneraPinResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.BoRigeneraPinResponse createBoRigeneraPinResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.BoRigeneraPinResponse();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistito }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistito createRicercaErogazioniAssistito() {
        return new it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistito();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacie }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacie createVerificaErogazioniFarmacie() {
        return new it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacie();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCode }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCode createUsaPinDaQRCode() {
        return new it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCode();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.GetPinAssistito }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.GetPinAssistito createGetPinAssistito() {
        return new it.csi.celiachia.celiachiabesrv.business.GetPinAssistito();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistitoResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistitoResponse createRicercaErogazioniAssistitoResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistitoResponse();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.GetPinAssistitoResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.GetPinAssistitoResponse createGetPinAssistitoResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.GetPinAssistitoResponse();
    }

    /**
     * Create an instance of {@link RigeneraPinAssistitoResponse }
     * 
     */
    public RigeneraPinAssistitoResponse createRigeneraPinAssistitoResponse() {
        return new RigeneraPinAssistitoResponse();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCodeResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCodeResponse createUsaPinDaQRCodeResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCodeResponse();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistito }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistito createVerificaSaldoAssistito() {
        return new it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistito();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistitoResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistitoResponse createVerificaSaldoAssistitoResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistitoResponse();
    }

    /**
     * Create an instance of {@link RigeneraPinAssistito }
     * 
     */
    public RigeneraPinAssistito createRigeneraPinAssistito() {
        return new RigeneraPinAssistito();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.UsaPinDaQRCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCodeResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.UsaPinDaQRCodeResponse> createUsaPinDaQRCodeResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.UsaPinDaQRCodeResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.UsaPinDaQRCodeResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.UsaPinDaQRCodeResponse.class, it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RigeneraPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = RigeneraPinAssistitoResponse.class)
    public JAXBElement<RigeneraPinResponse> createRigeneraPinAssistitoResponseReturn(RigeneraPinResponse value) {
        return new JAXBElement<RigeneraPinResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, RigeneraPinResponse.class, RigeneraPinAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.GetPinAssistitoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.GetPinAssistitoResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.GetPinAssistitoResponse> createGetPinAssistitoResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.GetPinAssistitoResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.GetPinAssistitoResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.GetPinAssistitoResponse.class, it.csi.celiachia.celiachiabesrv.business.GetPinAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistito.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito> createRicercaErogazioniAssistitoInput(it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito>(_RicercaErogazioniAssistitoInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito.class, it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.BoRigeneraPin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.BoRigeneraPin.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.BoRigeneraPin> createBoRigeneraPinInput(it.csi.celiachia.celiachiabesrv.input.xsd.BoRigeneraPin value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.BoRigeneraPin>(_RicercaErogazioniAssistitoInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.BoRigeneraPin.class, it.csi.celiachia.celiachiabesrv.business.BoRigeneraPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.BoRigeneraPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.BoRigeneraPinResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.BoRigeneraPinResponse> createBoRigeneraPinResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.BoRigeneraPinResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.BoRigeneraPinResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.BoRigeneraPinResponse.class, it.csi.celiachia.celiachiabesrv.business.BoRigeneraPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.UsaPinDaQRCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCode.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.UsaPinDaQRCode> createUsaPinDaQRCodeInput(it.csi.celiachia.celiachiabesrv.input.xsd.UsaPinDaQRCode value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.UsaPinDaQRCode>(_RicercaErogazioniAssistitoInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.UsaPinDaQRCode.class, it.csi.celiachia.celiachiabesrv.business.UsaPinDaQRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistitoResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse> createVerificaSaldoAssistitoResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse.class, it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacie.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie> createVerificaErogazioniFarmacieInput(it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie>(_RicercaErogazioniAssistitoInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie.class, it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RigeneraPinRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = RigeneraPinAssistito.class)
    public JAXBElement<RigeneraPinRequest> createRigeneraPinAssistitoInput(RigeneraPinRequest value) {
        return new JAXBElement<RigeneraPinRequest>(_RicercaErogazioniAssistitoInput_QNAME, RigeneraPinRequest.class, RigeneraPinAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.VerificaSaldoAssistito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistito.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaSaldoAssistito> createVerificaSaldoAssistitoInput(it.csi.celiachia.celiachiabesrv.input.xsd.VerificaSaldoAssistito value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaSaldoAssistito>(_RicercaErogazioniAssistitoInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.VerificaSaldoAssistito.class, it.csi.celiachia.celiachiabesrv.business.VerificaSaldoAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacieResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse> createVerificaErogazioniFarmacieResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse.class, it.csi.celiachia.celiachiabesrv.business.VerificaErogazioniFarmacieResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.RicercaErogazioniAssistitoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistitoResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.RicercaErogazioniAssistitoResponse> createRicercaErogazioniAssistitoResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.RicercaErogazioniAssistitoResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.RicercaErogazioniAssistitoResponse>(_UsaPinDaQRCodeResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.RicercaErogazioniAssistitoResponse.class, it.csi.celiachia.celiachiabesrv.business.RicercaErogazioniAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.GetPinAssistito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.GetPinAssistito.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.GetPinAssistito> createGetPinAssistitoInput(it.csi.celiachia.celiachiabesrv.input.xsd.GetPinAssistito value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.GetPinAssistito>(_RicercaErogazioniAssistitoInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.GetPinAssistito.class, it.csi.celiachia.celiachiabesrv.business.GetPinAssistito.class, value);
    }

}
