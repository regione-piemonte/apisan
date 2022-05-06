/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.dto.opessanws.opessan.common.request.Header;


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
 *         &lt;element name="header" type="{http://opessan.opessanws.dto.csi.it/common/request/}Header"/>
 *         &lt;element name="body" type="{http://opessan.opessanws.def.csi.it/}IdentificativoProfilo"/>
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
    "header",
    "body"
})
@XmlRootElement(name = "ReqElencoStudiMedici")
public class ReqElencoStudiMedici {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected IdentificativoProfilo body;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà body.
     * 
     * @return
     *     possible object is
     *     {@link IdentificativoProfilo }
     *     
     */
    public IdentificativoProfilo getBody() {
        return body;
    }

    /**
     * Imposta il valore della proprietà body.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificativoProfilo }
     *     
     */
    public void setBody(IdentificativoProfilo value) {
        this.body = value;
    }

}
