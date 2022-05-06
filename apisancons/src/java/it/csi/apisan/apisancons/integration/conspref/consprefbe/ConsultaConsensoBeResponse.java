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
import it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso;


/**
 * <p>Classe Java per ConsultaConsensoBeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaConsensoBeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="consensi" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="consenso" type="{consensoCittadino}consenso" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ConsultaConsensoBeResponse", propOrder = {
    "consensi"
})
public class ConsultaConsensoBeResponse
    extends ServiceResponse
{

    protected ConsultaConsensoBeResponse.Consensi consensi;

    /**
     * Recupera il valore della proprietà consensi.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaConsensoBeResponse.Consensi }
     *     
     */
    public ConsultaConsensoBeResponse.Consensi getConsensi() {
        return consensi;
    }

    /**
     * Imposta il valore della proprietà consensi.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaConsensoBeResponse.Consensi }
     *     
     */
    public void setConsensi(ConsultaConsensoBeResponse.Consensi value) {
        this.consensi = value;
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
     *         &lt;element name="consenso" type="{consensoCittadino}consenso" maxOccurs="unbounded" minOccurs="0"/>
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
        "consenso"
    })
    public static class Consensi {

        protected List<Consenso> consenso;

        /**
         * Gets the value of the consenso property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consenso property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConsenso().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Consenso }
         * 
         * 
         */
        public List<Consenso> getConsenso() {
            if (consenso == null) {
                consenso = new ArrayList<Consenso>();
            }
            return this.consenso;
        }

    }

}
