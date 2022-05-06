/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.consensoini.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per informativaIN complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="informativaIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoOrganizzazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzioniRequest" type="{http://dma.csi.it/}opzioniType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruoloUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strutturaUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informativaIN", propOrder = {
    "identificativoInformativa",
    "identificativoOrganizzazione",
    "identificativoUtente",
    "opzioniRequest",
    "pinCode",
    "ruoloUtente",
    "strutturaUtente",
    "tipoAttivita"
})
public class InformativaIN {

    protected String identificativoInformativa;
    protected String identificativoOrganizzazione;
    protected String identificativoUtente;
    @XmlElement(nillable = true)
    protected List<OpzioniType> opzioniRequest;
    protected String pinCode;
    protected String ruoloUtente;
    protected String strutturaUtente;
    protected String tipoAttivita;

    /**
     * Recupera il valore della proprieta identificativoInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoInformativa() {
        return identificativoInformativa;
    }

    /**
     * Imposta il valore della proprieta identificativoInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoInformativa(String value) {
        this.identificativoInformativa = value;
    }

    /**
     * Recupera il valore della proprieta identificativoOrganizzazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoOrganizzazione() {
        return identificativoOrganizzazione;
    }

    /**
     * Imposta il valore della proprieta identificativoOrganizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoOrganizzazione(String value) {
        this.identificativoOrganizzazione = value;
    }

    /**
     * Recupera il valore della proprieta identificativoUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoUtente() {
        return identificativoUtente;
    }

    /**
     * Imposta il valore della proprieta identificativoUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoUtente(String value) {
        this.identificativoUtente = value;
    }

    /**
     * Gets the value of the opzioniRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opzioniRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpzioniRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpzioniType }
     * 
     * 
     */
    public List<OpzioniType> getOpzioniRequest() {
        if (opzioniRequest == null) {
            opzioniRequest = new ArrayList<OpzioniType>();
        }
        return this.opzioniRequest;
    }

    /**
     * Recupera il valore della proprieta pinCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Imposta il valore della proprieta pinCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Recupera il valore della proprieta ruoloUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuoloUtente() {
        return ruoloUtente;
    }

    /**
     * Imposta il valore della proprieta ruoloUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuoloUtente(String value) {
        this.ruoloUtente = value;
    }

    /**
     * Recupera il valore della proprieta strutturaUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrutturaUtente() {
        return strutturaUtente;
    }

    /**
     * Imposta il valore della proprieta strutturaUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrutturaUtente(String value) {
        this.strutturaUtente = value;
    }

    /**
     * Recupera il valore della proprieta tipoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAttivita() {
        return tipoAttivita;
    }

    /**
     * Imposta il valore della proprieta tipoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAttivita(String value) {
        this.tipoAttivita = value;
    }

}
