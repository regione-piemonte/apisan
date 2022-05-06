/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="soloAttivi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "soloAttivi"
})
@XmlRootElement(name = "getTipiRuoliOperatore")
public class GetTipiRuoliOperatore {

    protected boolean soloAttivi;

    /**
     * Recupera il valore della proprietà soloAttivi.
     * 
     */
    public boolean isSoloAttivi() {
        return soloAttivi;
    }

    /**
     * Imposta il valore della proprietà soloAttivi.
     * 
     */
    public void setSoloAttivi(boolean value) {
        this.soloAttivi = value;
    }

}
