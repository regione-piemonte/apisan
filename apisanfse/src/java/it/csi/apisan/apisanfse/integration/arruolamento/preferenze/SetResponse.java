/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.arruolamento.preferenze;

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
 *         &lt;element name="inserimentoAvvenuto" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inserimentoAvvenuto"
})
@XmlRootElement(name = "SetResponse")
public class SetResponse {

    @XmlElement(required = true, namespace = "http://dmacc.csi.it")
    protected String inserimentoAvvenuto;

    /**
     * Recupera il valore della proprieta inserimentoAvvenuto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInserimentoAvvenuto() {
        return inserimentoAvvenuto;
    }

    /**
     * Imposta il valore della proprieta inserimentoAvvenuto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInserimentoAvvenuto(String value) {
        this.inserimentoAvvenuto = value;
    }

}
