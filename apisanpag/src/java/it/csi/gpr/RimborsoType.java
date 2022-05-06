/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RimborsoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RimborsoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_RIMBORSATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVVISO_PAGAMENTO" type="{http://csi.it}AVVISO_PAGAMENTOtype" minOccurs="0"/>
 *         &lt;element name="IUV_MOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_EMISSIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRATICA_PAGATA_CON_CREDITO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RimborsoType", propOrder = {
    "numerosportello",
    "numerorimborso",
    "datarimborso",
    "importorimborsato",
    "codiceversamento",
    "avvisopagamento",
    "iuvmod1",
    "dataemissione",
    "praticapagataconcredito"
})
public class RimborsoType {

    @XmlElement(name = "NUMERO_SPORTELLO", required = true)
    protected String numerosportello;
    @XmlElementRef(name = "NUMERO_RIMBORSO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numerorimborso;
    @XmlElement(name = "DATA_RIMBORSO", required = true)
    protected String datarimborso;
    @XmlElement(name = "IMPORTO_RIMBORSATO", required = true)
    protected String importorimborsato;
    @XmlElementRef(name = "CODICE_VERSAMENTO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceversamento;
    @XmlElementRef(name = "AVVISO_PAGAMENTO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<AVVISOPAGAMENTOtype> avvisopagamento;
    @XmlElementRef(name = "IUV_MOD1", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iuvmod1;
    @XmlElementRef(name = "DATA_EMISSIONE", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataemissione;
    @XmlElementRef(name = "PRATICA_PAGATA_CON_CREDITO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> praticapagataconcredito;

    /**
     * Recupera il valore della proprieta numerosportello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSPORTELLO() {
        return numerosportello;
    }

    /**
     * Imposta il valore della proprieta numerosportello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSPORTELLO(String value) {
        this.numerosportello = value;
    }

    /**
     * Recupera il valore della proprieta numerorimborso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNUMERORIMBORSO() {
        return numerorimborso;
    }

    /**
     * Imposta il valore della proprieta numerorimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNUMERORIMBORSO(JAXBElement<String> value) {
        this.numerorimborso = value;
    }

    /**
     * Recupera il valore della proprieta datarimborso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARIMBORSO() {
        return datarimborso;
    }

    /**
     * Imposta il valore della proprieta datarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARIMBORSO(String value) {
        this.datarimborso = value;
    }

    /**
     * Recupera il valore della proprieta importorimborsato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTORIMBORSATO() {
        return importorimborsato;
    }

    /**
     * Imposta il valore della proprieta importorimborsato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTORIMBORSATO(String value) {
        this.importorimborsato = value;
    }

    /**
     * Recupera il valore della proprieta codiceversamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODICEVERSAMENTO() {
        return codiceversamento;
    }

    /**
     * Imposta il valore della proprieta codiceversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODICEVERSAMENTO(JAXBElement<String> value) {
        this.codiceversamento = value;
    }

    /**
     * Recupera il valore della proprieta avvisopagamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVVISOPAGAMENTOtype }{@code >}
     *     
     */
    public JAXBElement<AVVISOPAGAMENTOtype> getAVVISOPAGAMENTO() {
        return avvisopagamento;
    }

    /**
     * Imposta il valore della proprieta avvisopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVVISOPAGAMENTOtype }{@code >}
     *     
     */
    public void setAVVISOPAGAMENTO(JAXBElement<AVVISOPAGAMENTOtype> value) {
        this.avvisopagamento = value;
    }

    /**
     * Recupera il valore della proprieta iuvmod1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIUVMOD1() {
        return iuvmod1;
    }

    /**
     * Imposta il valore della proprieta iuvmod1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIUVMOD1(JAXBElement<String> value) {
        this.iuvmod1 = value;
    }

    /**
     * Recupera il valore della proprieta dataemissione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDATAEMISSIONE() {
        return dataemissione;
    }

    /**
     * Imposta il valore della proprieta dataemissione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDATAEMISSIONE(JAXBElement<String> value) {
        this.dataemissione = value;
    }

    /**
     * Recupera il valore della proprieta praticapagataconcredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRATICAPAGATACONCREDITO() {
        return praticapagataconcredito;
    }

    /**
     * Imposta il valore della proprieta praticapagataconcredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRATICAPAGATACONCREDITO(JAXBElement<String> value) {
        this.praticapagataconcredito = value;
    }

}
