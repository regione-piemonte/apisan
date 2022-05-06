/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagatoRicevutaPagamento;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagatoRicevutaRimborso;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagatoRimborsoUtilizzato;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelTicketPagato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String numeroPratica = null;
  private String asrId = null;
  private String asrDescrizione = null;
  private BigDecimal importoPratica = null;
  private BigDecimal importoPagamento = null;
  private BigDecimal importoDaRimborsare = null;
  private BigDecimal importoRimborsato = null;
  private Integer consenso730 = null;
  private String statoPraticaCodice = null;
  private String statoPraticaDescrizione = null;
  private Date dataAnnullamento = null;
  private String servizioCodice = null;
  private String versamentoCodice = null;
  private String motivoPagamento = null;
  private Integer rimborsoModalitaCodice = null;
  private List<ModelTicketPagatoRicevutaPagamento> ricevutePagamento = new ArrayList<ModelTicketPagatoRicevutaPagamento>();
  private List<ModelTicketPagatoRicevutaRimborso> ricevuteRimborso = new ArrayList<ModelTicketPagatoRicevutaRimborso>();
  private List<ModelTicketPagatoRimborsoUtilizzato> rimborsiUtilizzati = new ArrayList<ModelTicketPagatoRimborsoUtilizzato>();

  /**
   * Un numero che identifica univocamente il pagamento
   **/
  

  @JsonProperty("numero_pratica") 
 
  public String getNumeroPratica() {
    return numeroPratica;
  }
  public void setNumeroPratica(String numeroPratica) {
    this.numeroPratica = numeroPratica;
  }

  /**
   * L&#39;id dell&#39;ASR di riferimento del pagamento
   **/
  

  @JsonProperty("asr_id") 
 
  public String getAsrId() {
    return asrId;
  }
  public void setAsrId(String asrId) {
    this.asrId = asrId;
  }

  /**
   * Il nome dell&#39;ASR di riferimento del pagamento
   **/
  

  @JsonProperty("asr_descrizione") 
 
  public String getAsrDescrizione() {
    return asrDescrizione;
  }
  public void setAsrDescrizione(String asrDescrizione) {
    this.asrDescrizione = asrDescrizione;
  }

  /**
   * L&#39;importo della pratica
   **/
  

  @JsonProperty("importo_pratica") 
 
  public BigDecimal getImportoPratica() {
    return importoPratica;
  }
  public void setImportoPratica(BigDecimal importoPratica) {
    this.importoPratica = importoPratica;
  }

  /**
   * L&#39;importo pagato dal cittadino
   **/
  

  @JsonProperty("importo_pagamento") 
 
  public BigDecimal getImportoPagamento() {
    return importoPagamento;
  }
  public void setImportoPagamento(BigDecimal importoPagamento) {
    this.importoPagamento = importoPagamento;
  }

  /**
   * L&#39;importo da rimborsare al cittadino
   **/
  

  @JsonProperty("importo_da_rimborsare") 
 
  public BigDecimal getImportoDaRimborsare() {
    return importoDaRimborsare;
  }
  public void setImportoDaRimborsare(BigDecimal importoDaRimborsare) {
    this.importoDaRimborsare = importoDaRimborsare;
  }

  /**
   * L&#39;importo rimborsato al cittadino
   **/
  

  @JsonProperty("importo_rimborsato") 
 
  public BigDecimal getImportoRimborsato() {
    return importoRimborsato;
  }
  public void setImportoRimborsato(BigDecimal importoRimborsato) {
    this.importoRimborsato = importoRimborsato;
  }

  /**
   * codice scelta opposizione trasmissione pagamento al MEF per il calcolo automatico delle spese sanitarie sul 730 0 opposizione 1 autorizzazione, -1 scelta non ancora eseguita 
   **/
  

  @JsonProperty("consenso_730") 
 
  public Integer getConsenso730() {
    return consenso730;
  }
  public void setConsenso730(Integer consenso730) {
    this.consenso730 = consenso730;
  }

  /**
   * Il codice dello stato della pratica. Possibili valori         * 001 -  Ticket pagato Totalmente         * 010 -  Ticket Pagato Parzialmente         * 015 -  Ticket Non Pagato         * 800 -  Ticket Annullato         * 801 -  Ticket Rimborsato         * 802 - Ticket Da rimborsare 
   **/
  

  @JsonProperty("stato_pratica_codice") 
 
  public String getStatoPraticaCodice() {
    return statoPraticaCodice;
  }
  public void setStatoPraticaCodice(String statoPraticaCodice) {
    this.statoPraticaCodice = statoPraticaCodice;
  }

  /**
   * Descrizione testuale dello stato da mostrare sulla UI
   **/
  

  @JsonProperty("stato_pratica_descrizione") 
 
  public String getStatoPraticaDescrizione() {
    return statoPraticaDescrizione;
  }
  public void setStatoPraticaDescrizione(String statoPraticaDescrizione) {
    this.statoPraticaDescrizione = statoPraticaDescrizione;
  }

  /**
   * Data annullamento della pratica
   **/
  

  @JsonProperty("data_annullamento") 
 
  public Date getDataAnnullamento() {
    return dataAnnullamento;
  }
  public void setDataAnnullamento(Date dataAnnullamento) {
    this.dataAnnullamento = dataAnnullamento;
  }

  /**
   * Codice del servizio (dipartimentale) che ha generato il ticket
   **/
  

  @JsonProperty("servizio_codice") 
 
  public String getServizioCodice() {
    return servizioCodice;
  }
  public void setServizioCodice(String servizioCodice) {
    this.servizioCodice = servizioCodice;
  }

  /**
   * Codice stabilito dall’ASR e usato per generare lo IUV nei pagamenti pagoPA
   **/
  

  @JsonProperty("versamento_codice") 
 
  public String getVersamentoCodice() {
    return versamentoCodice;
  }
  public void setVersamentoCodice(String versamentoCodice) {
    this.versamentoCodice = versamentoCodice;
  }

  /**
   **/
  

  @JsonProperty("motivo_pagamento") 
 
  public String getMotivoPagamento() {
    return motivoPagamento;
  }
  public void setMotivoPagamento(String motivoPagamento) {
    this.motivoPagamento = motivoPagamento;
  }

  /**
   * Il codice della modalità di rimborso impostato/usato per questo pagamento. * 1 - Voucher * 2 - Bonifico * 3 - Borsellino 
   **/
  

  @JsonProperty("rimborso_modalita_codice") 
 
  public Integer getRimborsoModalitaCodice() {
    return rimborsoModalitaCodice;
  }
  public void setRimborsoModalitaCodice(Integer rimborsoModalitaCodice) {
    this.rimborsoModalitaCodice = rimborsoModalitaCodice;
  }

  /**
   * Contiene l&#39;elenco delle ricevute create dai vari pagamenti effettuati per pagare completamente la pratica  Le nuove pratiche non possono essere pagate parzialmente e quindi non possono generare più ricevute di pagamento. Però nello storico potrebbero esserci delle casistiche in cui ci siano delle pratiche pagate in più tranche 
   **/
  

  @JsonProperty("ricevute_pagamento") 
 
  public List<ModelTicketPagatoRicevutaPagamento> getRicevutePagamento() {
    return ricevutePagamento;
  }
  public void setRicevutePagamento(List<ModelTicketPagatoRicevutaPagamento> ricevutePagamento) {
    this.ricevutePagamento = ricevutePagamento;
  }

  /**
   * Se questa pratica è stata usata come rimborso, allora qui sono presenti tutte le ricevute relative alla generazione del rimborso  Se si tratta di un rimborso tramite IBAN o Vaucher conterrà una sola ricevuta di rimborso 
   **/
  

  @JsonProperty("ricevute_rimborso") 
 
  public List<ModelTicketPagatoRicevutaRimborso> getRicevuteRimborso() {
    return ricevuteRimborso;
  }
  public void setRicevuteRimborso(List<ModelTicketPagatoRicevutaRimborso> ricevuteRimborso) {
    this.ricevuteRimborso = ricevuteRimborso;
  }

  /**
   * Contiene l&#39;elenco dei rimborsi utilizzati per pagare questa pratica. 
   **/
  

  @JsonProperty("rimborsi_utilizzati") 
 
  public List<ModelTicketPagatoRimborsoUtilizzato> getRimborsiUtilizzati() {
    return rimborsiUtilizzati;
  }
  public void setRimborsiUtilizzati(List<ModelTicketPagatoRimborsoUtilizzato> rimborsiUtilizzati) {
    this.rimborsiUtilizzati = rimborsiUtilizzati;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTicketPagato modelTicketPagato = (ModelTicketPagato) o;
    return Objects.equals(numeroPratica, modelTicketPagato.numeroPratica) &&
        Objects.equals(asrId, modelTicketPagato.asrId) &&
        Objects.equals(asrDescrizione, modelTicketPagato.asrDescrizione) &&
        Objects.equals(importoPratica, modelTicketPagato.importoPratica) &&
        Objects.equals(importoPagamento, modelTicketPagato.importoPagamento) &&
        Objects.equals(importoDaRimborsare, modelTicketPagato.importoDaRimborsare) &&
        Objects.equals(importoRimborsato, modelTicketPagato.importoRimborsato) &&
        Objects.equals(consenso730, modelTicketPagato.consenso730) &&
        Objects.equals(statoPraticaCodice, modelTicketPagato.statoPraticaCodice) &&
        Objects.equals(statoPraticaDescrizione, modelTicketPagato.statoPraticaDescrizione) &&
        Objects.equals(dataAnnullamento, modelTicketPagato.dataAnnullamento) &&
        Objects.equals(servizioCodice, modelTicketPagato.servizioCodice) &&
        Objects.equals(versamentoCodice, modelTicketPagato.versamentoCodice) &&
        Objects.equals(motivoPagamento, modelTicketPagato.motivoPagamento) &&
        Objects.equals(rimborsoModalitaCodice, modelTicketPagato.rimborsoModalitaCodice) &&
        Objects.equals(ricevutePagamento, modelTicketPagato.ricevutePagamento) &&
        Objects.equals(ricevuteRimborso, modelTicketPagato.ricevuteRimborso) &&
        Objects.equals(rimborsiUtilizzati, modelTicketPagato.rimborsiUtilizzati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroPratica, asrId, asrDescrizione, importoPratica, importoPagamento, importoDaRimborsare, importoRimborsato, consenso730, statoPraticaCodice, statoPraticaDescrizione, dataAnnullamento, servizioCodice, versamentoCodice, motivoPagamento, rimborsoModalitaCodice, ricevutePagamento, ricevuteRimborso, rimborsiUtilizzati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTicketPagato {\n");
    
    sb.append("    numeroPratica: ").append(toIndentedString(numeroPratica)).append("\n");
    sb.append("    asrId: ").append(toIndentedString(asrId)).append("\n");
    sb.append("    asrDescrizione: ").append(toIndentedString(asrDescrizione)).append("\n");
    sb.append("    importoPratica: ").append(toIndentedString(importoPratica)).append("\n");
    sb.append("    importoPagamento: ").append(toIndentedString(importoPagamento)).append("\n");
    sb.append("    importoDaRimborsare: ").append(toIndentedString(importoDaRimborsare)).append("\n");
    sb.append("    importoRimborsato: ").append(toIndentedString(importoRimborsato)).append("\n");
    sb.append("    consenso730: ").append(toIndentedString(consenso730)).append("\n");
    sb.append("    statoPraticaCodice: ").append(toIndentedString(statoPraticaCodice)).append("\n");
    sb.append("    statoPraticaDescrizione: ").append(toIndentedString(statoPraticaDescrizione)).append("\n");
    sb.append("    dataAnnullamento: ").append(toIndentedString(dataAnnullamento)).append("\n");
    sb.append("    servizioCodice: ").append(toIndentedString(servizioCodice)).append("\n");
    sb.append("    versamentoCodice: ").append(toIndentedString(versamentoCodice)).append("\n");
    sb.append("    motivoPagamento: ").append(toIndentedString(motivoPagamento)).append("\n");
    sb.append("    rimborsoModalitaCodice: ").append(toIndentedString(rimborsoModalitaCodice)).append("\n");
    sb.append("    ricevutePagamento: ").append(toIndentedString(ricevutePagamento)).append("\n");
    sb.append("    ricevuteRimborso: ").append(toIndentedString(ricevuteRimborso)).append("\n");
    sb.append("    rimborsiUtilizzati: ").append(toIndentedString(rimborsiUtilizzati)).append("\n");
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

