/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaFunzioniType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaFunzioniType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funzione" type="{http://www.csi.it/gestOperatore/}funzioneApplicazioneType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaFunzioniType", propOrder = {
    "funzione"
})
public class ListaFunzioniType {

    @XmlElement(required = true)
    protected List<FunzioneApplicazioneType> funzione;

    /**
     * Gets the value of the funzione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funzione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunzione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunzioneApplicazioneType }
     * 
     * 
     */
    public List<FunzioneApplicazioneType> getFunzione() {
        if (funzione == null) {
            funzione = new ArrayList<FunzioneApplicazioneType>();
        }
        return this.funzione;
    }

}
