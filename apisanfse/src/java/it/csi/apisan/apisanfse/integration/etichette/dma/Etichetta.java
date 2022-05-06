/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per etichetta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="etichetta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEtichetta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEtichetta" type="{http://dma.csi.it/}tipoEtichetta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etichetta", propOrder = {
    "idEtichetta",
    "testo",
    "tipoEtichetta"
})
public class Etichetta {

    protected Long idEtichetta;
    protected String testo;
    protected TipoEtichetta tipoEtichetta;

    /**
     * Recupera il valore della proprieta' idEtichetta.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEtichetta() {
        return idEtichetta;
    }

    /**
     * Imposta il valore della proprieta' idEtichetta.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEtichetta(Long value) {
        this.idEtichetta = value;
    }

    /**
     * Recupera il valore della proprieta' testo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesto() {
        return testo;
    }

    /**
     * Imposta il valore della proprieta' testo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesto(String value) {
        this.testo = value;
    }

    /**
     * Recupera il valore della proprieta' tipoEtichetta.
     * 
     * @return
     *     possible object is
     *     {@link TipoEtichetta }
     *     
     */
    public TipoEtichetta getTipoEtichetta() {
        return tipoEtichetta;
    }

    /**
     * Imposta il valore della proprieta' tipoEtichetta.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEtichetta }
     *     
     */
    public void setTipoEtichetta(TipoEtichetta value) {
        this.tipoEtichetta = value;
    }

}
