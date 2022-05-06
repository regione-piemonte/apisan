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
 * <p>Classe Java per GetDatiSensibiliUtenteAziendaleResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetDatiSensibiliUtenteAziendaleResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}PAZIENTE" minOccurs="0"/>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}LISTA_PRENOTAZIONE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDatiSensibiliUtenteAziendaleResult", propOrder = {
    "paziente",
    "listaprenotazione"
})
public class GetDatiSensibiliUtenteAziendaleResult {

    @XmlElement(name = "PAZIENTE")
    protected PAZIENTE paziente;
    @XmlElement(name = "LISTA_PRENOTAZIONE")
    protected LISTAPRENOTAZIONE listaprenotazione;

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

}
