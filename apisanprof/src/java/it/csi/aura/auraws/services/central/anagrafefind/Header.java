/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafefind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Header complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actors" type="{http://AnagrafeFind.central.services.auraws.aura.csi.it}ArrayOfactorActor" minOccurs="0"/>
 *         &lt;element name="codiceRitorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "actors",
    "codiceRitorno"
})
public class Header {

    protected ArrayOfactorActor actors;
    protected String codiceRitorno;

    /**
     * Recupera il valore della proprietà actors.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfactorActor }
     *     
     */
    public ArrayOfactorActor getActors() {
        return actors;
    }

    /**
     * Imposta il valore della proprietà actors.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfactorActor }
     *     
     */
    public void setActors(ArrayOfactorActor value) {
        this.actors = value;
    }

    /**
     * Recupera il valore della proprietà codiceRitorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRitorno() {
        return codiceRitorno;
    }

    /**
     * Imposta il valore della proprietà codiceRitorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRitorno(String value) {
        this.codiceRitorno = value;
    }

}
