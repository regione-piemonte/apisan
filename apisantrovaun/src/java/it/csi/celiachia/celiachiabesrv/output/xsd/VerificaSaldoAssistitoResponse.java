/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per VerificaSaldoAssistitoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaSaldoAssistitoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://output.celiachiabesrv.celiachia.csi.it/xsd}BasicEsitoOutput">
 *       &lt;sequence>
 *         &lt;element name="autorizzazione" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Autorizzazione" minOccurs="0"/>
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Errore" minOccurs="0"/>
 *         &lt;element name="importoDisponibile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoTotale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaSaldoAssistitoResponse", propOrder = {
    "autorizzazione",
    "dataFine",
    "dataInizio",
    "errore",
    "importoDisponibile",
    "importoTotale"
})
public class VerificaSaldoAssistitoResponse
    extends BasicEsitoOutput
{

    @XmlElementRef(name = "autorizzazione", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Autorizzazione> autorizzazione;
    @XmlElementRef(name = "dataFine", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataFine;
    @XmlElementRef(name = "dataInizio", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataInizio;
    @XmlElementRef(name = "errore", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Errore> errore;
    @XmlElementRef(name = "importoDisponibile", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importoDisponibile;
    @XmlElementRef(name = "importoTotale", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importoTotale;

    /**
     * Recupera il valore della proprieta autorizzazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Autorizzazione }{@code >}
     *     
     */
    public JAXBElement<Autorizzazione> getAutorizzazione() {
        return autorizzazione;
    }

    /**
     * Imposta il valore della proprieta autorizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Autorizzazione }{@code >}
     *     
     */
    public void setAutorizzazione(JAXBElement<Autorizzazione> value) {
        this.autorizzazione = value;
    }

    /**
     * Recupera il valore della proprieta dataFine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprieta dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataFine(JAXBElement<XMLGregorianCalendar> value) {
        this.dataFine = value;
    }

    /**
     * Recupera il valore della proprieta dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprieta dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataInizio(JAXBElement<XMLGregorianCalendar> value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public JAXBElement<Errore> getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public void setErrore(JAXBElement<Errore> value) {
        this.errore = value;
    }

    /**
     * Recupera il valore della proprieta importoDisponibile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportoDisponibile() {
        return importoDisponibile;
    }

    /**
     * Imposta il valore della proprieta importoDisponibile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportoDisponibile(JAXBElement<String> value) {
        this.importoDisponibile = value;
    }

    /**
     * Recupera il valore della proprieta importoTotale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportoTotale() {
        return importoTotale;
    }

    /**
     * Imposta il valore della proprieta importoTotale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportoTotale(JAXBElement<String> value) {
        this.importoTotale = value;
    }

}
