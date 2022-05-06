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
 * <p>Classe Java per consultaAsrBeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consultaAsrBeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="asr" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="asr" type="{http://consprefbe.csi.it/}tipoASR" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "consultaAsrBeResponse", propOrder = {
    "asr"
})
public class ConsultaAsrBeResponse
    extends ServiceResponse
{

    protected ConsultaAsrBeResponse.Asr asr;

    /**
     * Recupera il valore della proprietà asr.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaAsrBeResponse.Asr }
     *     
     */
    public ConsultaAsrBeResponse.Asr getAsr() {
        return asr;
    }

    /**
     * Imposta il valore della proprietà asr.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaAsrBeResponse.Asr }
     *     
     */
    public void setAsr(ConsultaAsrBeResponse.Asr value) {
        this.asr = value;
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
     *         &lt;element name="asr" type="{http://consprefbe.csi.it/}tipoASR" maxOccurs="unbounded" minOccurs="0"/>
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
        "asr"
    })
    public static class Asr {

        protected List<TipoASR> asr;

        /**
         * Gets the value of the asr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoASR }
         * 
         * 
         */
        public List<TipoASR> getAsr() {
            if (asr == null) {
                asr = new ArrayList<TipoASR>();
            }
            return this.asr;
        }

    }

}
