/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abilitazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abilitazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoScreening" type="{http://www.csi.it/gestOperatore/}TipoScreeningType" minOccurs="0"/>
 *         &lt;element name="livelloScreening" type="{http://www.csi.it/gestOperatore/}LivelloScreeningType" minOccurs="0"/>
 *         &lt;element name="funzionalitScreening" type="{http://www.csi.it/gestOperatore/}FunzionalitScreeningType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abilitazioneType", propOrder = {
    "tipoScreening",
    "livelloScreening",
    "funzionalitScreening"
})
public class AbilitazioneType {

    protected TipoScreeningType tipoScreening;
    protected LivelloScreeningType livelloScreening;
    @XmlElement(required = true)
    protected FunzionalitScreeningType funzionalitScreening;

    /**
     * Recupera il valore della proprietà tipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link TipoScreeningType }
     *     
     */
    public TipoScreeningType getTipoScreening() {
        return tipoScreening;
    }

    /**
     * Imposta il valore della proprietà tipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScreeningType }
     *     
     */
    public void setTipoScreening(TipoScreeningType value) {
        this.tipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà livelloScreening.
     * 
     * @return
     *     possible object is
     *     {@link LivelloScreeningType }
     *     
     */
    public LivelloScreeningType getLivelloScreening() {
        return livelloScreening;
    }

    /**
     * Imposta il valore della proprietà livelloScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link LivelloScreeningType }
     *     
     */
    public void setLivelloScreening(LivelloScreeningType value) {
        this.livelloScreening = value;
    }

    /**
     * Recupera il valore della proprietà funzionalitScreening.
     * 
     * @return
     *     possible object is
     *     {@link FunzionalitScreeningType }
     *     
     */
    public FunzionalitScreeningType getFunzionalitScreening() {
        return funzionalitScreening;
    }

    /**
     * Imposta il valore della proprietà funzionalitScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link FunzionalitScreeningType }
     *     
     */
    public void setFunzionalitScreening(FunzionalitScreeningType value) {
        this.funzionalitScreening = value;
    }

}
