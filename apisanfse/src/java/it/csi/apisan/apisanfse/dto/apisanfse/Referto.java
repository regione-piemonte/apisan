/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ComponenteLocale;
import it.csi.apisan.apisanfse.dto.apisanfse.Importo;
import it.csi.apisan.apisanfse.dto.apisanfse.LuogoAsu;
import it.csi.apisan.apisanfse.dto.apisanfse.Paziente;
import it.csi.apisan.apisanfse.dto.apisanfse.Prestazione;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoFileDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoReferto;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Referto   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String idReferto = null;
  private String idDocumentoCl = null;
  private String accessionNumber = null;
  private List<String> accessionNumbers = new ArrayList<String>();
  private String codiceDocumentoDipartimentale = null;
  private String codiceDocumentoScaricabile = null;
  private Date dataEpisodio = null;
  private Date dataValidazione = null;
  private Date dataInserimento = null;
  private Date dataAggiornamento = null;
  private Date dataAnnullamento = null;
  private Date dataCancellazione = null;
  private LuogoAsu luogoProduzioneDocumento = null;
  private Date dataScaricabileFinoAl = null;
  private TipoDocumento tipoDocumento = null;
  private TipoFileDocumento tipoFileDocumento = null;
  private String medicoValidante = null;
  private Integer numeroDiDownload = null;
  private Integer numeroGiorniDownload = null;

  /**
   * Codice che identifica se il tiket e&#39; stato pagato (S), non pagato  pagato (N), parzialmente pagato (P) indefinito (U) esente (E), rimborso (R). * P --&gt; pagato parzialmente * S --&gt; si * N --&gt; no * E --&gt; esente  * U --&gt; unknown 
   */
  public enum PagatoTicketStatoEnum {
    P("P"),

        S("S"),

        N("N"),

        E("E"),

        U("U"),

        R("R");
    private String value;

    PagatoTicketStatoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PagatoTicketStatoEnum pagatoTicketStato = null;
  private String oscuraScaricoCittadino = null;
  private Boolean firmatoDigitalmente = null;
  private ComponenteLocale componenteLocale = null;
  private Paziente paziente = null;
  private Boolean pinBruciato = null;
  private Boolean richiestoPinCode = null;
  private Boolean scaricabileSeTicketNonPagato = null;
  private Boolean soggettoALeggiSpeciali = null;
  private String idPacchetto = null;

  /**
   * Gets or Sets statoRichiesta
   */
  public enum StatoRichiestaEnum {
    ERRORE_WS("ERRORE_WS"),

        RICHIESTA_NON_PRESENTE("RICHIESTA_NON_PRESENTE"),

        CANCELLAZIONE_PACCHETTO_SOSPESA("CANCELLAZIONE_PACCHETTO_SOSPESA"),

        COMPOSIZIONE_PACCHETTO_SOSPESA("COMPOSIZIONE_PACCHETTO_SOSPESA"),

        SCARICATO("SCARICATO"),

        DA_ELABORARE("DA_ELABORARE"),

        ELAB_IN_CORSO("ELAB_IN_CORSO"),

        DISPONIBILE("DISPONIBILE"),

        INVIO_MAIL_IN_CORSO("INVIO_MAIL_IN_CORSO"),

        NOTIFICATO("NOTIFICATO"),

        ERRORE_COMPONI_PACCHETTO("ERRORE_COMPONI_PACCHETTO"),

        ERRORE_INVIO_MAIL("ERRORE_INVIO_MAIL"),

        PACCHETTO_DA_CANCELLARE("PACCHETTO_DA_CANCELLARE"),

        PACCHETTO_IN_CANCELLAZIONE("PACCHETTO_IN_CANCELLAZIONE"),

        PACCHETTO_CANCELLATO("PACCHETTO_CANCELLATO"),

        ERRORE_IN_CANCELLAZIONE_PACCHETTO("ERRORE_IN_CANCELLAZIONE_PACCHETTO");
    private String value;

    StatoRichiestaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatoRichiestaEnum statoRichiesta = null;
  private Date dataDisponibilitaReferto = null;
  private String medicoRefertante = null;
  private Importo ticketDaPagare = null;
  private Importo ticketPagato = null;
  private TipoReferto tipoReferto = null;
  private List<Prestazione> elencoPrestazioni = new ArrayList<Prestazione>();
  private List<String> elencoNre = new ArrayList<String>();

  /**
   * Identificativo del referto all&#39;interno dei sistema.
   **/
  
  @ApiModelProperty(value = "Identificativo del referto all'interno dei sistema.")
  @JsonProperty("id_referto") 
 
  public String getIdReferto() {
    return idReferto;
  }
  public void setIdReferto(String idReferto) {
    this.idReferto = idReferto;
  }

  /**
   * Identificativo del referto sulla componente centrale
   **/
  
  @ApiModelProperty(value = "Identificativo del referto sulla componente centrale")
  @JsonProperty("id_documento_cl") 
 
  public String getIdDocumentoCl() {
    return idDocumentoCl;
  }
  public void setIdDocumentoCl(String idDocumentoCl) {
    this.idDocumentoCl = idDocumentoCl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accession_number") 
 
  public String getAccessionNumber() {
    return accessionNumber;
  }
  public void setAccessionNumber(String accessionNumber) {
    this.accessionNumber = accessionNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accession_numbers") 
 
  public List<String> getAccessionNumbers() {
    return accessionNumbers;
  }
  public void setAccessionNumbers(List<String> accessionNumbers) {
    this.accessionNumbers = accessionNumbers;
  }

  /**
   * Codice che identifica il documento all&#39;interno dell&#39;ASR.
   **/
  
  @ApiModelProperty(value = "Codice che identifica il documento all'interno dell'ASR.")
  @JsonProperty("codice_documento_dipartimentale") 
 
  public String getCodiceDocumentoDipartimentale() {
    return codiceDocumentoDipartimentale;
  }
  public void setCodiceDocumentoDipartimentale(String codiceDocumentoDipartimentale) {
    this.codiceDocumentoDipartimentale = codiceDocumentoDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_documento_scaricabile") 
 
  public String getCodiceDocumentoScaricabile() {
    return codiceDocumentoScaricabile;
  }
  public void setCodiceDocumentoScaricabile(String codiceDocumentoScaricabile) {
    this.codiceDocumentoScaricabile = codiceDocumentoScaricabile;
  }

  /**
   * Data in cui il paziente ha effettuato l&#39;esame.
   **/
  
  @ApiModelProperty(value = "Data in cui il paziente ha effettuato l'esame.")
  @JsonProperty("data_episodio") 
 
  public Date getDataEpisodio() {
    return dataEpisodio;
  }
  public void setDataEpisodio(Date dataEpisodio) {
    this.dataEpisodio = dataEpisodio;
  }

  /**
   * Data in cui il medico refertante ha validato ed emesso il referto.
   **/
  
  @ApiModelProperty(value = "Data in cui il medico refertante ha validato ed emesso il referto.")
  @JsonProperty("data_validazione") 
 
  public Date getDataValidazione() {
    return dataValidazione;
  }
  public void setDataValidazione(Date dataValidazione) {
    this.dataValidazione = dataValidazione;
  }

  /**
   * Data in cui il referto e&#39; acquisito dal sistema.
   **/
  
  @ApiModelProperty(value = "Data in cui il referto e' acquisito dal sistema.")
  @JsonProperty("data_inserimento") 
 
  public Date getDataInserimento() {
    return dataInserimento;
  }
  public void setDataInserimento(Date dataInserimento) {
    this.dataInserimento = dataInserimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_aggiornamento") 
 
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_annullamento") 
 
  public Date getDataAnnullamento() {
    return dataAnnullamento;
  }
  public void setDataAnnullamento(Date dataAnnullamento) {
    this.dataAnnullamento = dataAnnullamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_cancellazione") 
 
  public Date getDataCancellazione() {
    return dataCancellazione;
  }
  public void setDataCancellazione(Date dataCancellazione) {
    this.dataCancellazione = dataCancellazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("luogo_produzione_documento") 
 
  public LuogoAsu getLuogoProduzioneDocumento() {
    return luogoProduzioneDocumento;
  }
  public void setLuogoProduzioneDocumento(LuogoAsu luogoProduzioneDocumento) {
    this.luogoProduzioneDocumento = luogoProduzioneDocumento;
  }

  /**
   * Data in cui il referto per legge non viene più reso disponibile all&#39;utente (calcolato con dati presenti in ILEC).
   **/
  
  @ApiModelProperty(value = "Data in cui il referto per legge non viene più reso disponibile all'utente (calcolato con dati presenti in ILEC).")
  @JsonProperty("data_scaricabile_fino_al") 
 
  public Date getDataScaricabileFinoAl() {
    return dataScaricabileFinoAl;
  }
  public void setDataScaricabileFinoAl(Date dataScaricabileFinoAl) {
    this.dataScaricabileFinoAl = dataScaricabileFinoAl;
  }

  /**
   * Identificativo numerico del tipo del referto da decodificare.
   **/
  
  @ApiModelProperty(value = "Identificativo numerico del tipo del referto da decodificare.")
  @JsonProperty("tipo_documento") 
 
  public TipoDocumento getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_file_documento") 
 
  public TipoFileDocumento getTipoFileDocumento() {
    return tipoFileDocumento;
  }
  public void setTipoFileDocumento(TipoFileDocumento tipoFileDocumento) {
    this.tipoFileDocumento = tipoFileDocumento;
  }

  /**
   * Nominativo del medico che ha firmato il referto.
   **/
  
  @ApiModelProperty(value = "Nominativo del medico che ha firmato il referto.")
  @JsonProperty("medico_validante") 
 
  public String getMedicoValidante() {
    return medicoValidante;
  }
  public void setMedicoValidante(String medicoValidante) {
    this.medicoValidante = medicoValidante;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_di_download") 
 
  public Integer getNumeroDiDownload() {
    return numeroDiDownload;
  }
  public void setNumeroDiDownload(Integer numeroDiDownload) {
    this.numeroDiDownload = numeroDiDownload;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_giorni_download") 
 
  public Integer getNumeroGiorniDownload() {
    return numeroGiorniDownload;
  }
  public void setNumeroGiorniDownload(Integer numeroGiorniDownload) {
    this.numeroGiorniDownload = numeroGiorniDownload;
  }

  /**
   * Codice che identifica se il tiket e&#39; stato pagato (S), non pagato  pagato (N), parzialmente pagato (P) indefinito (U) esente (E), rimborso (R). * P --&gt; pagato parzialmente * S --&gt; si * N --&gt; no * E --&gt; esente  * U --&gt; unknown 
   **/
  
  @ApiModelProperty(value = "Codice che identifica se il tiket e' stato pagato (S), non pagato  pagato (N), parzialmente pagato (P) indefinito (U) esente (E), rimborso (R). * P --> pagato parzialmente * S --> si * N --> no * E --> esente  * U --> unknown ")
  @JsonProperty("pagato_ticket_stato") 
 
  public PagatoTicketStatoEnum getPagatoTicketStato() {
    return pagatoTicketStato;
  }
  public void setPagatoTicketStato(PagatoTicketStatoEnum pagatoTicketStato) {
    this.pagatoTicketStato = pagatoTicketStato;
  }

  /**
   * Flag che indica se il referto è oscurato al cittadino valori ammessi S, M, N.
   **/
  
  @ApiModelProperty(value = "Flag che indica se il referto è oscurato al cittadino valori ammessi S, M, N.")
  @JsonProperty("oscura_scarico_cittadino") 
 
  public String getOscuraScaricoCittadino() {
    return oscuraScaricoCittadino;
  }
  public void setOscuraScaricoCittadino(String oscuraScaricoCittadino) {
    this.oscuraScaricoCittadino = oscuraScaricoCittadino;
  }

  /**
   * Flag che discrimina se esiste un referto firmato con certificato (validità legale) restituisce (true) se esiste altrmienti (false).
   **/
  
  @ApiModelProperty(value = "Flag che discrimina se esiste un referto firmato con certificato (validità legale) restituisce (true) se esiste altrmienti (false).")
  @JsonProperty("firmato_digitalmente") 
 
  public Boolean isFirmatoDigitalmente() {
    return firmatoDigitalmente;
  }
  public void setFirmatoDigitalmente(Boolean firmatoDigitalmente) {
    this.firmatoDigitalmente = firmatoDigitalmente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("componente_locale") 
 
  public ComponenteLocale getComponenteLocale() {
    return componenteLocale;
  }
  public void setComponenteLocale(ComponenteLocale componenteLocale) {
    this.componenteLocale = componenteLocale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paziente") 
 
  public Paziente getPaziente() {
    return paziente;
  }
  public void setPaziente(Paziente paziente) {
    this.paziente = paziente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pin_bruciato") 
 
  public Boolean isPinBruciato() {
    return pinBruciato;
  }
  public void setPinBruciato(Boolean pinBruciato) {
    this.pinBruciato = pinBruciato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("richiesto_pin_code") 
 
  public Boolean isRichiestoPinCode() {
    return richiestoPinCode;
  }
  public void setRichiestoPinCode(Boolean richiestoPinCode) {
    this.richiestoPinCode = richiestoPinCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scaricabile_se_ticket_non_pagato") 
 
  public Boolean isScaricabileSeTicketNonPagato() {
    return scaricabileSeTicketNonPagato;
  }
  public void setScaricabileSeTicketNonPagato(Boolean scaricabileSeTicketNonPagato) {
    this.scaricabileSeTicketNonPagato = scaricabileSeTicketNonPagato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("soggetto_a_leggi_speciali") 
 
  public Boolean isSoggettoALeggiSpeciali() {
    return soggettoALeggiSpeciali;
  }
  public void setSoggettoALeggiSpeciali(Boolean soggettoALeggiSpeciali) {
    this.soggettoALeggiSpeciali = soggettoALeggiSpeciali;
  }

  /**
   * id dell&#39;immagine da scaricare
   **/
  
  @ApiModelProperty(value = "id dell'immagine da scaricare")
  @JsonProperty("id_pacchetto") 
 
  public String getIdPacchetto() {
    return idPacchetto;
  }
  public void setIdPacchetto(String idPacchetto) {
    this.idPacchetto = idPacchetto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_richiesta") 
 
  public StatoRichiestaEnum getStatoRichiesta() {
    return statoRichiesta;
  }
  public void setStatoRichiesta(StatoRichiestaEnum statoRichiesta) {
    this.statoRichiesta = statoRichiesta;
  }

  /**
   * data di disponibilita del referto
   **/
  
  @ApiModelProperty(value = "data di disponibilita del referto")
  @JsonProperty("data_disponibilita_referto") 
 
  public Date getDataDisponibilitaReferto() {
    return dataDisponibilitaReferto;
  }
  public void setDataDisponibilitaReferto(Date dataDisponibilitaReferto) {
    this.dataDisponibilitaReferto = dataDisponibilitaReferto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medico_refertante") 
 
  public String getMedicoRefertante() {
    return medicoRefertante;
  }
  public void setMedicoRefertante(String medicoRefertante) {
    this.medicoRefertante = medicoRefertante;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticket_da_pagare") 
 
  public Importo getTicketDaPagare() {
    return ticketDaPagare;
  }
  public void setTicketDaPagare(Importo ticketDaPagare) {
    this.ticketDaPagare = ticketDaPagare;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticket_pagato") 
 
  public Importo getTicketPagato() {
    return ticketPagato;
  }
  public void setTicketPagato(Importo ticketPagato) {
    this.ticketPagato = ticketPagato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_referto") 
 
  public TipoReferto getTipoReferto() {
    return tipoReferto;
  }
  public void setTipoReferto(TipoReferto tipoReferto) {
    this.tipoReferto = tipoReferto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("elenco_prestazioni") 
 
  public List<Prestazione> getElencoPrestazioni() {
    return elencoPrestazioni;
  }
  public void setElencoPrestazioni(List<Prestazione> elencoPrestazioni) {
    this.elencoPrestazioni = elencoPrestazioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("elenco_nre") 
 
  public List<String> getElencoNre() {
    return elencoNre;
  }
  public void setElencoNre(List<String> elencoNre) {
    this.elencoNre = elencoNre;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Referto referto = (Referto) o;
    return Objects.equals(idReferto, referto.idReferto) &&
        Objects.equals(idDocumentoCl, referto.idDocumentoCl) &&
        Objects.equals(accessionNumber, referto.accessionNumber) &&
        Objects.equals(accessionNumbers, referto.accessionNumbers) &&
        Objects.equals(codiceDocumentoDipartimentale, referto.codiceDocumentoDipartimentale) &&
        Objects.equals(codiceDocumentoScaricabile, referto.codiceDocumentoScaricabile) &&
        Objects.equals(dataEpisodio, referto.dataEpisodio) &&
        Objects.equals(dataValidazione, referto.dataValidazione) &&
        Objects.equals(dataInserimento, referto.dataInserimento) &&
        Objects.equals(dataAggiornamento, referto.dataAggiornamento) &&
        Objects.equals(dataAnnullamento, referto.dataAnnullamento) &&
        Objects.equals(dataCancellazione, referto.dataCancellazione) &&
        Objects.equals(luogoProduzioneDocumento, referto.luogoProduzioneDocumento) &&
        Objects.equals(dataScaricabileFinoAl, referto.dataScaricabileFinoAl) &&
        Objects.equals(tipoDocumento, referto.tipoDocumento) &&
        Objects.equals(tipoFileDocumento, referto.tipoFileDocumento) &&
        Objects.equals(medicoValidante, referto.medicoValidante) &&
        Objects.equals(numeroDiDownload, referto.numeroDiDownload) &&
        Objects.equals(numeroGiorniDownload, referto.numeroGiorniDownload) &&
        Objects.equals(pagatoTicketStato, referto.pagatoTicketStato) &&
        Objects.equals(oscuraScaricoCittadino, referto.oscuraScaricoCittadino) &&
        Objects.equals(firmatoDigitalmente, referto.firmatoDigitalmente) &&
        Objects.equals(componenteLocale, referto.componenteLocale) &&
        Objects.equals(paziente, referto.paziente) &&
        Objects.equals(pinBruciato, referto.pinBruciato) &&
        Objects.equals(richiestoPinCode, referto.richiestoPinCode) &&
        Objects.equals(scaricabileSeTicketNonPagato, referto.scaricabileSeTicketNonPagato) &&
        Objects.equals(soggettoALeggiSpeciali, referto.soggettoALeggiSpeciali) &&
        Objects.equals(idPacchetto, referto.idPacchetto) &&
        Objects.equals(statoRichiesta, referto.statoRichiesta) &&
        Objects.equals(dataDisponibilitaReferto, referto.dataDisponibilitaReferto) &&
        Objects.equals(medicoRefertante, referto.medicoRefertante) &&
        Objects.equals(ticketDaPagare, referto.ticketDaPagare) &&
        Objects.equals(ticketPagato, referto.ticketPagato) &&
        Objects.equals(tipoReferto, referto.tipoReferto) &&
        Objects.equals(elencoPrestazioni, referto.elencoPrestazioni) &&
        Objects.equals(elencoNre, referto.elencoNre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idReferto, idDocumentoCl, accessionNumber, accessionNumbers, codiceDocumentoDipartimentale, codiceDocumentoScaricabile, dataEpisodio, dataValidazione, dataInserimento, dataAggiornamento, dataAnnullamento, dataCancellazione, luogoProduzioneDocumento, dataScaricabileFinoAl, tipoDocumento, tipoFileDocumento, medicoValidante, numeroDiDownload, numeroGiorniDownload, pagatoTicketStato, oscuraScaricoCittadino, firmatoDigitalmente, componenteLocale, paziente, pinBruciato, richiestoPinCode, scaricabileSeTicketNonPagato, soggettoALeggiSpeciali, idPacchetto, statoRichiesta, dataDisponibilitaReferto, medicoRefertante, ticketDaPagare, ticketPagato, tipoReferto, elencoPrestazioni, elencoNre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Referto {\n");
    
    sb.append("    idReferto: ").append(toIndentedString(idReferto)).append("\n");
    sb.append("    idDocumentoCl: ").append(toIndentedString(idDocumentoCl)).append("\n");
    sb.append("    accessionNumber: ").append(toIndentedString(accessionNumber)).append("\n");
    sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
    sb.append("    codiceDocumentoDipartimentale: ").append(toIndentedString(codiceDocumentoDipartimentale)).append("\n");
    sb.append("    codiceDocumentoScaricabile: ").append(toIndentedString(codiceDocumentoScaricabile)).append("\n");
    sb.append("    dataEpisodio: ").append(toIndentedString(dataEpisodio)).append("\n");
    sb.append("    dataValidazione: ").append(toIndentedString(dataValidazione)).append("\n");
    sb.append("    dataInserimento: ").append(toIndentedString(dataInserimento)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
    sb.append("    dataAnnullamento: ").append(toIndentedString(dataAnnullamento)).append("\n");
    sb.append("    dataCancellazione: ").append(toIndentedString(dataCancellazione)).append("\n");
    sb.append("    luogoProduzioneDocumento: ").append(toIndentedString(luogoProduzioneDocumento)).append("\n");
    sb.append("    dataScaricabileFinoAl: ").append(toIndentedString(dataScaricabileFinoAl)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    tipoFileDocumento: ").append(toIndentedString(tipoFileDocumento)).append("\n");
    sb.append("    medicoValidante: ").append(toIndentedString(medicoValidante)).append("\n");
    sb.append("    numeroDiDownload: ").append(toIndentedString(numeroDiDownload)).append("\n");
    sb.append("    numeroGiorniDownload: ").append(toIndentedString(numeroGiorniDownload)).append("\n");
    sb.append("    pagatoTicketStato: ").append(toIndentedString(pagatoTicketStato)).append("\n");
    sb.append("    oscuraScaricoCittadino: ").append(toIndentedString(oscuraScaricoCittadino)).append("\n");
    sb.append("    firmatoDigitalmente: ").append(toIndentedString(firmatoDigitalmente)).append("\n");
    sb.append("    componenteLocale: ").append(toIndentedString(componenteLocale)).append("\n");
    sb.append("    paziente: ").append(toIndentedString(paziente)).append("\n");
    sb.append("    pinBruciato: ").append(toIndentedString(pinBruciato)).append("\n");
    sb.append("    richiestoPinCode: ").append(toIndentedString(richiestoPinCode)).append("\n");
    sb.append("    scaricabileSeTicketNonPagato: ").append(toIndentedString(scaricabileSeTicketNonPagato)).append("\n");
    sb.append("    soggettoALeggiSpeciali: ").append(toIndentedString(soggettoALeggiSpeciali)).append("\n");
    sb.append("    idPacchetto: ").append(toIndentedString(idPacchetto)).append("\n");
    sb.append("    statoRichiesta: ").append(toIndentedString(statoRichiesta)).append("\n");
    sb.append("    dataDisponibilitaReferto: ").append(toIndentedString(dataDisponibilitaReferto)).append("\n");
    sb.append("    medicoRefertante: ").append(toIndentedString(medicoRefertante)).append("\n");
    sb.append("    ticketDaPagare: ").append(toIndentedString(ticketDaPagare)).append("\n");
    sb.append("    ticketPagato: ").append(toIndentedString(ticketPagato)).append("\n");
    sb.append("    tipoReferto: ").append(toIndentedString(tipoReferto)).append("\n");
    sb.append("    elencoPrestazioni: ").append(toIndentedString(elencoPrestazioni)).append("\n");
    sb.append("    elencoNre: ").append(toIndentedString(elencoNre)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

