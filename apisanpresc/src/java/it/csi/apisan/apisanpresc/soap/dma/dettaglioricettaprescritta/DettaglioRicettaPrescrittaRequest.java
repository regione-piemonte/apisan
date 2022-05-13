/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dettaglioRicettaPrescrittaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettaglioRicettaPrescrittaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dmacc.csi.it/}richiedente"/>
 *         &lt;element name="paziente" type="{http://dmacc.csi.it/}estremiPaziente"/>
 *         &lt;element name="informazioniRichiedente" type="{http://dmacc.csi.it/}informazioniRichiedente"/>
 *         &lt;element name="estremiRicetta" type="{http://dma.csi.it/}estremiRicetta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioRicettaPrescrittaRequest", namespace = "http://dmacc.csi.it/", propOrder = {
    "richiedente",
    "paziente",
    "informazioniRichiedente",
    "estremiRicetta"
})
public class DettaglioRicettaPrescrittaRequest {

    @XmlElement(required = true)
    protected Richiedente richiedente;
    @XmlElement(required = true)
    protected EstremiPaziente paziente;
    @XmlElement(required = true)
    protected InformazioniRichiedente informazioniRichiedente;
    @XmlElement(required = true)
    protected EstremiRicetta estremiRicetta;

    /**
     * Recupera il valore della property richiedente.
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
     * Imposta il valore della property richiedente.
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
     * Recupera il valore della property paziente.
     * 
     * @return
     *     possible object is
     *     {@link EstremiPaziente }
     *     
     */
    public EstremiPaziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della property paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiPaziente }
     *     
     */
    public void setPaziente(EstremiPaziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della property informazioniRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniRichiedente }
     *     
     */
    public InformazioniRichiedente getInformazioniRichiedente() {
        return informazioniRichiedente;
    }

    /**
     * Imposta il valore della property informazioniRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniRichiedente }
     *     
     */
    public void setInformazioniRichiedente(InformazioniRichiedente value) {
        this.informazioniRichiedente = value;
    }

    /**
     * Recupera il valore della property estremiRicetta.
     * 
     * @return
     *     possible object is
     *     {@link EstremiRicetta }
     *     
     */
    public EstremiRicetta getEstremiRicetta() {
        return estremiRicetta;
    }

    /**
     * Imposta il valore della property estremiRicetta.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiRicetta }
     *     
     */
    public void setEstremiRicetta(EstremiRicetta value) {
        this.estremiRicetta = value;
    }

}
