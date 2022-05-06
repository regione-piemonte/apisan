/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Clause complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Clause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clauseLiv" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clauseScreenId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clauseScreenType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codiceFunzionalita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="screenMap" type="{http://www.csi.it/GestCommon/}Screening" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clause", propOrder = {
    "clauseLiv",
    "clauseScreenId",
    "clauseScreenType",
    "codiceFunzionalita",
    "screenMap"
})
public class Clause {

    @XmlElement(nillable = true)
    protected List<Integer> clauseLiv;
    @XmlElement(nillable = true)
    protected List<Integer> clauseScreenId;
    @XmlElement(nillable = true)
    protected List<String> clauseScreenType;
    protected String codiceFunzionalita;
    protected Screening screenMap;

    /**
     * Gets the value of the clauseLiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clauseLiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClauseLiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getClauseLiv() {
        if (clauseLiv == null) {
            clauseLiv = new ArrayList<Integer>();
        }
        return this.clauseLiv;
    }

    /**
     * Gets the value of the clauseScreenId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clauseScreenId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClauseScreenId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getClauseScreenId() {
        if (clauseScreenId == null) {
            clauseScreenId = new ArrayList<Integer>();
        }
        return this.clauseScreenId;
    }

    /**
     * Gets the value of the clauseScreenType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clauseScreenType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClauseScreenType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClauseScreenType() {
        if (clauseScreenType == null) {
            clauseScreenType = new ArrayList<String>();
        }
        return this.clauseScreenType;
    }

    /**
     * Recupera il valore della proprietà codiceFunzionalita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFunzionalita() {
        return codiceFunzionalita;
    }

    /**
     * Imposta il valore della proprietà codiceFunzionalita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFunzionalita(String value) {
        this.codiceFunzionalita = value;
    }

    /**
     * Recupera il valore della proprietà screenMap.
     * 
     * @return
     *     possible object is
     *     {@link Screening }
     *     
     */
    public Screening getScreenMap() {
        return screenMap;
    }

    /**
     * Imposta il valore della proprietà screenMap.
     * 
     * @param value
     *     allowed object is
     *     {@link Screening }
     *     
     */
    public void setScreenMap(Screening value) {
        this.screenMap = value;
    }

}
