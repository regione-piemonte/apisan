/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.infodatiassistito;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per Info_DatiAssistito complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Info_DatiAssistito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContattiAssistito" type="{}DTOContatti" minOccurs="0"/>
 *         &lt;element name="ContattiAssistitoResult" type="{}SetContattoResult" minOccurs="0"/>
 *         &lt;element name="DatiPaziente" type="{}DTOPaziente" minOccurs="0"/>
 *         &lt;element name="Result" type="{}ResultSetPost" minOccurs="0"/>
 *         &lt;element name="Documenti" type="{}ArrayOfDTODocumento" minOccurs="0"/>
 *         &lt;element name="VacciniDaEffettuare" type="{}ArrayOfDTOVaccinoEssential" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Info_DatiAssistito", propOrder = {
    "contattiAssistito",
    "contattiAssistitoResult",
    "datiPaziente",
    "result",
    "documenti",
    "vacciniDaEffettuare"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
@XmlRootElement(name = "Info_DatiAssistito")
public class InfoDatiAssistito {

    @XmlElement(name = "ContattiAssistito")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOContatti contattiAssistito;
    @XmlElement(name = "ContattiAssistitoResult")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SetContattoResult contattiAssistitoResult;
    @XmlElement(name = "DatiPaziente")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOPaziente datiPaziente;
    @XmlElement(name = "Result")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ResultSetPost result;
    @XmlElement(name = "Documenti")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTODocumento documenti;
    @XmlElement(name = "VacciniDaEffettuare")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOVaccinoEssential vacciniDaEffettuare;

    /**
     * Recupera il valore della proprietà contattiAssistito.
     * 
     * @return
     *     possible object is
     *     {@link DTOContatti }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOContatti getContattiAssistito() {
        return contattiAssistito;
    }

    /**
     * Imposta il valore della proprietà contattiAssistito.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOContatti }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContattiAssistito(DTOContatti value) {
        this.contattiAssistito = value;
    }

    /**
     * Recupera il valore della proprietà contattiAssistitoResult.
     * 
     * @return
     *     possible object is
     *     {@link SetContattoResult }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SetContattoResult getContattiAssistitoResult() {
        return contattiAssistitoResult;
    }

    /**
     * Imposta il valore della proprietà contattiAssistitoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SetContattoResult }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContattiAssistitoResult(SetContattoResult value) {
        this.contattiAssistitoResult = value;
    }

    /**
     * Recupera il valore della proprietà datiPaziente.
     * 
     * @return
     *     possible object is
     *     {@link DTOPaziente }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOPaziente getDatiPaziente() {
        return datiPaziente;
    }

    /**
     * Imposta il valore della proprietà datiPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOPaziente }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDatiPaziente(DTOPaziente value) {
        this.datiPaziente = value;
    }

    /**
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetPost }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ResultSetPost getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetPost }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setResult(ResultSetPost value) {
        this.result = value;
    }

    /**
     * Recupera il valore della proprietà documenti.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTODocumento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTODocumento getDocumenti() {
        return documenti;
    }

    /**
     * Imposta il valore della proprietà documenti.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTODocumento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumenti(ArrayOfDTODocumento value) {
        this.documenti = value;
    }

    /**
     * Recupera il valore della proprietà vacciniDaEffettuare.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOVaccinoEssential }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTOVaccinoEssential getVacciniDaEffettuare() {
        return vacciniDaEffettuare;
    }

    /**
     * Imposta il valore della proprietà vacciniDaEffettuare.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTOVaccinoEssential }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVacciniDaEffettuare(ArrayOfDTOVaccinoEssential value) {
        this.vacciniDaEffettuare = value;
    }

}
