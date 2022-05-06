/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="dipartimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_uo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dipartimento",
    "azienda",
    "tipoUo"
})
@XmlRootElement(name = "getLivSat")
public class GetLivSat {

    protected int dipartimento;
    protected int azienda;
    @XmlElement(name = "tipo_uo")
    protected int tipoUo;

    /**
     * Recupera il valore della proprietà dipartimento.
     * 
     */
    public int getDipartimento() {
        return dipartimento;
    }

    /**
     * Imposta il valore della proprietà dipartimento.
     * 
     */
    public void setDipartimento(int value) {
        this.dipartimento = value;
    }

    /**
     * Recupera il valore della proprietà azienda.
     * 
     */
    public int getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprietà azienda.
     * 
     */
    public void setAzienda(int value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della proprietà tipoUo.
     * 
     */
    public int getTipoUo() {
        return tipoUo;
    }

    /**
     * Imposta il valore della proprietà tipoUo.
     * 
     */
    public void setTipoUo(int value) {
        this.tipoUo = value;
    }

}
