/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoUOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoUOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo_uo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="des_tipo_uo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="liv_screen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_tipo_screen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insert_fo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update_fo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoUOType", propOrder = {
    "tipoUo",
    "desTipoUo",
    "livScreen",
    "idTipoScreen",
    "valido",
    "insertFo",
    "updateFo"
})
public class TipoUOType {

    @XmlElement(name = "tipo_uo")
    protected int tipoUo;
    @XmlElement(name = "des_tipo_uo", required = true)
    protected String desTipoUo;
    @XmlElement(name = "liv_screen", required = true)
    protected String livScreen;
    @XmlElement(name = "id_tipo_screen")
    protected int idTipoScreen;
    protected String valido;
    @XmlElement(name = "insert_fo")
    protected String insertFo;
    @XmlElement(name = "update_fo")
    protected String updateFo;

    /**
     * Recupera il valore della proprietà tipoUo.
     * 
     */
    public int getTipoUo() {
        return tipoUo;
    }

    /**
     * Imposta il valore della proprietà tipoUo.
     * 
     */
    public void setTipoUo(int value) {
        this.tipoUo = value;
    }

    /**
     * Recupera il valore della proprietà desTipoUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoUo() {
        return desTipoUo;
    }

    /**
     * Imposta il valore della proprietà desTipoUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoUo(String value) {
        this.desTipoUo = value;
    }

    /**
     * Recupera il valore della proprietà livScreen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivScreen() {
        return livScreen;
    }

    /**
     * Imposta il valore della proprietà livScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivScreen(String value) {
        this.livScreen = value;
    }

    /**
     * Recupera il valore della proprietà idTipoScreen.
     * 
     */
    public int getIdTipoScreen() {
        return idTipoScreen;
    }

    /**
     * Imposta il valore della proprietà idTipoScreen.
     * 
     */
    public void setIdTipoScreen(int value) {
        this.idTipoScreen = value;
    }

    /**
     * Recupera il valore della proprietà valido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValido() {
        return valido;
    }

    /**
     * Imposta il valore della proprietà valido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValido(String value) {
        this.valido = value;
    }

    /**
     * Recupera il valore della proprietà insertFo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertFo() {
        return insertFo;
    }

    /**
     * Imposta il valore della proprietà insertFo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertFo(String value) {
        this.insertFo = value;
    }

    /**
     * Recupera il valore della proprietà updateFo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFo() {
        return updateFo;
    }

    /**
     * Imposta il valore della proprietà updateFo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFo(String value) {
        this.updateFo = value;
    }

}
