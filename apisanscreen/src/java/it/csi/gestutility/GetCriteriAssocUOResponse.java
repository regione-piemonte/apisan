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
 *         &lt;element name="listaTipoCritAssUoIiLiv" type="{http://www.csi.it/GestUtility/}ListaTipoCritAssUoIiLivType"/>
 *         &lt;element name="errori" type="{http://www.csi.it/GestUtility/}ErroriType"/>
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
    "listaTipoCritAssUoIiLiv",
    "errori"
})
@XmlRootElement(name = "getCriteriAssocUOResponse")
public class GetCriteriAssocUOResponse {

    @XmlElement(required = true)
    protected ListaTipoCritAssUoIiLivType listaTipoCritAssUoIiLiv;
    @XmlElement(required = true)
    protected ErroriType errori;

    /**
     * Recupera il valore della proprietà listaTipoCritAssUoIiLiv.
     * 
     * @return
     *     possible object is
     *     {@link ListaTipoCritAssUoIiLivType }
     *     
     */
    public ListaTipoCritAssUoIiLivType getListaTipoCritAssUoIiLiv() {
        return listaTipoCritAssUoIiLiv;
    }

    /**
     * Imposta il valore della proprietà listaTipoCritAssUoIiLiv.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaTipoCritAssUoIiLivType }
     *     
     */
    public void setListaTipoCritAssUoIiLiv(ListaTipoCritAssUoIiLivType value) {
        this.listaTipoCritAssUoIiLiv = value;
    }

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setErrori(ErroriType value) {
        this.errori = value;
    }

}
