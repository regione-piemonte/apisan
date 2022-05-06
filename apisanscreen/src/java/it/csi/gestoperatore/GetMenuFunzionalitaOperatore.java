/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMenuFunzionalitaOperatore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMenuFunzionalitaOperatore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaAbilitazioniPipe" type="{http://www.csi.it/gestOperatore/}listaAbilitazioniPipeType" minOccurs="0"/>
 *         &lt;element name="idApplicazione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMenuFunzionalitaOperatore", propOrder = {
    "listaAbilitazioniPipe",
    "idApplicazione"
})
public class GetMenuFunzionalitaOperatore {

    protected ListaAbilitazioniPipeType listaAbilitazioniPipe;
    protected Integer idApplicazione;

    /**
     * Recupera il valore della proprietà listaAbilitazioniPipe.
     * 
     * @return
     *     possible object is
     *     {@link ListaAbilitazioniPipeType }
     *     
     */
    public ListaAbilitazioniPipeType getListaAbilitazioniPipe() {
        return listaAbilitazioniPipe;
    }

    /**
     * Imposta il valore della proprietà listaAbilitazioniPipe.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaAbilitazioniPipeType }
     *     
     */
    public void setListaAbilitazioniPipe(ListaAbilitazioniPipeType value) {
        this.listaAbilitazioniPipe = value;
    }

    /**
     * Recupera il valore della proprietà idApplicazione.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdApplicazione() {
        return idApplicazione;
    }

    /**
     * Imposta il valore della proprietà idApplicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdApplicazione(Integer value) {
        this.idApplicazione = value;
    }

}
