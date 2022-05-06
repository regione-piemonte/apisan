/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pazienteOncologico complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pazienteOncologico">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}paziente">
 *       &lt;sequence>
 *         &lt;element name="numeroSSO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pazienteOncologico", propOrder = {
    "numeroSSO"
})
public class PazienteOncologico
    extends Paziente
{

    @XmlElement(required = true)
    protected String numeroSSO;

    /**
     * Recupera il valore della proprietà numeroSSO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSSO() {
        return numeroSSO;
    }

    /**
     * Imposta il valore della proprietà numeroSSO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSSO(String value) {
        this.numeroSSO = value;
    }

}
