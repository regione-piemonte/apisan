/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazionesclusa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VaccinazioneEsclusa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VaccinazioneEsclusa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VaccinazioniEsclusePerImmunizzazione" type="{}ArrayOfDTOVaccinazioneEsclusa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VaccinazioneEsclusa", propOrder = {
    "vaccinazioniEsclusePerImmunizzazione"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class VaccinazioneEsclusa {

    @XmlElement(name = "VaccinazioniEsclusePerImmunizzazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOVaccinazioneEsclusa vaccinazioniEsclusePerImmunizzazione;

    /**
     * Recupera il valore della proprietà vaccinazioniEsclusePerImmunizzazione.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOVaccinazioneEsclusa }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTOVaccinazioneEsclusa getVaccinazioniEsclusePerImmunizzazione() {
        return vaccinazioniEsclusePerImmunizzazione;
    }

    /**
     * Imposta il valore della proprietà vaccinazioniEsclusePerImmunizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTOVaccinazioneEsclusa }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVaccinazioniEsclusePerImmunizzazione(ArrayOfDTOVaccinazioneEsclusa value) {
        this.vaccinazioniEsclusePerImmunizzazione = value;
    }

}
