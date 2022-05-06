/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.Codifica;
import it.csi.apisan.apisanfse.integration.paziente.dma.Errore;
import it.csi.apisan.apisanfse.integration.paziente.dma.RisultatoCodice;


/**
 * <p>Classe Java per serviceResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codifiche" type="{http://dma.csi.it/}codifica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errori" type="{http://dma.csi.it/}errore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://dma.csi.it/}risultatoCodice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", propOrder = {
    "codifiche",
    "errori",
    "esito"
})
@XmlSeeAlso({
    AlimentazioneElencoCodiciFiscaliResponse.class,
    InvioNotifichePazientiResponse.class,
    GetPazienteByIdIRECResponse.class,
    GetDoNotificaMMGResponse.class,
    NotificaRefertoScaricabileResponse.class,
    SetDatiNotificaMMGResponse.class,
    GetCLDaInvocareResponse.class,
    NotificaPresenzaDatiILECResponse.class,
    GetMMGPazienteResponse.class,
    GetInfoPazienteResponse.class,
    RicercaPazienteResponse.class,
    SetInfoPazienteResponse.class,
    GetRiepilogoResponse.class,
    GetDatiNotificaMMGResponse.class,
    GetAccessiResponse.class
})
public class ServiceResponse {

    @XmlElement(nillable = true)
    protected List<Codifica> codifiche;
    @XmlElement(nillable = true)
    protected List<Errore> errori;
    protected RisultatoCodice esito;

    /**
     * Gets the value of the codifiche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codifiche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodifiche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Codifica }
     * 
     * 
     */
    public List<Codifica> getCodifiche() {
        if (codifiche == null) {
            codifiche = new ArrayList<Codifica>();
        }
        return this.codifiche;
    }

    /**
     * Gets the value of the errori property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errori property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrori().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Errore }
     * 
     * 
     */
    public List<Errore> getErrori() {
        if (errori == null) {
            errori = new ArrayList<Errore>();
        }
        return this.errori;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link RisultatoCodice }
     *     
     */
    public RisultatoCodice getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link RisultatoCodice }
     *     
     */
    public void setEsito(RisultatoCodice value) {
        this.esito = value;
    }

}
