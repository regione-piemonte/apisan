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
 * <p>Classe Java per ListaPrenotazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListaPrenotazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPORTO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_MARCA_BOLLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_IVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERCENTUALE_IVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRESTAZIONE_EROGATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRENOTAZIONE" type="{http://csi.it}Prenotazione" minOccurs="0"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaPrenotazione", propOrder = {
    "importopratica",
    "importomarcabollo",
    "importoiva",
    "percentualeiva",
    "prestazioneerogata",
    "codiceversamento",
    "prenotazione",
    "motivopagamento"
})
public class ListaPrenotazione {

    @XmlElement(name = "IMPORTO_PRATICA")
    protected String importopratica;
    @XmlElement(name = "IMPORTO_MARCA_BOLLO")
    protected String importomarcabollo;
    @XmlElement(name = "IMPORTO_IVA")
    protected String importoiva;
    @XmlElement(name = "PERCENTUALE_IVA")
    protected String percentualeiva;
    @XmlElement(name = "PRESTAZIONE_EROGATA")
    protected String prestazioneerogata;
    @XmlElement(name = "CODICE_VERSAMENTO")
    protected String codiceversamento;
    @XmlElement(name = "PRENOTAZIONE")
    protected Prenotazione prenotazione;
    @XmlElement(name = "MOTIVO_PAGAMENTO")
    protected String motivopagamento;

    /**
     * Recupera il valore della proprieta importopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPRATICA() {
        return importopratica;
    }

    /**
     * Imposta il valore della proprieta importopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPRATICA(String value) {
        this.importopratica = value;
    }

    /**
     * Recupera il valore della proprieta importomarcabollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOMARCABOLLO() {
        return importomarcabollo;
    }

    /**
     * Imposta il valore della proprieta importomarcabollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOMARCABOLLO(String value) {
        this.importomarcabollo = value;
    }

    /**
     * Recupera il valore della proprieta importoiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOIVA() {
        return importoiva;
    }

    /**
     * Imposta il valore della proprieta importoiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOIVA(String value) {
        this.importoiva = value;
    }

    /**
     * Recupera il valore della proprieta percentualeiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENTUALEIVA() {
        return percentualeiva;
    }

    /**
     * Imposta il valore della proprieta percentualeiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENTUALEIVA(String value) {
        this.percentualeiva = value;
    }

    /**
     * Recupera il valore della proprieta prestazioneerogata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESTAZIONEEROGATA() {
        return prestazioneerogata;
    }

    /**
     * Imposta il valore della proprieta prestazioneerogata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESTAZIONEEROGATA(String value) {
        this.prestazioneerogata = value;
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

    /**
     * Recupera il valore della proprieta prenotazione.
     * 
     * @return
     *     possible object is
     *     {@link Prenotazione }
     *     
     */
    public Prenotazione getPRENOTAZIONE() {
        return prenotazione;
    }

    /**
     * Imposta il valore della proprieta prenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Prenotazione }
     *     
     */
    public void setPRENOTAZIONE(Prenotazione value) {
        this.prenotazione = value;
    }

    /**
     * Recupera il valore della proprieta motivopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOPAGAMENTO() {
        return motivopagamento;
    }

    /**
     * Imposta il valore della proprieta motivopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOPAGAMENTO(String value) {
        this.motivopagamento = value;
    }

}
