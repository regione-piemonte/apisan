/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoRicevutePagamentiOnorati complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoRicevutePagamentiOnorati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RICEVUTA_PAGAMENTO" type="{http://csi.it}RICEVUTA_PAGAMENTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoRicevutePagamentiOnorati", propOrder = {
    "ricevutapagamento"
})
public class ElencoRicevutePagamentiOnorati {

    @XmlElement(name = "RICEVUTA_PAGAMENTO")
    protected List<RICEVUTAPAGAMENTO> ricevutapagamento;

    /**
     * Gets the value of the ricevutapagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ricevutapagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRICEVUTAPAGAMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RICEVUTAPAGAMENTO }
     * 
     * 
     */
    public List<RICEVUTAPAGAMENTO> getRICEVUTAPAGAMENTO() {
        if (ricevutapagamento == null) {
            ricevutapagamento = new ArrayList<RICEVUTAPAGAMENTO>();
        }
        return this.ricevutapagamento;
    }

}
