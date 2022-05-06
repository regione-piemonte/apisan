/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codiceasr",
    "codiceversamento"
})
@XmlRootElement(name = "GprGetConfigLottoIUVCodiceAsrCodiceVersamento")
public class GprGetConfigLottoIUVCodiceAsrCodiceVersamento {

    @XmlElement(name = "CODICE_ASR", required = true, nillable = true)
    protected String codiceasr;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true, nillable = true)
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
