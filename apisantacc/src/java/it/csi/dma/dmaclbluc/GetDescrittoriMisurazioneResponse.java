/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDescrittoriMisurazioneResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDescrittoriMisurazioneResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaDescrittoreMisurazione" type="{http://dmaclbluc.dma.csi.it/}listaDescrittoreMisurazione" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDescrittoriMisurazioneResponse", propOrder = {
    "listaDescrittoreMisurazione"
})
public class GetDescrittoriMisurazioneResponse
    extends ServiceResponse
{

    protected ListaDescrittoreMisurazione listaDescrittoreMisurazione;

    /**
     * Recupera il valore della proprietà listaDescrittoreMisurazione.
     * 
     * @return
     *     possible object is
     *     {@link ListaDescrittoreMisurazione }
     *     
     */
    public ListaDescrittoreMisurazione getListaDescrittoreMisurazione() {
        return listaDescrittoreMisurazione;
    }

    /**
     * Imposta il valore della proprietà listaDescrittoreMisurazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDescrittoreMisurazione }
     *     
     */
    public void setListaDescrittoreMisurazione(ListaDescrittoreMisurazione value) {
        this.listaDescrittoreMisurazione = value;
    }

}
