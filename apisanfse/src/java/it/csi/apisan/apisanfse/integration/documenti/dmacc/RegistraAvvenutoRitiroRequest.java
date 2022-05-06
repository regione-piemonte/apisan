/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;


/**
 * <p>Classe Java per registraAvvenutoRitiroRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="registraAvvenutoRitiroRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="identificativoDocumento" type="{http://dmacc.csi.it/}identificativoDocumento" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registraAvvenutoRitiroRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "identificativoDocumento"
})
public class RegistraAvvenutoRitiroRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected IdentificativoDocumento identificativoDocumento;

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
     * Recupera il valore della proprietà identificativoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link IdentificativoDocumento }
     *     
     */
    public IdentificativoDocumento getIdentificativoDocumento() {
        return identificativoDocumento;
    }

    /**
     * Imposta il valore della proprietà identificativoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificativoDocumento }
     *     
     */
    public void setIdentificativoDocumento(IdentificativoDocumento value) {
        this.identificativoDocumento = value;
    }

}
