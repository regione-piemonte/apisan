/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per AppuntamentiVaccinali complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AppuntamentiVaccinali">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Convocazioni" type="{}ArrayOfDTOConvocazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppuntamentiVaccinali", propOrder = {
    "convocazioni"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
@XmlRootElement(name = "AppuntamentiVaccinali")
public class AppuntamentiVaccinali {

    @XmlElement(name = "Convocazioni")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOConvocazione convocazioni;

    /**
     * Recupera il valore della proprietà convocazioni.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOConvocazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTOConvocazione getConvocazioni() {
        return convocazioni;
    }

    /**
     * Imposta il valore della proprietà convocazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTOConvocazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setConvocazioni(ArrayOfDTOConvocazione value) {
        this.convocazioni = value;
    }

}
