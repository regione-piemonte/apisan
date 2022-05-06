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
 * <p>Classe Java per RIMBORSO_UTILIZZATO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RIMBORSO_UTILIZZATO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RIMBORSO_UTILIZZATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_CREDITO_UTILIZZATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RIMBORSO_UTILIZZATO", namespace = "http://csi.it", propOrder = {
    "idrimborsoutilizzato",
    "importocreditoutilizzato"
})
public class RIMBORSOUTILIZZATO {

    @XmlElement(name = "ID_RIMBORSO_UTILIZZATO", namespace = "http://csi.it", required = true, nillable = true)
    protected String idrimborsoutilizzato;
    @XmlElement(name = "IMPORTO_CREDITO_UTILIZZATO", namespace = "http://csi.it", required = true, nillable = true)
    protected String importocreditoutilizzato;

    /**
     * Recupera il valore della proprieta idrimborsoutilizzato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRIMBORSOUTILIZZATO() {
        return idrimborsoutilizzato;
    }

    /**
     * Imposta il valore della proprieta idrimborsoutilizzato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRIMBORSOUTILIZZATO(String value) {
        this.idrimborsoutilizzato = value;
    }

    /**
     * Recupera il valore della proprieta importocreditoutilizzato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOCREDITOUTILIZZATO() {
        return importocreditoutilizzato;
    }

    /**
     * Imposta il valore della proprieta importocreditoutilizzato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOCREDITOUTILIZZATO(String value) {
        this.importocreditoutilizzato = value;
    }

}
