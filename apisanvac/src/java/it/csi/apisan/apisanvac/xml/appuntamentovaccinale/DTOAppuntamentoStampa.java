/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentovaccinale;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per DTOAppuntamentoStampa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOAppuntamentoStampa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tiket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvvisoPdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="IdAppuntamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOAppuntamentoStampa", propOrder = {
    "tiket",
    "avvisoPdf",
    "idAppuntamento"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOAppuntamentoStampa {

    @XmlElement(name = "Tiket")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String tiket;
    @XmlElement(name = "AvvisoPdf")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected byte[] avvisoPdf;
    @XmlElement(name = "IdAppuntamento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String idAppuntamento;

    /**
     * Recupera il valore della proprietà tiket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTiket() {
        return tiket;
    }

    /**
     * Imposta il valore della proprietà tiket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTiket(String value) {
        this.tiket = value;
    }

    /**
     * Recupera il valore della proprietà avvisoPdf.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte[] getAvvisoPdf() {
        return avvisoPdf;
    }

    /**
     * Imposta il valore della proprietà avvisoPdf.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAvvisoPdf(byte[] value) {
        this.avvisoPdf = value;
    }

    /**
     * Recupera il valore della proprietà idAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIdAppuntamento() {
        return idAppuntamento;
    }

    /**
     * Imposta il valore della proprietà idAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdAppuntamento(String value) {
        this.idAppuntamento = value;
    }

}
