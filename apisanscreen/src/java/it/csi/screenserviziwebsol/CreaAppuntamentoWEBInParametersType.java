/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Crea_Appuntamento_WEBInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Crea_Appuntamento_WEBInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="I_COD_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_PREF_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_TIPO_SCREENING" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *       &lt;attribute name="I_COD_DIPARTIMENTO" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_COD_AZIENDA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_COD_UNPR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_COD_AGENDA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_DATA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_ORA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_ORA_INIZIO_ATTIVITA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_ORA_FINE_ATTIVITA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_ORA_SLOT_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_PROGRESSIVO_APP" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_ID_UTENTE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_UTENTE_UVOS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_INS_MOD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="O_COD_ERRORE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="O_DESCR_ERRORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crea_Appuntamento_WEBInParametersType")
public class CreaAppuntamentoWEBInParametersType {

    @XmlAttribute(name = "I_COD_ID_INTERNO")
    protected Integer icodidinterno;
    @XmlAttribute(name = "I_PREF_ID_INTERNO")
    protected String iprefidinterno;
    @XmlAttribute(name = "I_TIPO_SCREENING")
    protected TipoScreenType itiposcreening;
    @XmlAttribute(name = "I_COD_DIPARTIMENTO")
    protected Integer icoddipartimento;
    @XmlAttribute(name = "I_COD_AZIENDA")
    protected Integer icodazienda;
    @XmlAttribute(name = "I_COD_UNPR")
    protected String icodunpr;
    @XmlAttribute(name = "I_COD_AGENDA")
    protected Integer icodagenda;
    @XmlAttribute(name = "I_DATA_APPUNTAMENTO")
    protected String idataappuntamento;
    @XmlAttribute(name = "I_ORA_APPUNTAMENTO")
    protected String ioraappuntamento;
    @XmlAttribute(name = "I_ORA_INIZIO_ATTIVITA")
    protected String iorainizioattivita;
    @XmlAttribute(name = "I_ORA_FINE_ATTIVITA")
    protected String iorafineattivita;
    @XmlAttribute(name = "I_ORA_SLOT_APPUNTAMENTO")
    protected String ioraslotappuntamento;
    @XmlAttribute(name = "I_PROGRESSIVO_APP")
    protected Integer iprogressivoapp;
    @XmlAttribute(name = "I_ID_UTENTE")
    protected Integer iidutente;
    @XmlAttribute(name = "I_UTENTE_UVOS")
    protected Integer iutenteuvos;
    @XmlAttribute(name = "I_INS_MOD")
    protected String iinsmod;
    @XmlAttribute(name = "O_COD_ERRORE")
    protected Integer ocoderrore;
    @XmlAttribute(name = "O_DESCR_ERRORE")
    protected String odescrerrore;

    /**
     * Recupera il valore della proprietà icodidinterno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODIDINTERNO() {
        return icodidinterno;
    }

    /**
     * Imposta il valore della proprietà icodidinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODIDINTERNO(Integer value) {
        this.icodidinterno = value;
    }

    /**
     * Recupera il valore della proprietà iprefidinterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPREFIDINTERNO() {
        return iprefidinterno;
    }

    /**
     * Imposta il valore della proprietà iprefidinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPREFIDINTERNO(String value) {
        this.iprefidinterno = value;
    }

    /**
     * Recupera il valore della proprietà itiposcreening.
     * 
     * @return
     *     possible object is
     *     {@link TipoScreenType }
     *     
     */
    public TipoScreenType getITIPOSCREENING() {
        return itiposcreening;
    }

    /**
     * Imposta il valore della proprietà itiposcreening.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScreenType }
     *     
     */
    public void setITIPOSCREENING(TipoScreenType value) {
        this.itiposcreening = value;
    }

