/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per taccuino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="taccuino">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTaccuino" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPaziente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assunzioniFarmaciVisibili" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noteVisibili" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="profiloClinicoVisibile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rilevazioniAlimentariVisibili" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taccuino", propOrder = {
    "idTaccuino",
    "idPaziente",
    "assunzioniFarmaciVisibili",
    "noteVisibili",
    "profiloClinicoVisibile",
    "rilevazioniAlimentariVisibili"
})
public class Taccuino {

    protected Long idTaccuino;
    protected Long idPaziente;
    protected boolean assunzioniFarmaciVisibili;
    protected boolean noteVisibili;
    protected boolean profiloClinicoVisibile;
    protected boolean rilevazioniAlimentariVisibili;

    /**
     * Recupera il valore della proprietà idTaccuino.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTaccuino() {
        return idTaccuino;
    }

    /**
     * Imposta il valore della proprietà idTaccuino.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTaccuino(Long value) {
        this.idTaccuino = value;
    }

    /**
     * Recupera il valore della proprietà idPaziente.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPaziente() {
        return idPaziente;
    }

    /**
     * Imposta il valore della proprietà idPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPaziente(Long value) {
        this.idPaziente = value;
    }

    /**
     * Recupera il valore della proprietà assunzioniFarmaciVisibili.
     * 
     */
    public boolean isAssunzioniFarmaciVisibili() {
        return assunzioniFarmaciVisibili;
    }

    /**
     * Imposta il valore della proprietà assunzioniFarmaciVisibili.
     * 
     */
    public void setAssunzioniFarmaciVisibili(boolean value) {
        this.assunzioniFarmaciVisibili = value;
    }

    /**
     * Recupera il valore della proprietà noteVisibili.
     * 
     */
    public boolean isNoteVisibili() {
        return noteVisibili;
    }

    /**
     * Imposta il valore della proprietà noteVisibili.
     * 
     */
    public void setNoteVisibili(boolean value) {
        this.noteVisibili = value;
    }

    /**
     * Recupera il valore della proprietà profiloClinicoVisibile.
     * 
     */
    public boolean isProfiloClinicoVisibile() {
        return profiloClinicoVisibile;
    }

    /**
     * Imposta il valore della proprietà profiloClinicoVisibile.
     * 
     */
    public void setProfiloClinicoVisibile(boolean value) {
        this.profiloClinicoVisibile = value;
    }

    /**
     * Recupera il valore della proprietà rilevazioniAlimentariVisibili.
     * 
     */
    public boolean isRilevazioniAlimentariVisibili() {
        return rilevazioniAlimentariVisibili;
    }

    /**
     * Imposta il valore della proprietà rilevazioniAlimentariVisibili.
     * 
     */
    public void setRilevazioniAlimentariVisibili(boolean value) {
        this.rilevazioniAlimentariVisibili = value;
    }

}
