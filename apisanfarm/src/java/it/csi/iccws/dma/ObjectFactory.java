/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.iccws.dma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.iccws.dmacc.DatiFarmacia;
import it.csi.iccws.dmacc.Errori;
import it.csi.iccws.dmacc.Farmacia;
import it.csi.iccws.dmacc.Farmacie;
import it.csi.iccws.dmacc.Richiedente;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.iccws.dma package. 
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

    private final static QName _CodiceFiscaleFarmacista_QNAME = new QName("http://dma.csi.it/", "codiceFiscaleFarmacista");
    private final static QName _Richiedente_QNAME = new QName("http://dma.csi.it/", "richiedente");
    private final static QName _Codifiche_QNAME = new QName("http://dma.csi.it/", "codifiche");
    private final static QName _Errore_QNAME = new QName("http://dma.csi.it/", "errore");
    private final static QName _DatiFarmacia_QNAME = new QName("http://dma.csi.it/", "datiFarmacia");
    private final static QName _Errori_QNAME = new QName("http://dma.csi.it/", "errori");
    private final static QName _Farmacie_QNAME = new QName("http://dma.csi.it/", "farmacie");
    private final static QName _Farmacia_QNAME = new QName("http://dma.csi.it/", "farmacia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.iccws.dma
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
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codiceFiscaleFarmacista")
    public JAXBElement<String> createCodiceFiscaleFarmacista(String value) {
        return new JAXBElement<String>(_CodiceFiscaleFarmacista_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Richiedente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "richiedente")
    public JAXBElement<Richiedente> createRichiedente(Richiedente value) {
        return new JAXBElement<Richiedente>(_Richiedente_QNAME, Richiedente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codifica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codifiche")
    public JAXBElement<Codifica> createCodifiche(Codifica value) {
        return new JAXBElement<Codifica>(_Codifiche_QNAME, Codifica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "errore")
    public JAXBElement<Errore> createErrore(Errore value) {
        return new JAXBElement<Errore>(_Errore_QNAME, Errore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiFarmacia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "datiFarmacia")
    public JAXBElement<DatiFarmacia> createDatiFarmacia(DatiFarmacia value) {
        return new JAXBElement<DatiFarmacia>(_DatiFarmacia_QNAME, DatiFarmacia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errori }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "errori")
    public JAXBElement<Errori> createErrori(Errori value) {
        return new JAXBElement<Errori>(_Errori_QNAME, Errori.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Farmacie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "farmacie")
    public JAXBElement<Farmacie> createFarmacie(Farmacie value) {
        return new JAXBElement<Farmacie>(_Farmacie_QNAME, Farmacie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Farmacia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "farmacia")
    public JAXBElement<Farmacia> createFarmacia(Farmacia value) {
        return new JAXBElement<Farmacia>(_Farmacia_QNAME, Farmacia.class, null, value);
    }

}
