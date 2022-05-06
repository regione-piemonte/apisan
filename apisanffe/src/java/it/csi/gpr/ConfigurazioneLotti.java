/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ConfigurazioneLotti complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConfigurazioneLotti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIM_LOTTO_IUV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VALORE_SOGLIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATA_INIZIO_VALIDITA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DATA_FINE_VALIDITA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurazioneLotti", propOrder = {
    "codiceasr",
    "codiceversamento",
    "dimlottoiuv",
    "valoresoglia",
    "datainiziovalidita",
    "datafinevalidita"
})
public class ConfigurazioneLotti {

    @XmlElement(name = "CODICE_ASR", required = true)
    protected String codiceasr;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true)
    protected String codiceversamento;
    @XmlElement(name = "DIM_LOTTO_IUV")
    protected int dimlottoiuv;
    @XmlElement(name = "VALORE_SOGLIA")
    protected int valoresoglia;
    @XmlElement(name = "DATA_INIZIO_VALIDITA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datainiziovalidita;
    @XmlElement(name = "DATA_FINE_VALIDITA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datafinevalidita;

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
     * Recupera il valore della proprietà dimlottoiuv.
     * 
     */
    public int getDIMLOTTOIUV() {
        return dimlottoiuv;
    }

    /**
     * Imposta il valore della proprietà dimlottoiuv.
     * 
     */
    public void setDIMLOTTOIUV(int value) {
        this.dimlottoiuv = value;
    }

    /**
     * Recupera il valore della proprietà valoresoglia.
     * 
     */
    public int getVALORESOGLIA() {
        return valoresoglia;
    }

    /**
     * Imposta il valore della proprietà valoresoglia.
     * 
     */
    public void setVALORESOGLIA(int value) {
        this.valoresoglia = value;
    }

    /**
     * Recupera il valore della proprietà datainiziovalidita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAINIZIOVALIDITA() {
        return datainiziovalidita;
    }

    /**
     * Imposta il valore della proprietà datainiziovalidita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAINIZIOVALIDITA(XMLGregorianCalendar value) {
        this.datainiziovalidita = value;
    }

    /**
     * Recupera il valore della proprietà datafinevalidita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAFINEVALIDITA() {
        return datafinevalidita;
    }

    /**
     * Imposta il valore della proprietà datafinevalidita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAFINEVALIDITA(XMLGregorianCalendar value) {
        this.datafinevalidita = value;
    }

}
