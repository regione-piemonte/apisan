/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.csi.it/gestOperatore/}CodiceFiscaleType"/>
 *         &lt;element name="listaRuoli" type="{http://www.csi.it/gestOperatore/}listaRuoliType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codiceFiscale",
    "listaRuoli"
})
@XmlRootElement(name = "getAllData")
public class GetAllData {

    @XmlElement(required = true)
    protected CodiceFiscaleType codiceFiscale;
    @XmlElement(required = true)
    protected ListaRuoliType listaRuoli;

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link CodiceFiscaleType }
     *     
     */
    public CodiceFiscaleType getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceFiscaleType }
     *     
     */
    public void setCodiceFiscale(CodiceFiscaleType value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà listaRuoli.
     * 
     * @return
     *     possible object is
     *     {@link ListaRuoliType }
     *     
     */
    public ListaRuoliType getListaRuoli() {
        return listaRuoli;
    }

    /**
     * Imposta il valore della proprietà listaRuoli.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRuoliType }
     *     
     */
    public void setListaRuoli(ListaRuoliType value) {
        this.listaRuoli = value;
    }

}
