/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.StatoNotifica;


/**
 * <p>Classe Java per ConsultaNotificheBeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaNotificheBeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoNotifiche" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="statoNotifica" type="{statoNotifica}statoNotifica" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaNotificheBeResponse", propOrder = {
    "cfCittadino",
    "statoNotifiche"
})
public class ConsultaNotificheBeResponse
    extends ServiceResponse
{

    protected String cfCittadino;
    protected ConsultaNotificheBeResponse.StatoNotifiche statoNotifiche;

    /**
     * Recupera il valore della proprietà cfCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfCittadino() {
        return cfCittadino;
    }

    /**
     * Imposta il valore della proprietà cfCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfCittadino(String value) {
        this.cfCittadino = value;
    }

    /**
     * Recupera il valore della proprietà statoNotifiche.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaNotificheBeResponse.StatoNotifiche }
     *     
     */
    public ConsultaNotificheBeResponse.StatoNotifiche getStatoNotifiche() {
        return statoNotifiche;
    }

    /**
     * Imposta il valore della proprietà statoNotifiche.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaNotificheBeResponse.StatoNotifiche }
     *     
     */
    public void setStatoNotifiche(ConsultaNotificheBeResponse.StatoNotifiche value) {
        this.statoNotifiche = value;
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
     *         &lt;element name="statoNotifica" type="{statoNotifica}statoNotifica" maxOccurs="unbounded" minOccurs="0"/>
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
        "statoNotifica"
    })
    public static class StatoNotifiche {

        protected List<StatoNotifica> statoNotifica;

        /**
         * Gets the value of the statoNotifica property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statoNotifica property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatoNotifica().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatoNotifica }
         * 
         * 
         */
        public List<StatoNotifica> getStatoNotifica() {
            if (statoNotifica == null) {
                statoNotifica = new ArrayList<StatoNotifica>();
            }
            return this.statoNotifica;
        }

    }

}

