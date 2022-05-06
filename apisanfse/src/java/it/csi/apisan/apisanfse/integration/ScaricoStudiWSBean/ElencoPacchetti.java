/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ElencoPacchetti complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ElencoPacchetti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRichiestaScarico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElencoPacchetti", propOrder = {
    "idRichiestaScarico",
    "directory",
    "zipName"
})
public class ElencoPacchetti {

    protected String idRichiestaScarico;
    protected String directory;
    protected String zipName;

    /**
     * Recupera il valore della propriet� idRichiestaScarico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRichiestaScarico() {
        return idRichiestaScarico;
    }

    /**
     * Imposta il valore della propriet� idRichiestaScarico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRichiestaScarico(String value) {
        this.idRichiestaScarico = value;
    }

    /**
     * Recupera il valore della propriet� directory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Imposta il valore della propriet� directory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Recupera il valore della propriet� zipName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipName() {
        return zipName;
    }

    /**
     * Imposta il valore della propriet� zipName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipName(String value) {
        this.zipName = value;
    }

}
