/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="idTipoScreening" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoAgenda" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idTipoScreening",
    "tipoAgenda"
})
@XmlRootElement(name = "getTipoSpazioRis")
public class GetTipoSpazioRis {

    protected int idTipoScreening;
    protected int tipoAgenda;

    /**
     * Recupera il valore della proprietà idTipoScreening.
     * 
     */
    public int getIdTipoScreening() {
        return idTipoScreening;
    }

    /**
     * Imposta il valore della proprietà idTipoScreening.
     * 
     */
    public void setIdTipoScreening(int value) {
        this.idTipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà tipoAgenda.
     * 
     */
    public int getTipoAgenda() {
        return tipoAgenda;
    }

    /**
     * Imposta il valore della proprietà tipoAgenda.
     * 
     */
    public void setTipoAgenda(int value) {
        this.tipoAgenda = value;
    }

}
