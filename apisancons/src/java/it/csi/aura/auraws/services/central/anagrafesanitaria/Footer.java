/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafesanitaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Footer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Footer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}ArrayOfmessageMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Footer", propOrder = {
    "messages"
})
public class Footer {

    protected ArrayOfmessageMessage messages;

    /**
     * Recupera il valore della proprietà messages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfmessageMessage }
     *     
     */
    public ArrayOfmessageMessage getMessages() {
        return messages;
    }

    /**
     * Imposta il valore della proprietà messages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfmessageMessage }
     *     
     */
    public void setMessages(ArrayOfmessageMessage value) {
        this.messages = value;
    }

}
