/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LISTA_METADATI_TICKET complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LISTA_METADATI_TICKET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}PAZIENTE"/>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}LISTA_PRENOTAZIONE"/>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}ERRORE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LISTA_METADATI_TICKET", propOrder = {
    "paziente",
    "listaprenotazione",
    "errore"
})
public class LISTAMETADATITICKET {

    @XmlElement(name = "PAZIENTE", required = true)
    protected PAZIENTE paziente;
    @XmlElement(name = "LISTA_PRENOTAZIONE", required = true)
    protected LISTAPRENOTAZIONE listaprenotazione;
    @XmlElement(name = "ERRORE", required = true)
    protected ERRORE errore;

    /**
     * Recupera il valore della proprieta paziente.
     * 
     * @return
     *     possible object is
     *     {@link PAZIENTE }
     *     
     */
    public PAZIENTE getPAZIENTE() {
        return paziente;
    }

    /**
     * Imposta il valore della proprieta paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link PAZIENTE }
     *     
     */
    public void setPAZIENTE(PAZIENTE value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprieta listaprenotazione.
     * 
     * @return
     *     possible object is
     *     {@link LISTAPRENOTAZIONE }
     *     
     */
    public LISTAPRENOTAZIONE getLISTAPRENOTAZIONE() {
        return listaprenotazione;
    }

    /**
     * Imposta il valore della proprieta listaprenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTAPRENOTAZIONE }
     *     
     */
    public void setLISTAPRENOTAZIONE(LISTAPRENOTAZIONE value) {
        this.listaprenotazione = value;
    }

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link ERRORE }
     *     
     */
    public ERRORE getERRORE() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link ERRORE }
     *     
     */
    public void setERRORE(ERRORE value) {
        this.errore = value;
    }

}