    /**
     * Recupera il valore della proprietà icoddipartimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODDIPARTIMENTO() {
        return icoddipartimento;
    }

    /**
     * Imposta il valore della proprietà icoddipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODDIPARTIMENTO(Integer value) {
        this.icoddipartimento = value;
    }

    /**
     * Recupera il valore della proprietà icodazienda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODAZIENDA() {
        return icodazienda;
    }

    /**
     * Imposta il valore della proprietà icodazienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODAZIENDA(Integer value) {
        this.icodazienda = value;
    }

    /**
     * Recupera il valore della proprietà icodunpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICODUNPR() {
        return icodunpr;
    }

    /**
     * Imposta il valore della proprietà icodunpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICODUNPR(String value) {
        this.icodunpr = value;
    }

    /**
     * Recupera il valore della proprietà icodagenda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODAGENDA() {
        return icodagenda;
    }

    /**
     * Imposta il valore della proprietà icodagenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODAGENDA(Integer value) {
        this.icodagenda = value;
    }

    /**
     * Recupera il valore della proprietà idataappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDATAAPPUNTAMENTO() {
        return idataappuntamento;
    }

    /**
     * Imposta il valore della proprietà idataappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDATAAPPUNTAMENTO(String value) {
        this.idataappuntamento = value;
    }

    /**
     * Recupera il valore della proprietà ioraappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIORAAPPUNTAMENTO() {
        return ioraappuntamento;
    }

    /**
     * Imposta il valore della proprietà ioraappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIORAAPPUNTAMENTO(String value) {
        this.ioraappuntamento = value;
    }

    /**
     * Recupera il valore della proprietà iorainizioattivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIORAINIZIOATTIVITA() {
        return iorainizioattivita;
    }

    /**
     * Imposta il valore della proprietà iorainizioattivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIORAINIZIOATTIVITA(String value) {
        this.iorainizioattivita = value;
    }

    /**
     * Recupera il valore della proprietà iorafineattivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIORAFINEATTIVITA() {
        return iorafineattivita;
    }

    /**
     * Imposta il valore della proprietà iorafineattivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIORAFINEATTIVITA(String value) {
        this.iorafineattivita = value;
    }

    /**
     * Recupera il valore della proprietà ioraslotappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIORASLOTAPPUNTAMENTO() {
        return ioraslotappuntamento;
    }

    /**
     * Imposta il valore della proprietà ioraslotappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIORASLOTAPPUNTAMENTO(String value) {
        this.ioraslotappuntamento = value;
    }

    /**
     * Recupera il valore della proprietà iprogressivoapp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIPROGRESSIVOAPP() {
        return iprogressivoapp;
    }

    /**
     * Imposta il valore della proprietà iprogressivoapp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIPROGRESSIVOAPP(Integer value) {
        this.iprogressivoapp = value;
    }

    /**
     * Recupera il valore della proprietà iidutente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIIDUTENTE() {
        return iidutente;
    }

    /**
     * Imposta il valore della proprietà iidutente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIIDUTENTE(Integer value) {
        this.iidutente = value;
    }

    /**
     * Recupera il valore della proprietà iutenteuvos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIUTENTEUVOS() {
        return iutenteuvos;
    }

    /**
     * Imposta il valore della proprietà iutenteuvos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIUTENTEUVOS(Integer value) {
        this.iutenteuvos = value;
    }

    /**
     * Recupera il valore della proprietà iinsmod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIINSMOD() {
        return iinsmod;
    }

    /**
     * Imposta il valore della proprietà iinsmod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIINSMOD(String value) {
        this.iinsmod = value;
    }

    /**
     * Recupera il valore della proprietà ocoderrore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOCODERRORE() {
        return ocoderrore;
    }

    /**
     * Imposta il valore della proprietà ocoderrore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOCODERRORE(Integer value) {
        this.ocoderrore = value;
    }

    /**
     * Recupera il valore della proprietà odescrerrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODESCRERRORE() {
        return odescrerrore;
    }

    /**
     * Imposta il valore della proprietà odescrerrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODESCRERRORE(String value) {
        this.odescrerrore = value;
    }

}
