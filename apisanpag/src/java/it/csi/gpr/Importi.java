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
 * <p>Classe Java per Importi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Importi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAZIENTE" type="{http://csi.it}Paziente" minOccurs="0"/>
 *         &lt;element name="LISTA_PRENOTAZIONE" type="{http://csi.it}ArrayOfPRATICAListaPrenotazioni" minOccurs="0"/>
 *         &lt;element name="ERRORE" type="{http://csi.it}Errore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Importi", propOrder = {
    "paziente",
    "listaprenotazione",
    "errore"
})
public class Importi {

    @XmlElement(name = "PAZIENTE")
    protected Paziente paziente;
    @XmlElement(name = "LISTA_PRENOTAZIONE")
    protected ArrayOfPRATICAListaPrenotazioni listaprenotazione;
    @XmlElement(name = "ERRORE", required = true)
    protected Errore errore;

    /**
     * Recupera il valore della proprieta paziente.
     * 
     * @return
     *     possible object is
     *     {@link Paziente }
     *     
     */
    public Paziente getPAZIENTE() {
        return paziente;
    }

    /**
     * Imposta il valore della proprieta paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paziente }
     *     
     */
    public void setPAZIENTE(Paziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprieta listaprenotazione.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRATICAListaPrenotazioni }
     *     
     */
    public ArrayOfPRATICAListaPrenotazioni getLISTAPRENOTAZIONE() {
        return listaprenotazione;
    }

    /**
     * Imposta il valore della proprieta listaprenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRATICAListaPrenotazioni }
     *     
     */
    public void setLISTAPRENOTAZIONE(ArrayOfPRATICAListaPrenotazioni value) {
        this.listaprenotazione = value;
    }

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link Errore }
     *     
     */
    public Errore getERRORE() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link Errore }
     *     
     */
    public void setERRORE(Errore value) {
        this.errore = value;
    }

}
