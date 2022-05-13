/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per luogoASU complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="luogoASU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azienda" type="{http://dma.csi.it/}aziendaSanitaria" minOccurs="0"/>
 *         &lt;element name="struttura" type="{http://dma.csi.it/}strutturaSanitaria" minOccurs="0"/>
 *         &lt;element name="unitaOperativa" type="{http://dma.csi.it/}unitaOperativaSanitaria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "luogoASU", propOrder = {
    "azienda",
    "struttura",
    "unitaOperativa"
})
public class LuogoASU {

    protected AziendaSanitaria azienda;
    protected StrutturaSanitaria struttura;
    protected UnitaOperativaSanitaria unitaOperativa;

    /**
     * Recupera il valore della property azienda.
     * 
     * @return
     *     possible object is
     *     {@link AziendaSanitaria }
     *     
     */
    public AziendaSanitaria getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della property azienda.
     * 
     * @param value
     *     allowed object is
     *     {@link AziendaSanitaria }
     *     
     */
    public void setAzienda(AziendaSanitaria value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della property struttura.
     * 
     * @return
     *     possible object is
     *     {@link StrutturaSanitaria }
     *     
     */
    public StrutturaSanitaria getStruttura() {
        return struttura;
    }

    /**
     * Imposta il valore della property struttura.
     * 
     * @param value
     *     allowed object is
     *     {@link StrutturaSanitaria }
     *     
     */
    public void setStruttura(StrutturaSanitaria value) {
        this.struttura = value;
    }

    /**
     * Recupera il valore della property unitaOperativa.
     * 
     * @return
     *     possible object is
     *     {@link UnitaOperativaSanitaria }
     *     
     */
    public UnitaOperativaSanitaria getUnitaOperativa() {
        return unitaOperativa;
    }

    /**
     * Imposta il valore della property unitaOperativa.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitaOperativaSanitaria }
     *     
     */
    public void setUnitaOperativa(UnitaOperativaSanitaria value) {
        this.unitaOperativa = value;
    }

}
