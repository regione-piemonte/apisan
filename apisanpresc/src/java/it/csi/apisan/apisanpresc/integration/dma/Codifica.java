/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per codifica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="codifica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codifica", propOrder = {
    "codice",
    "descrizione",
    "riferimento"
})
@XmlSeeAlso({
    Errore.class,
    ModalitaDiAlimentazione.class,
    EventoNotifica.class,
    TipoFileDocumento.class,
    Disciplina.class,
    TipoEpisodio.class,
    TipoCartellaPersonale.class,
    EnteEmittenteEsenzione.class,
    TipoAccessoConsultazione.class,
    ApplicazioneRichiedente.class,
    ComponenteLocaleOperazione.class,
    TipoDocumento.class,
    Branca.class,
    Configurazione.class,
    Profilo.class,
    TipoStudio.class,
    RegimeDMA.class,
    NotificaDocumentoScaricabileTipo.class,
    StrutturaSanitaria.class,
    ComponenteLocale.class,
    StatoDiNascita.class,
    ComponenteLocaleServizio.class,
    AziendaSanitaria.class,
    UnitaOperativaSanitaria.class,
    ComuneDiNascita.class,
    EpisodioStato.class,
    TipoContributo.class,
    ConsensoMatriceTipoDato.class,
    TipoAccessoOperazione.class,
    ComponenteLocaleRispostaStato.class,
    RuoloDMA.class,
    ComponenteLocaleTipo.class,
    CatalogoLog.class,
    Prestazione.class,
    DiagnosiEsenzione.class,
    CanaleNotifica.class,
    Esenzione.class
})
public class Codifica {

    protected String codice;
    protected String descrizione;
    protected String riferimento;

    /**
     * Recupera il valore della property codice.
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
     * Imposta il valore della property codice.
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
     * Recupera il valore della property descrizione.
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
     * Imposta il valore della property descrizione.
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
     * Recupera il valore della property riferimento.
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
     * Imposta il valore della property riferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiferimento(String value) {
        this.riferimento = value;
    }

}
