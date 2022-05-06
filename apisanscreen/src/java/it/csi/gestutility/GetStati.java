/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

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
 *         &lt;element name="tipoEntita" type="{http://www.csi.it/GestUtility/}TipoEntitaStatoType"/>
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
    "tipoEntita"
})
@XmlRootElement(name = "getStati")
public class GetStati {

    @XmlElement(required = true)
    protected TipoEntitaStatoType tipoEntita;

    /**
     * Recupera il valore della proprietà tipoEntita.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntitaStatoType }
     *     
     */
    public TipoEntitaStatoType getTipoEntita() {
        return tipoEntita;
    }

    /**
     * Imposta il valore della proprietà tipoEntita.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntitaStatoType }
     *     
     */
    public void setTipoEntita(TipoEntitaStatoType value) {
        this.tipoEntita = value;
    }

}
