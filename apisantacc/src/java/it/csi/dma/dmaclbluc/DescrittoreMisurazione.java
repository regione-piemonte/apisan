/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per descrittoreMisurazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="descrittoreMisurazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entitaCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="gruppoCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="descrittoreCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="descrittoreDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="descrittoreDescrizioneEstesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="unitaMisuraCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="unitaMisuraDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="descrizioneGruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="descrizioneGruppoEstesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="icona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="colore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="idGruppo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descrittoreMisurazione", propOrder = {
    "entitaCodice",
    "gruppoCodice",
    "descrittoreCodice",
    "descrittoreDescrizione",
    "descrittoreDescrizioneEstesa",
    "unitaMisuraCodice",
    "unitaMisuraDescrizione",
    "descrizioneGruppo",
    "descrizioneGruppoEstesa",
    "icona",
    "colore",
    "idGruppo"
})
public class DescrittoreMisurazione {

    protected String entitaCodice;
    protected String gruppoCodice;
    protected String descrittoreCodice;
    protected String descrittoreDescrizione;
    protected String descrittoreDescrizioneEstesa;
    protected String unitaMisuraCodice;
    protected String unitaMisuraDescrizione;
    protected String descrizioneGruppo;
    protected String descrizioneGruppoEstesa;
    protected String icona;
    protected String colore;
    protected Long idGruppo;

    /**
     * Recupera il valore della propriet?? entitaCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitaCodice() {
        return entitaCodice;
    }

    /**
     * Imposta il valore della propriet?? entitaCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitaCodice(String value) {
        this.entitaCodice = value;
    }

    /**
     * Recupera il valore della propriet?? gruppoCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppoCodice() {
        return gruppoCodice;
    }

    /**
     * Imposta il valore della propriet?? gruppoCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppoCodice(String value) {
        this.gruppoCodice = value;
    }

    /**
     * Recupera il valore della propriet?? descrittoreCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrittoreCodice() {
        return descrittoreCodice;
    }

    /**
     * Imposta il valore della propriet?? descrittoreCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrittoreCodice(String value) {
        this.descrittoreCodice = value;
    }

    /**
     * Recupera il valore della propriet?? descrittoreDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrittoreDescrizione() {
        return descrittoreDescrizione;
    }

    /**
     * Imposta il valore della propriet?? descrittoreDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrittoreDescrizione(String value) {
        this.descrittoreDescrizione = value;
    }

    /**
     * Recupera il valore della propriet?? descrittoreDescrizioneEstesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrittoreDescrizioneEstesa() {
        return descrittoreDescrizioneEstesa;
    }

    /**
     * Imposta il valore della propriet?? descrittoreDescrizioneEstesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrittoreDescrizioneEstesa(String value) {
        this.descrittoreDescrizioneEstesa = value;
    }

    /**
     * Recupera il valore della propriet?? unitaMisuraCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaMisuraCodice() {
        return unitaMisuraCodice;
    }

    /**
     * Imposta il valore della propriet?? unitaMisuraCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaMisuraCodice(String value) {
        this.unitaMisuraCodice = value;
    }

    /**
     * Recupera il valore della propriet?? unitaMisuraDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaMisuraDescrizione() {
        return unitaMisuraDescrizione;
    }

    /**
     * Imposta il valore della propriet?? unitaMisuraDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaMisuraDescrizione(String value) {
        this.unitaMisuraDescrizione = value;
    }

    /**
     * Recupera il valore della propriet?? descrizioneGruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneGruppo() {
        return descrizioneGruppo;
    }

    /**
     * Imposta il valore della propriet?? descrizioneGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneGruppo(String value) {
        this.descrizioneGruppo = value;
    }

    /**
     * Recupera il valore della propriet?? descrizioneGruppoEstesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneGruppoEstesa() {
        return descrizioneGruppoEstesa;
    }

    /**
     * Imposta il valore della propriet?? descrizioneGruppoEstesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneGruppoEstesa(String value) {
        this.descrizioneGruppoEstesa = value;
    }

    /**
     * Recupera il valore della propriet?? icona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcona() {
        return icona;
    }

    /**
     * Imposta il valore della propriet?? icona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcona(String value) {
        this.icona = value;
    }

    /**
     * Recupera il valore della propriet?? colore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColore() {
        return colore;
    }

    /**
     * Imposta il valore della propriet?? colore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColore(String value) {
        this.colore = value;
    }

    /**
     * Recupera il valore della propriet?? idGruppo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdGruppo() {
        return idGruppo;
    }

    /**
     * Imposta il valore della propriet?? idGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdGruppo(Long value) {
        this.idGruppo = value;
    }

}
