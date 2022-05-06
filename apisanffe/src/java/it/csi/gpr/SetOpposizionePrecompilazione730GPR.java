/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

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
 *         &lt;element name="richiesta" type="{http://csi.it}SetOpposizionePrecompilazione730GPRRequest"/>
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
    "richiesta"
})
@XmlRootElement(name = "SetOpposizionePrecompilazione730GPR")
public class SetOpposizionePrecompilazione730GPR {

    @XmlElement(required = true)
    protected SetOpposizionePrecompilazione730GPRRequest richiesta;

    /**
     * Recupera il valore della proprietà richiesta.
     * 
     * @return
     *     possible object is
     *     {@link SetOpposizionePrecompilazione730GPRRequest }
     *     
     */
    public SetOpposizionePrecompilazione730GPRRequest getRichiesta() {
        return richiesta;
    }

    /**
     * Imposta il valore della proprietà richiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOpposizionePrecompilazione730GPRRequest }
     *     
     */
    public void setRichiesta(SetOpposizionePrecompilazione730GPRRequest value) {
        this.richiesta = value;
    }

}
