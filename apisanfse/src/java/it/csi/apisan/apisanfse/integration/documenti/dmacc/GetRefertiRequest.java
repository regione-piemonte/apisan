/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.csi.apisan.apisanfse.integration.documenti.dma.Paziente;
import it.csi.apisan.apisanfse.integration.documenti.dma.Richiedente;


/**
 * <p>Classe Java per getRefertiRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRefertiRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criterioOrdinamento" type="{http://dmacc.csi.it/}criterioOrdinamento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataFineRicerca" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataInizioRicerca" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numElementiVisualizzati" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/>
 *         &lt;element name="numPagina" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/>
 *         &lt;element ref="{http://dma.csi.it/}paziente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element name="timeoutChiamanteInSec" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/>
 *         &lt;element name="tipoMedico" type="{http://dmacc.csi.it/}tipoMedico" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoOrdinamento" type="{http://dmacc.csi.it/}tipoOrdinamento" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRefertiRequest", propOrder = {
    "criterioOrdinamento",
    "dataFineRicerca",
    "dataInizioRicerca",
    "numElementiVisualizzati",
    "numPagina",
    "paziente",
    "richiedente",
    "timeoutChiamanteInSec",
    "tipoMedico",
    "tipoOrdinamento"
})
public class GetRefertiRequest {

    protected CriterioOrdinamento criterioOrdinamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFineRicerca;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizioRicerca;
    protected int numElementiVisualizzati;
    protected int numPagina;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Paziente paziente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Richiedente richiedente;
    protected int timeoutChiamanteInSec;
    protected TipoMedico tipoMedico;
    protected TipoOrdinamento tipoOrdinamento;

    /**
     * Recupera il valore della proprietà criterioOrdinamento.
     * 
     * @return
     *     possible object is
     *     {@link CriterioOrdinamento }
     *     
     */
    public CriterioOrdinamento getCriterioOrdinamento() {
        return criterioOrdinamento;
    }

    /**
     * Imposta il valore della proprietà criterioOrdinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterioOrdinamento }
     *     
     */
    public void setCriterioOrdinamento(CriterioOrdinamento value) {
        this.criterioOrdinamento = value;
    }

    /**
     * Recupera il valore della proprietà dataFineRicerca.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineRicerca() {
        return dataFineRicerca;
    }

    /**
     * Imposta il valore della proprietà dataFineRicerca.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineRicerca(XMLGregorianCalendar value) {
        this.dataFineRicerca = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioRicerca.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioRicerca() {
        return dataInizioRicerca;
    }

    /**
     * Imposta il valore della proprietà dataInizioRicerca.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioRicerca(XMLGregorianCalendar value) {
        this.dataInizioRicerca = value;
    }

    /**
     * Recupera il valore della proprietà numElementiVisualizzati.
     * 
     */
    public int getNumElementiVisualizzati() {
        return numElementiVisualizzati;
    }

    /**
     * Imposta il valore della proprietà numElementiVisualizzati.
     * 
     */
    public void setNumElementiVisualizzati(int value) {
        this.numElementiVisualizzati = value;
    }

    /**
     * Recupera il valore della proprietà numPagina.
     * 
     */
    public int getNumPagina() {
        return numPagina;
    }

    /**
     * Imposta il valore della proprietà numPagina.
     * 
     */
    public void setNumPagina(int value) {
        this.numPagina = value;
    }

    /**
     * Recupera il valore della proprietà paziente.
     * 
     * @return
     *     possible object is
     *     {@link Paziente }
     *     
     */
    public Paziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprietà paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paziente }
     *     
     */
    public void setPaziente(Paziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà timeoutChiamanteInSec.
     * 
     */
    public int getTimeoutChiamanteInSec() {
        return timeoutChiamanteInSec;
    }

    /**
     * Imposta il valore della proprietà timeoutChiamanteInSec.
     * 
     */
    public void setTimeoutChiamanteInSec(int value) {
        this.timeoutChiamanteInSec = value;
    }

    /**
     * Recupera il valore della proprietà tipoMedico.
     * 
     * @return
     *     possible object is
     *     {@link TipoMedico }
     *     
     */
    public TipoMedico getTipoMedico() {
        return tipoMedico;
    }

    /**
     * Imposta il valore della proprietà tipoMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMedico }
     *     
     */
    public void setTipoMedico(TipoMedico value) {
        this.tipoMedico = value;
    }

    /**
     * Recupera il valore della proprietà tipoOrdinamento.
     * 
     * @return
     *     possible object is
     *     {@link TipoOrdinamento }
     *     
     */
    public TipoOrdinamento getTipoOrdinamento() {
        return tipoOrdinamento;
    }

    /**
     * Imposta il valore della proprietà tipoOrdinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOrdinamento }
     *     
     */
    public void setTipoOrdinamento(TipoOrdinamento value) {
        this.tipoOrdinamento = value;
    }

}
