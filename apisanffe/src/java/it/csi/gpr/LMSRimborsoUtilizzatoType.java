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
 * <p>Classe Java per LMSRimborsoUtilizzatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSRimborsoUtilizzatoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RIMBORSO_UTILIZZATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA_RIMBORSATA" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "LMSRimborsoUtilizzatoType", propOrder = {
    "idrimborsoutilizzato",
    "numeropraticarimborsata",
    "importocreditoutilizzato"
})
public class LMSRimborsoUtilizzatoType {

    @XmlElement(name = "ID_RIMBORSO_UTILIZZATO", required = true)
    protected String idrimborsoutilizzato;
    @XmlElement(name = "NUMERO_PRATICA_RIMBORSATA", required = true)
    protected String numeropraticarimborsata;
    @XmlElement(name = "IMPORTO_CREDITO_UTILIZZATO", required = true)
    protected String importocreditoutilizzato;

    /**
     * Recupera il valore della proprietà idrimborsoutilizzato.
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
     * Imposta il valore della proprietà idrimborsoutilizzato.
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
     * Recupera il valore della proprietà numeropraticarimborsata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICARIMBORSATA() {
        return numeropraticarimborsata;
    }

    /**
     * Imposta il valore della proprietà numeropraticarimborsata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICARIMBORSATA(String value) {
        this.numeropraticarimborsata = value;
    }

    /**
     * Recupera il valore della proprietà importocreditoutilizzato.
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
     * Imposta il valore della proprietà importocreditoutilizzato.
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
