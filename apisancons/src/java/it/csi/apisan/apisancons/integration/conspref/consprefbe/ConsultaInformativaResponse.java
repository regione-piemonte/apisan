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


/**
 * <p>Classe Java per consultaInformativaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consultaInformativaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="informative" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="informativa" type="{http://consprefbe.csi.it/}informativa" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "consultaInformativaResponse", propOrder = {
    "informative"
})
public class ConsultaInformativaResponse
    extends ServiceResponse
{

    protected ConsultaInformativaResponse.Informative informative;

    /**
     * Recupera il valore della proprietà informative.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaInformativaResponse.Informative }
     *     
     */
    public ConsultaInformativaResponse.Informative getInformative() {
        return informative;
    }

    /**
     * Imposta il valore della proprietà informative.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaInformativaResponse.Informative }
     *     
     */
    public void setInformative(ConsultaInformativaResponse.Informative value) {
        this.informative = value;
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
     *         &lt;element name="informativa" type="{http://consprefbe.csi.it/}informativa" maxOccurs="unbounded" minOccurs="0"/>
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
        "informativa"
    })
    public static class Informative {

        protected List<Informativa> informativa;

        /**
         * Gets the value of the informativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Informativa }
         * 
         * 
         */
        public List<Informativa> getInformativa() {
            if (informativa == null) {
                informativa = new ArrayList<Informativa>();
            }
            return this.informativa;
        }

    }

}
