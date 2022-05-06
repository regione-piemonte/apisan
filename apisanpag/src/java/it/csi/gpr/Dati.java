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
 * <p>Classe Java per Dati complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Dati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dati", propOrder = {
    "codiceasr",
    "codiceversamento"
})
public class Dati {

    @XmlElement(name = "CODICE_ASR")
    protected String codiceasr;
    @XmlElement(name = "CODICE_VERSAMENTO")
    protected String codiceversamento;

    /**
     * Recupera il valore della proprieta codiceasr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEASR() {
        return codiceasr;
    }

    /**
     * Imposta il valore della proprieta codiceasr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEASR(String value) {
        this.codiceasr = value;
    }

    /**
     * Recupera il valore della proprieta codiceversamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEVERSAMENTO() {
        return codiceversamento;
    }

    /**
     * Imposta il valore della proprieta codiceversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEVERSAMENTO(String value) {
        this.codiceversamento = value;
    }

}
