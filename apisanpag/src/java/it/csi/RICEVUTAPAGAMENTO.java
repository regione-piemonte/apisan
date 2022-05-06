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
 * <p>Classe Java per RICEVUTA_PAGAMENTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RICEVUTA_PAGAMENTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_RT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_ESITO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RICEVUTA_PAGAMENTO", propOrder = {
    "datapagamento",
    "idricevuta",
    "idrt",
    "idesito"
})
public class RICEVUTAPAGAMENTO {

    @XmlElement(name = "DATA_PAGAMENTO", required = true, nillable = true)
    protected String datapagamento;
    @XmlElement(name = "ID_RICEVUTA", required = true, nillable = true)
    protected String idricevuta;
    @XmlElement(name = "ID_RT", required = true, nillable = true)
    protected String idrt;
    @XmlElement(name = "ID_ESITO", required = true, nillable = true)
    protected String idesito;

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
     * Recupera il valore della proprieta idricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRICEVUTA() {
        return idricevuta;
    }

    /**
     * Imposta il valore della proprieta idricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRICEVUTA(String value) {
        this.idricevuta = value;
    }

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
     * Recupera il valore della proprieta idesito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDESITO() {
        return idesito;
    }

    /**
     * Imposta il valore della proprieta idesito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDESITO(String value) {
        this.idesito = value;
    }

}
