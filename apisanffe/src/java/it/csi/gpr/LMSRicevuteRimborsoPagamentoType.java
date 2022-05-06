/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LMSRicevuteRimborsoPagamentoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSRicevuteRimborsoPagamentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_RIMBORSO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_RIMBORSATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRATICA_PAGATA_CON_CREDITO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSRicevuteRimborsoPagamentoType", propOrder = {
    "datarimborsopagamento",
    "idrimborso",
    "importorimborsato",
    "praticapagataconcredito",
    "numerorimborso"
})
public class LMSRicevuteRimborsoPagamentoType {

    @XmlElement(name = "DATA_RIMBORSO_PAGAMENTO", required = true)
    protected String datarimborsopagamento;
    @XmlElement(name = "ID_RIMBORSO", required = true)
    protected String idrimborso;
    @XmlElement(name = "IMPORTO_RIMBORSATO", required = true)
    protected String importorimborsato;
    @XmlElement(name = "PRATICA_PAGATA_CON_CREDITO")
    protected String praticapagataconcredito;
    @XmlElement(name = "NUMERO_RIMBORSO", required = true)
    protected String numerorimborso;

    /**
     * Recupera il valore della proprietà datarimborsopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARIMBORSOPAGAMENTO() {
        return datarimborsopagamento;
    }

    /**
     * Imposta il valore della proprietà datarimborsopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARIMBORSOPAGAMENTO(String value) {
        this.datarimborsopagamento = value;
    }

    /**
     * Recupera il valore della proprietà idrimborso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRIMBORSO() {
        return idrimborso;
    }

    /**
     * Imposta il valore della proprietà idrimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRIMBORSO(String value) {
        this.idrimborso = value;
    }

    /**
     * Recupera il valore della proprietà importorimborsato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTORIMBORSATO() {
        return importorimborsato;
    }

    /**
     * Imposta il valore della proprietà importorimborsato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTORIMBORSATO(String value) {
        this.importorimborsato = value;
    }

    /**
     * Recupera il valore della proprietà praticapagataconcredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRATICAPAGATACONCREDITO() {
        return praticapagataconcredito;
    }

    /**
     * Imposta il valore della proprietà praticapagataconcredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRATICAPAGATACONCREDITO(String value) {
        this.praticapagataconcredito = value;
    }

    /**
     * Recupera il valore della proprietà numerorimborso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERORIMBORSO() {
        return numerorimborso;
    }

    /**
     * Imposta il valore della proprietà numerorimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERORIMBORSO(String value) {
        this.numerorimborso = value;
    }

}
