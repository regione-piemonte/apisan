/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.SiNo;


/**
 * <p>Classe Java per getDatiNotificaMMGResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDatiNotificaMMGResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaccbl.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}indirizzoEmailMmg" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}flagAbilitaInvioMailMmg" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}flagAbilitaInvioMailMmgFse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDatiNotificaMMGResponse", propOrder = {
    "indirizzoEmailMmg",
    "flagAbilitaInvioMailMmg",
    "flagAbilitaInvioMailMmgFse"
})
public class GetDatiNotificaMMGResponse
    extends ServiceResponse
{

    @XmlElement(namespace = "http://dma.csi.it/")
    protected String indirizzoEmailMmg;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected SiNo flagAbilitaInvioMailMmg;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected SiNo flagAbilitaInvioMailMmgFse;

    /**
     * Recupera il valore della proprietà indirizzoEmailMmg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoEmailMmg() {
        return indirizzoEmailMmg;
    }

    /**
     * Imposta il valore della proprietà indirizzoEmailMmg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoEmailMmg(String value) {
        this.indirizzoEmailMmg = value;
    }

    /**
     * Recupera il valore della proprietà flagAbilitaInvioMailMmg.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getFlagAbilitaInvioMailMmg() {
        return flagAbilitaInvioMailMmg;
    }

    /**
     * Imposta il valore della proprietà flagAbilitaInvioMailMmg.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setFlagAbilitaInvioMailMmg(SiNo value) {
        this.flagAbilitaInvioMailMmg = value;
    }

    /**
     * Recupera il valore della proprietà flagAbilitaInvioMailMmgFse.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getFlagAbilitaInvioMailMmgFse() {
        return flagAbilitaInvioMailMmgFse;
    }

    /**
     * Imposta il valore della proprietà flagAbilitaInvioMailMmgFse.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setFlagAbilitaInvioMailMmgFse(SiNo value) {
        this.flagAbilitaInvioMailMmgFse = value;
    }

}
