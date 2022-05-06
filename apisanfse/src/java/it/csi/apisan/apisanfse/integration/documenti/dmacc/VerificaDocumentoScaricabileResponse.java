/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.ServiceResponse;


/**
 * <p>Classe Java per verificaDocumentoScaricabileResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="verificaDocumentoScaricabileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="codiceAzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceEpisodio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceDocumentoIlec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaDocumentoScaricabileResponse", propOrder = {
    "codiceAzione",
    "codiceCL",
    "codiceEpisodio",
    "codiceDocumentoIlec"
})
public class VerificaDocumentoScaricabileResponse
    extends ServiceResponse
{

    protected String codiceAzione;
    protected String codiceCL;
    protected String codiceEpisodio;
    protected String codiceDocumentoIlec;

    /**
     * Recupera il valore della proprietà codiceAzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAzione() {
        return codiceAzione;
    }

    /**
     * Imposta il valore della proprietà codiceAzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAzione(String value) {
        this.codiceAzione = value;
    }

    /**
     * Recupera il valore della proprietà codiceCL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCL() {
        return codiceCL;
    }

    /**
     * Imposta il valore della proprietà codiceCL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCL(String value) {
        this.codiceCL = value;
    }

    /**
     * Recupera il valore della proprietà codiceEpisodio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEpisodio() {
        return codiceEpisodio;
    }

    /**
     * Imposta il valore della proprietà codiceEpisodio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEpisodio(String value) {
        this.codiceEpisodio = value;
    }

    /**
     * Recupera il valore della proprietà codiceDocumentoIlec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDocumentoIlec() {
        return codiceDocumentoIlec;
    }

    /**
     * Imposta il valore della proprietà codiceDocumentoIlec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDocumentoIlec(String value) {
        this.codiceDocumentoIlec = value;
    }

}
