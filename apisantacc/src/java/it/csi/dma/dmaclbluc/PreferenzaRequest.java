/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per preferenzaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="preferenzaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="visibile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="codiceEntita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="codiceGruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferenzaRequest", propOrder = {
    "id",
    "visibile",
    "codiceEntita",
    "codiceGruppo"
})
public class PreferenzaRequest {

    protected Long id;
    protected String visibile;
    protected String codiceEntita;
    protected String codiceGruppo;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà visibile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibile() {
        return visibile;
    }

    /**
     * Imposta il valore della proprietà visibile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibile(String value) {
        this.visibile = value;
    }

    /**
     * Recupera il valore della proprietà codiceEntita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEntita() {
        return codiceEntita;
    }

    /**
     * Imposta il valore della proprietà codiceEntita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEntita(String value) {
        this.codiceEntita = value;
    }

    /**
     * Recupera il valore della proprietà codiceGruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceGruppo() {
        return codiceGruppo;
    }

    /**
     * Imposta il valore della proprietà codiceGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceGruppo(String value) {
        this.codiceGruppo = value;
    }

}
