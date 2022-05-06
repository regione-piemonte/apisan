/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ELENCO_PAGAMENTI complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ELENCO_PAGAMENTI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELENCO_PAGAMENTI", propOrder = {
    "numerosportello",
    "numeroricevuta",
    "dataricevuta",
    "importoricevuta"
})
public class ELENCOPAGAMENTI {

    @XmlElement(name = "NUMERO_SPORTELLO", required = true, nillable = true)
    protected String numerosportello;
    @XmlElement(name = "NUMERO_RICEVUTA", required = true, nillable = true)
    protected String numeroricevuta;
    @XmlElement(name = "DATA_RICEVUTA", required = true, nillable = true)
    protected String dataricevuta;
    @XmlElement(name = "IMPORTO_RICEVUTA", required = true, nillable = true)
    protected String importoricevuta;

    /**
     * Recupera il valore della proprieta numerosportello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSPORTELLO() {
        return numerosportello;
    }

    /**
     * Imposta il valore della proprieta numerosportello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSPORTELLO(String value) {
        this.numerosportello = value;
    }

    /**
     * Recupera il valore della proprieta numeroricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERORICEVUTA() {
        return numeroricevuta;
    }

    /**
     * Imposta il valore della proprieta numeroricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERORICEVUTA(String value) {
        this.numeroricevuta = value;
    }

    /**
     * Recupera il valore della proprieta dataricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARICEVUTA() {
        return dataricevuta;
    }

    /**
     * Imposta il valore della proprieta dataricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARICEVUTA(String value) {
        this.dataricevuta = value;
    }

    /**
     * Recupera il valore della proprieta importoricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTORICEVUTA() {
        return importoricevuta;
    }

    /**
     * Imposta il valore della proprieta importoricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTORICEVUTA(String value) {
        this.importoricevuta = value;
    }

}
