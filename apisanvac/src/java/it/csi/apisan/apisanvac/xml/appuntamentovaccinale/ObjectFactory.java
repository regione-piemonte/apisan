/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentovaccinale;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.appuntamentovaccinale package. 
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

    private final static QName _AppuntamentoVaccinale_QNAME = new QName("", "AppuntamentoVaccinale");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.appuntamentovaccinale
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppuntamentoVaccinale }
     * 
     */
    public AppuntamentoVaccinale createAppuntamentoVaccinale() {
        return new AppuntamentoVaccinale();
    }

    /**
     * Create an instance of {@link DTOAppuntamentoStampa }
     * 
     */
    public DTOAppuntamentoStampa createDTOAppuntamentoStampa() {
        return new DTOAppuntamentoStampa();
    }

    /**
     * Create an instance of {@link ResultSetPost }
     * 
     */
    public ResultSetPost createResultSetPost() {
        return new ResultSetPost();
    }

    /**
     * Create an instance of {@link DTOPropostaDateSpostamento }
     * 
     */
    public DTOPropostaDateSpostamento createDTOPropostaDateSpostamento() {
        return new DTOPropostaDateSpostamento();
    }

    /**
     * Create an instance of {@link PropostaVariazione }
     * 
     */
    public PropostaVariazione createPropostaVariazione() {
        return new PropostaVariazione();
    }

    /**
     * Create an instance of {@link ArrayOfDTOAppuntamento }
     * 
     */
    public ArrayOfDTOAppuntamento createArrayOfDTOAppuntamento() {
        return new ArrayOfDTOAppuntamento();
    }

    /**
     * Create an instance of {@link DTOAppuntamento }
     * 
     */
    public DTOAppuntamento createDTOAppuntamento() {
        return new DTOAppuntamento();
    }

    /**
     * Create an instance of {@link DTOVaccino }
     * 
     */
    public DTOVaccino createDTOVaccino() {
        return new DTOVaccino();
    }

    /**
     * Create an instance of {@link DTOPropostaDiAppuntamento }
     * 
     */
    public DTOPropostaDiAppuntamento createDTOPropostaDiAppuntamento() {
        return new DTOPropostaDiAppuntamento();
    }

    /**
     * Create an instance of {@link ArrayOfDTOVaccino }
     * 
     */
    public ArrayOfDTOVaccino createArrayOfDTOVaccino() {
        return new ArrayOfDTOVaccino();
    }

    /**
     * Create an instance of {@link DTOPrenotazione }
     * 
     */
    public DTOPrenotazione createDTOPrenotazione() {
        return new DTOPrenotazione();
    }

    /**
     * Create an instance of {@link PropostaVaccinazione }
     * 
     */
    public PropostaVaccinazione createPropostaVaccinazione() {
        return new PropostaVaccinazione();
    }

    /**
     * Create an instance of {@link ArrayOfDTOPropostaDiAppuntamento }
     * 
     */
    public ArrayOfDTOPropostaDiAppuntamento createArrayOfDTOPropostaDiAppuntamento() {
        return new ArrayOfDTOPropostaDiAppuntamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppuntamentoVaccinale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppuntamentoVaccinale")
    public JAXBElement<AppuntamentoVaccinale> createAppuntamentoVaccinale(AppuntamentoVaccinale value) {
        return new JAXBElement<AppuntamentoVaccinale>(_AppuntamentoVaccinale_QNAME, AppuntamentoVaccinale.class, null, value);
    }

}
