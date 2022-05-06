/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per rilevazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rilevazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valoreNumerico" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0" form="qualified"/>
 *         &lt;element name="valoreTestuale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="unitaMisura" type="{http://dmaclbluc.dma.csi.it/}unitaMisura" minOccurs="0" form="qualified"/>
 *         &lt;element name="gruppo" type="{http://dmaclbluc.dma.csi.it/}gruppo" minOccurs="0" form="qualified"/>
 *         &lt;element name="descrittore" type="{http://dmaclbluc.dma.csi.it/}descrittore" minOccurs="0" form="qualified"/>
 *         &lt;element name="modalitaRilevazione" type="{http://dmaclbluc.dma.csi.it/}modalitaRilevazione" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rilevazione", propOrder = {
    "valoreNumerico",
    "valoreTestuale",
    "data",
    "unitaMisura",
    "gruppo",
    "descrittore",
    "modalitaRilevazione"
})
public class Rilevazione {

    protected Float valoreNumerico;
    protected String valoreTestuale;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected UnitaMisura unitaMisura;
    protected Gruppo gruppo;
    protected Descrittore descrittore;
    protected ModalitaRilevazione modalitaRilevazione;

    /**
     * Recupera il valore della proprietà valoreNumerico.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValoreNumerico() {
        return valoreNumerico;
    }

    /**
     * Imposta il valore della proprietà valoreNumerico.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValoreNumerico(Float value) {
        this.valoreNumerico = value;
    }

    /**
     * Recupera il valore della proprietà valoreTestuale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoreTestuale() {
        return valoreTestuale;
    }

    /**
     * Imposta il valore della proprietà valoreTestuale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoreTestuale(String value) {
        this.valoreTestuale = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà unitaMisura.
     * 
     * @return
     *     possible object is
     *     {@link UnitaMisura }
     *     
     */
    public UnitaMisura getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * Imposta il valore della proprietà unitaMisura.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitaMisura }
     *     
     */
    public void setUnitaMisura(UnitaMisura value) {
        this.unitaMisura = value;
    }

    /**
     * Recupera il valore della proprietà gruppo.
     * 
     * @return
     *     possible object is
     *     {@link Gruppo }
     *     
     */
    public Gruppo getGruppo() {
        return gruppo;
    }

    /**
     * Imposta il valore della proprietà gruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link Gruppo }
     *     
     */
    public void setGruppo(Gruppo value) {
        this.gruppo = value;
    }

    /**
     * Recupera il valore della proprietà descrittore.
     * 
     * @return
     *     possible object is
     *     {@link Descrittore }
     *     
     */
    public Descrittore getDescrittore() {
        return descrittore;
    }

    /**
     * Imposta il valore della proprietà descrittore.
     * 
     * @param value
     *     allowed object is
     *     {@link Descrittore }
     *     
     */
    public void setDescrittore(Descrittore value) {
        this.descrittore = value;
    }

    /**
     * Recupera il valore della proprietà modalitaRilevazione.
     * 
     * @return
     *     possible object is
     *     {@link ModalitaRilevazione }
     *     
     */
    public ModalitaRilevazione getModalitaRilevazione() {
        return modalitaRilevazione;
    }

    /**
     * Imposta il valore della proprietà modalitaRilevazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalitaRilevazione }
     *     
     */
    public void setModalitaRilevazione(ModalitaRilevazione value) {
        this.modalitaRilevazione = value;
    }

}
