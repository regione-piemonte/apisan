/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.integration.conspref.consprefbe;



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;


/**
 * <p>Classe Java per ConsultaNotificheBe complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaNotificheBe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cfDelegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatore" type="{http://consprefbe.csi.it/}operatore" minOccurs="0"/>
 *         &lt;element name="fonte" type="{fonteCittadino}fonte"/>
 *         &lt;element name="codiceTipoConsenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceSottotipoConsenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaNotificheBe", propOrder = {
    "cfCittadino",
    "cfDelegato",
    "operatore",
    "fonte",
    "codiceTipoConsenso",
    "codiceSottotipoConsenso",
    "uuid"
})
public class ConsultaNotificheBe
    extends ServiceRequest
{

    @XmlElement(required = true)
    protected String cfCittadino;
    protected String cfDelegato;
    protected Operatore operatore;
    @XmlElement(required = true)
    protected Fonte fonte;
    protected String codiceTipoConsenso;
    protected String codiceSottotipoConsenso;
    @XmlElement(required = true)
    protected List<String> uuid;

    /**
     * Recupera il valore della proprietà cfCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfCittadino() {
        return cfCittadino;
    }

    /**
     * Imposta il valore della proprietà cfCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfCittadino(String value) {
        this.cfCittadino = value;
    }

    /**
     * Recupera il valore della proprietà cfDelegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfDelegato() {
        return cfDelegato;
    }

    /**
     * Imposta il valore della proprietà cfDelegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfDelegato(String value) {
        this.cfDelegato = value;
    }

    /**
     * Recupera il valore della proprietà operatore.
     * 
     * @return
     *     possible object is
     *     {@link Operatore }
     *     
     */
    public Operatore getOperatore() {
        return operatore;
    }

    /**
     * Imposta il valore della proprietà operatore.
     * 
     * @param value
     *     allowed object is
     *     {@link Operatore }
     *     
     */
    public void setOperatore(Operatore value) {
        this.operatore = value;
    }

    /**
     * Recupera il valore della proprietà fonte.
     * 
     * @return
     *     possible object is
     *     {@link Fonte }
     *     
     */
    public Fonte getFonte() {
        return fonte;
    }

    /**
     * Imposta il valore della proprietà fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link Fonte }
     *     
     */
    public void setFonte(Fonte value) {
        this.fonte = value;
    }

    /**
     * Recupera il valore della proprietà codiceTipoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTipoConsenso() {
        return codiceTipoConsenso;
    }

    /**
     * Imposta il valore della proprietà codiceTipoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTipoConsenso(String value) {
        this.codiceTipoConsenso = value;
    }

    /**
     * Recupera il valore della proprietà codiceSottotipoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceSottotipoConsenso() {
        return codiceSottotipoConsenso;
    }

    /**
     * Imposta il valore della proprietà codiceSottotipoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceSottotipoConsenso(String value) {
        this.codiceSottotipoConsenso = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUuid() {
        if (uuid == null) {
            uuid = new ArrayList<String>();
        }
        return this.uuid;
    }
    
    public void setUuid(List<String> uuid) {
		this.uuid = uuid;
	}

}
