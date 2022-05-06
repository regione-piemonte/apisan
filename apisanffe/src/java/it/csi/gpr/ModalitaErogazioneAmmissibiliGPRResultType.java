/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModalitaErogazioneAmmissibiliGPRResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModalitaErogazioneAmmissibiliGPRResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LISTA_MODALITA" type="{http://csi.it}ListaModalitaErogazioneType" minOccurs="0"/>
 *         &lt;element name="ERRORE" type="{http://csi.it}Errore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalitaErogazioneAmmissibiliGPRResultType", propOrder = {
    "listamodalita",
    "errore"
})
public class ModalitaErogazioneAmmissibiliGPRResultType {

    @XmlElement(name = "LISTA_MODALITA")
    protected ListaModalitaErogazioneType listamodalita;
    @XmlElement(name = "ERRORE", required = true)
    protected Errore errore;

    /**
     * Recupera il valore della proprietà listamodalita.
     * 
     * @return
     *     possible object is
     *     {@link ListaModalitaErogazioneType }
     *     
     */
    public ListaModalitaErogazioneType getLISTAMODALITA() {
        return listamodalita;
    }

    /**
     * Imposta il valore della proprietà listamodalita.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaModalitaErogazioneType }
     *     
     */
    public void setLISTAMODALITA(ListaModalitaErogazioneType value) {
        this.listamodalita = value;
    }

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link Errore }
     *     
     */
    public Errore getERRORE() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link Errore }
     *     
     */
    public void setERRORE(Errore value) {
        this.errore = value;
    }

}
