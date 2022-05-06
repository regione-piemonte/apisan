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
 *         &lt;element name="listaAbilitazioniPipe" type="{http://www.csi.it/gestOperatore/}listaAbilitazioniPipeType"/>
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
    "listaAbilitazioniPipe"
})
@XmlRootElement(name = "getAbilitScreen")
public class GetAbilitScreen {

    @XmlElement(required = true)
    protected ListaAbilitazioniPipeType listaAbilitazioniPipe;

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

}
