/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ElencoPagamentiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ElencoPagamentiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVVISO_PAGAMENTO" type="{http://csi.it}AVVISO_PAGAMENTOtype" minOccurs="0"/>
 *         &lt;element name="IUV_MOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLAGPAGAMENTOANTICIPATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLAGTIPOSPESA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPOSPESA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAEMISSIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElencoPagamentiType", propOrder = {
    "numerosportello",
    "numeroricevuta",
    "dataricevuta",
    "importoricevuta",
    "avvisopagamento",
    "iuvmod1",
    "flagpagamentoanticipato",
    "flagtipospesa",
    "tipospesa",
    "dataemissione"
})
public class ElencoPagamentiType {

    @XmlElementRef(name = "NUMERO_SPORTELLO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numerosportello;
    @XmlElementRef(name = "NUMERO_RICEVUTA", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroricevuta;
    @XmlElementRef(name = "DATA_RICEVUTA", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataricevuta;
    @XmlElementRef(name = "IMPORTO_RICEVUTA", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importoricevuta;
    @XmlElementRef(name = "AVVISO_PAGAMENTO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<AVVISOPAGAMENTOtype> avvisopagamento;
    @XmlElementRef(name = "IUV_MOD1", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iuvmod1;
    @XmlElementRef(name = "FLAGPAGAMENTOANTICIPATO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagpagamentoanticipato;
    @XmlElementRef(name = "FLAGTIPOSPESA", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagtipospesa;
    @XmlElementRef(name = "TIPOSPESA", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipospesa;
    @XmlElementRef(name = "DATAEMISSIONE", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataemissione;

    /**
     * Recupera il valore della proprieta numerosportello.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNUMEROSPORTELLO() {
        return numerosportello;
    }

    /**
     * Imposta il valore della proprieta numerosportello.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNUMEROSPORTELLO(JAXBElement<String> value) {
        this.numerosportello = value;
    }

    /**
     * Recupera il valore della proprieta numeroricevuta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNUMERORICEVUTA() {
        return numeroricevuta;
    }

    /**
     * Imposta il valore della proprieta numeroricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNUMERORICEVUTA(JAXBElement<String> value) {
        this.numeroricevuta = value;
    }

    /**
     * Recupera il valore della proprieta dataricevuta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDATARICEVUTA() {
        return dataricevuta;
    }

    /**
     * Imposta il valore della proprieta dataricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDATARICEVUTA(JAXBElement<String> value) {
        this.dataricevuta = value;
    }

    /**
     * Recupera il valore della proprieta importoricevuta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPORTORICEVUTA() {
        return importoricevuta;
    }

    /**
     * Imposta il valore della proprieta importoricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPORTORICEVUTA(JAXBElement<String> value) {
        this.importoricevuta = value;
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
     * Recupera il valore della proprieta flagpagamentoanticipato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLAGPAGAMENTOANTICIPATO() {
        return flagpagamentoanticipato;
    }

    /**
     * Imposta il valore della proprieta flagpagamentoanticipato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLAGPAGAMENTOANTICIPATO(JAXBElement<String> value) {
        this.flagpagamentoanticipato = value;
    }

    /**
     * Recupera il valore della proprieta flagtipospesa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLAGTIPOSPESA() {
        return flagtipospesa;
    }

    /**
     * Imposta il valore della proprieta flagtipospesa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLAGTIPOSPESA(JAXBElement<String> value) {
        this.flagtipospesa = value;
    }

    /**
     * Recupera il valore della proprieta tipospesa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTIPOSPESA() {
        return tipospesa;
    }

    /**
     * Imposta il valore della proprieta tipospesa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTIPOSPESA(JAXBElement<String> value) {
        this.tipospesa = value;
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

}
