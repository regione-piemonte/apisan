/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.business.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.celiachia.celiachiabesrv.input.xsd.ElencoErogRequest;
import it.csi.celiachia.celiachiabesrv.input.xsd.PinGocRequest;
import it.csi.celiachia.celiachiabesrv.input.xsd.RigeneraPinRequest;
import it.csi.celiachia.celiachiabesrv.input.xsd.SaldoBuonoRequest;
import it.csi.celiachia.celiachiabesrv.input.xsd.UsaPinRequest;
import it.csi.celiachia.celiachiabesrv.output.xsd.ElencoErogResponse;
import it.csi.celiachia.celiachiabesrv.output.xsd.PinGocResponse;
import it.csi.celiachia.celiachiabesrv.output.xsd.RigeneraPinResponse;
import it.csi.celiachia.celiachiabesrv.output.xsd.SaldoBuonoResponse;
import it.csi.celiachia.celiachiabesrv.output.xsd.UsaPinResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.celiachia.celiachiabesrv.business.endpoint package. 
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

    private final static QName _UsaPinDaQRCodeGOCResponseReturn_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "return");
    private final static QName _RicercaErogazioniAssistitoElencoErogInput_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "elencoErogInput");
    private final static QName _GetPinAssistitoPinGocInput_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "pinGocInput");
    private final static QName _VerificaErogazioniFarmacieInput_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "input");
    private final static QName _VerificaSaldoAssistitoSaldoBuonoInput_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "saldoBuonoInput");
    private final static QName _UsaPinDaQRCodeGOCUsaPinInput_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "usaPinInput");
    private final static QName _RigeneraPinAssistitoRigeneraPinInput_QNAME = new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it", "rigeneraPinInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.celiachia.celiachiabesrv.business.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacieResponse }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacieResponse createVerificaErogazioniFarmacieResponse() {
        return new it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacieResponse();
    }

    /**
     * Create an instance of {@link RicercaErogazioniAssistito }
     * 
     */
    public RicercaErogazioniAssistito createRicercaErogazioniAssistito() {
        return new RicercaErogazioniAssistito();
    }

    /**
     * Create an instance of {@link BCKRIGPinGOC }
     * 
     */
    public BCKRIGPinGOC createBCKRIGPinGOC() {
        return new BCKRIGPinGOC();
    }

    /**
     * Create an instance of {@link it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacie }
     * 
     */
    public it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacie createVerificaErogazioniFarmacie() {
        return new it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacie();
    }

    /**
     * Create an instance of {@link UsaPinDaQRCodeGOCResponse }
     * 
     */
    public UsaPinDaQRCodeGOCResponse createUsaPinDaQRCodeGOCResponse() {
        return new UsaPinDaQRCodeGOCResponse();
    }

    /**
     * Create an instance of {@link GetPinAssistito }
     * 
     */
    public GetPinAssistito createGetPinAssistito() {
        return new GetPinAssistito();
    }

    /**
     * Create an instance of {@link RicercaErogazioniAssistitoResponse }
     * 
     */
    public RicercaErogazioniAssistitoResponse createRicercaErogazioniAssistitoResponse() {
        return new RicercaErogazioniAssistitoResponse();
    }

    /**
     * Create an instance of {@link BCKRIGPinGOCResponse }
     * 
     */
    public BCKRIGPinGOCResponse createBCKRIGPinGOCResponse() {
        return new BCKRIGPinGOCResponse();
    }

    /**
     * Create an instance of {@link GetPinAssistitoResponse }
     * 
     */
    public GetPinAssistitoResponse createGetPinAssistitoResponse() {
        return new GetPinAssistitoResponse();
    }

    /**
     * Create an instance of {@link RigeneraPinAssistitoResponse }
     * 
     */
    public RigeneraPinAssistitoResponse createRigeneraPinAssistitoResponse() {
        return new RigeneraPinAssistitoResponse();
    }

    /**
     * Create an instance of {@link VerificaSaldoAssistito }
     * 
     */
    public VerificaSaldoAssistito createVerificaSaldoAssistito() {
        return new VerificaSaldoAssistito();
    }

    /**
     * Create an instance of {@link UsaPinDaQRCodeGOC }
     * 
     */
    public UsaPinDaQRCodeGOC createUsaPinDaQRCodeGOC() {
        return new UsaPinDaQRCodeGOC();
    }

    /**
     * Create an instance of {@link VerificaSaldoAssistitoResponse }
     * 
     */
    public VerificaSaldoAssistitoResponse createVerificaSaldoAssistitoResponse() {
        return new VerificaSaldoAssistitoResponse();
    }

    /**
     * Create an instance of {@link RigeneraPinAssistito }
     * 
     */
    public RigeneraPinAssistito createRigeneraPinAssistito() {
        return new RigeneraPinAssistito();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsaPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = UsaPinDaQRCodeGOCResponse.class)
    public JAXBElement<UsaPinResponse> createUsaPinDaQRCodeGOCResponseReturn(UsaPinResponse value) {
        return new JAXBElement<UsaPinResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, UsaPinResponse.class, UsaPinDaQRCodeGOCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoErogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "elencoErogInput", scope = RicercaErogazioniAssistito.class)
    public JAXBElement<ElencoErogRequest> createRicercaErogazioniAssistitoElencoErogInput(ElencoErogRequest value) {
        return new JAXBElement<ElencoErogRequest>(_RicercaErogazioniAssistitoElencoErogInput_QNAME, ElencoErogRequest.class, RicercaErogazioniAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoErogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = RicercaErogazioniAssistitoResponse.class)
    public JAXBElement<ElencoErogResponse> createRicercaErogazioniAssistitoResponseReturn(ElencoErogResponse value) {
        return new JAXBElement<ElencoErogResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, ElencoErogResponse.class, RicercaErogazioniAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinGocRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "pinGocInput", scope = GetPinAssistito.class)
    public JAXBElement<PinGocRequest> createGetPinAssistitoPinGocInput(PinGocRequest value) {
        return new JAXBElement<PinGocRequest>(_GetPinAssistitoPinGocInput_QNAME, PinGocRequest.class, GetPinAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RigeneraPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = BCKRIGPinGOCResponse.class)
    public JAXBElement<RigeneraPinResponse> createBCKRIGPinGOCResponseReturn(RigeneraPinResponse value) {
        return new JAXBElement<RigeneraPinResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, RigeneraPinResponse.class, BCKRIGPinGOCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacieResponse.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse> createVerificaErogazioniFarmacieResponseReturn(it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse.class, it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacieResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinGocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = GetPinAssistitoResponse.class)
    public JAXBElement<PinGocResponse> createGetPinAssistitoResponseReturn(PinGocResponse value) {
        return new JAXBElement<PinGocResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, PinGocResponse.class, GetPinAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "input", scope = it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacie.class)
    public JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie> createVerificaErogazioniFarmacieInput(it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie value) {
        return new JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie>(_VerificaErogazioniFarmacieInput_QNAME, it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie.class, it.csi.celiachia.celiachiabesrv.business.endpoint.VerificaErogazioniFarmacie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoBuonoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "saldoBuonoInput", scope = VerificaSaldoAssistito.class)
    public JAXBElement<SaldoBuonoRequest> createVerificaSaldoAssistitoSaldoBuonoInput(SaldoBuonoRequest value) {
        return new JAXBElement<SaldoBuonoRequest>(_VerificaSaldoAssistitoSaldoBuonoInput_QNAME, SaldoBuonoRequest.class, VerificaSaldoAssistito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsaPinRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "usaPinInput", scope = UsaPinDaQRCodeGOC.class)
    public JAXBElement<UsaPinRequest> createUsaPinDaQRCodeGOCUsaPinInput(UsaPinRequest value) {
        return new JAXBElement<UsaPinRequest>(_UsaPinDaQRCodeGOCUsaPinInput_QNAME, UsaPinRequest.class, UsaPinDaQRCodeGOC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RigeneraPinRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "saldoBuonoInput", scope = BCKRIGPinGOC.class)
    public JAXBElement<RigeneraPinRequest> createBCKRIGPinGOCSaldoBuonoInput(RigeneraPinRequest value) {
        return new JAXBElement<RigeneraPinRequest>(_VerificaSaldoAssistitoSaldoBuonoInput_QNAME, RigeneraPinRequest.class, BCKRIGPinGOC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RigeneraPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = RigeneraPinAssistitoResponse.class)
    public JAXBElement<RigeneraPinResponse> createRigeneraPinAssistitoResponseReturn(RigeneraPinResponse value) {
        return new JAXBElement<RigeneraPinResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, RigeneraPinResponse.class, RigeneraPinAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoBuonoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "return", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<SaldoBuonoResponse> createVerificaSaldoAssistitoResponseReturn(SaldoBuonoResponse value) {
        return new JAXBElement<SaldoBuonoResponse>(_UsaPinDaQRCodeGOCResponseReturn_QNAME, SaldoBuonoResponse.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RigeneraPinRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", name = "rigeneraPinInput", scope = RigeneraPinAssistito.class)
    public JAXBElement<RigeneraPinRequest> createRigeneraPinAssistitoRigeneraPinInput(RigeneraPinRequest value) {
        return new JAXBElement<RigeneraPinRequest>(_RigeneraPinAssistitoRigeneraPinInput_QNAME, RigeneraPinRequest.class, RigeneraPinAssistito.class, value);
    }

}
