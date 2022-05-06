/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.integration.dma;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java per componenteLocaleRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="componenteLocaleRisposta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aziendaSanitaria" type="{http://dma.csi.it/}aziendaSanitaria" minOccurs="0"/>
 *         &lt;element name="componenteLocaleTipo" type="{http://dma.csi.it/}componenteLocaleTipo" minOccurs="0"/>
 *         &lt;element name="servizi" type="{http://dma.csi.it/}componenteLocaleServizio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errori" type="{http://dma.csi.it/}errore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stato" type="{http://dma.csi.it/}componenteLocaleRispostaStato" minOccurs="0"/>
 *         &lt;element name="erroreRegistrazioneConsenso" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="tempoMaxAttesaCLInSec" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tempoMaxRestituzioneDatiInSec" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteLocaleRisposta", propOrder = {
    "codice",
    "descrizione",
    "riferimento",
    "aziendaSanitaria",
    "componenteLocaleTipo",
    "servizi",
    "errori",
    "stato",
    "erroreRegistrazioneConsenso",
    "tempoMaxAttesaCLInSec",
    "tempoMaxRestituzioneDatiInSec"
})
public class ComponenteLocaleRisposta {

    protected String codice;
    protected String descrizione;
    protected String riferimento;
    protected AziendaSanitaria aziendaSanitaria;
    protected ComponenteLocaleTipo componenteLocaleTipo;
    @XmlElement(nillable = true)
    protected List<ComponenteLocaleServizio> servizi;
    @XmlElement(nillable = true)
    protected List<Errore> errori;
    protected ComponenteLocaleRispostaStato stato;
    @XmlSchemaType(name = "string")
    protected SiNo erroreRegistrazioneConsenso;
    protected long tempoMaxAttesaCLInSec;
    protected long tempoMaxRestituzioneDatiInSec;

    /**
     * Recupera il valore della property  codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della property  codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della property  descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della property  descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della property  riferimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimento() {
        return riferimento;
    }

    /**
     * Imposta il valore della property  riferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiferimento(String value) {
        this.riferimento = value;
    }

    /**
     * Recupera il valore della property  aziendaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link AziendaSanitaria }
     *     
     */
    public AziendaSanitaria getAziendaSanitaria() {
        return aziendaSanitaria;
    }

    /**
     * Imposta il valore della property  aziendaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link AziendaSanitaria }
     *     
     */
    public void setAziendaSanitaria(AziendaSanitaria value) {
        this.aziendaSanitaria = value;
    }

    /**
     * Recupera il valore della property  componenteLocaleTipo.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocaleTipo }
     *     
     */
    public ComponenteLocaleTipo getComponenteLocaleTipo() {
        return componenteLocaleTipo;
    }

    /**
     * Imposta il valore della property  componenteLocaleTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocaleTipo }
     *     
     */
    public void setComponenteLocaleTipo(ComponenteLocaleTipo value) {
        this.componenteLocaleTipo = value;
    }

    /**
     * Gets the value of the servizi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servizi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServizi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponenteLocaleServizio }
     * 
     * 
     */
    public List<ComponenteLocaleServizio> getServizi() {
        if (servizi == null) {
            servizi = new ArrayList<ComponenteLocaleServizio>();
        }
        return this.servizi;
    }

    /**
     * Gets the value of the errori property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errori property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrori().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Errore }
     * 
     * 
     */
    public List<Errore> getErrori() {
        if (errori == null) {
            errori = new ArrayList<Errore>();
        }
        return this.errori;
    }

    /**
     * Recupera il valore della property  stato.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocaleRispostaStato }
     *     
     */
    public ComponenteLocaleRispostaStato getStato() {
        return stato;
    }

    /**
     * Imposta il valore della property  stato.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocaleRispostaStato }
     *     
     */
    public void setStato(ComponenteLocaleRispostaStato value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della property  erroreRegistrazioneConsenso.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getErroreRegistrazioneConsenso() {
        return erroreRegistrazioneConsenso;
    }

    /**
     * Imposta il valore della property  erroreRegistrazioneConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setErroreRegistrazioneConsenso(SiNo value) {
        this.erroreRegistrazioneConsenso = value;
    }

    /**
     * Recupera il valore della property  tempoMaxAttesaCLInSec.
     * 
     */
    public long getTempoMaxAttesaCLInSec() {
        return tempoMaxAttesaCLInSec;
    }

    /**
     * Imposta il valore della property  tempoMaxAttesaCLInSec.
     * 
     */
    public void setTempoMaxAttesaCLInSec(long value) {
        this.tempoMaxAttesaCLInSec = value;
    }

    /**
     * Recupera il valore della property  tempoMaxRestituzioneDatiInSec.
     * 
     */
    public long getTempoMaxRestituzioneDatiInSec() {
        return tempoMaxRestituzioneDatiInSec;
    }

    /**
     * Imposta il valore della property  tempoMaxRestituzioneDatiInSec.
     * 
     */
    public void setTempoMaxRestituzioneDatiInSec(long value) {
        this.tempoMaxRestituzioneDatiInSec = value;
    }

}
