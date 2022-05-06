/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta una vaccinazione immunizzata")

public class ModelVaccinazioneImmunizzata   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String dataEsclusione = null;
  private String dataAppuntamento = null;
  private String dataRegistrazione = null;
  private String dataScadenza = null;
  private String motivazioneCodice = null;
  private String motivazioneDescrizione = null;
  private String vaccinazione = null;
  private Boolean visibile = null;
  private String note = null;
  private BigDecimal dose = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(required = true, value = "Identificativo univoco")
  @JsonProperty("id") 
 
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * la data in cui la vaccinazione è stata esclusa
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "la data in cui la vaccinazione è stata esclusa")
  @JsonProperty("data_esclusione") 
 
  @NotNull
  public String getDataEsclusione() {
    return dataEsclusione;
  }
  public void setDataEsclusione(String dataEsclusione) {
    this.dataEsclusione = dataEsclusione;
  }

  /**
   * la data dell&#39;apputamento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "la data dell'apputamento")
  @JsonProperty("data_appuntamento") 
 
  @NotNull
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * TODO - descrivere cos&#39;è
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "TODO - descrivere cos'è")
  @JsonProperty("data_registrazione") 
 
  public String getDataRegistrazione() {
    return dataRegistrazione;
  }
  public void setDataRegistrazione(String dataRegistrazione) {
    this.dataRegistrazione = dataRegistrazione;
  }

  /**
   * TODO - descrivere cos&#39;è
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "TODO - descrivere cos'è")
  @JsonProperty("data_scadenza") 
 
  public String getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(String dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   * Il codice della motivazione dell&#39;esclusione
   **/
  
  @ApiModelProperty(required = true, value = "Il codice della motivazione dell'esclusione")
  @JsonProperty("motivazione_codice") 
 
  @NotNull
  public String getMotivazioneCodice() {
    return motivazioneCodice;
  }
  public void setMotivazioneCodice(String motivazioneCodice) {
    this.motivazioneCodice = motivazioneCodice;
  }

  /**
   * La descrizione della motivazione dell&#39;esclusione
   **/
  
  @ApiModelProperty(required = true, value = "La descrizione della motivazione dell'esclusione")
  @JsonProperty("motivazione_descrizione") 
 
  @NotNull
  public String getMotivazioneDescrizione() {
    return motivazioneDescrizione;
  }
  public void setMotivazioneDescrizione(String motivazioneDescrizione) {
    this.motivazioneDescrizione = motivazioneDescrizione;
  }

  /**
   * TODO - Descrivere cos&#39;è
   **/
  
  @ApiModelProperty(required = true, value = "TODO - Descrivere cos'è")
  @JsonProperty("vaccinazione") 
 
  @NotNull
  public String getVaccinazione() {
    return vaccinazione;
  }
  public void setVaccinazione(String vaccinazione) {
    this.vaccinazione = vaccinazione;
  }

  /**
   * true se deve essere visibile al cittadino, false altrimenti
   **/
  
  @ApiModelProperty(example = "true", value = "true se deve essere visibile al cittadino, false altrimenti")
  @JsonProperty("visibile") 
 
  public Boolean isVisibile() {
    return visibile;
  }
  public void setVisibile(Boolean visibile) {
    this.visibile = visibile;
  }

  /**
   * TODO - Descrivere cos&#39;è
   **/
  
  @ApiModelProperty(value = "TODO - Descrivere cos'è")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Il numero della dose
   **/
  
  @ApiModelProperty(example = "2.0", value = "Il numero della dose")
  @JsonProperty("dose") 
 
  public BigDecimal getDose() {
    return dose;
  }
  public void setDose(BigDecimal dose) {
    this.dose = dose;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVaccinazioneImmunizzata modelVaccinazioneImmunizzata = (ModelVaccinazioneImmunizzata) o;
    return Objects.equals(id, modelVaccinazioneImmunizzata.id) &&
        Objects.equals(dataEsclusione, modelVaccinazioneImmunizzata.dataEsclusione) &&
        Objects.equals(dataAppuntamento, modelVaccinazioneImmunizzata.dataAppuntamento) &&
        Objects.equals(dataRegistrazione, modelVaccinazioneImmunizzata.dataRegistrazione) &&
        Objects.equals(dataScadenza, modelVaccinazioneImmunizzata.dataScadenza) &&
        Objects.equals(motivazioneCodice, modelVaccinazioneImmunizzata.motivazioneCodice) &&
        Objects.equals(motivazioneDescrizione, modelVaccinazioneImmunizzata.motivazioneDescrizione) &&
        Objects.equals(vaccinazione, modelVaccinazioneImmunizzata.vaccinazione) &&
        Objects.equals(visibile, modelVaccinazioneImmunizzata.visibile) &&
        Objects.equals(note, modelVaccinazioneImmunizzata.note) &&
        Objects.equals(dose, modelVaccinazioneImmunizzata.dose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataEsclusione, dataAppuntamento, dataRegistrazione, dataScadenza, motivazioneCodice, motivazioneDescrizione, vaccinazione, visibile, note, dose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVaccinazioneImmunizzata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataEsclusione: ").append(toIndentedString(dataEsclusione)).append("\n");
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    dataRegistrazione: ").append(toIndentedString(dataRegistrazione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    motivazioneCodice: ").append(toIndentedString(motivazioneCodice)).append("\n");
    sb.append("    motivazioneDescrizione: ").append(toIndentedString(motivazioneDescrizione)).append("\n");
    sb.append("    vaccinazione: ").append(toIndentedString(vaccinazione)).append("\n");
    sb.append("    visibile: ").append(toIndentedString(visibile)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    dose: ").append(toIndentedString(dose)).append("\n");
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

