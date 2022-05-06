/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.arruolamento.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per isArruolabileResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="isArruolabileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fascicoloArruolabile" type="{http://dma.csi.it/}fascicoloArruolabile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isArruolabileResponse", propOrder = {
    "fascicoloArruolabile"
})
public class IsArruolabileResponse {

    @XmlElement(required = true)
    protected FascicoloArruolabile fascicoloArruolabile;

    /**
     * Recupera il valore della proprietà fascicoloArruolabile.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloArruolabile }
     *     
     */
    public FascicoloArruolabile getFascicoloArruolabile() {
        return fascicoloArruolabile;
    }

    /**
     * Imposta il valore della proprietà fascicoloArruolabile.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloArruolabile }
     *     
     */
    public void setFascicoloArruolabile(FascicoloArruolabile value) {
        this.fascicoloArruolabile = value;
    }

}
