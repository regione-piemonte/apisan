/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per preferenza complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="preferenza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="visibile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="entita" type="{http://dmaclbluc.dma.csi.it/}entita" minOccurs="0" form="qualified"/>
 *         &lt;element name="gruppo" type="{http://dmaclbluc.dma.csi.it/}gruppo" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferenza", propOrder = {
    "id",
    "visibile",
    "entita",
    "gruppo"
})
public class Preferenza {

    protected Long id;
    protected String visibile;
    protected Entita entita;
    protected Gruppo gruppo;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà visibile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibile() {
        return visibile;
    }

    /**
     * Imposta il valore della proprietà visibile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibile(String value) {
        this.visibile = value;
    }

    /**
     * Recupera il valore della proprietà entita.
     * 
     * @return
     *     possible object is
     *     {@link Entita }
     *     
     */
    public Entita getEntita() {
        return entita;
    }

    /**
     * Imposta il valore della proprietà entita.
     * 
     * @param value
     *     allowed object is
     *     {@link Entita }
     *     
     */
    public void setEntita(Entita value) {
        this.entita = value;
    }

    /**
     * Recupera il valore della proprietà gruppo.
     * 
     * @return
     *     possible object is
     *     {@link Gruppo }
     *     
     */
    public Gruppo getGruppo() {
        return gruppo;
    }

    /**
     * Imposta il valore della proprietà gruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link Gruppo }
     *     
     */
    public void setGruppo(Gruppo value) {
        this.gruppo = value;
    }

}
