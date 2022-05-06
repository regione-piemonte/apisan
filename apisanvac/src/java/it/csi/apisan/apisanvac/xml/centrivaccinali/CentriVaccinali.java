/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.centrivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per CentriVaccinali complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CentriVaccinali">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentroV" type="{}CentroVaccinale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentriVaccinali", propOrder = {
    "centroV"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
@XmlRootElement(name = "CentriVaccinali")
public class CentriVaccinali {

    @XmlElement(name = "CentroV")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CentroVaccinale centroV;

    /**
     * Recupera il valore della proprietà centroV.
     * 
     * @return
     *     possible object is
     *     {@link CentroVaccinale }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CentroVaccinale getCentroV() {
        return centroV;
    }

    /**
     * Imposta il valore della proprietà centroV.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroVaccinale }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCentroV(CentroVaccinale value) {
        this.centroV = value;
    }

}
