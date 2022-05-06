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
 * <p>Classe Java per SetCodiceVersamentoGPRResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SetCodiceVersamentoGPRResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ERRORE" type="{http://csi.it}ErroreSetCodiceVersamento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetCodiceVersamentoGPRResponseType", propOrder = {
    "errore"
})
public class SetCodiceVersamentoGPRResponseType {

    @XmlElement(name = "ERRORE", required = true)
    protected ErroreSetCodiceVersamento errore;

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link ErroreSetCodiceVersamento }
     *     
     */
    public ErroreSetCodiceVersamento getERRORE() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroreSetCodiceVersamento }
     *     
     */
    public void setERRORE(ErroreSetCodiceVersamento value) {
        this.errore = value;
    }

}
