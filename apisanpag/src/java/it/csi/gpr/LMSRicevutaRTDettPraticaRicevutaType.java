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
 * <p>Classe Java per LMSRicevutaRTDettPraticaRicevutaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSRicevutaRTDettPraticaRicevutaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAMPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSRicevutaRTDettPraticaRicevutaType", propOrder = {
    "idrt",
    "datapagamento",
    "stampa"
})
public class LMSRicevutaRTDettPraticaRicevutaType {

    @XmlElement(name = "ID_RT")
    protected String idrt;
    @XmlElement(name = "DATA_PAGAMENTO")
    protected String datapagamento;
    @XmlElement(name = "STAMPA")
    protected String stampa;

    /**
     * Recupera il valore della proprieta idrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRT() {
        return idrt;
    }

    /**
     * Imposta il valore della proprieta idrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRT(String value) {
        this.idrt = value;
    }

    /**
     * Recupera il valore della proprieta datapagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAPAGAMENTO() {
        return datapagamento;
    }

    /**
     * Imposta il valore della proprieta datapagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAPAGAMENTO(String value) {
        this.datapagamento = value;
    }

    /**
     * Recupera il valore della proprieta stampa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAMPA() {
        return stampa;
    }

    /**
     * Imposta il valore della proprieta stampa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAMPA(String value) {
        this.stampa = value;
    }

}
