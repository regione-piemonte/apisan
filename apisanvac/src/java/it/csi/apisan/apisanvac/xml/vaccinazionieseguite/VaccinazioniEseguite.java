/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazionieseguite;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VaccinazioniEseguite complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VaccinazioniEseguite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Segnalazione" type="{}DTOSegnalazioneReazioniAvverse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VaccinazioniEseguite", propOrder = {
    "segnalazione"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class VaccinazioniEseguite {

    @XmlElement(name = "Segnalazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOSegnalazioneReazioniAvverse segnalazione;

    /**
     * Recupera il valore della proprietà segnalazione.
     * 
     * @return
     *     possible object is
     *     {@link DTOSegnalazioneReazioniAvverse }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOSegnalazioneReazioniAvverse getSegnalazione() {
        return segnalazione;
    }

    /**
     * Imposta il valore della proprietà segnalazione.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOSegnalazioneReazioniAvverse }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSegnalazione(DTOSegnalazioneReazioniAvverse value) {
        this.segnalazione = value;
    }

}
