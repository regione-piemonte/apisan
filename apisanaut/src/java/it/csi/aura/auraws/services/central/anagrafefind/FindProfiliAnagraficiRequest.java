/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafefind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per findProfiliAnagraficiRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="findProfiliAnagraficiRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://AnagrafeFind.central.services.auraws.aura.csi.it}Ens_Request">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagDecesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findProfiliAnagraficiRequest", propOrder = {
    "codiceFiscale",
    "cognome",
    "nome",
    "dataNascita",
    "dataDa",
    "dataA",
    "flagDecesso",
    "idEnte"
})
public class FindProfiliAnagraficiRequest
    extends EnsRequest
{

    protected String codiceFiscale;
    protected String cognome;
    protected String nome;
    protected String dataNascita;
    protected String dataDa;
    protected String dataA;
    protected String flagDecesso;
    protected String idEnte;

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà dataNascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     * Imposta il valore della proprietà dataNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascita(String value) {
        this.dataNascita = value;
    }

    /**
     * Recupera il valore della proprietà dataDa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDa() {
        return dataDa;
    }

    /**
     * Imposta il valore della proprietà dataDa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDa(String value) {
        this.dataDa = value;
    }

    /**
     * Recupera il valore della proprietà dataA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataA() {
        return dataA;
    }

    /**
     * Imposta il valore della proprietà dataA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataA(String value) {
        this.dataA = value;
    }

    /**
     * Recupera il valore della proprietà flagDecesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagDecesso() {
        return flagDecesso;
    }

    /**
     * Imposta il valore della proprietà flagDecesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagDecesso(String value) {
        this.flagDecesso = value;
    }

    /**
     * Recupera il valore della proprietà idEnte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEnte() {
        return idEnte;
    }

    /**
     * Imposta il valore della proprietà idEnte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEnte(String value) {
        this.idEnte = value;
    }

}
