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
 *         &lt;element name="filtroCalendarioProcedure" type="{http://www.csi.it/GestUtility/}FiltroCalendarioProcedureType"/>
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
    "filtroCalendarioProcedure"
})
@XmlRootElement(name = "getCalendarioProcedure")
public class GetCalendarioProcedure {

    @XmlElement(required = true)
    protected FiltroCalendarioProcedureType filtroCalendarioProcedure;

    /**
     * Recupera il valore della proprietà filtroCalendarioProcedure.
     * 
     * @return
     *     possible object is
     *     {@link FiltroCalendarioProcedureType }
     *     
     */
    public FiltroCalendarioProcedureType getFiltroCalendarioProcedure() {
        return filtroCalendarioProcedure;
    }

    /**
     * Imposta il valore della proprietà filtroCalendarioProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroCalendarioProcedureType }
     *     
     */
    public void setFiltroCalendarioProcedure(FiltroCalendarioProcedureType value) {
        this.filtroCalendarioProcedure = value;
    }

}
