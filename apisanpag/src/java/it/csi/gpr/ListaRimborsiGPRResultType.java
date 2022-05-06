/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ListaRimborsiGPRResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListaRimborsiGPRResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LISTA_TICKET" type="{http://csi.it}Importi" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListaRimborsiGPRResultType", propOrder = {
    "listaticket",
    "errore"
})
public class ListaRimborsiGPRResultType {

    @XmlElement(name = "LISTA_TICKET")
    protected List<Importi> listaticket;
    @XmlElement(name = "ERRORE", required = true)
    protected Errore errore;

    /**
     * Gets the value of the listaticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTATICKET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Importi }
     * 
     * 
     */
    public List<Importi> getLISTATICKET() {
        if (listaticket == null) {
            listaticket = new ArrayList<Importi>();
        }
        return this.listaticket;
    }

    /**
     * Recupera il valore della proprieta errore.
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
     * Imposta il valore della proprieta errore.
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
