/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDipartimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoScreen" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="soloVisibiliPerGOI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="soloAttivi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="soloRandom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codStudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codGruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRicerca" type="{http://www.csi.it/GestUtility/}TipoRicercaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codDipartimento",
    "tipoScreen",
    "soloVisibiliPerGOI",
    "soloAttivi",
    "soloRandom",
    "codStudio",
    "codGruppo",
    "tipoRicerca"
})
@XmlRootElement(name = "getSperimentazioni")
public class GetSperimentazioni {

    protected int codDipartimento;
    @XmlElement(required = true)
    protected List<String> tipoScreen;
    protected Boolean soloVisibiliPerGOI;
    protected boolean soloAttivi;
    protected boolean soloRandom;
    protected String codStudio;
    protected String codGruppo;
    @XmlElement(required = true)
    protected TipoRicercaType tipoRicerca;

    /**
     * Recupera il valore della proprietà codDipartimento.
     * 
     */
    public int getCodDipartimento() {
        return codDipartimento;
    }

    /**
     * Imposta il valore della proprietà codDipartimento.
     * 
     */
    public void setCodDipartimento(int value) {
        this.codDipartimento = value;
    }

    /**
     * Gets the value of the tipoScreen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoScreen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoScreen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTipoScreen() {
        if (tipoScreen == null) {
            tipoScreen = new ArrayList<String>();
        }
        return this.tipoScreen;
    }

    /**
     * Recupera il valore della proprietà soloVisibiliPerGOI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoloVisibiliPerGOI() {
        return soloVisibiliPerGOI;
    }

    /**
     * Imposta il valore della proprietà soloVisibiliPerGOI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoloVisibiliPerGOI(Boolean value) {
        this.soloVisibiliPerGOI = value;
    }

    /**
     * Recupera il valore della proprietà soloAttivi.
     * 
     */
    public boolean isSoloAttivi() {
        return soloAttivi;
    }

    /**
     * Imposta il valore della proprietà soloAttivi.
     * 
     */
    public void setSoloAttivi(boolean value) {
        this.soloAttivi = value;
    }

    /**
     * Recupera il valore della proprietà soloRandom.
     * 
     */
    public boolean isSoloRandom() {
        return soloRandom;
    }

    /**
     * Imposta il valore della proprietà soloRandom.
     * 
     */
    public void setSoloRandom(boolean value) {
        this.soloRandom = value;
    }

    /**
     * Recupera il valore della proprietà codStudio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStudio() {
        return codStudio;
    }

    /**
     * Imposta il valore della proprietà codStudio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStudio(String value) {
        this.codStudio = value;
    }

    /**
     * Recupera il valore della proprietà codGruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGruppo() {
        return codGruppo;
    }

    /**
     * Imposta il valore della proprietà codGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGruppo(String value) {
        this.codGruppo = value;
    }

    /**
     * Recupera il valore della proprietà tipoRicerca.
     * 
     * @return
     *     possible object is
     *     {@link TipoRicercaType }
     *     
     */
    public TipoRicercaType getTipoRicerca() {
        return tipoRicerca;
    }

    /**
     * Imposta il valore della proprietà tipoRicerca.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRicercaType }
     *     
     */
    public void setTipoRicerca(TipoRicercaType value) {
        this.tipoRicerca = value;
    }

}
