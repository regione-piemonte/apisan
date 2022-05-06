/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafefind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiAnagraficiBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiAnagraficiBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elencoProfili" type="{http://AnagrafeFind.central.services.auraws.aura.csi.it}ArrayOfdatianagraficiDatiAnagrafici" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiAnagraficiBody", propOrder = {
    "elencoProfili"
})
public class DatiAnagraficiBody {

    protected ArrayOfdatianagraficiDatiAnagrafici elencoProfili;

    /**
     * Recupera il valore della proprietà elencoProfili.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfdatianagraficiDatiAnagrafici }
     *     
     */
    public ArrayOfdatianagraficiDatiAnagrafici getElencoProfili() {
        return elencoProfili;
    }

    /**
     * Imposta il valore della proprietà elencoProfili.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfdatianagraficiDatiAnagrafici }
     *     
     */
    public void setElencoProfili(ArrayOfdatianagraficiDatiAnagrafici value) {
        this.elencoProfili = value;
    }

}
