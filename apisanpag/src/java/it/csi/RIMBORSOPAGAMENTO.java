/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RIMBORSO_PAGAMENTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RIMBORSO_PAGAMENTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_RIMBORSO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RIMBORSO_PAGAMENTO", propOrder = {
    "datarimborsopagamento",
    "idrimborso"
})
public class RIMBORSOPAGAMENTO {

    @XmlElement(name = "DATA_RIMBORSO_PAGAMENTO", required = true, nillable = true)
    protected String datarimborsopagamento;
    @XmlElement(name = "ID_RIMBORSO", required = true, nillable = true)
    protected String idrimborso;

    /**
     * Recupera il valore della proprieta datarimborsopagamento.
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
     * Imposta il valore della proprieta datarimborsopagamento.
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
     * Recupera il valore della proprieta idrimborso.
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
     * Imposta il valore della proprieta idrimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRIMBORSO(String value) {
        this.idrimborso = value;
    }

}
