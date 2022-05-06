/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.datidocumentimodel;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per DatiDocumentiModel complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiDocumentiModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documento" type="{}DocumentoModel" minOccurs="0"/>
 *         &lt;element name="Result" type="{}ResultSetPost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiDocumentiModel", propOrder = {
    "documento",
    "result"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
@XmlRootElement(name = "DatiDocumentiModel")
public class DatiDocumentiModel {

    @XmlElement(name = "Documento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DocumentoModel documento;
    @XmlElement(name = "Result")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ResultSetPost result;

    /**
     * Recupera il valore della proprietà documento.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoModel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DocumentoModel getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprietà documento.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoModel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumento(DocumentoModel value) {
        this.documento = value;
    }

    /**
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetPost }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ResultSetPost getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetPost }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setResult(ResultSetPost value) {
        this.result = value;
    }

}
