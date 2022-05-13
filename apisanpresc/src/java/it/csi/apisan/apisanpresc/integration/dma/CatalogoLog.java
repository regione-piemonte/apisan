/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per catalogoLog complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="catalogoLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}codifica">
 *       &lt;sequence>
 *         &lt;element name="descrizioneErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizioneLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isErrore" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogoLog", propOrder = {
    "descrizioneErrore",
    "descrizioneLog",
    "isErrore"
})
public class CatalogoLog
    extends Codifica
{

    protected String descrizioneErrore;
    protected String descrizioneLog;
    @XmlSchemaType(name = "string")
    protected SiNo isErrore;

    /**
     * Recupera il valore della property descrizioneErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneErrore() {
        return descrizioneErrore;
    }

    /**
     * Imposta il valore della property descrizioneErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneErrore(String value) {
        this.descrizioneErrore = value;
    }

    /**
     * Recupera il valore della property descrizioneLog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneLog() {
        return descrizioneLog;
    }

    /**
     * Imposta il valore della property descrizioneLog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneLog(String value) {
        this.descrizioneLog = value;
    }

    /**
     * Recupera il valore della property isErrore.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getIsErrore() {
        return isErrore;
    }

    /**
     * Imposta il valore della property isErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setIsErrore(SiNo value) {
        this.isErrore = value;
    }

}
