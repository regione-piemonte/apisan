/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisancons.integration.conspref.errorecittadino.Errore;


/**
 * <p>Classe Java per serviceResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elencoErrori" type="{erroreCittadino}errore" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", propOrder = {
    "esito",
    "elencoErrori"
})
@XmlSeeAlso({
    InserisciConsensoBeResponse.class,
    ConsultaStatoBeResponse.class,
    ConsultaInformativaResponse.class,
    ModificaConsensoBeResponse.class,
    ConsultaSottoTipoBeResponse.class,
    ConsultaAsrBeResponse.class,
    ConsultaTipoBeResponse.class,
    ConsultaNotificheBeResponse.class,
    ConsultaConsensoBeResponse.class
})
public class ServiceResponse {

    protected String esito;
    @XmlElement(nillable = true)
    protected List<Errore> elencoErrori;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Gets the value of the elencoErrori property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoErrori property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoErrori().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Errore }
     * 
     * 
     */
    public List<Errore> getElencoErrori() {
        if (elencoErrori == null) {
            elencoErrori = new ArrayList<Errore>();
        }
        return this.elencoErrori;
    }

}
