/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per saveRicXML complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="saveRicXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idXML" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="enkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="saveUtil" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveRicXML", propOrder = {
    "idXML",
    "enkey",
    "xml",
    "saveUtil"
})
public class SaveRicXML {

    protected BigDecimal idXML;
    protected String enkey;
    protected String xml;
    protected boolean saveUtil;

    /**
     * Recupera il valore della property idXML.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdXML() {
        return idXML;
    }

    /**
     * Imposta il valore della property idXML.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdXML(BigDecimal value) {
        this.idXML = value;
    }

    /**
     * Recupera il valore della property enkey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnkey() {
        return enkey;
    }

    /**
     * Imposta il valore della property enkey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnkey(String value) {
        this.enkey = value;
    }

    /**
     * Recupera il valore della property xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Imposta il valore della property xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
    }

    /**
     * Recupera il valore della property saveUtil.
     * 
     */
    public boolean isSaveUtil() {
        return saveUtil;
    }

    /**
     * Imposta il valore della property saveUtil.
     * 
     */
    public void setSaveUtil(boolean value) {
        this.saveUtil = value;
    }

}
