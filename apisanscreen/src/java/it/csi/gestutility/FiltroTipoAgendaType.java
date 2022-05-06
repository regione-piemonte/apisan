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
 * <p>Classe Java per filtroTipoAgendaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="filtroTipoAgendaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoAgenda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoScreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoUoSelezionata" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtroTipoAgendaType", propOrder = {
    "idTipoAgenda",
    "tipoScreen",
    "tipoUoSelezionata"
})
public class FiltroTipoAgendaType {

    protected Long idTipoAgenda;
    @XmlElement(required = true)
    protected String tipoScreen;
    protected int tipoUoSelezionata;

    /**
     * Recupera il valore della proprietà idTipoAgenda.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTipoAgenda() {
        return idTipoAgenda;
    }

    /**
     * Imposta il valore della proprietà idTipoAgenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTipoAgenda(Long value) {
        this.idTipoAgenda = value;
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

    /**
     * Recupera il valore della proprietà tipoUoSelezionata.
     * 
     */
    public int getTipoUoSelezionata() {
        return tipoUoSelezionata;
    }

    /**
     * Imposta il valore della proprietà tipoUoSelezionata.
     * 
     */
    public void setTipoUoSelezionata(int value) {
        this.tipoUoSelezionata = value;
    }

}
