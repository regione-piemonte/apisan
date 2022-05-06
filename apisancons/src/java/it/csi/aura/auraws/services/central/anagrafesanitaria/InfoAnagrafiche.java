/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafesanitaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InfoAnagrafiche complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfoAnagrafiche">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiPrimari" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}DatiPrimari" minOccurs="0"/>
 *         &lt;element name="domicilio" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}DatiSecondari" minOccurs="0"/>
 *         &lt;element name="residenza" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}DatiSecondari" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoAnagrafiche", propOrder = {
    "datiPrimari",
    "domicilio",
    "residenza"
})
public class InfoAnagrafiche {

    protected DatiPrimari datiPrimari;
    protected DatiSecondari domicilio;
    protected DatiSecondari residenza;

    /**
     * Recupera il valore della proprietà datiPrimari.
     * 
     * @return
     *     possible object is
     *     {@link DatiPrimari }
     *     
     */
    public DatiPrimari getDatiPrimari() {
        return datiPrimari;
    }

    /**
     * Imposta il valore della proprietà datiPrimari.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiPrimari }
     *     
     */
    public void setDatiPrimari(DatiPrimari value) {
        this.datiPrimari = value;
    }

    /**
     * Recupera il valore della proprietà domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DatiSecondari }
     *     
     */
    public DatiSecondari getDomicilio() {
        return domicilio;
    }

    /**
     * Imposta il valore della proprietà domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiSecondari }
     *     
     */
    public void setDomicilio(DatiSecondari value) {
        this.domicilio = value;
    }

    /**
     * Recupera il valore della proprietà residenza.
     * 
     * @return
     *     possible object is
     *     {@link DatiSecondari }
     *     
     */
    public DatiSecondari getResidenza() {
        return residenza;
    }

    /**
     * Imposta il valore della proprietà residenza.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiSecondari }
     *     
     */
    public void setResidenza(DatiSecondari value) {
        this.residenza = value;
    }

}
