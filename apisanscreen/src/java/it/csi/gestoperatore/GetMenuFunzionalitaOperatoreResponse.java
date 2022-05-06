/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMenuFunzionalitaOperatoreResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMenuFunzionalitaOperatoreResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.csi.it/gestOperatore/}returnCodeType" minOccurs="0"/>
 *         &lt;element name="listaFunzioni" type="{http://www.csi.it/gestOperatore/}listaFunzioniType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMenuFunzionalitaOperatoreResponse", propOrder = {
    "returnCode",
    "listaFunzioni"
})
public class GetMenuFunzionalitaOperatoreResponse {

    protected ReturnCodeType returnCode;
    protected ListaFunzioniType listaFunzioni;

    /**
     * Recupera il valore della proprietà returnCode.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCodeType }
     *     
     */
    public ReturnCodeType getReturnCode() {
        return returnCode;
    }

    /**
     * Imposta il valore della proprietà returnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCodeType }
     *     
     */
    public void setReturnCode(ReturnCodeType value) {
        this.returnCode = value;
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

}
