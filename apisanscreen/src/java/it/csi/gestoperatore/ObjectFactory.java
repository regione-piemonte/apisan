/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.gestoperatore package. 
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

    private final static QName _CheckOperatoreResponse_QNAME = new QName("http://www.csi.it/gestOperatore/", "checkOperatoreResponse");
    private final static QName _GetMenuFunzionalitaOperatore_QNAME = new QName("http://www.csi.it/gestOperatore/", "getMenuFunzionalitaOperatore");
    private final static QName _GetMenuFunzionalitaOperatoreResponse_QNAME = new QName("http://www.csi.it/gestOperatore/", "getMenuFunzionalitaOperatoreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.gestoperatore
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RuoloType }
     * 
     */
    public RuoloType createRuoloType() {
        return new RuoloType();
    }

    /**
     * Create an instance of {@link LivelloScreeningType }
     * 
     */
    public LivelloScreeningType createLivelloScreeningType() {
        return new LivelloScreeningType();
    }

    /**
     * Create an instance of {@link GetAbilitScreenResponse }
     * 
     */
    public GetAbilitScreenResponse createGetAbilitScreenResponse() {
        return new GetAbilitScreenResponse();
    }

    /**
     * Create an instance of {@link ReturnCodeType }
     * 
     */
    public ReturnCodeType createReturnCodeType() {
        return new ReturnCodeType();
    }

    /**
     * Create an instance of {@link ListaAbilitazioniType }
     * 
     */
    public ListaAbilitazioniType createListaAbilitazioniType() {
        return new ListaAbilitazioniType();
    }

    /**
     * Create an instance of {@link GetUnitaOpSer }
     * 
     */
    public GetUnitaOpSer createGetUnitaOpSer() {
        return new GetUnitaOpSer();
    }

    /**
     * Create an instance of {@link GetRuoliResponse }
     * 
     */
    public GetRuoliResponse createGetRuoliResponse() {
        return new GetRuoliResponse();
    }

    /**
     * Create an instance of {@link ListaRuoliType }
     * 
     */
    public ListaRuoliType createListaRuoliType() {
        return new ListaRuoliType();
    }

    /**
     * Create an instance of {@link GetMenuFunzionalitaOperatore }
     * 
     */
    public GetMenuFunzionalitaOperatore createGetMenuFunzionalitaOperatore() {
        return new GetMenuFunzionalitaOperatore();
    }

    /**
     * Create an instance of {@link GetRuoli }
     * 
     */
    public GetRuoli createGetRuoli() {
        return new GetRuoli();
    }

    /**
     * Create an instance of {@link CodiceFiscaleType }
     * 
     */
    public CodiceFiscaleType createCodiceFiscaleType() {
        return new CodiceFiscaleType();
    }

    /**
     * Create an instance of {@link IsAliveResponse }
     * 
     */
    public IsAliveResponse createIsAliveResponse() {
        return new IsAliveResponse();
    }

    /**
     * Create an instance of {@link CheckOperatoreResponseType }
     * 
     */
    public CheckOperatoreResponseType createCheckOperatoreResponseType() {
        return new CheckOperatoreResponseType();
    }

    /**
     * Create an instance of {@link SearchOperatoriFault }
     * 
     */
    public SearchOperatoriFault createSearchOperatoriFault() {
        return new SearchOperatoriFault();
    }

    /**
     * Create an instance of {@link GetAllDataResponse }
     * 
     */
    public GetAllDataResponse createGetAllDataResponse() {
        return new GetAllDataResponse();
    }

    /**
     * Create an instance of {@link OperatoreType }
     * 
     */
    public OperatoreType createOperatoreType() {
        return new OperatoreType();
    }

    /**
     * Create an instance of {@link ListaFunzioniType }
     * 
     */
    public ListaFunzioniType createListaFunzioniType() {
        return new ListaFunzioniType();
    }

    /**
     * Create an instance of {@link ListaApplicazioniType }
     * 
     */
    public ListaApplicazioniType createListaApplicazioniType() {
        return new ListaApplicazioniType();
    }

    /**
     * Create an instance of {@link GetMenuFunzionalitaOperatoreFault }
     * 
     */
    public GetMenuFunzionalitaOperatoreFault createGetMenuFunzionalitaOperatoreFault() {
        return new GetMenuFunzionalitaOperatoreFault();
    }

    /**
     * Create an instance of {@link IsAlive }
     * 
     */
    public IsAlive createIsAlive() {
        return new IsAlive();
    }

    /**
     * Create an instance of {@link SearchOperatoriResponse }
     * 
     */
    public SearchOperatoriResponse createSearchOperatoriResponse() {
        return new SearchOperatoriResponse();
    }

    /**
     * Create an instance of {@link GetAllData }
     * 
     */
    public GetAllData createGetAllData() {
        return new GetAllData();
    }

    /**
     * Create an instance of {@link GetMenuFunzionalitaOperatoreResponse }
     * 
     */
    public GetMenuFunzionalitaOperatoreResponse createGetMenuFunzionalitaOperatoreResponse() {
        return new GetMenuFunzionalitaOperatoreResponse();
    }

    /**
     * Create an instance of {@link CheckOperatoreFault }
     * 
     */
    public CheckOperatoreFault createCheckOperatoreFault() {
        return new CheckOperatoreFault();
    }

    /**
     * Create an instance of {@link GetAbilitScreen }
     * 
     */
    public GetAbilitScreen createGetAbilitScreen() {
        return new GetAbilitScreen();
    }

    /**
     * Create an instance of {@link ListaAbilitazioniPipeType }
     * 
     */
    public ListaAbilitazioniPipeType createListaAbilitazioniPipeType() {
        return new ListaAbilitazioniPipeType();
    }

    /**
     * Create an instance of {@link GetAbilitScreenFault }
     * 
     */
    public GetAbilitScreenFault createGetAbilitScreenFault() {
        return new GetAbilitScreenFault();
    }

    /**
     * Create an instance of {@link GetUnitaOpSerFault }
     * 
     */
    public GetUnitaOpSerFault createGetUnitaOpSerFault() {
        return new GetUnitaOpSerFault();
    }

    /**
     * Create an instance of {@link GetAllDataFault }
     * 
     */
    public GetAllDataFault createGetAllDataFault() {
        return new GetAllDataFault();
    }

    /**
     * Create an instance of {@link GetUnitaOpSerResponse }
     * 
     */
    public GetUnitaOpSerResponse createGetUnitaOpSerResponse() {
        return new GetUnitaOpSerResponse();
    }

    /**
     * Create an instance of {@link UnitaOperativaOperatoreType }
     * 
     */
    public UnitaOperativaOperatoreType createUnitaOperativaOperatoreType() {
        return new UnitaOperativaOperatoreType();
    }

    /**
     * Create an instance of {@link GetRuoliFault }
     * 
     */
    public GetRuoliFault createGetRuoliFault() {
        return new GetRuoliFault();
    }

    /**
     * Create an instance of {@link SearchOperatori }
     * 
     */
    public SearchOperatori createSearchOperatori() {
        return new SearchOperatori();
    }

    /**
     * Create an instance of {@link FiltroRicercaOperatoreType }
     * 
     */
    public FiltroRicercaOperatoreType createFiltroRicercaOperatoreType() {
        return new FiltroRicercaOperatoreType();
    }

    /**
     * Create an instance of {@link CheckOperatore }
     * 
     */
    public CheckOperatore createCheckOperatore() {
        return new CheckOperatore();
    }

    /**
     * Create an instance of {@link FunzioneApplicazioneType }
     * 
     */
    public FunzioneApplicazioneType createFunzioneApplicazioneType() {
        return new FunzioneApplicazioneType();
    }

    /**
     * Create an instance of {@link FunzioneType }
     * 
     */
    public FunzioneType createFunzioneType() {
        return new FunzioneType();
    }

    /**
     * Create an instance of {@link TipoScreeningType }
     * 
     */
    public TipoScreeningType createTipoScreeningType() {
        return new TipoScreeningType();
    }

    /**
     * Create an instance of {@link FunzionalitScreeningType }
     * 
     */
    public FunzionalitScreeningType createFunzionalitScreeningType() {
        return new FunzionalitScreeningType();
    }

    /**
     * Create an instance of {@link AbilitazioneType }
     * 
     */
    public AbilitazioneType createAbilitazioneType() {
        return new AbilitazioneType();
    }

    /**
     * Create an instance of {@link ApplicazioneType }
     * 
     */
    public ApplicazioneType createApplicazioneType() {
        return new ApplicazioneType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOperatoreResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/gestOperatore/", name = "checkOperatoreResponse")
    public JAXBElement<CheckOperatoreResponseType> createCheckOperatoreResponse(CheckOperatoreResponseType value) {
        return new JAXBElement<CheckOperatoreResponseType>(_CheckOperatoreResponse_QNAME, CheckOperatoreResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuFunzionalitaOperatore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/gestOperatore/", name = "getMenuFunzionalitaOperatore")
    public JAXBElement<GetMenuFunzionalitaOperatore> createGetMenuFunzionalitaOperatore(GetMenuFunzionalitaOperatore value) {
        return new JAXBElement<GetMenuFunzionalitaOperatore>(_GetMenuFunzionalitaOperatore_QNAME, GetMenuFunzionalitaOperatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuFunzionalitaOperatoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/gestOperatore/", name = "getMenuFunzionalitaOperatoreResponse")
    public JAXBElement<GetMenuFunzionalitaOperatoreResponse> createGetMenuFunzionalitaOperatoreResponse(GetMenuFunzionalitaOperatoreResponse value) {
        return new JAXBElement<GetMenuFunzionalitaOperatoreResponse>(_GetMenuFunzionalitaOperatoreResponse_QNAME, GetMenuFunzionalitaOperatoreResponse.class, null, value);
    }

}
