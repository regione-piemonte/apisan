/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafesanitaria;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SoggettoAuraBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SoggettoAuraBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="infoAnag" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}InfoAnagrafiche" minOccurs="0"/>
 *         &lt;element name="infoSan" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}InfoSanitarie" minOccurs="0"/>
 *         &lt;element name="infoEsenzioni" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}ArrayOfinfoesenzioneInfoEsenzione" minOccurs="0"/>
 *         &lt;element name="altreInfo" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}ArrayOfinformazioniAltreInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoggettoAuraBody", propOrder = {
    "idAura",
    "infoAnag",
    "infoSan",
    "infoEsenzioni",
    "altreInfo"
})
public class SoggettoAuraBody {

    protected BigDecimal idAura;
    protected InfoAnagrafiche infoAnag;
    protected InfoSanitarie infoSan;
    protected ArrayOfinfoesenzioneInfoEsenzione infoEsenzioni;
    protected ArrayOfinformazioniAltreInfo altreInfo;

    /**
     * Recupera il valore della proprietà idAura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdAura() {
        return idAura;
    }

    /**
     * Imposta il valore della proprietà idAura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdAura(BigDecimal value) {
        this.idAura = value;
    }

    /**
     * Recupera il valore della proprietà infoAnag.
     * 
     * @return
     *     possible object is
     *     {@link InfoAnagrafiche }
     *     
     */
    public InfoAnagrafiche getInfoAnag() {
        return infoAnag;
    }

    /**
     * Imposta il valore della proprietà infoAnag.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoAnagrafiche }
     *     
     */
    public void setInfoAnag(InfoAnagrafiche value) {
        this.infoAnag = value;
    }

    /**
     * Recupera il valore della proprietà infoSan.
     * 
     * @return
     *     possible object is
     *     {@link InfoSanitarie }
     *     
     */
    public InfoSanitarie getInfoSan() {
        return infoSan;
    }

    /**
     * Imposta il valore della proprietà infoSan.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSanitarie }
     *     
     */
    public void setInfoSan(InfoSanitarie value) {
        this.infoSan = value;
    }

    /**
     * Recupera il valore della proprietà infoEsenzioni.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfinfoesenzioneInfoEsenzione }
     *     
     */
    public ArrayOfinfoesenzioneInfoEsenzione getInfoEsenzioni() {
        return infoEsenzioni;
    }

    /**
     * Imposta il valore della proprietà infoEsenzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfinfoesenzioneInfoEsenzione }
     *     
     */
    public void setInfoEsenzioni(ArrayOfinfoesenzioneInfoEsenzione value) {
        this.infoEsenzioni = value;
    }

    /**
     * Recupera il valore della proprietà altreInfo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfinformazioniAltreInfo }
     *     
     */
    public ArrayOfinformazioniAltreInfo getAltreInfo() {
        return altreInfo;
    }

    /**
     * Imposta il valore della proprietà altreInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfinformazioniAltreInfo }
     *     
     */
    public void setAltreInfo(ArrayOfinformazioniAltreInfo value) {
        this.altreInfo = value;
    }

}
