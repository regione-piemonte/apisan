/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.dma.ComponenteLocale;
import it.csi.apisan.apisanfse.integration.dma.Paziente;
import it.csi.apisan.apisanfse.integration.dma.Richiedente;
import it.csi.apisan.apisanfse.integration.dma.SiNo;


/**
 * <p>Classe Java per getRefertoSR complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRefertoSR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Request">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element name="paziente" type="{http://dma.csi.it/}paziente" minOccurs="0"/>
 *         &lt;element name="componenteLocale" type="{http://dma.csi.it/}componenteLocale" minOccurs="0"/>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="richiestoPinCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numeroGiorniDownload" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pinBruciato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criptato" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="soloMetadati" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRefertoSR", propOrder = {
    "richiedente",
    "paziente",
    "componenteLocale",
    "idDocumento",
    "pinCode",
    "richiestoPinCode",
    "numeroGiorniDownload",
    "pinBruciato",
    "criptato",
    "soloMetadati"
})
public class GetRefertoSR
    extends EnsRequest
{

    protected Richiedente richiedente;
    protected Paziente paziente;
    protected ComponenteLocale componenteLocale;
    protected String idDocumento;
    protected String pinCode;
    protected Boolean richiestoPinCode;
    protected Long numeroGiorniDownload;
    protected Boolean pinBruciato;
    @XmlSchemaType(name = "string")
    protected SiNo criptato;
    @XmlSchemaType(name = "string")
    protected SiNo soloMetadati;

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà paziente.
     * 
     * @return
     *     possible object is
     *     {@link Paziente }
     *     
     */
    public Paziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprietà paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paziente }
     *     
     */
    public void setPaziente(Paziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprietà componenteLocale.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocale }
     *     
     */
    public ComponenteLocale getComponenteLocale() {
        return componenteLocale;
    }

    /**
     * Imposta il valore della proprietà componenteLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocale }
     *     
     */
    public void setComponenteLocale(ComponenteLocale value) {
        this.componenteLocale = value;
    }

    /**
     * Recupera il valore della proprietà idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Imposta il valore della proprietà idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Recupera il valore della proprietà pinCode.
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
     * Imposta il valore della proprietà pinCode.
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
     * Recupera il valore della proprietà richiestoPinCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRichiestoPinCode() {
        return richiestoPinCode;
    }

    /**
     * Imposta il valore della proprietà richiestoPinCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRichiestoPinCode(Boolean value) {
        this.richiestoPinCode = value;
    }

    /**
     * Recupera il valore della proprietà numeroGiorniDownload.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroGiorniDownload() {
        return numeroGiorniDownload;
    }

    /**
     * Imposta il valore della proprietà numeroGiorniDownload.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroGiorniDownload(Long value) {
        this.numeroGiorniDownload = value;
    }

    /**
     * Recupera il valore della proprietà pinBruciato.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPinBruciato() {
        return pinBruciato;
    }

    /**
     * Imposta il valore della proprietà pinBruciato.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPinBruciato(Boolean value) {
        this.pinBruciato = value;
    }

    /**
     * Recupera il valore della proprietà criptato.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getCriptato() {
        return criptato;
    }

    /**
     * Imposta il valore della proprietà criptato.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setCriptato(SiNo value) {
        this.criptato = value;
    }

    /**
     * Recupera il valore della proprietà soloMetadati.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getSoloMetadati() {
        return soloMetadati;
    }

    /**
     * Imposta il valore della proprietà soloMetadati.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setSoloMetadati(SiNo value) {
        this.soloMetadati = value;
    }

}
