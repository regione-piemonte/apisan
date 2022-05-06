/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rispostaMultiIuv complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rispostaMultiIuv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AUXDIGIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPLICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LISTA_IUV" type="{http://csi.it}listaIuv" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaMultiIuv", propOrder = {
    "uuid",
    "codiceversamento",
    "auxdigit",
    "applicationcode",
    "listaiuv"
})
public class RispostaMultiIuv {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true)
    protected String codiceversamento;
    @XmlElement(name = "AUXDIGIT", required = true)
    protected String auxdigit;
    @XmlElement(name = "APPLICATION_CODE", required = true)
    protected String applicationcode;
    @XmlElementRef(name = "LISTA_IUV", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ListaIuv> listaiuv;

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà codiceversamento.
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
     * Imposta il valore della proprietà codiceversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEVERSAMENTO(String value) {
        this.codiceversamento = value;
    }

    /**
     * Recupera il valore della proprietà auxdigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUXDIGIT() {
        return auxdigit;
    }

    /**
     * Imposta il valore della proprietà auxdigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUXDIGIT(String value) {
        this.auxdigit = value;
    }

    /**
     * Recupera il valore della proprietà applicationcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATIONCODE() {
        return applicationcode;
    }

    /**
     * Imposta il valore della proprietà applicationcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATIONCODE(String value) {
        this.applicationcode = value;
    }

    /**
     * Recupera il valore della proprietà listaiuv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaIuv }{@code >}
     *     
     */
    public JAXBElement<ListaIuv> getLISTAIUV() {
        return listaiuv;
    }

    /**
     * Imposta il valore della proprietà listaiuv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaIuv }{@code >}
     *     
     */
    public void setLISTAIUV(JAXBElement<ListaIuv> value) {
        this.listaiuv = value;
    }

}
