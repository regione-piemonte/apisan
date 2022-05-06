/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.gestutility.ErroriType;


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
 *         &lt;element name="operatore" type="{http://www.csi.it/gestOperatore/}operatoreType"/>
 *         &lt;element name="listaFunzioni" type="{http://www.csi.it/gestOperatore/}listaFunzioniType"/>
 *         &lt;element name="listaApplicazioni" type="{http://www.csi.it/gestOperatore/}listaApplicazioniType"/>
 *         &lt;element name="errori" type="{http://www.csi.it/GestUtility/}ErroriType"/>
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
    "operatore",
    "listaFunzioni",
    "listaApplicazioni",
    "errori"
})
@XmlRootElement(name = "getAllDataResponse")
public class GetAllDataResponse {

    @XmlElement(required = true)
    protected OperatoreType operatore;
    @XmlElement(required = true)
    protected ListaFunzioniType listaFunzioni;
    @XmlElement(required = true)
    protected ListaApplicazioniType listaApplicazioni;
    @XmlElement(required = true)
    protected ErroriType errori;

    /**
     * Recupera il valore della proprietà operatore.
     * 
     * @return
     *     possible object is
     *     {@link OperatoreType }
     *     
     */
    public OperatoreType getOperatore() {
        return operatore;
    }

    /**
     * Imposta il valore della proprietà operatore.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatoreType }
     *     
     */
    public void setOperatore(OperatoreType value) {
        this.operatore = value;
    }

    /**
     * Recupera il valore della proprietà listaFunzioni.
     * 
     * @return
     *     possible object is
     *     {@link ListaFunzioniType }
     *     
     */
    public ListaFunzioniType getListaFunzioni() {
        return listaFunzioni;
    }

    /**
     * Imposta il valore della proprietà listaFunzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaFunzioniType }
     *     
     */
    public void setListaFunzioni(ListaFunzioniType value) {
        this.listaFunzioni = value;
    }

    /**
     * Recupera il valore della proprietà listaApplicazioni.
     * 
     * @return
     *     possible object is
     *     {@link ListaApplicazioniType }
     *     
     */
    public ListaApplicazioniType getListaApplicazioni() {
        return listaApplicazioni;
    }

    /**
     * Imposta il valore della proprietà listaApplicazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaApplicazioniType }
     *     
     */
    public void setListaApplicazioni(ListaApplicazioniType value) {
        this.listaApplicazioni = value;
    }

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setErrori(ErroriType value) {
        this.errori = value;
    }

}
