/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getEventiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getEventiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaEventi" type="{http://dmaclbluc.dma.csi.it/}listaEventi" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventiResponse", propOrder = {
    "listaEventi"
})
public class GetEventiResponse
    extends ServiceResponse
{

    protected ListaEventi listaEventi;

    /**
     * Recupera il valore della proprietà listaEventi.
     * 
     * @return
     *     possible object is
     *     {@link ListaEventi }
     *     
     */
    public ListaEventi getListaEventi() {
        return listaEventi;
    }

    /**
     * Imposta il valore della proprietà listaEventi.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaEventi }
     *     
     */
    public void setListaEventi(ListaEventi value) {
        this.listaEventi = value;
    }

}
