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
 * <p>Classe Java per TipoRipetizioneAgendaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoRipetizioneAgendaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoRipetitivita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desTipoRipetitivita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRipetizioneAgendaType", propOrder = {
    "idTipoRipetitivita",
    "desTipoRipetitivita"
})
public class TipoRipetizioneAgendaType {

    protected int idTipoRipetitivita;
    @XmlElement(required = true)
    protected String desTipoRipetitivita;

    /**
     * Recupera il valore della proprietà idTipoRipetitivita.
     * 
     */
    public int getIdTipoRipetitivita() {
        return idTipoRipetitivita;
    }

    /**
     * Imposta il valore della proprietà idTipoRipetitivita.
     * 
     */
    public void setIdTipoRipetitivita(int value) {
        this.idTipoRipetitivita = value;
    }

    /**
     * Recupera il valore della proprietà desTipoRipetitivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoRipetitivita() {
        return desTipoRipetitivita;
    }

    /**
     * Imposta il valore della proprietà desTipoRipetitivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoRipetitivita(String value) {
        this.desTipoRipetitivita = value;
    }

}
