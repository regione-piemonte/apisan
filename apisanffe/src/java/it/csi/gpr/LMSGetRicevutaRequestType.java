/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LMSGetRicevutaRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSGetRicevutaRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID_RT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID_ESITO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MODALITA_RIMBORSO" type="{http://csi.it}ModalitaRimborsoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSGetRicevutaRequestType", propOrder = {
    "codiceservizio",
    "numerosportello",
    "uuid",
    "codiceasr",
    "codicefiscale",
    "numeropratica",
    "idricevuta",
    "idrt",
    "idesito",
    "idrimborso",
    "modalitarimborso"
})
public class LMSGetRicevutaRequestType {

    @XmlElement(name = "CODICE_SERVIZIO", required = true)
    protected String codiceservizio;
    @XmlElement(name = "NUMERO_SPORTELLO", required = true)
    protected String numerosportello;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "CODICE_ASR", required = true)
    protected String codiceasr;
    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;
    @XmlElement(name = "ID_RICEVUTA")
    protected List<String> idricevuta;
    @XmlElement(name = "ID_RT")
    protected List<String> idrt;
    @XmlElement(name = "ID_ESITO")
    protected List<String> idesito;
    @XmlElement(name = "ID_RIMBORSO")
    protected List<String> idrimborso;
    @XmlElement(name = "MODALITA_RIMBORSO")
    protected BigInteger modalitarimborso;

    /**
     * Recupera il valore della proprietà codiceservizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESERVIZIO() {
        return codiceservizio;
    }

    /**
     * Imposta il valore della proprietà codiceservizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESERVIZIO(String value) {
        this.codiceservizio = value;
    }

    /**
     * Recupera il valore della proprietà numerosportello.
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
     * Imposta il valore della proprietà numerosportello.
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
     * Recupera il valore della proprietà codiceasr.
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
     * Imposta il valore della proprietà codiceasr.
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
     * Recupera il valore della proprietà codicefiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEFISCALE() {
        return codicefiscale;
    }

    /**
     * Imposta il valore della proprietà codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEFISCALE(String value) {
        this.codicefiscale = value;
    }

    /**
     * Recupera il valore della proprietà numeropratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICA() {
        return numeropratica;
    }

    /**
     * Imposta il valore della proprietà numeropratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICA(String value) {
        this.numeropratica = value;
    }

    /**
     * Gets the value of the idricevuta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idricevuta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDRICEVUTA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDRICEVUTA() {
        if (idricevuta == null) {
            idricevuta = new ArrayList<String>();
        }
        return this.idricevuta;
    }

    /**
     * Gets the value of the idrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDRT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDRT() {
        if (idrt == null) {
            idrt = new ArrayList<String>();
        }
        return this.idrt;
    }

    /**
     * Gets the value of the idesito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idesito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDESITO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDESITO() {
        if (idesito == null) {
            idesito = new ArrayList<String>();
        }
        return this.idesito;
    }

    /**
     * Gets the value of the idrimborso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idrimborso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDRIMBORSO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDRIMBORSO() {
        if (idrimborso == null) {
            idrimborso = new ArrayList<String>();
        }
        return this.idrimborso;
    }

    /**
     * Recupera il valore della proprietà modalitarimborso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODALITARIMBORSO() {
        return modalitarimborso;
    }

    /**
     * Imposta il valore della proprietà modalitarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODALITARIMBORSO(BigInteger value) {
        this.modalitarimborso = value;
    }

}
