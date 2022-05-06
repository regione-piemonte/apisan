/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per taccuino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="taccuino">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="oscurato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="notaGenerale" type="{http://dmaclbluc.dma.csi.it/}notaGenerale" minOccurs="0" form="qualified"/>
 *         &lt;element name="listaPreferenze" type="{http://dmaclbluc.dma.csi.it/}listaPreferenze" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taccuino", propOrder = {
    "id",
    "oscurato",
    "notaGenerale",
    "listaPreferenze"
})
public class Taccuino {

    protected Long id;
    protected String oscurato;
    protected NotaGenerale notaGenerale;
    protected ListaPreferenze listaPreferenze;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà oscurato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscurato() {
        return oscurato;
    }

    /**
     * Imposta il valore della proprietà oscurato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscurato(String value) {
        this.oscurato = value;
    }

    /**
     * Recupera il valore della proprietà notaGenerale.
     * 
     * @return
     *     possible object is
     *     {@link NotaGenerale }
     *     
     */
    public NotaGenerale getNotaGenerale() {
        return notaGenerale;
    }

    /**
     * Imposta il valore della proprietà notaGenerale.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaGenerale }
     *     
     */
    public void setNotaGenerale(NotaGenerale value) {
        this.notaGenerale = value;
    }

    /**
     * Recupera il valore della proprietà listaPreferenze.
     * 
     * @return
     *     possible object is
     *     {@link ListaPreferenze }
     *     
     */
    public ListaPreferenze getListaPreferenze() {
        return listaPreferenze;
    }

    /**
     * Imposta il valore della proprietà listaPreferenze.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPreferenze }
     *     
     */
    public void setListaPreferenze(ListaPreferenze value) {
        this.listaPreferenze = value;
    }

}
