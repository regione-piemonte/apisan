/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.utility.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.utility.dma.RichiedenteInfo;


/**
 * <p>Classe Java per SetAuditRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SetAuditRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceAudit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametroAudit" type="{http://dmacc.csi.it/}parametroAudit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAuditRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "codiceAudit",
    "parametroAudit"
})
public class SetAuditRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected String codiceAudit;
    @XmlElement(nillable = true)
    protected List<ParametroAudit> parametroAudit;

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
     * Recupera il valore della proprietà codiceAudit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAudit() {
        return codiceAudit;
    }

    /**
     * Imposta il valore della proprietà codiceAudit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAudit(String value) {
        this.codiceAudit = value;
    }

    /**
     * Gets the value of the parametroAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroAudit }
     * 
     * 
     */
    public List<ParametroAudit> getParametroAudit() {
        if (parametroAudit == null) {
            parametroAudit = new ArrayList<ParametroAudit>();
        }
        return this.parametroAudit;
    }

}
