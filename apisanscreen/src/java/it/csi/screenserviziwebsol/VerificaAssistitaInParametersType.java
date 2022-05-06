/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaAssistitaInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaAssistitaInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pCodFiscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaAssistitaInParametersType")
public class VerificaAssistitaInParametersType {

    @XmlAttribute(name = "pCodFiscale")
    protected String pCodFiscale;

    /**
     * Recupera il valore della proprieta pCodFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodFiscale() {
        return pCodFiscale;
    }

    /**
     * Imposta il valore della proprieta pCodFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodFiscale(String value) {
        this.pCodFiscale = value;
    }

}
