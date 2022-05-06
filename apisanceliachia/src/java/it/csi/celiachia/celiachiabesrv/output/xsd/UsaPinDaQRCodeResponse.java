/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UsaPinDaQRCodeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UsaPinDaQRCodeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://output.celiachiabesrv.celiachia.csi.it/xsd}BasicEsitoOutput">
 *       &lt;sequence>
 *         &lt;element name="codiceAutorizzazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Errore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsaPinDaQRCodeResponse", propOrder = {
    "codiceAutorizzazione",
    "errore"
})
public class UsaPinDaQRCodeResponse
    extends BasicEsitoOutput
{

    @XmlElementRef(name = "codiceAutorizzazione", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceAutorizzazione;
    @XmlElementRef(name = "errore", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Errore> errore;

    /**
     * Recupera il valore della proprieta codiceAutorizzazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceAutorizzazione() {
        return codiceAutorizzazione;
    }

    /**
     * Imposta il valore della proprieta codiceAutorizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceAutorizzazione(JAXBElement<String> value) {
        this.codiceAutorizzazione = value;
    }

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public JAXBElement<Errore> getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public void setErrore(JAXBElement<Errore> value) {
        this.errore = value;
    }

}
