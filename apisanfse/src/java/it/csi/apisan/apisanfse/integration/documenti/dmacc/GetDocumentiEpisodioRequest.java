/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;


/**
 * <p>Classe Java per GetDocumentiEpisodioRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentiEpisodioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idEpisodio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentiEpisodioRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "idEpisodio",
    "codiceCL"
})
public class GetDocumentiEpisodioRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected BigDecimal idEpisodio;
    protected String codiceCL;

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link RichiedenteInfo }
     *     
     */
    public RichiedenteInfo getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiedenteInfo }
     *     
     */
    public void setRichiedente(RichiedenteInfo value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà cfPaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfPaziente() {
        return cfPaziente;
    }

    /**
     * Imposta il valore della proprietà cfPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfPaziente(String value) {
        this.cfPaziente = value;
    }

    /**
     * Recupera il valore della proprietà idEpisodio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdEpisodio() {
        return idEpisodio;
    }

    /**
     * Imposta il valore della proprietà idEpisodio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdEpisodio(BigDecimal value) {
        this.idEpisodio = value;
    }

    /**
     * Recupera il valore della proprietà codiceCL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCL() {
        return codiceCL;
    }

    /**
     * Imposta il valore della proprietà codiceCL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCL(String value) {
        this.codiceCL = value;
    }

}
