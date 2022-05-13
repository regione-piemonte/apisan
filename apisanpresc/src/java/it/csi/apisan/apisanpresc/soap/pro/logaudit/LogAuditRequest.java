/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logAuditRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logAuditRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}richiedente">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscalePaziente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audit" type="{http://dma.csi.it/}audit"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logAuditRequest", namespace = "http://dmapro.csi.it/", propOrder = {
    "codiceFiscalePaziente",
    "audit"
})
public class LogAuditRequest
    extends Richiedente
{

    @XmlElement(required = true)
    protected String codiceFiscalePaziente;
    @XmlElement(required = true)
    protected Audit audit;

    /**
     * Recupera il valore della property codiceFiscalePaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscalePaziente() {
        return codiceFiscalePaziente;
    }

    /**
     * Imposta il valore della property codiceFiscalePaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscalePaziente(String value) {
        this.codiceFiscalePaziente = value;
    }

    /**
     * Recupera il valore della property audit.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAudit() {
        return audit;
    }

    /**
     * Imposta il valore della property audit.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

}
