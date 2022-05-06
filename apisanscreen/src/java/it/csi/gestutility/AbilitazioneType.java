/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AbilitazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbilitazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="livelloScreening" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoScreening" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="funzionalitScreening" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbilitazioneType", propOrder = {
    "livelloScreening",
    "tipoScreening",
    "funzionalitScreening"
})
public class AbilitazioneType {

    protected int livelloScreening;
    protected int tipoScreening;
    protected int funzionalitScreening;

    /**
     * Recupera il valore della proprietà livelloScreening.
     * 
     */
    public int getLivelloScreening() {
        return livelloScreening;
    }

    /**
     * Imposta il valore della proprietà livelloScreening.
     * 
     */
    public void setLivelloScreening(int value) {
        this.livelloScreening = value;
    }

    /**
     * Recupera il valore della proprietà tipoScreening.
     * 
     */
    public int getTipoScreening() {
        return tipoScreening;
    }

    /**
     * Imposta il valore della proprietà tipoScreening.
     * 
     */
    public void setTipoScreening(int value) {
        this.tipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà funzionalitScreening.
     * 
     */
    public int getFunzionalitScreening() {
        return funzionalitScreening;
    }

    /**
     * Imposta il valore della proprietà funzionalitScreening.
     * 
     */
    public void setFunzionalitScreening(int value) {
        this.funzionalitScreening = value;
    }

}
