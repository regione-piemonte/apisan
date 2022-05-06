/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per GetElencoDocumentiDigitaliOutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetElencoDocumentiDigitaliOutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pIdDocumento" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pTipoScreen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDescScreen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodDocumento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodModello" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDesModello" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCategoria" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pDescCategoria" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNomeFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDataGenerazione" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="pLetto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetElencoDocumentiDigitaliOutParametersType")
public class GetElencoDocumentiDigitaliOutParametersType {

    @XmlAttribute(name = "pIdDocumento")
    protected Integer pIdDocumento;
    @XmlAttribute(name = "pTipoScreen")
    protected String pTipoScreen;
    @XmlAttribute(name = "pDescScreen")
    protected String pDescScreen;
    @XmlAttribute(name = "pCodDocumento")
    protected String pCodDocumento;
    @XmlAttribute(name = "pCodModello")
    protected String pCodModello;
    @XmlAttribute(name = "pDesModello")
    protected String pDesModello;
    @XmlAttribute(name = "pCategoria")
    protected Integer pCategoria;
    @XmlAttribute(name = "pDescCategoria")
    protected String pDescCategoria;
    @XmlAttribute(name = "pNomeFile")
    protected String pNomeFile;
    @XmlAttribute(name = "pDataGenerazione")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pDataGenerazione;
    @XmlAttribute(name = "pLetto")
    protected String pLetto;

    /**
     * Recupera il valore della proprietà pIdDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPIdDocumento() {
        return pIdDocumento;
    }

    /**
     * Imposta il valore della proprietà pIdDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPIdDocumento(Integer value) {
        this.pIdDocumento = value;
    }

    /**
     * Recupera il valore della proprietà pTipoScreen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTipoScreen() {
        return pTipoScreen;
    }

    /**
     * Imposta il valore della proprietà pTipoScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTipoScreen(String value) {
        this.pTipoScreen = value;
    }

    /**
     * Recupera il valore della proprietà pDescScreen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDescScreen() {
        return pDescScreen;
    }

    /**
     * Imposta il valore della proprietà pDescScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDescScreen(String value) {
        this.pDescScreen = value;
    }

    /**
     * Recupera il valore della proprietà pCodDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodDocumento() {
        return pCodDocumento;
    }

    /**
     * Imposta il valore della proprietà pCodDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodDocumento(String value) {
        this.pCodDocumento = value;
    }

    /**
     * Recupera il valore della proprietà pCodModello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodModello() {
        return pCodModello;
    }

    /**
     * Imposta il valore della proprietà pCodModello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodModello(String value) {
        this.pCodModello = value;
    }

    /**
     * Recupera il valore della proprietà pDesModello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDesModello() {
        return pDesModello;
    }

    /**
     * Imposta il valore della proprietà pDesModello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDesModello(String value) {
        this.pDesModello = value;
    }

    /**
     * Recupera il valore della proprietà pCategoria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCategoria() {
        return pCategoria;
    }

    /**
     * Imposta il valore della proprietà pCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCategoria(Integer value) {
        this.pCategoria = value;
    }

    /**
     * Recupera il valore della proprietà pDescCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDescCategoria() {
        return pDescCategoria;
    }

    /**
     * Imposta il valore della proprietà pDescCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDescCategoria(String value) {
        this.pDescCategoria = value;
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
     * Recupera il valore della proprietà pDataGenerazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDataGenerazione() {
        return pDataGenerazione;
    }

    /**
     * Imposta il valore della proprietà pDataGenerazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDataGenerazione(XMLGregorianCalendar value) {
        this.pDataGenerazione = value;
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
