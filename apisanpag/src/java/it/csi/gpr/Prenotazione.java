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
 * <p>Classe Java per Prenotazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Prenotazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_RIGA_SORTING" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_DA_PAGARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_PAGATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LISTA_FATTURA" type="{http://csi.it}ListaFatturaType" minOccurs="0"/>
 *         &lt;element name="NUMERO_QUIETANZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ELENCO_PRESTAZIONI" type="{http://csi.it}ArrayOfPRESTAZIONEPrestazione" minOccurs="0"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASR_BENEFICIARIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_CREAZIONE_PRENOTAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVVISO_PAGAMENTO" type="{http://csi.it}AVVISO_PAGAMENTOtype" minOccurs="0"/>
 *         &lt;element name="IUV_MOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPPOSIZIONE_730" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LISTA_NRE" type="{http://csi.it}LISTA_NREtype" minOccurs="0"/>
 *         &lt;element name="LISTA_RIMBORSI" type="{http://csi.it}ListaRimborsiType" minOccurs="0"/>
 *         &lt;element name="IMPORTO_DA_RIMBORSARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_RIMBORSATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RIMBORSO_IN_EROGAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODALITA_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBAN_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prenotazione", propOrder = {
    "numerorigasorting",
    "numeropratica",
    "importodapagare",
    "importopagato",
    "listafattura",
    "numeroquietanza",
    "elencoprestazioni",
    "motivopagamento",
    "asrbeneficiaria",
    "codiceservizio",
    "datacreazioneprenotazione",
    "avvisopagamento",
    "iuvmod1",
    "opposizione730",
    "listanre",
    "listarimborsi",
    "importodarimborsare",
    "importorimborsato",
    "rimborsoinerogazione",
    "modalitarimborso",
    "ibanrimborso"
})
public class Prenotazione {

    @XmlElement(name = "NUMERO_RIGA_SORTING")
    protected Integer numerorigasorting;
    @XmlElement(name = "NUMERO_PRATICA")
    protected String numeropratica;
    @XmlElement(name = "IMPORTO_DA_PAGARE")
    protected String importodapagare;
    @XmlElement(name = "IMPORTO_PAGATO")
    protected String importopagato;
    @XmlElement(name = "LISTA_FATTURA")
    protected ListaFatturaType listafattura;
    @XmlElement(name = "NUMERO_QUIETANZA")
    protected String numeroquietanza;
    @XmlElement(name = "ELENCO_PRESTAZIONI")
    protected ArrayOfPRESTAZIONEPrestazione elencoprestazioni;
    @XmlElement(name = "MOTIVO_PAGAMENTO")
    protected String motivopagamento;
    @XmlElement(name = "ASR_BENEFICIARIA")
    protected String asrbeneficiaria;
    @XmlElement(name = "CODICE_SERVIZIO")
    protected String codiceservizio;
    @XmlElement(name = "DATA_CREAZIONE_PRENOTAZIONE")
    protected String datacreazioneprenotazione;
    @XmlElement(name = "AVVISO_PAGAMENTO")
    protected AVVISOPAGAMENTOtype avvisopagamento;
    @XmlElement(name = "IUV_MOD1")
    protected String iuvmod1;
    @XmlElement(name = "OPPOSIZIONE_730")
    protected String opposizione730;
    @XmlElement(name = "LISTA_NRE")
    protected LISTANREtype listanre;
    @XmlElement(name = "LISTA_RIMBORSI")
    protected ListaRimborsiType listarimborsi;
    @XmlElementRef(name = "IMPORTO_DA_RIMBORSARE", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importodarimborsare;
    @XmlElementRef(name = "IMPORTO_RIMBORSATO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importorimborsato;
    @XmlElementRef(name = "RIMBORSO_IN_EROGAZIONE", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rimborsoinerogazione;
    @XmlElementRef(name = "MODALITA_RIMBORSO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modalitarimborso;
    @XmlElementRef(name = "IBAN_RIMBORSO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibanrimborso;

    /**
     * Recupera il valore della proprieta numerorigasorting.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMERORIGASORTING() {
        return numerorigasorting;
    }

    /**
     * Imposta il valore della proprieta numerorigasorting.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMERORIGASORTING(Integer value) {
        this.numerorigasorting = value;
    }

    /**
     * Recupera il valore della proprieta numeropratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICA() {
        return numeropratica;
    }

    /**
     * Imposta il valore della proprieta numeropratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICA(String value) {
        this.numeropratica = value;
    }

    /**
     * Recupera il valore della proprieta importodapagare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTODAPAGARE() {
        return importodapagare;
    }

    /**
     * Imposta il valore della proprieta importodapagare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTODAPAGARE(String value) {
        this.importodapagare = value;
    }

    /**
     * Recupera il valore della proprieta importopagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPAGATO() {
        return importopagato;
    }

    /**
     * Imposta il valore della proprieta importopagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPAGATO(String value) {
        this.importopagato = value;
    }

    /**
     * Recupera il valore della proprieta listafattura.
     * 
     * @return
     *     possible object is
     *     {@link ListaFatturaType }
     *     
     */
    public ListaFatturaType getLISTAFATTURA() {
        return listafattura;
    }

    /**
     * Imposta il valore della proprieta listafattura.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaFatturaType }
     *     
     */
    public void setLISTAFATTURA(ListaFatturaType value) {
        this.listafattura = value;
    }

    /**
     * Recupera il valore della proprieta numeroquietanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROQUIETANZA() {
        return numeroquietanza;
    }

    /**
     * Imposta il valore della proprieta numeroquietanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROQUIETANZA(String value) {
        this.numeroquietanza = value;
    }

    /**
     * Recupera il valore della proprieta elencoprestazioni.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRESTAZIONEPrestazione }
     *     
     */
    public ArrayOfPRESTAZIONEPrestazione getELENCOPRESTAZIONI() {
        return elencoprestazioni;
    }

    /**
     * Imposta il valore della proprieta elencoprestazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRESTAZIONEPrestazione }
     *     
     */
    public void setELENCOPRESTAZIONI(ArrayOfPRESTAZIONEPrestazione value) {
        this.elencoprestazioni = value;
    }

    /**
     * Recupera il valore della proprieta motivopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOPAGAMENTO() {
        return motivopagamento;
    }

    /**
     * Imposta il valore della proprieta motivopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOPAGAMENTO(String value) {
        this.motivopagamento = value;
    }

    /**
     * Recupera il valore della proprieta asrbeneficiaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASRBENEFICIARIA() {
        return asrbeneficiaria;
    }

    /**
     * Imposta il valore della proprieta asrbeneficiaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASRBENEFICIARIA(String value) {
        this.asrbeneficiaria = value;
    }

    /**
     * Recupera il valore della proprieta codiceservizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESERVIZIO() {
        return codiceservizio;
    }

    /**
     * Imposta il valore della proprieta codiceservizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESERVIZIO(String value) {
        this.codiceservizio = value;
    }

    /**
     * Recupera il valore della proprieta datacreazioneprenotazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACREAZIONEPRENOTAZIONE() {
        return datacreazioneprenotazione;
    }

    /**
     * Imposta il valore della proprieta datacreazioneprenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACREAZIONEPRENOTAZIONE(String value) {
        this.datacreazioneprenotazione = value;
    }

    /**
     * Recupera il valore della proprieta avvisopagamento.
     * 
     * @return
     *     possible object is
     *     {@link AVVISOPAGAMENTOtype }
     *     
     */
    public AVVISOPAGAMENTOtype getAVVISOPAGAMENTO() {
        return avvisopagamento;
    }

    /**
     * Imposta il valore della proprieta avvisopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link AVVISOPAGAMENTOtype }
     *     
     */
    public void setAVVISOPAGAMENTO(AVVISOPAGAMENTOtype value) {
        this.avvisopagamento = value;
    }

    /**
     * Recupera il valore della proprieta iuvmod1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUVMOD1() {
        return iuvmod1;
    }

    /**
     * Imposta il valore della proprieta iuvmod1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUVMOD1(String value) {
        this.iuvmod1 = value;
    }

    /**
     * Recupera il valore della proprieta opposizione730.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPPOSIZIONE730() {
        return opposizione730;
    }

    /**
     * Imposta il valore della proprieta opposizione730.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPPOSIZIONE730(String value) {
        this.opposizione730 = value;
    }

    /**
     * Recupera il valore della proprieta listanre.
     * 
     * @return
     *     possible object is
     *     {@link LISTANREtype }
     *     
     */
    public LISTANREtype getLISTANRE() {
        return listanre;
    }

    /**
     * Imposta il valore della proprieta listanre.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTANREtype }
     *     
     */
    public void setLISTANRE(LISTANREtype value) {
        this.listanre = value;
    }

    /**
     * Recupera il valore della proprieta listarimborsi.
     * 
     * @return
     *     possible object is
     *     {@link ListaRimborsiType }
     *     
     */
    public ListaRimborsiType getLISTARIMBORSI() {
        return listarimborsi;
    }

    /**
     * Imposta il valore della proprieta listarimborsi.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRimborsiType }
     *     
     */
    public void setLISTARIMBORSI(ListaRimborsiType value) {
        this.listarimborsi = value;
    }

    /**
     * Recupera il valore della proprieta importodarimborsare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPORTODARIMBORSARE() {
        return importodarimborsare;
    }

    /**
     * Imposta il valore della proprieta importodarimborsare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPORTODARIMBORSARE(JAXBElement<String> value) {
        this.importodarimborsare = value;
    }

    /**
     * Recupera il valore della proprieta importorimborsato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPORTORIMBORSATO() {
        return importorimborsato;
    }

    /**
     * Imposta il valore della proprieta importorimborsato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPORTORIMBORSATO(JAXBElement<String> value) {
        this.importorimborsato = value;
    }

    /**
     * Recupera il valore della proprieta rimborsoinerogazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRIMBORSOINEROGAZIONE() {
        return rimborsoinerogazione;
    }

    /**
     * Imposta il valore della proprieta rimborsoinerogazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRIMBORSOINEROGAZIONE(JAXBElement<String> value) {
        this.rimborsoinerogazione = value;
    }

    /**
     * Recupera il valore della proprieta modalitarimborso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMODALITARIMBORSO() {
        return modalitarimborso;
    }

    /**
     * Imposta il valore della proprieta modalitarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMODALITARIMBORSO(JAXBElement<String> value) {
        this.modalitarimborso = value;
    }

    /**
     * Recupera il valore della proprieta ibanrimborso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBANRIMBORSO() {
        return ibanrimborso;
    }

    /**
     * Imposta il valore della proprieta ibanrimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBANRIMBORSO(JAXBElement<String> value) {
        this.ibanrimborso = value;
    }

}
