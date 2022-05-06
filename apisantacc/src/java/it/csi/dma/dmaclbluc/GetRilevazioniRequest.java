/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getRilevazioniRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRilevazioniRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommonGet">
 *       &lt;sequence>
 *         &lt;element name="listaCodiceGruppo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="listaCodiceDescrittore" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRilevazioniRequest", propOrder = {
    "listaCodiceGruppo",
    "listaCodiceDescrittore"
})
public class GetRilevazioniRequest
    extends RequestCommonGet
{

    protected List<String> listaCodiceGruppo;
    protected List<String> listaCodiceDescrittore;

    /**
     * Gets the value of the listaCodiceGruppo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCodiceGruppo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCodiceGruppo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaCodiceGruppo() {
        if (listaCodiceGruppo == null) {
            listaCodiceGruppo = new ArrayList<String>();
        }
        return this.listaCodiceGruppo;
    }

    /**
     * Gets the value of the listaCodiceDescrittore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCodiceDescrittore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCodiceDescrittore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaCodiceDescrittore() {
        if (listaCodiceDescrittore == null) {
            listaCodiceDescrittore = new ArrayList<String>();
        }
        return this.listaCodiceDescrittore;
    }

}
