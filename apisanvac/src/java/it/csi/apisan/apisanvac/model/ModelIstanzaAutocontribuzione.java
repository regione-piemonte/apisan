/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta l istanza di autocontribuzione attiva ")

public class ModelIstanzaAutocontribuzione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idIstanza = null;
  private String idAppuntamento = null;
  private String idConvocazione = null;
  private String idStato = null;
  private String descrizioneStato = null;
  private String noteRichiesta = null;
  private String noteRisposta = null;
  private String tipologiaIstanza = null;
  private String dataRichiesta = null;

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
   * L id dell appuntamento relativo all istanza
   **/
  
  @ApiModelProperty(value = "L id dell appuntamento relativo all istanza")
  @JsonProperty("id_appuntamento") 
 
  public String getIdAppuntamento() {
    return idAppuntamento;
  }
  public void setIdAppuntamento(String idAppuntamento) {
    this.idAppuntamento = idAppuntamento;
  }

  /**
   * L id della convocazione relativa all istanza (non fornito dal giallo)
   **/
  
  @ApiModelProperty(value = "L id della convocazione relativa all istanza (non fornito dal giallo)")
  @JsonProperty("id_convocazione") 
 
  public String getIdConvocazione() {
    return idConvocazione;
  }
  public void setIdConvocazione(String idConvocazione) {
    this.idConvocazione = idConvocazione;
  }

  /**
   * L id dello stato dell istanza (non fornito da giallo)
   **/
  
  @ApiModelProperty(required = true, value = "L id dello stato dell istanza (non fornito da giallo)")
  @JsonProperty("id_stato") 
 
  @NotNull
  public String getIdStato() {
    return idStato;
  }
  public void setIdStato(String idStato) {
    this.idStato = idStato;
  }

  /**
   * Descrizione dello stato (non fornito da giallo)
   **/
  
  @ApiModelProperty(required = true, value = "Descrizione dello stato (non fornito da giallo)")
  @JsonProperty("descrizione_stato") 
 
  @NotNull
  public String getDescrizioneStato() {
    return descrizioneStato;
  }
  public void setDescrizioneStato(String descrizioneStato) {
    this.descrizioneStato = descrizioneStato;
  }

  /**
   * Note inserite da utente alla richiesta
   **/
  
  @ApiModelProperty(value = "Note inserite da utente alla richiesta")
  @JsonProperty("note_richiesta") 
 
  public String getNoteRichiesta() {
    return noteRichiesta;
  }
  public void setNoteRichiesta(String noteRichiesta) {
    this.noteRichiesta = noteRichiesta;
  }

  /**
   * Eventuali note in risposta
   **/
  
  @ApiModelProperty(value = "Eventuali note in risposta")
  @JsonProperty("note_risposta") 
 
  public String getNoteRisposta() {
    return noteRisposta;
  }
  public void setNoteRisposta(String noteRisposta) {
    this.noteRisposta = noteRisposta;
  }

  /**
   * Tipologia dell&#39;istanza
   **/
  
  @ApiModelProperty(value = "Tipologia dell'istanza")
  @JsonProperty("tipologia_istanza") 
 
  public String getTipologiaIstanza() {
    return tipologiaIstanza;
  }
  public void setTipologiaIstanza(String tipologiaIstanza) {
    this.tipologiaIstanza = tipologiaIstanza;
  }

  /**
   * Data inserimento richiesta
   **/
  
  @ApiModelProperty(value = "Data inserimento richiesta")
  @JsonProperty("data_richiesta") 
 
  public String getDataRichiesta() {
    return dataRichiesta;
  }
  public void setDataRichiesta(String dataRichiesta) {
    this.dataRichiesta = dataRichiesta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIstanzaAutocontribuzione modelIstanzaAutocontribuzione = (ModelIstanzaAutocontribuzione) o;
    return Objects.equals(idIstanza, modelIstanzaAutocontribuzione.idIstanza) &&
        Objects.equals(idAppuntamento, modelIstanzaAutocontribuzione.idAppuntamento) &&
        Objects.equals(idConvocazione, modelIstanzaAutocontribuzione.idConvocazione) &&
        Objects.equals(idStato, modelIstanzaAutocontribuzione.idStato) &&
        Objects.equals(descrizioneStato, modelIstanzaAutocontribuzione.descrizioneStato) &&
        Objects.equals(noteRichiesta, modelIstanzaAutocontribuzione.noteRichiesta) &&
        Objects.equals(noteRisposta, modelIstanzaAutocontribuzione.noteRisposta) &&
        Objects.equals(tipologiaIstanza, modelIstanzaAutocontribuzione.tipologiaIstanza) &&
        Objects.equals(dataRichiesta, modelIstanzaAutocontribuzione.dataRichiesta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idIstanza, idAppuntamento, idConvocazione, idStato, descrizioneStato, noteRichiesta, noteRisposta, tipologiaIstanza, dataRichiesta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIstanzaAutocontribuzione {\n");
    
    sb.append("    idIstanza: ").append(toIndentedString(idIstanza)).append("\n");
    sb.append("    idAppuntamento: ").append(toIndentedString(idAppuntamento)).append("\n");
    sb.append("    idConvocazione: ").append(toIndentedString(idConvocazione)).append("\n");
    sb.append("    idStato: ").append(toIndentedString(idStato)).append("\n");
    sb.append("    descrizioneStato: ").append(toIndentedString(descrizioneStato)).append("\n");
    sb.append("    noteRichiesta: ").append(toIndentedString(noteRichiesta)).append("\n");
    sb.append("    noteRisposta: ").append(toIndentedString(noteRisposta)).append("\n");
    sb.append("    tipologiaIstanza: ").append(toIndentedString(tipologiaIstanza)).append("\n");
    sb.append("    dataRichiesta: ").append(toIndentedString(dataRichiesta)).append("\n");
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

