/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelNoteGenerali   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String statoSalute = null;
  private String stileVita = null;
  private Date dataCreazione = null;
  private Date dataAggiornamento = null;

  /**
   * Lo stato di salute inserito dal cittadino
   **/
  
  @ApiModelProperty(value = "Lo stato di salute inserito dal cittadino")
  @JsonProperty("stato_salute") 
 
  public String getStatoSalute() {
    return statoSalute;
  }
  public void setStatoSalute(String statoSalute) {
    this.statoSalute = statoSalute;
  }

  /**
   * Lo stile di vita inserito dal cittadino
   **/
  
  @ApiModelProperty(value = "Lo stile di vita inserito dal cittadino")
  @JsonProperty("stile_vita") 
 
  public String getStileVita() {
    return stileVita;
  }
  public void setStileVita(String stileVita) {
    this.stileVita = stileVita;
  }

  /**
   * La data di creazione delle note
   **/
  
  @ApiModelProperty(value = "La data di creazione delle note")
  @JsonProperty("data_creazione") 
 
  public Date getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(Date dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   * La data di aggiornamento delle note
   **/
  
  @ApiModelProperty(value = "La data di aggiornamento delle note")
  @JsonProperty("data_aggiornamento") 
 
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelNoteGenerali modelNoteGenerali = (ModelNoteGenerali) o;
    return Objects.equals(statoSalute, modelNoteGenerali.statoSalute) &&
        Objects.equals(stileVita, modelNoteGenerali.stileVita) &&
        Objects.equals(dataCreazione, modelNoteGenerali.dataCreazione) &&
        Objects.equals(dataAggiornamento, modelNoteGenerali.dataAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statoSalute, stileVita, dataCreazione, dataAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelNoteGenerali {\n");
    
    sb.append("    statoSalute: ").append(toIndentedString(statoSalute)).append("\n");
    sb.append("    stileVita: ").append(toIndentedString(stileVita)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
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

