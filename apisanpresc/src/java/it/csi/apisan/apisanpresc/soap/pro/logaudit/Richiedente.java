/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per richiedente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistemaRichiedente" type="{http://dma.csi.it/}sistemaRichiedente"/>
 *         &lt;element name="utenteRichiedente" type="{http://dma.csi.it/}utenteRichiedente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedente", propOrder = {
    "sistemaRichiedente",
    "utenteRichiedente"
})
@XmlSeeAlso({
    LogAuditRequest.class
})
public class Richiedente {

    @XmlElement(required = true)
    protected SistemaRichiedente sistemaRichiedente;
    @XmlElement(required = true)
    protected UtenteRichiedente utenteRichiedente;

    /**
     * Recupera il valore della property sistemaRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link SistemaRichiedente }
     *     
     */
    public SistemaRichiedente getSistemaRichiedente() {
        return sistemaRichiedente;
    }

    /**
     * Imposta il valore della property sistemaRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaRichiedente }
     *     
     */
    public void setSistemaRichiedente(SistemaRichiedente value) {
        this.sistemaRichiedente = value;
    }

    /**
     * Recupera il valore della property utenteRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link UtenteRichiedente }
     *     
     */
    public UtenteRichiedente getUtenteRichiedente() {
        return utenteRichiedente;
    }

    /**
     * Imposta il valore della property utenteRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link UtenteRichiedente }
     *     
     */
    public void setUtenteRichiedente(UtenteRichiedente value) {
        this.utenteRichiedente = value;
    }

}
