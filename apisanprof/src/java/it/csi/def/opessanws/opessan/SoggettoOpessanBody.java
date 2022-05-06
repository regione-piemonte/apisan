/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.def.opessanws.opessan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SoggettoOpessanBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SoggettoOpessanBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="elencoStudiMedici" type="{http://opessan.opessanws.def.csi.it/}StudioMedico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoggettoOpessanBody", propOrder = {
    "idAura",
    "elencoStudiMedici"
})
public class SoggettoOpessanBody {

    @XmlElement(required = true)
    protected BigDecimal idAura;
    @XmlElement(nillable = true)
    protected List<StudioMedico> elencoStudiMedici;

    /**
     * Recupera il valore della proprietà idAura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdAura() {
        return idAura;
    }

    /**
     * Imposta il valore della proprietà idAura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdAura(BigDecimal value) {
        this.idAura = value;
    }

    /**
     * Gets the value of the elencoStudiMedici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoStudiMedici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoStudiMedici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudioMedico }
     * 
     * 
     */
    public List<StudioMedico> getElencoStudiMedici() {
        if (elencoStudiMedici == null) {
            elencoStudiMedici = new ArrayList<StudioMedico>();
        }
        return this.elencoStudiMedici;
    }

}
