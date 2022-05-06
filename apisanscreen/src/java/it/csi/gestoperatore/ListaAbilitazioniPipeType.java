/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaAbilitazioniPipeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaAbilitazioniPipeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abilitazionePipe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaAbilitazioniPipeType", propOrder = {
    "abilitazionePipe"
})
public class ListaAbilitazioniPipeType {

    @XmlElement(required = true)
    protected String abilitazionePipe;

    /**
     * Recupera il valore della proprietà abilitazionePipe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbilitazionePipe() {
        return abilitazionePipe;
    }

    /**
     * Imposta il valore della proprietà abilitazionePipe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbilitazionePipe(String value) {
        this.abilitazionePipe = value;
    }

}
