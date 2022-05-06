/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.associazioni.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.associazioni.dto.opessanws.opessan.common.request.Header;


/**
 * <p>Classe Java per getAssociazioniAggregazioni complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getAssociazioniAggregazioni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="header" type="{http://opessan.opessanws.dto.csi.it/common/request/}Header"/>
 *                   &lt;element name="body" type="{http://opessan.opessanws.def.csi.it/}AssociazioniAggregazioniBody"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAssociazioniAggregazioniArg0", propOrder = {
    "arg0"
})
public class GetAssociazioniAggregazioni {

    protected GetAssociazioniAggregazioni.Arg0 arg0;

    /**
     * Recupera il valore della poprieta arg0.
     * 
     * @return
     *     possible object is
     *     {@link GetAssociazioniAggregazioni.Arg0 }
     *     
     */
    public GetAssociazioniAggregazioni.Arg0 getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della poprieta arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssociazioniAggregazioni.Arg0 }
     *     
     */
    public void setArg0(GetAssociazioniAggregazioni.Arg0 value) {
        this.arg0 = value;
    }


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
     *         &lt;element name="body" type="{http://opessan.opessanws.def.csi.it/}AssociazioniAggregazioniBody"/>
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
    public static class Arg0 {

        @XmlElement(required = true)
        protected Header header;
        @XmlElement(required = true)
        protected AssociazioniAggregazioniBody body;

        /**
         * Recupera il valore della poprieta header.
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
         * Imposta il valore della poprieta header.
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
         * Recupera il valore della poprieta body.
         * 
         * @return
         *     possible object is
         *     {@link AssociazioniAggregazioniBody }
         *     
         */
        public AssociazioniAggregazioniBody getBody() {
            return body;
        }

        /**
         * Imposta il valore della poprieta body.
         * 
         * @param value
         *     allowed object is
         *     {@link AssociazioniAggregazioniBody }
         *     
         */
        public void setBody(AssociazioniAggregazioniBody value) {
            this.body = value;
        }

    }

}
