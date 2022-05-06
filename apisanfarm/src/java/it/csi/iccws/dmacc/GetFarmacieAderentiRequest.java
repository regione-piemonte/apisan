/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.iccws.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getFarmacieAderentiRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getFarmacieAderentiRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}datiFarmacia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFarmacieAderentiRequest", propOrder = {
    "richiedente",
    "datiFarmacia"
})
public class GetFarmacieAderentiRequest {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected Richiedente richiedente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected DatiFarmacia datiFarmacia;

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
     * Recupera il valore della proprietà datiFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link DatiFarmacia }
     *     
     */
    public DatiFarmacia getDatiFarmacia() {
        return datiFarmacia;
    }

    /**
     * Imposta il valore della proprietà datiFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiFarmacia }
     *     
     */
    public void setDatiFarmacia(DatiFarmacia value) {
        this.datiFarmacia = value;
    }

}
