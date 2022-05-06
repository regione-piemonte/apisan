/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FiltroCalendarioProcedureType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FiltroCalendarioProcedureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDipartimento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codAzienda" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoScreening" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoBatch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroCalendarioProcedureType", propOrder = {
    "codDipartimento",
    "codAzienda",
    "tipoScreening",
    "tipoBatch"
})
public class FiltroCalendarioProcedureType {

    protected long codDipartimento;
    @XmlElement(type = Long.class)
    protected List<Long> codAzienda;
    @XmlElement(required = true)
    protected String tipoScreening;
    protected int tipoBatch;

    /**
     * Recupera il valore della proprietà codDipartimento.
     * 
     */
    public long getCodDipartimento() {
        return codDipartimento;
    }

    /**
     * Imposta il valore della proprietà codDipartimento.
     * 
     */
    public void setCodDipartimento(long value) {
        this.codDipartimento = value;
    }

    /**
     * Gets the value of the codAzienda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codAzienda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodAzienda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCodAzienda() {
        if (codAzienda == null) {
            codAzienda = new ArrayList<Long>();
        }
        return this.codAzienda;
    }

    /**
     * Recupera il valore della proprietà tipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScreening() {
        return tipoScreening;
    }

    /**
     * Imposta il valore della proprietà tipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScreening(String value) {
        this.tipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà tipoBatch.
     * 
     */
    public int getTipoBatch() {
        return tipoBatch;
    }

    /**
     * Imposta il valore della proprietà tipoBatch.
     * 
     */
    public void setTipoBatch(int value) {
        this.tipoBatch = value;
    }

}
