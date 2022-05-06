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
 * <p>Classe Java per GetElencoDocumentiDigitaliInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetElencoDocumentiDigitaliInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pCodIdInterno" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pPrefIdInterno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetElencoDocumentiDigitaliInParametersType")
public class GetElencoDocumentiDigitaliInParametersType {

    @XmlAttribute(name = "pCodIdInterno")
    protected Integer pCodIdInterno;
    @XmlAttribute(name = "pPrefIdInterno")
    protected String pPrefIdInterno;

    /**
     * Recupera il valore della proprietà pCodIdInterno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodIdInterno() {
        return pCodIdInterno;
    }

    /**
     * Imposta il valore della proprietà pCodIdInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodIdInterno(Integer value) {
        this.pCodIdInterno = value;
    }

    /**
     * Recupera il valore della proprietà pPrefIdInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrefIdInterno() {
        return pPrefIdInterno;
    }

    /**
     * Imposta il valore della proprietà pPrefIdInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrefIdInterno(String value) {
        this.pPrefIdInterno = value;
    }

}
