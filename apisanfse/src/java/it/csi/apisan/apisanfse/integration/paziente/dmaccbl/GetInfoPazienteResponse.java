/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.ContattiPaziente;


/**
 * <p>Classe Java per getInfoPazienteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getInfoPazienteResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaccbl.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}contattiPaziente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoPazienteResponse", propOrder = {
    "contattiPaziente"
})
public class GetInfoPazienteResponse
    extends ServiceResponse
{

    @XmlElement(namespace = "http://dma.csi.it/")
    protected ContattiPaziente contattiPaziente;

    /**
     * Recupera il valore della proprietà contattiPaziente.
     * 
     * @return
     *     possible object is
     *     {@link ContattiPaziente }
     *     
     */
    public ContattiPaziente getContattiPaziente() {
        return contattiPaziente;
    }

    /**
     * Imposta il valore della proprietà contattiPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link ContattiPaziente }
     *     
     */
    public void setContattiPaziente(ContattiPaziente value) {
        this.contattiPaziente = value;
    }

}
