/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

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
 *         &lt;element name="filtro" type="{http://www.csi.it/GestUtility/}filtroTipoAgendaType"/>
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
    "filtro"
})
@XmlRootElement(name = "getTipoAgenda")
public class GetTipoAgenda {

    @XmlElement(required = true)
    protected FiltroTipoAgendaType filtro;

    /**
     * Recupera il valore della proprietà filtro.
     * 
     * @return
     *     possible object is
     *     {@link FiltroTipoAgendaType }
     *     
     */
    public FiltroTipoAgendaType getFiltro() {
        return filtro;
    }

    /**
     * Imposta il valore della proprietà filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroTipoAgendaType }
     *     
     */
    public void setFiltro(FiltroTipoAgendaType value) {
        this.filtro = value;
    }

}
