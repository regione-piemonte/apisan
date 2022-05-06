/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per GetDettaglioDocumentoDigitaleOutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetDettaglioDocumentoDigitaleOutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pFile" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pNomeFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pLetto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDettaglioDocumentoDigitaleOutParametersType", propOrder = {
    "pFile"
})
public class GetDettaglioDocumentoDigitaleOutParametersType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] pFile;
    @XmlAttribute(name = "pNomeFile")
    protected String pNomeFile;
    @XmlAttribute(name = "pLetto")
    protected String pLetto;

    /**
     * Recupera il valore della proprietà pFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPFile() {
        return pFile;
    }

    /**
     * Imposta il valore della proprietà pFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFile(byte[] value) {
        this.pFile = value;
    }

    /**
     * Recupera il valore della proprietà pNomeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNomeFile() {
        return pNomeFile;
    }

    /**
     * Imposta il valore della proprietà pNomeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNomeFile(String value) {
        this.pNomeFile = value;
    }

    /**
     * Recupera il valore della proprietà pLetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLetto() {
        return pLetto;
    }

    /**
     * Imposta il valore della proprietà pLetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLetto(String value) {
        this.pLetto = value;
    }

}
