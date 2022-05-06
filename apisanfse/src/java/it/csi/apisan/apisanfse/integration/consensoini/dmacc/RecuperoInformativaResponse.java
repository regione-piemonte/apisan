/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.consensoini.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.consensoini.dma.InformativaOUT;


/**
 * <p>Classe Java per recuperoInformativaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="recuperoInformativaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="informativaOUT" type="{http://dma.csi.it/}informativaOUT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoInformativaResponse", propOrder = {
    "informativaOUT"
})
public class RecuperoInformativaResponse
    extends ServiceResponse
{

    protected InformativaOUT informativaOUT;

    /**
     * Recupera il valore della proprieta informativaOUT.
     * 
     * @return
     *     possible object is
     *     {@link InformativaOUT }
     *     
     */
    public InformativaOUT getInformativaOUT() {
        return informativaOUT;
    }

    /**
     * Imposta il valore della proprieta informativaOUT.
     * 
     * @param value
     *     allowed object is
     *     {@link InformativaOUT }
     *     
     */
    public void setInformativaOUT(InformativaOUT value) {
        this.informativaOUT = value;
    }

}
