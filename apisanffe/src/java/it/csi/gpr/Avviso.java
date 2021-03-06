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
 * <p>Classe Java per Avviso complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Avviso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STRUTTURA_SANITARIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COGNOME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INDIRIZZO_RESIDENZA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_TICKET_DA_PAGARE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMUNE_RESIDENZA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROVINCIA_RESIDENZA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avviso", propOrder = {
    "codicefiscale",
    "strutturasanitaria",
    "nome",
    "cognome",
    "dataappuntamento",
    "numeropratica",
    "indirizzoresidenza",
    "importoticketdapagare",
    "email",
    "comuneresidenza",
    "provinciaresidenza"
})
public class Avviso {

    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "STRUTTURA_SANITARIA", required = true)
    protected String strutturasanitaria;
    @XmlElement(name = "NOME", required = true)
    protected String nome;
    @XmlElement(name = "COGNOME", required = true)
    protected String cognome;
    @XmlElement(name = "DATA_APPUNTAMENTO", required = true)
    protected String dataappuntamento;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;
    @XmlElement(name = "INDIRIZZO_RESIDENZA", required = true)
    protected String indirizzoresidenza;
    @XmlElement(name = "IMPORTO_TICKET_DA_PAGARE", required = true)
    protected String importoticketdapagare;
    @XmlElement(name = "EMAIL", required = true)
    protected String email;
    @XmlElement(name = "COMUNE_RESIDENZA", required = true)
    protected String comuneresidenza;
    @XmlElement(name = "PROVINCIA_RESIDENZA", required = true)
    protected String provinciaresidenza;

    /**
     * Recupera il valore della propriet?? codicefiscale.
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
     * Imposta il valore della propriet?? codicefiscale.
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
     * Recupera il valore della propriet?? strutturasanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRUTTURASANITARIA() {
        return strutturasanitaria;
    }

    /**
     * Imposta il valore della propriet?? strutturasanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRUTTURASANITARIA(String value) {
        this.strutturasanitaria = value;
    }

    /**
     * Recupera il valore della propriet?? nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOME() {
        return nome;
    }

    /**
     * Imposta il valore della propriet?? nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOME(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della propriet?? cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOGNOME() {
        return cognome;
    }

    /**
     * Imposta il valore della propriet?? cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOGNOME(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della propriet?? dataappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAAPPUNTAMENTO() {
        return dataappuntamento;
    }

    /**
     * Imposta il valore della propriet?? dataappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAAPPUNTAMENTO(String value) {
        this.dataappuntamento = value;
    }

    /**
     * Recupera il valore della propriet?? numeropratica.
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
     * Imposta il valore della propriet?? numeropratica.
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
     * Recupera il valore della propriet?? indirizzoresidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDIRIZZORESIDENZA() {
        return indirizzoresidenza;
    }

    /**
     * Imposta il valore della propriet?? indirizzoresidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDIRIZZORESIDENZA(String value) {
        this.indirizzoresidenza = value;
    }

    /**
     * Recupera il valore della propriet?? importoticketdapagare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOTICKETDAPAGARE() {
        return importoticketdapagare;
    }

    /**
     * Imposta il valore della propriet?? importoticketdapagare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOTICKETDAPAGARE(String value) {
        this.importoticketdapagare = value;
    }

    /**
     * Recupera il valore della propriet?? email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Imposta il valore della propriet?? email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della propriet?? comuneresidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMUNERESIDENZA() {
        return comuneresidenza;
    }

    /**
     * Imposta il valore della propriet?? comuneresidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMUNERESIDENZA(String value) {
        this.comuneresidenza = value;
    }

    /**
     * Recupera il valore della propriet?? provinciaresidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIARESIDENZA() {
        return provinciaresidenza;
    }

    /**
     * Imposta il valore della propriet?? provinciaresidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIARESIDENZA(String value) {
        this.provinciaresidenza = value;
    }

}
