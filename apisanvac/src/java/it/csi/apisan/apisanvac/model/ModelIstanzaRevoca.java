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

@ApiModel(description="Rappresenta l istanza di revoca appuntamento attiva ")

public class ModelIstanzaRevoca   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idIstanza = null;
  private String motivazione = null;
  private String idAppuntamento = null;
  private String idStato = null;
  private String descrizioneStato = null;
  private String noteRichiesta = null;
  private String noteRisposta = null;

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
   * Descrizione estesa della motivazione
   **/
  
  @ApiModelProperty(value = "Descrizione estesa della motivazione")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   * L id dell appuntamento relativo all istanza
   **/
  
  @ApiModelProperty(required = true, value = "L id dell appuntamento relativo all istanza")
  @JsonProperty("id_appuntamento") 
 
  @NotNull
  public String getIdAppuntamento() {
    return idAppuntamento;
  }
  public void setIdAppuntamento(String idAppuntamento) {
    this.idAppuntamento = idAppuntamento;
  }

  /**
   * L id dello stato dell istanza
   **/
  
  @ApiModelProperty(required = true, value = "L id dello stato dell istanza")
  @JsonProperty("id_stato") 
 
  @NotNull
  public String getIdStato() {
    return idStato;
  }
  public void setIdStato(String idStato) {
    this.idStato = idStato;
  }

  /**
   * Descrizione dello stato
   **/
  
  @ApiModelProperty(value = "Descrizione dello stato")
  @JsonProperty("descrizione_stato") 
 
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
   * Note inserite da operatore alla risposta
   **/
  
  @ApiModelProperty(value = "Note inserite da operatore alla risposta")
  @JsonProperty("note_risposta") 
 
  public String getNoteRisposta() {
    return noteRisposta;
  }
  public void setNoteRisposta(String noteRisposta) {
    this.noteRisposta = noteRisposta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIstanzaRevoca modelIstanzaRevoca = (ModelIstanzaRevoca) o;
    return Objects.equals(idIstanza, modelIstanzaRevoca.idIstanza) &&
        Objects.equals(motivazione, modelIstanzaRevoca.motivazione) &&
        Objects.equals(idAppuntamento, modelIstanzaRevoca.idAppuntamento) &&
        Objects.equals(idStato, modelIstanzaRevoca.idStato) &&
        Objects.equals(descrizioneStato, modelIstanzaRevoca.descrizioneStato) &&
        Objects.equals(noteRichiesta, modelIstanzaRevoca.noteRichiesta) &&
        Objects.equals(noteRisposta, modelIstanzaRevoca.noteRisposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idIstanza, motivazione, idAppuntamento, idStato, descrizioneStato, noteRichiesta, noteRisposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIstanzaRevoca {\n");
    
    sb.append("    idIstanza: ").append(toIndentedString(idIstanza)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    idAppuntamento: ").append(toIndentedString(idAppuntamento)).append("\n");
    sb.append("    idStato: ").append(toIndentedString(idStato)).append("\n");
    sb.append("    descrizioneStato: ").append(toIndentedString(descrizioneStato)).append("\n");
    sb.append("    noteRichiesta: ").append(toIndentedString(noteRichiesta)).append("\n");
    sb.append("    noteRisposta: ").append(toIndentedString(noteRisposta)).append("\n");
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

