/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.nascondinre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per nascondiNre complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="nascondiNre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dmapro.csi.it/}richiedente"/>
 *         &lt;element name="paziente" type="{http://dmapro.csi.it/}estremiPaziente"/>
 *         &lt;element name="estremiRicetta" type="{http://dma.csi.it/}estremiRicetta"/>
 *         &lt;element name="operazione" type="{http://dmapro.csi.it/}operazione"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nascondiNre", propOrder = {
    "richiedente",
    "paziente",
    "estremiRicetta",
    "operazione"
})
public class NascondiNre {

    @XmlElement(required = true)
    protected Richiedente richiedente;
    @XmlElement(required = true)
    protected EstremiPaziente paziente;
    @XmlElement(required = true)
    protected EstremiRicetta estremiRicetta;
    @XmlElement(required = true)
    protected Operazione operazione;

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

    /**
     * Recupera il valore della property operazione.
     * 
     * @return
     *     possible object is
     *     {@link Operazione }
     *     
     */
    public Operazione getOperazione() {
        return operazione;
    }

    /**
     * Imposta il valore della property operazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Operazione }
     *     
     */
    public void setOperazione(Operazione value) {
        this.operazione = value;
    }

}
