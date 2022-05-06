/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafefind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per datiAnagraficiMsg complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiAnagraficiMsg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://AnagrafeFind.central.services.auraws.aura.csi.it}Ens_Response">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://AnagrafeFind.central.services.auraws.aura.csi.it}Header" minOccurs="0"/>
 *         &lt;element name="body" type="{http://AnagrafeFind.central.services.auraws.aura.csi.it}DatiAnagraficiBody" minOccurs="0"/>
 *         &lt;element name="footer" type="{http://AnagrafeFind.central.services.auraws.aura.csi.it}Footer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiAnagraficiMsg", propOrder = {
    "header",
    "body",
    "footer"
})
public class DatiAnagraficiMsg
    extends EnsResponse
{

    protected Header header;
    protected DatiAnagraficiBody body;
    protected Footer footer;

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
     *     {@link DatiAnagraficiBody }
     *     
     */
    public DatiAnagraficiBody getBody() {
        return body;
    }

    /**
     * Imposta il valore della proprietà body.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiBody }
     *     
     */
    public void setBody(DatiAnagraficiBody value) {
        this.body = value;
    }

    /**
     * Recupera il valore della proprietà footer.
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
     * Imposta il valore della proprietà footer.
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
