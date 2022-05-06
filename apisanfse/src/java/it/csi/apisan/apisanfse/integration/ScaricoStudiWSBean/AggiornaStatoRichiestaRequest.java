/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AggiornaStatoRichiestaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AggiornaStatoRichiestaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arvchivioDocumentoIlec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggiornaStatoRichiestaRequest", propOrder = {
    "codiceFiscale",
    "codCL",
    "codDocumentoDipartimentale",
    "arvchivioDocumentoIlec",
    "statoRichiesta",
    "errore"
})
public class AggiornaStatoRichiestaRequest {

    protected String codiceFiscale;
    protected String codCL;
    protected String codDocumentoDipartimentale;
    protected String arvchivioDocumentoIlec;
    protected String statoRichiesta;
    protected String errore;

    /**
     * Recupera il valore della propriet� codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della propriet� codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della propriet� codCL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCL() {
        return codCL;
    }

    /**
     * Imposta il valore della propriet� codCL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCL(String value) {
        this.codCL = value;
    }

    /**
     * Recupera il valore della propriet� codDocumentoDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDocumentoDipartimentale() {
        return codDocumentoDipartimentale;
    }

    /**
     * Imposta il valore della propriet� codDocumentoDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDocumentoDipartimentale(String value) {
        this.codDocumentoDipartimentale = value;
    }

    /**
     * Recupera il valore della propriet� arvchivioDocumentoIlec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArvchivioDocumentoIlec() {
        return arvchivioDocumentoIlec;
    }

    /**
     * Imposta il valore della propriet� arvchivioDocumentoIlec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArvchivioDocumentoIlec(String value) {
        this.arvchivioDocumentoIlec = value;
    }

    /**
     * Recupera il valore della propriet� statoRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoRichiesta() {
        return statoRichiesta;
    }

    /**
     * Imposta il valore della propriet� statoRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoRichiesta(String value) {
        this.statoRichiesta = value;
    }

    /**
     * Recupera il valore della propriet� errore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della propriet� errore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

}
