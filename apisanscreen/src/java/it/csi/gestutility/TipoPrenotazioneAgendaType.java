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
 * <p>Classe Java per TipoPrenotazioneAgendaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoPrenotazioneAgendaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPrenotazAgenda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desPrenotazAgenda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoPrenotazioneAgendaType", propOrder = {
    "idPrenotazAgenda",
    "desPrenotazAgenda"
})
public class TipoPrenotazioneAgendaType {

    protected int idPrenotazAgenda;
    @XmlElement(required = true)
    protected String desPrenotazAgenda;

    /**
     * Recupera il valore della proprietà idPrenotazAgenda.
     * 
     */
    public int getIdPrenotazAgenda() {
        return idPrenotazAgenda;
    }

    /**
     * Imposta il valore della proprietà idPrenotazAgenda.
     * 
     */
    public void setIdPrenotazAgenda(int value) {
        this.idPrenotazAgenda = value;
    }

    /**
     * Recupera il valore della proprietà desPrenotazAgenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesPrenotazAgenda() {
        return desPrenotazAgenda;
    }

    /**
     * Imposta il valore della proprietà desPrenotazAgenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesPrenotazAgenda(String value) {
        this.desPrenotazAgenda = value;
    }

}
