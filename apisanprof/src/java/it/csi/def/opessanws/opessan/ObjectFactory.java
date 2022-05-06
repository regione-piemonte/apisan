/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.def.opessanws.opessan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.def.opessanws.opessan package. 
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

    private final static QName _GetElencoStudi_QNAME = new QName("http://opessan.opessanws.def.csi.it/", "getElencoStudi");
    private final static QName _GetElencoStudiResponse_QNAME = new QName("http://opessan.opessanws.def.csi.it/", "getElencoStudiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.def.opessanws.opessan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FasceOrarie }
     * 
     */
    public FasceOrarie createFasceOrarie() {
        return new FasceOrarie();
    }

    /**
     * Create an instance of {@link GetElencoStudi }
     * 
     */
    public GetElencoStudi createGetElencoStudi() {
        return new GetElencoStudi();
    }

    /**
     * Create an instance of {@link GetElencoStudiResponse }
     * 
     */
    public GetElencoStudiResponse createGetElencoStudiResponse() {
        return new GetElencoStudiResponse();
    }

    /**
     * Create an instance of {@link ReqElencoStudiMedici }
     * 
     */
    public ReqElencoStudiMedici createReqElencoStudiMedici() {
        return new ReqElencoStudiMedici();
    }

    /**
     * Create an instance of {@link IdentificativoProfilo }
     * 
     */
    public IdentificativoProfilo createIdentificativoProfilo() {
        return new IdentificativoProfilo();
    }

    /**
     * Create an instance of {@link StudiMedici }
     * 
     */
    public StudiMedici createStudiMedici() {
        return new StudiMedici();
    }

    /**
     * Create an instance of {@link SoggettoOpessanBody }
     * 
     */
    public SoggettoOpessanBody createSoggettoOpessanBody() {
        return new SoggettoOpessanBody();
    }

    /**
     * Create an instance of {@link GiornoApertura }
     * 
     */
    public GiornoApertura createGiornoApertura() {
        return new GiornoApertura();
    }

    /**
     * Create an instance of {@link StudioMedico }
     * 
     */
    public StudioMedico createStudioMedico() {
        return new StudioMedico();
    }

    /**
     * Create an instance of {@link GiorniApertura }
     * 
     */
    public GiorniApertura createGiorniApertura() {
        return new GiorniApertura();
    }

    /**
     * Create an instance of {@link FasceOrarie.Orario }
     * 
     */
    public FasceOrarie.Orario createFasceOrarieOrario() {
        return new FasceOrarie.Orario();
    }

    /**
     * Create an instance of {@link GetElencoStudi.Arg0 }
     * 
     */
    public GetElencoStudi.Arg0 createGetElencoStudiArg0() {
        return new GetElencoStudi.Arg0();
    }

    /**
     * Create an instance of {@link GetElencoStudiResponse.Return }
     * 
     */
    public GetElencoStudiResponse.Return createGetElencoStudiResponseReturn() {
        return new GetElencoStudiResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElencoStudi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opessan.opessanws.def.csi.it/", name = "getElencoStudi")
    public JAXBElement<GetElencoStudi> createGetElencoStudi(GetElencoStudi value) {
        return new JAXBElement<GetElencoStudi>(_GetElencoStudi_QNAME, GetElencoStudi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElencoStudiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opessan.opessanws.def.csi.it/", name = "getElencoStudiResponse")
    public JAXBElement<GetElencoStudiResponse> createGetElencoStudiResponse(GetElencoStudiResponse value) {
        return new JAXBElement<GetElencoStudiResponse>(_GetElencoStudiResponse_QNAME, GetElencoStudiResponse.class, null, value);
    }

}
