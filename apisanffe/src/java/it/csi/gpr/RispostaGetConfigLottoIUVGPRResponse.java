/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rispostaGetConfigLottoIUVGPRResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rispostaGetConfigLottoIUVGPRResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONFIGURAZIONE_LOTTI" type="{http://csi.it}ConfigurazioneLotti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaGetConfigLottoIUVGPRResponse", propOrder = {
    "configurazionelotti"
})
public class RispostaGetConfigLottoIUVGPRResponse {

    @XmlElement(name = "CONFIGURAZIONE_LOTTI")
    protected ConfigurazioneLotti configurazionelotti;

    /**
     * Recupera il valore della proprietà configurazionelotti.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurazioneLotti }
     *     
     */
    public ConfigurazioneLotti getCONFIGURAZIONELOTTI() {
        return configurazionelotti;
    }

    /**
     * Imposta il valore della proprietà configurazionelotti.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurazioneLotti }
     *     
     */
    public void setCONFIGURAZIONELOTTI(ConfigurazioneLotti value) {
        this.configurazionelotti = value;
    }

}
