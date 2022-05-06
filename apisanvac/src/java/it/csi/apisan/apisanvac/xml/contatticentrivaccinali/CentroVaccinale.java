/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.contatticentrivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CentroVaccinale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CentroVaccinale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContattiCentroV" type="{}DTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentroVaccinale", propOrder = {
    "contattiCentroV"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CentroVaccinale {

    @XmlElement(name = "ContattiCentroV")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTO contattiCentroV;

    /**
     * Recupera il valore della proprietà contattiCentroV.
     * 
     * @return
     *     possible object is
     *     {@link DTO }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTO getContattiCentroV() {
        return contattiCentroV;
    }

    /**
     * Imposta il valore della proprietà contattiCentroV.
     * 
     * @param value
     *     allowed object is
     *     {@link DTO }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContattiCentroV(DTO value) {
        this.contattiCentroV = value;
    }

}
