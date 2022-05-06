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
 * <p>Classe Java per TipoAgendaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoAgendaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoAgenda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desTipoAgenda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoScreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoAgendaType", propOrder = {
    "idTipoAgenda",
    "desTipoAgenda",
    "tipoScreen"
})
public class TipoAgendaType {

    protected int idTipoAgenda;
    @XmlElement(required = true)
    protected String desTipoAgenda;
    @XmlElement(required = true)
    protected String tipoScreen;

    /**
     * Recupera il valore della proprietà idTipoAgenda.
     * 
     */
    public int getIdTipoAgenda() {
        return idTipoAgenda;
    }

    /**
     * Imposta il valore della proprietà idTipoAgenda.
     * 
     */
    public void setIdTipoAgenda(int value) {
        this.idTipoAgenda = value;
    }

    /**
     * Recupera il valore della proprietà desTipoAgenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoAgenda() {
        return desTipoAgenda;
    }

    /**
     * Imposta il valore della proprietà desTipoAgenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoAgenda(String value) {
        this.desTipoAgenda = value;
    }

    /**
     * Recupera il valore della proprietà tipoScreen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScreen() {
        return tipoScreen;
    }

    /**
     * Imposta il valore della proprietà tipoScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScreen(String value) {
        this.tipoScreen = value;
    }

}
