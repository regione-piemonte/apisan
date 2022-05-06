/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per consultaInformativa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consultaInformativa">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="codiceTipoConsenso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceSottotipoConsenso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataRiferimento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaInformativa", propOrder = {
    "codiceTipoConsenso",
    "codiceSottotipoConsenso",
    "dataRiferimento"
})
public class ConsultaInformativa
    extends ServiceRequest
{

    @XmlElement(required = true)
    protected String codiceTipoConsenso;
    @XmlElement(required = true)
    protected String codiceSottotipoConsenso;
    @XmlElement(required = true)
    protected String dataRiferimento;

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
     * Recupera il valore della proprietà dataRiferimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRiferimento() {
        return dataRiferimento;
    }

    /**
     * Imposta il valore della proprietà dataRiferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRiferimento(String value) {
        this.dataRiferimento = value;
    }

}
