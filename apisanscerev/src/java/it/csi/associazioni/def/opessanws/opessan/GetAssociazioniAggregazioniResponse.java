/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.associazioni.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.associazioni.dto.opessanws.opessan.common.response.Footer;
import it.csi.associazioni.dto.opessanws.opessan.common.response.Header;


/**
 * <p>Classe Java per getAssociazioniAggregazioniResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getAssociazioniAggregazioniResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="header" type="{http://opessan.opessanws.dto.csi.it/common/response/}Header"/>
 *                   &lt;element name="body" type="{http://opessan.opessanws.def.csi.it/}ElencoAssociazioniBody" minOccurs="0"/>
 *                   &lt;element name="footer" type="{http://opessan.opessanws.dto.csi.it/common/response/}Footer" minOccurs="0"/>
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
@XmlType(name = "getAssociazioniAggregazioniResponse_return", propOrder = {
    "_return"
})
public class GetAssociazioniAggregazioniResponse {

    @XmlElement(name = "return")
    protected GetAssociazioniAggregazioniResponse.Return _return;

    /**
     * Recupera il valore della poprieta return.
     * 
     * @return
     *     possible object is
     *     {@link GetAssociazioniAggregazioniResponse.Return }
     *     
     */
    public GetAssociazioniAggregazioniResponse.Return getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della poprieta return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssociazioniAggregazioniResponse.Return }
     *     
     */
    public void setReturn(GetAssociazioniAggregazioniResponse.Return value) {
        this._return = value;
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
     *         &lt;element name="header" type="{http://opessan.opessanws.dto.csi.it/common/response/}Header"/>
     *         &lt;element name="body" type="{http://opessan.opessanws.def.csi.it/}ElencoAssociazioniBody" minOccurs="0"/>
     *         &lt;element name="footer" type="{http://opessan.opessanws.dto.csi.it/common/response/}Footer" minOccurs="0"/>
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
        "body",
        "footer"
    })
    public static class Return {

        @XmlElement(required = true)
        protected Header header;
        protected ElencoAssociazioniBody body;
        protected Footer footer;

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
         *     {@link ElencoAssociazioniBody }
         *     
         */
        public ElencoAssociazioniBody getBody() {
            return body;
        }

        /**
         * Imposta il valore della poprieta body.
         * 
         * @param value
         *     allowed object is
         *     {@link ElencoAssociazioniBody }
         *     
         */
        public void setBody(ElencoAssociazioniBody value) {
            this.body = value;
        }

        /**
         * Recupera il valore della poprieta footer.
         * 
         * @return
         *     possible object is
         *     {@link Footer }
         *     
         */
        public Footer getFooter() {
            return footer;
        }

        /**
         * Imposta il valore della poprieta footer.
         * 
         * @param value
         *     allowed object is
         *     {@link Footer }
         *     
         */
        public void setFooter(Footer value) {
            this.footer = value;
        }

    }

}
