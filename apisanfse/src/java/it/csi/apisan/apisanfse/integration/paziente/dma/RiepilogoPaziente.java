/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.SintesiElemento;


/**
 * <p>Classe Java per riepilogoPaziente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="riepilogoPaziente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contattiPaziente" type="{http://dma.csi.it/}contattiPaziente" minOccurs="0"/>
 *         &lt;element name="taccuino" type="{http://dma.csi.it/}taccuino" minOccurs="0"/>
 *         &lt;element name="gruppiMisurazioni" type="{http://dma.csi.it/}gruppoMisurazioni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sintesiDocumenti" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiDocumentiROPVA" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiScreening" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiFarmaci" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiEpisodi" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiEsenzioni" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiDisabilita" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiVaccinazioni" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiMalattieRare" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiDocumentiPersonali" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiMisurazioni" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiRilevazioniAlimentari" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiAssunzioniFarmaci" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *         &lt;element name="sintesiNote" type="{http://dmaccbl.csi.it/}SintesiElemento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riepilogoPaziente", propOrder = {
    "contattiPaziente",
    "taccuino",
    "gruppiMisurazioni",
    "sintesiDocumenti",
    "sintesiDocumentiROPVA",
    "sintesiScreening",
    "sintesiFarmaci",
    "sintesiEpisodi",
    "sintesiEsenzioni",
    "sintesiDisabilita",
    "sintesiVaccinazioni",
    "sintesiMalattieRare",
    "sintesiDocumentiPersonali",
    "sintesiMisurazioni",
    "sintesiRilevazioniAlimentari",
    "sintesiAssunzioniFarmaci",
    "sintesiNote"
})
public class RiepilogoPaziente {

    protected ContattiPaziente contattiPaziente;
    protected Taccuino taccuino;
    protected List<GruppoMisurazioni> gruppiMisurazioni;
    protected SintesiElemento sintesiDocumenti;
    protected SintesiElemento sintesiDocumentiROPVA;
    protected SintesiElemento sintesiScreening;
    protected SintesiElemento sintesiFarmaci;
    protected SintesiElemento sintesiEpisodi;
    protected SintesiElemento sintesiEsenzioni;
    protected SintesiElemento sintesiDisabilita;
    protected SintesiElemento sintesiVaccinazioni;
    protected SintesiElemento sintesiMalattieRare;
    protected SintesiElemento sintesiDocumentiPersonali;
    protected SintesiElemento sintesiMisurazioni;
    protected SintesiElemento sintesiRilevazioniAlimentari;
    protected SintesiElemento sintesiAssunzioniFarmaci;
    protected SintesiElemento sintesiNote;

    /**
     * Recupera il valore della propriet?? contattiPaziente.
     * 
     * @return
     *     possible object is
     *     {@link ContattiPaziente }
     *     
     */
    public ContattiPaziente getContattiPaziente() {
        return contattiPaziente;
    }

    /**
     * Imposta il valore della propriet?? contattiPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link ContattiPaziente }
     *     
     */
    public void setContattiPaziente(ContattiPaziente value) {
        this.contattiPaziente = value;
    }

    /**
     * Recupera il valore della propriet?? taccuino.
     * 
     * @return
     *     possible object is
     *     {@link Taccuino }
     *     
     */
    public Taccuino getTaccuino() {
        return taccuino;
    }

    /**
     * Imposta il valore della propriet?? taccuino.
     * 
     * @param value
     *     allowed object is
     *     {@link Taccuino }
     *     
     */
    public void setTaccuino(Taccuino value) {
        this.taccuino = value;
    }

    /**
     * Gets the value of the gruppiMisurazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gruppiMisurazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGruppiMisurazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GruppoMisurazioni }
     * 
     * 
     */
    public List<GruppoMisurazioni> getGruppiMisurazioni() {
        if (gruppiMisurazioni == null) {
            gruppiMisurazioni = new ArrayList<GruppoMisurazioni>();
        }
        return this.gruppiMisurazioni;
    }

    /**
     * Recupera il valore della propriet?? sintesiDocumenti.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiDocumenti() {
        return sintesiDocumenti;
    }

    /**
     * Imposta il valore della propriet?? sintesiDocumenti.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiDocumenti(SintesiElemento value) {
        this.sintesiDocumenti = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiDocumentiROPVA.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiDocumentiROPVA() {
        return sintesiDocumentiROPVA;
    }

    /**
     * Imposta il valore della propriet?? sintesiDocumentiROPVA.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiDocumentiROPVA(SintesiElemento value) {
        this.sintesiDocumentiROPVA = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiScreening.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiScreening() {
        return sintesiScreening;
    }

    /**
     * Imposta il valore della propriet?? sintesiScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiScreening(SintesiElemento value) {
        this.sintesiScreening = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiFarmaci.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiFarmaci() {
        return sintesiFarmaci;
    }

    /**
     * Imposta il valore della propriet?? sintesiFarmaci.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiFarmaci(SintesiElemento value) {
        this.sintesiFarmaci = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiEpisodi.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiEpisodi() {
        return sintesiEpisodi;
    }

    /**
     * Imposta il valore della propriet?? sintesiEpisodi.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiEpisodi(SintesiElemento value) {
        this.sintesiEpisodi = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiEsenzioni.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiEsenzioni() {
        return sintesiEsenzioni;
    }

    /**
     * Imposta il valore della propriet?? sintesiEsenzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiEsenzioni(SintesiElemento value) {
        this.sintesiEsenzioni = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiDisabilita.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiDisabilita() {
        return sintesiDisabilita;
    }

    /**
     * Imposta il valore della propriet?? sintesiDisabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiDisabilita(SintesiElemento value) {
        this.sintesiDisabilita = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiVaccinazioni.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiVaccinazioni() {
        return sintesiVaccinazioni;
    }

    /**
     * Imposta il valore della propriet?? sintesiVaccinazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiVaccinazioni(SintesiElemento value) {
        this.sintesiVaccinazioni = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiMalattieRare.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiMalattieRare() {
        return sintesiMalattieRare;
    }

    /**
     * Imposta il valore della propriet?? sintesiMalattieRare.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiMalattieRare(SintesiElemento value) {
        this.sintesiMalattieRare = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiDocumentiPersonali.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiDocumentiPersonali() {
        return sintesiDocumentiPersonali;
    }

    /**
     * Imposta il valore della propriet?? sintesiDocumentiPersonali.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiDocumentiPersonali(SintesiElemento value) {
        this.sintesiDocumentiPersonali = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiMisurazioni.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiMisurazioni() {
        return sintesiMisurazioni;
    }

    /**
     * Imposta il valore della propriet?? sintesiMisurazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiMisurazioni(SintesiElemento value) {
        this.sintesiMisurazioni = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiRilevazioniAlimentari.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiRilevazioniAlimentari() {
        return sintesiRilevazioniAlimentari;
    }

    /**
     * Imposta il valore della propriet?? sintesiRilevazioniAlimentari.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiRilevazioniAlimentari(SintesiElemento value) {
        this.sintesiRilevazioniAlimentari = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiAssunzioniFarmaci.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiAssunzioniFarmaci() {
        return sintesiAssunzioniFarmaci;
    }

    /**
     * Imposta il valore della propriet?? sintesiAssunzioniFarmaci.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiAssunzioniFarmaci(SintesiElemento value) {
        this.sintesiAssunzioniFarmaci = value;
    }

    /**
     * Recupera il valore della propriet?? sintesiNote.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElemento }
     *     
     */
    public SintesiElemento getSintesiNote() {
        return sintesiNote;
    }

    /**
     * Imposta il valore della propriet?? sintesiNote.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElemento }
     *     
     */
    public void setSintesiNote(SintesiElemento value) {
        this.sintesiNote = value;
    }

}
