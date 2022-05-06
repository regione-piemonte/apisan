/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://farab.msg.interfacews.farmab.dma.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuidDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fonte" type="{http://farab.msg.interfacews.farmab.dma.csi.it/}codifica" minOccurs="0"/>
 *         &lt;element name="telCittadino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispositivo" type="{http://farab.msg.interfacews.farmab.dma.csi.it/}dispositivo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cfCittadino",
    "uuidDevice",
    "fonte",
    "telCittadino",
    "dispositivo"
})
@XmlRootElement(name = "certificaDevice")
public class CertificaDevice
    extends ServiceRequest
{

    protected String cfCittadino;
    protected String uuidDevice;
    protected Codifica fonte;
    protected String telCittadino;
    protected Dispositivo dispositivo;

    /**
     * Recupera il valore della proprietà cfCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfCittadino() {
        return cfCittadino;
    }

    /**
     * Imposta il valore della proprietà cfCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfCittadino(String value) {
        this.cfCittadino = value;
    }

    /**
     * Recupera il valore della proprietà uuidDevice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidDevice() {
        return uuidDevice;
    }

    /**
     * Imposta il valore della proprietà uuidDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidDevice(String value) {
        this.uuidDevice = value;
    }

    /**
     * Recupera il valore della proprietà fonte.
     * 
     * @return
     *     possible object is
     *     {@link Codifica }
     *     
     */
    public Codifica getFonte() {
        return fonte;
    }

    /**
     * Imposta il valore della proprietà fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link Codifica }
     *     
     */
    public void setFonte(Codifica value) {
        this.fonte = value;
    }

    /**
     * Recupera il valore della proprietà telCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCittadino() {
        return telCittadino;
    }

    /**
     * Imposta il valore della proprietà telCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCittadino(String value) {
        this.telCittadino = value;
    }

    /**
     * Recupera il valore della proprietà dispositivo.
     * 
     * @return
     *     possible object is
     *     {@link Dispositivo }
     *     
     */
    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    /**
     * Imposta il valore della proprietà dispositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Dispositivo }
     *     
     */
    public void setDispositivo(Dispositivo value) {
        this.dispositivo = value;
    }

}
