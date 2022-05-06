/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta l'istanza di reazione avversa ")

public class ModelIstanzaReazioneAvversa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idIstanza = null;
  private String farmaco = null;
  private String note = null;
  private String dataReazione = null;
  private String tipologia = null;
  private String idStato = null;
  private String descrizioneStato = null;
  private String noteRisposta = null;
  private String idVaccinazione = null;
  private List<ModelVaccino> vaccini = new ArrayList<ModelVaccino>();

  /**
   * L id dell istanza
   **/
  
  @ApiModelProperty(required = true, value = "L id dell istanza")
  @JsonProperty("id_istanza") 
 
  @NotNull
  public String getIdIstanza() {
    return idIstanza;
  }
  public void setIdIstanza(String idIstanza) {
    this.idIstanza = idIstanza;
  }

  /**
   * Nome del farmaco
   **/
  
  @ApiModelProperty(value = "Nome del farmaco")
  @JsonProperty("farmaco") 
 
  public String getFarmaco() {
    return farmaco;
  }
  public void setFarmaco(String farmaco) {
    this.farmaco = farmaco;
  }

  /**
   * Note dell&#39;utente
   **/
  
  @ApiModelProperty(value = "Note dell'utente")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   **/
  
  @ApiModelProperty(example = "2021-11-08T09:21:38.739Z", required = true, value = "")
  @JsonProperty("data_reazione") 
 
  @NotNull
  public String getDataReazione() {
    return dataReazione;
  }
  public void setDataReazione(String dataReazione) {
    this.dataReazione = dataReazione;
  }

  /**
   * Tipologia
   **/
  
  @ApiModelProperty(value = "Tipologia")
  @JsonProperty("tipologia") 
 
  public String getTipologia() {
    return tipologia;
  }
  public void setTipologia(String tipologia) {
    this.tipologia = tipologia;
  }

  /**
   * id dello stato
   **/
  
  @ApiModelProperty(required = true, value = "id dello stato")
  @JsonProperty("id_stato") 
 
  @NotNull
  public String getIdStato() {
    return idStato;
  }
  public void setIdStato(String idStato) {
    this.idStato = idStato;
  }

  /**
   * descrizione dello stato
   **/
  
  @ApiModelProperty(required = true, value = "descrizione dello stato")
  @JsonProperty("descrizione_stato") 
 
  @NotNull
  public String getDescrizioneStato() {
    return descrizioneStato;
  }
  public void setDescrizioneStato(String descrizioneStato) {
    this.descrizioneStato = descrizioneStato;
  }

  /**
   * note in risposta
   **/
  
  @ApiModelProperty(value = "note in risposta")
  @JsonProperty("note_risposta") 
 
  public String getNoteRisposta() {
    return noteRisposta;
  }
  public void setNoteRisposta(String noteRisposta) {
    this.noteRisposta = noteRisposta;
  }

  /**
   * id della vaccinazione
   **/
  
  @ApiModelProperty(required = true, value = "id della vaccinazione")
  @JsonProperty("id_vaccinazione") 
 
  @NotNull
  public String getIdVaccinazione() {
    return idVaccinazione;
  }
  public void setIdVaccinazione(String idVaccinazione) {
    this.idVaccinazione = idVaccinazione;
  }

  /**
   * vaccini relativi
   **/
  
  @ApiModelProperty(value = "vaccini relativi")
  @JsonProperty("vaccini") 
 
  public List<ModelVaccino> getVaccini() {
    return vaccini;
  }
  public void setVaccini(List<ModelVaccino> vaccini) {
    this.vaccini = vaccini;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIstanzaReazioneAvversa modelIstanzaReazioneAvversa = (ModelIstanzaReazioneAvversa) o;
    return Objects.equals(idIstanza, modelIstanzaReazioneAvversa.idIstanza) &&
        Objects.equals(farmaco, modelIstanzaReazioneAvversa.farmaco) &&
        Objects.equals(note, modelIstanzaReazioneAvversa.note) &&
        Objects.equals(dataReazione, modelIstanzaReazioneAvversa.dataReazione) &&
        Objects.equals(tipologia, modelIstanzaReazioneAvversa.tipologia) &&
        Objects.equals(idStato, modelIstanzaReazioneAvversa.idStato) &&
        Objects.equals(descrizioneStato, modelIstanzaReazioneAvversa.descrizioneStato) &&
        Objects.equals(noteRisposta, modelIstanzaReazioneAvversa.noteRisposta) &&
        Objects.equals(idVaccinazione, modelIstanzaReazioneAvversa.idVaccinazione) &&
        Objects.equals(vaccini, modelIstanzaReazioneAvversa.vaccini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idIstanza, farmaco, note, dataReazione, tipologia, idStato, descrizioneStato, noteRisposta, idVaccinazione, vaccini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIstanzaReazioneAvversa {\n");
    
    sb.append("    idIstanza: ").append(toIndentedString(idIstanza)).append("\n");
    sb.append("    farmaco: ").append(toIndentedString(farmaco)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    dataReazione: ").append(toIndentedString(dataReazione)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    idStato: ").append(toIndentedString(idStato)).append("\n");
    sb.append("    descrizioneStato: ").append(toIndentedString(descrizioneStato)).append("\n");
    sb.append("    noteRisposta: ").append(toIndentedString(noteRisposta)).append("\n");
    sb.append("    idVaccinazione: ").append(toIndentedString(idVaccinazione)).append("\n");
    sb.append("    vaccini: ").append(toIndentedString(vaccini)).append("\n");
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

