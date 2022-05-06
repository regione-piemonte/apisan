/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per accessionNumber complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="accessionNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataNotificaPacs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessionNumber", propOrder = {
    "accessionNumber",
    "dataNotificaPacs"
})
public class AccessionNumber {

    protected String accessionNumber;
    protected String dataNotificaPacs;

    /**
     * Recupera il valore della proprietà accessionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumber() {
        return accessionNumber;
    }

    /**
     * Imposta il valore della proprietà accessionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumber(String value) {
        this.accessionNumber = value;
    }

    /**
     * Recupera il valore della proprietà dataNotificaPacs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNotificaPacs() {
        return dataNotificaPacs;
    }

    /**
     * Imposta il valore della proprietà dataNotificaPacs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNotificaPacs(String value) {
        this.dataNotificaPacs = value;
    }

}
