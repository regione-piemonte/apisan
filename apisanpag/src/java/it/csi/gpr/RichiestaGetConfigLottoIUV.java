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
 * <p>Classe Java per richiestaGetConfigLottoIUV complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiestaGetConfigLottoIUV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATI" type="{http://csi.it}Dati"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiestaGetConfigLottoIUV", propOrder = {
    "uuid",
    "dati"
})
public class RichiestaGetConfigLottoIUV {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "DATI", required = true)
    protected Dati dati;

    /**
     * Recupera il valore della proprieta uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprieta uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprieta dati.
     * 
     * @return
     *     possible object is
     *     {@link Dati }
     *     
     */
    public Dati getDATI() {
        return dati;
    }

    /**
     * Imposta il valore della proprieta dati.
     * 
     * @param value
     *     allowed object is
     *     {@link Dati }
     *     
     */
    public void setDATI(Dati value) {
        this.dati = value;
    }

}
