/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanesenpat.model.ModelCittadino;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneCodice;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneMalattia;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneMotivazioneAnnullamento;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneMotivazioneRevoca;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneStato;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneTipologia;
import it.csi.apisan.apisanesenpat.model.ModelTipologiaInvaliditaV3;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta un'esenzione indistintamente dalla tipologia ")

public class ModelEsenzione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String numeroPratica = null;
  private String dataRichiesta = null;
  private String dataRevoca = null;
  private String dataAnnullamento = null;
  private String dataScadenza = null;
  private String dataAggiornamento = null;
  private String dataInizioValidita = null;
  private String dataFineValidita = null;
  private String certificatoId = null;
  private Boolean zip = null;
  private Boolean archiviata = null;
  private Boolean annullabile = null;
  private Boolean rinnovabile = null;
  private Boolean revocabile = null;
  private Boolean inScadenza = null;
  private ModelEsenzioneCodice codice = null;
  private ModelEsenzioneStato stato = null;
  private ModelEsenzioneTipologia tipologia = null;
  private ModelTipologiaInvaliditaV3 tipologiaInvalidita = null;
  private ModelEsenzioneMalattia malattia = null;
  private ModelCittadino richiestoDa = null;
  private ModelCittadino revocatoDa = null;
  private ModelCittadino annullatoDa = null;
  private ModelEsenzioneMotivazioneRevoca motivazioneRevoca = null;
  private ModelEsenzioneMotivazioneAnnullamento motivazioneAnnullamento = null;

  /**
   * Un identificativo univoco della pratica. TODO: se il numero_pratica è univoco può essere una sua duplicazione, oppure un UUID, oppure qualcosa di comodo per il back-end 
   **/
  
  @ApiModelProperty(required = true, value = "Un identificativo univoco della pratica. TODO: se il numero_pratica è univoco può essere una sua duplicazione, oppure un UUID, oppure qualcosa di comodo per il back-end ")
  @JsonProperty("id") 
 
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Il numero della pratica associata alla richiesta
   **/
  
  @ApiModelProperty(required = true, value = "Il numero della pratica associata alla richiesta")
  @JsonProperty("numero_pratica") 
 
  @NotNull
  public String getNumeroPratica() {
    return numeroPratica;
  }
  public void setNumeroPratica(String numeroPratica) {
    this.numeroPratica = numeroPratica;
  }

  /**
   * Quando è stata richiesta
   **/
  
  @ApiModelProperty(required = true, value = "Quando è stata richiesta")
  @JsonProperty("data_richiesta") 
 
  @NotNull
  public String getDataRichiesta() {
    return dataRichiesta;
  }
  public void setDataRichiesta(String dataRichiesta) {
    this.dataRichiesta = dataRichiesta;
  }

  /**
   * Quando è stata revocata
   **/
  
  @ApiModelProperty(value = "Quando è stata revocata")
  @JsonProperty("data_revoca") 
 
  public String getDataRevoca() {
    return dataRevoca;
  }
  public void setDataRevoca(String dataRevoca) {
    this.dataRevoca = dataRevoca;
  }

  /**
   * Quando è stata annullata
   **/
  
  @ApiModelProperty(value = "Quando è stata annullata")
  @JsonProperty("data_annullamento") 
 
  public String getDataAnnullamento() {
    return dataAnnullamento;
  }
  public void setDataAnnullamento(String dataAnnullamento) {
    this.dataAnnullamento = dataAnnullamento;
  }

  /**
   * Quando è prevista la scadenza
   **/
  
  @ApiModelProperty(value = "Quando è prevista la scadenza")
  @JsonProperty("data_scadenza") 
 
  public String getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(String dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   * Quando è stata effettuata l&#39;ultima modifica
   **/
  
  @ApiModelProperty(required = true, value = "Quando è stata effettuata l'ultima modifica")
  @JsonProperty("data_aggiornamento") 
 
  @NotNull
  public String getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(String dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

  /**
   * Quando è iniziata la validità dell&#39;esenzione
   **/
  
  @ApiModelProperty(required = true, value = "Quando è iniziata la validità dell'esenzione")
  @JsonProperty("data_inizio_validita") 
 
  @NotNull
  public String getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(String dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   * Quando è terminata la validità dell&#39;esenzione
   **/
  
  @ApiModelProperty(required = true, value = "Quando è terminata la validità dell'esenzione")
  @JsonProperty("data_fine_validita") 
 
  @NotNull
  public String getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(String dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  /**
   * L&#39;id del certificato usato per richiedere questa esenzione 
   **/
  
  @ApiModelProperty(value = "L'id del certificato usato per richiedere questa esenzione ")
  @JsonProperty("certificato_id") 
 
  public String getCertificatoId() {
    return certificatoId;
  }
  public void setCertificatoId(String certificatoId) {
    this.certificatoId = certificatoId;
  }

  /**
   * Indica se l&#39;esenzione ha allegati o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Indica se l'esenzione ha allegati o meno ")
  @JsonProperty("zip") 
 
  @NotNull
  public Boolean isZip() {
    return zip;
  }
  public void setZip(Boolean zip) {
    this.zip = zip;
  }

  /**
   * Indica se l&#39;esenzione deve considerarsi archiviata o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Indica se l'esenzione deve considerarsi archiviata o meno ")
  @JsonProperty("archiviata") 
 
  @NotNull
  public Boolean isArchiviata() {
    return archiviata;
  }
  public void setArchiviata(Boolean archiviata) {
    this.archiviata = archiviata;
  }

  /**
   * Indica se l&#39;esenzione deve considerarsi annulabile o meno 
   **/
  
  @ApiModelProperty(value = "Indica se l'esenzione deve considerarsi annulabile o meno ")
  @JsonProperty("annullabile") 
 
  public Boolean isAnnullabile() {
    return annullabile;
  }
  public void setAnnullabile(Boolean annullabile) {
    this.annullabile = annullabile;
  }

  /**
   * Indica se l&#39;esenzione è rinnovabile o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Indica se l'esenzione è rinnovabile o meno ")
  @JsonProperty("rinnovabile") 
 
  @NotNull
  public Boolean isRinnovabile() {
    return rinnovabile;
  }
  public void setRinnovabile(Boolean rinnovabile) {
    this.rinnovabile = rinnovabile;
  }

  /**
   * Indica se l&#39;esenzione è revocabile o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Indica se l'esenzione è revocabile o meno ")
  @JsonProperty("revocabile") 
 
  @NotNull
  public Boolean isRevocabile() {
    return revocabile;
  }
  public void setRevocabile(Boolean revocabile) {
    this.revocabile = revocabile;
  }

  /**
   * Indica se l&#39;esenzione deve considerarsi in scadenza o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Indica se l'esenzione deve considerarsi in scadenza o meno ")
  @JsonProperty("in_scadenza") 
 
  @NotNull
  public Boolean isInScadenza() {
    return inScadenza;
  }
  public void setInScadenza(Boolean inScadenza) {
    this.inScadenza = inScadenza;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("codice") 
 
  @NotNull
  public ModelEsenzioneCodice getCodice() {
    return codice;
  }
  public void setCodice(ModelEsenzioneCodice codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stato") 
 
  @NotNull
  public ModelEsenzioneStato getStato() {
    return stato;
  }
  public void setStato(ModelEsenzioneStato stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tipologia") 
 
  @NotNull
  public ModelEsenzioneTipologia getTipologia() {
    return tipologia;
  }
  public void setTipologia(ModelEsenzioneTipologia tipologia) {
    this.tipologia = tipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_invalidita") 
 
  public ModelTipologiaInvaliditaV3 getTipologiaInvalidita() {
    return tipologiaInvalidita;
  }
  public void setTipologiaInvalidita(ModelTipologiaInvaliditaV3 tipologiaInvalidita) {
    this.tipologiaInvalidita = tipologiaInvalidita;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("malattia") 
 
  @NotNull
  public ModelEsenzioneMalattia getMalattia() {
    return malattia;
  }
  public void setMalattia(ModelEsenzioneMalattia malattia) {
    this.malattia = malattia;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("richiesto_da") 
 
  @NotNull
  public ModelCittadino getRichiestoDa() {
    return richiestoDa;
  }
  public void setRichiestoDa(ModelCittadino richiestoDa) {
    this.richiestoDa = richiestoDa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("revocato_da") 
 
  public ModelCittadino getRevocatoDa() {
    return revocatoDa;
  }
  public void setRevocatoDa(ModelCittadino revocatoDa) {
    this.revocatoDa = revocatoDa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("annullato_da") 
 
  public ModelCittadino getAnnullatoDa() {
    return annullatoDa;
  }
  public void setAnnullatoDa(ModelCittadino annullatoDa) {
    this.annullatoDa = annullatoDa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivazione_revoca") 
 
  public ModelEsenzioneMotivazioneRevoca getMotivazioneRevoca() {
    return motivazioneRevoca;
  }
  public void setMotivazioneRevoca(ModelEsenzioneMotivazioneRevoca motivazioneRevoca) {
    this.motivazioneRevoca = motivazioneRevoca;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivazione_annullamento") 
 
  public ModelEsenzioneMotivazioneAnnullamento getMotivazioneAnnullamento() {
    return motivazioneAnnullamento;
  }
  public void setMotivazioneAnnullamento(ModelEsenzioneMotivazioneAnnullamento motivazioneAnnullamento) {
    this.motivazioneAnnullamento = motivazioneAnnullamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsenzione modelEsenzione = (ModelEsenzione) o;
    return Objects.equals(id, modelEsenzione.id) &&
        Objects.equals(numeroPratica, modelEsenzione.numeroPratica) &&
        Objects.equals(dataRichiesta, modelEsenzione.dataRichiesta) &&
        Objects.equals(dataRevoca, modelEsenzione.dataRevoca) &&
        Objects.equals(dataAnnullamento, modelEsenzione.dataAnnullamento) &&
        Objects.equals(dataScadenza, modelEsenzione.dataScadenza) &&
        Objects.equals(dataAggiornamento, modelEsenzione.dataAggiornamento) &&
        Objects.equals(dataInizioValidita, modelEsenzione.dataInizioValidita) &&
        Objects.equals(dataFineValidita, modelEsenzione.dataFineValidita) &&
        Objects.equals(certificatoId, modelEsenzione.certificatoId) &&
        Objects.equals(zip, modelEsenzione.zip) &&
        Objects.equals(archiviata, modelEsenzione.archiviata) &&
        Objects.equals(annullabile, modelEsenzione.annullabile) &&
        Objects.equals(rinnovabile, modelEsenzione.rinnovabile) &&
        Objects.equals(revocabile, modelEsenzione.revocabile) &&
        Objects.equals(inScadenza, modelEsenzione.inScadenza) &&
        Objects.equals(codice, modelEsenzione.codice) &&
        Objects.equals(stato, modelEsenzione.stato) &&
        Objects.equals(tipologia, modelEsenzione.tipologia) &&
        Objects.equals(tipologiaInvalidita, modelEsenzione.tipologiaInvalidita) &&
        Objects.equals(malattia, modelEsenzione.malattia) &&
        Objects.equals(richiestoDa, modelEsenzione.richiestoDa) &&
        Objects.equals(revocatoDa, modelEsenzione.revocatoDa) &&
        Objects.equals(annullatoDa, modelEsenzione.annullatoDa) &&
        Objects.equals(motivazioneRevoca, modelEsenzione.motivazioneRevoca) &&
        Objects.equals(motivazioneAnnullamento, modelEsenzione.motivazioneAnnullamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroPratica, dataRichiesta, dataRevoca, dataAnnullamento, dataScadenza, dataAggiornamento, dataInizioValidita, dataFineValidita, certificatoId, zip, archiviata, annullabile, rinnovabile, revocabile, inScadenza, codice, stato, tipologia, tipologiaInvalidita, malattia, richiestoDa, revocatoDa, annullatoDa, motivazioneRevoca, motivazioneAnnullamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsenzione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroPratica: ").append(toIndentedString(numeroPratica)).append("\n");
    sb.append("    dataRichiesta: ").append(toIndentedString(dataRichiesta)).append("\n");
    sb.append("    dataRevoca: ").append(toIndentedString(dataRevoca)).append("\n");
    sb.append("    dataAnnullamento: ").append(toIndentedString(dataAnnullamento)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    certificatoId: ").append(toIndentedString(certificatoId)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    archiviata: ").append(toIndentedString(archiviata)).append("\n");
    sb.append("    annullabile: ").append(toIndentedString(annullabile)).append("\n");
    sb.append("    rinnovabile: ").append(toIndentedString(rinnovabile)).append("\n");
    sb.append("    revocabile: ").append(toIndentedString(revocabile)).append("\n");
    sb.append("    inScadenza: ").append(toIndentedString(inScadenza)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    tipologiaInvalidita: ").append(toIndentedString(tipologiaInvalidita)).append("\n");
    sb.append("    malattia: ").append(toIndentedString(malattia)).append("\n");
    sb.append("    richiestoDa: ").append(toIndentedString(richiestoDa)).append("\n");
    sb.append("    revocatoDa: ").append(toIndentedString(revocatoDa)).append("\n");
    sb.append("    annullatoDa: ").append(toIndentedString(annullatoDa)).append("\n");
    sb.append("    motivazioneRevoca: ").append(toIndentedString(motivazioneRevoca)).append("\n");
    sb.append("    motivazioneAnnullamento: ").append(toIndentedString(motivazioneAnnullamento)).append("\n");
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

