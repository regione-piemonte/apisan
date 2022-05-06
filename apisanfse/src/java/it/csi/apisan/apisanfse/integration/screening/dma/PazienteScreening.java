/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pazienteScreening complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pazienteScreening">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}paziente">
 *       &lt;sequence>
 *         &lt;element name="idScreening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pazienteScreening", propOrder = {
    "idScreening"
})
public class PazienteScreening
    extends Paziente
{

    protected String idScreening;

    /**
     * Recupera il valore della proprietà idScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdScreening() {
        return idScreening;
    }

    /**
     * Imposta il valore della proprietà idScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdScreening(String value) {
        this.idScreening = value;
    }

}
