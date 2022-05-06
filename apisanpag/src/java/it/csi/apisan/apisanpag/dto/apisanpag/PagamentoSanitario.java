/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.AssegnazioneIuv;
import it.csi.apisan.apisanpag.dto.apisanpag.Cittadino;
import it.csi.apisan.apisanpag.dto.apisanpag.Importo;
import it.csi.apisan.apisanpag.dto.apisanpag.Nre;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PagamentoSanitario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Cittadino paziente = null;
  private Asr asr = null;
  private String motivo = null;
  private Importo daPagare = null;
  private Importo pagato = null;
  private Importo marcaDaBollo = null;
  private Importo iva = null;
  private String ivaPerStampaVideo = null;
  private Integer opposizione730 = null;
  private String descrizioneOpposizione730 = null;
  private String stato = null;
  private String numeroPraticaRegionale = null;
  private String numeroPraticaAsr = null;
  private Integer idRicevuta = null;
  private AssegnazioneIuv assegnazioneIuv = null;
  private List<Nre> nre = new ArrayList<Nre>();
  private Date dataCreazione = null;
  private String uuid = null;
  private String codiceServizio = null;
  private String codiceVersamento = null;

  /**
   * anagrafica restituita dal S.I. dell&#39;Asr che ha emesso la pratica da pagare    
   **/
  
  @ApiModelProperty(value = "anagrafica restituita dal S.I. dell'Asr che ha emesso la pratica da pagare    ")
  @JsonProperty("paziente") 
 
  public Cittadino getPaziente() {
    return paziente;
  }
  public void setPaziente(Cittadino paziente) {
    this.paziente = paziente;
  }

  /**
   * asr che ha generato la pratica di pagamento
   **/
  
  @ApiModelProperty(value = "asr che ha generato la pratica di pagamento")
  @JsonProperty("asr") 
 
  public Asr getAsr() {
    return asr;
  }
  public void setAsr(Asr asr) {
    this.asr = asr;
  }

  /**
   * codice regionale del motivo pagamento
   **/
  
  @ApiModelProperty(example = "S", value = "codice regionale del motivo pagamento")
  @JsonProperty("motivo") 
 
  public String getMotivo() {
    return motivo;
  }
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  /**
   * importo da pagare
   **/
  
  @ApiModelProperty(value = "importo da pagare")
  @JsonProperty("da_pagare") 
 
  public Importo getDaPagare() {
    return daPagare;
  }
  public void setDaPagare(Importo daPagare) {
    this.daPagare = daPagare;
  }

  /**
   * importo pagato
   **/
  
  @ApiModelProperty(value = "importo pagato")
  @JsonProperty("pagato") 
 
  public Importo getPagato() {
    return pagato;
  }
  public void setPagato(Importo pagato) {
    this.pagato = pagato;
  }

  /**
   * importo marca da bollo
   **/
  
  @ApiModelProperty(value = "importo marca da bollo")
  @JsonProperty("marca_da_bollo") 
 
  public Importo getMarcaDaBollo() {
    return marcaDaBollo;
  }
  public void setMarcaDaBollo(Importo marcaDaBollo) {
    this.marcaDaBollo = marcaDaBollo;
  }

  /**
   * importo dell&#39;iva
   **/
  
  @ApiModelProperty(value = "importo dell'iva")
  @JsonProperty("iva") 
 
  public Importo getIva() {
    return iva;
  }
  public void setIva(Importo iva) {
    this.iva = iva;
  }

  /**
   * percentuale iva applicata
   **/
  
  @ApiModelProperty(example = "4%", value = "percentuale iva applicata")
  @JsonProperty("iva_per_stampa_video") 
 
  public String getIvaPerStampaVideo() {
    return ivaPerStampaVideo;
  }
  public void setIvaPerStampaVideo(String ivaPerStampaVideo) {
    this.ivaPerStampaVideo = ivaPerStampaVideo;
  }

  /**
   * codice scelta opposizione trasmissione pagamento al MEF per il calcolo automatico delle spese sanitarie sul 730 0 opposizione 1 autorizzazione,  -1 scelta non ancora eseguita
   **/
  
  @ApiModelProperty(example = "0", value = "codice scelta opposizione trasmissione pagamento al MEF per il calcolo automatico delle spese sanitarie sul 730 0 opposizione 1 autorizzazione,  -1 scelta non ancora eseguita")
  @JsonProperty("opposizione730") 
 
  public Integer getOpposizione730() {
    return opposizione730;
  }
  public void setOpposizione730(Integer opposizione730) {
    this.opposizione730 = opposizione730;
  }

  /**
   * descrizione scelta opposizione trasmissione pagamento al MEF per il calcolo automatico delle spese sanitarie sul 730 0 opposizione 1 autorizzazione,  -1 scelta non ancora eseguita
   **/
  
  @ApiModelProperty(example = "OPPOSIZIONE ALLA TRASMISSIONE DEL PAGAMENTO ALL'AGENZIA DELLE ENTRATE PER IL CALCOLO DEL 730 PRECOMPILATO", value = "descrizione scelta opposizione trasmissione pagamento al MEF per il calcolo automatico delle spese sanitarie sul 730 0 opposizione 1 autorizzazione,  -1 scelta non ancora eseguita")
  @JsonProperty("descrizione_opposizione730") 
 
  public String getDescrizioneOpposizione730() {
    return descrizioneOpposizione730;
  }
  public void setDescrizioneOpposizione730(String descrizioneOpposizione730) {
    this.descrizioneOpposizione730 = descrizioneOpposizione730;
  }

  /**
   * stato del pagamento sanitario richiesto dalla Azienda sanitaria regionale (in questo caso il valore consentito è da pagare)
   **/
  
  @ApiModelProperty(example = "DA PAGARE", value = "stato del pagamento sanitario richiesto dalla Azienda sanitaria regionale (in questo caso il valore consentito è da pagare)")
  @JsonProperty("stato") 
 
  public String getStato() {
    return stato;
  }
  public void setStato(String stato) {
    this.stato = stato;
  }

  /**
   * identficativo della richiesta di pagamento
   **/
  
  @ApiModelProperty(example = "S30101123456789012345602670", value = "identficativo della richiesta di pagamento")
  @JsonProperty("numero_pratica_regionale") 
 
  public String getNumeroPraticaRegionale() {
    return numeroPraticaRegionale;
  }
  public void setNumeroPraticaRegionale(String numeroPraticaRegionale) {
    this.numeroPraticaRegionale = numeroPraticaRegionale;
  }

  /**
   * numero pratica asr aggiunto in quanto serve per i filter da non usare
   **/
  
  @ApiModelProperty(example = "123456723456", value = "numero pratica asr aggiunto in quanto serve per i filter da non usare")
  @JsonProperty("numero_pratica_asr") 
 
  public String getNumeroPraticaAsr() {
    return numeroPraticaAsr;
  }
  public void setNumeroPraticaAsr(String numeroPraticaAsr) {
    this.numeroPraticaAsr = numeroPraticaAsr;
  }

  /**
   * id della ricevuta di pagamento verrà ritornato unicamente nella response a pagamento/{id_transazione}/ricevuta
   **/
  
  @ApiModelProperty(example = "2019132", value = "id della ricevuta di pagamento verrà ritornato unicamente nella response a pagamento/{id_transazione}/ricevuta")
  @JsonProperty("id_ricevuta") 
 
  public Integer getIdRicevuta() {
    return idRicevuta;
  }
  public void setIdRicevuta(Integer idRicevuta) {
    this.idRicevuta = idRicevuta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assegnazione_iuv") 
 
  public AssegnazioneIuv getAssegnazioneIuv() {
    return assegnazioneIuv;
  }
  public void setAssegnazioneIuv(AssegnazioneIuv assegnazioneIuv) {
    this.assegnazioneIuv = assegnazioneIuv;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nre") 
 
  public List<Nre> getNre() {
    return nre;
  }
  public void setNre(List<Nre> nre) {
    this.nre = nre;
  }

  /**
   * data creazione della richiesta di pagamento
   **/
  
  @ApiModelProperty(example = "01/05/2018", value = "data creazione della richiesta di pagamento")
  @JsonProperty("data_creazione") 
 
  public Date getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(Date dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   * Universally unique identifier
   **/
  
  @ApiModelProperty(example = "550e8400-e29b-41d4-a716-446655440000", value = "Universally unique identifier")
  @JsonProperty("uuid") 
 
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Codice del servizio (dipartimentale) che ha generato il ticket
   **/
  
  @ApiModelProperty(example = "1100", value = "Codice del servizio (dipartimentale) che ha generato il ticket")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   * Codice stabilito dall’ASR e usato per generare lo IUV nei pagamenti pagoPA.
   **/
  
  @ApiModelProperty(example = "1", value = "Codice stabilito dall’ASR e usato per generare lo IUV nei pagamenti pagoPA.")
  @JsonProperty("codice_versamento") 
 
  public String getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(String codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoSanitario pagamentoSanitario = (PagamentoSanitario) o;
    return Objects.equals(paziente, pagamentoSanitario.paziente) &&
        Objects.equals(asr, pagamentoSanitario.asr) &&
        Objects.equals(motivo, pagamentoSanitario.motivo) &&
        Objects.equals(daPagare, pagamentoSanitario.daPagare) &&
        Objects.equals(pagato, pagamentoSanitario.pagato) &&
        Objects.equals(marcaDaBollo, pagamentoSanitario.marcaDaBollo) &&
        Objects.equals(iva, pagamentoSanitario.iva) &&
        Objects.equals(ivaPerStampaVideo, pagamentoSanitario.ivaPerStampaVideo) &&
        Objects.equals(opposizione730, pagamentoSanitario.opposizione730) &&
        Objects.equals(descrizioneOpposizione730, pagamentoSanitario.descrizioneOpposizione730) &&
        Objects.equals(stato, pagamentoSanitario.stato) &&
        Objects.equals(numeroPraticaRegionale, pagamentoSanitario.numeroPraticaRegionale) &&
        Objects.equals(numeroPraticaAsr, pagamentoSanitario.numeroPraticaAsr) &&
        Objects.equals(idRicevuta, pagamentoSanitario.idRicevuta) &&
        Objects.equals(assegnazioneIuv, pagamentoSanitario.assegnazioneIuv) &&
        Objects.equals(nre, pagamentoSanitario.nre) &&
        Objects.equals(dataCreazione, pagamentoSanitario.dataCreazione) &&
        Objects.equals(uuid, pagamentoSanitario.uuid) &&
        Objects.equals(codiceServizio, pagamentoSanitario.codiceServizio) &&
        Objects.equals(codiceVersamento, pagamentoSanitario.codiceVersamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paziente, asr, motivo, daPagare, pagato, marcaDaBollo, iva, ivaPerStampaVideo, opposizione730, descrizioneOpposizione730, stato, numeroPraticaRegionale, numeroPraticaAsr, idRicevuta, assegnazioneIuv, nre, dataCreazione, uuid, codiceServizio, codiceVersamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoSanitario {\n");
    
    sb.append("    paziente: ").append(toIndentedString(paziente)).append("\n");
    sb.append("    asr: ").append(toIndentedString(asr)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    daPagare: ").append(toIndentedString(daPagare)).append("\n");
    sb.append("    pagato: ").append(toIndentedString(pagato)).append("\n");
    sb.append("    marcaDaBollo: ").append(toIndentedString(marcaDaBollo)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    ivaPerStampaVideo: ").append(toIndentedString(ivaPerStampaVideo)).append("\n");
    sb.append("    opposizione730: ").append(toIndentedString(opposizione730)).append("\n");
    sb.append("    descrizioneOpposizione730: ").append(toIndentedString(descrizioneOpposizione730)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    numeroPraticaRegionale: ").append(toIndentedString(numeroPraticaRegionale)).append("\n");
    sb.append("    numeroPraticaAsr: ").append(toIndentedString(numeroPraticaAsr)).append("\n");
    sb.append("    idRicevuta: ").append(toIndentedString(idRicevuta)).append("\n");
    sb.append("    assegnazioneIuv: ").append(toIndentedString(assegnazioneIuv)).append("\n");
    sb.append("    nre: ").append(toIndentedString(nre)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    codiceVersamento: ").append(toIndentedString(codiceVersamento)).append("\n");
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

