/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadVaccinazioneAppuntamentoAnnullamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String note = null;
  private String motivazione = null;
  private Boolean mantieniConvocazioni = null;

  /**
   * Eventuali note inserite dall&#39;assistito
   **/
  
  @ApiModelProperty(value = "Eventuali note inserite dall'assistito")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * L&#39;id della motivazione
   **/
  
  @ApiModelProperty(value = "L'id della motivazione")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mantieni_convocazioni") 
 
  public Boolean isMantieniConvocazioni() {
    return mantieniConvocazioni;
  }
  public void setMantieniConvocazioni(Boolean mantieniConvocazioni) {
    this.mantieniConvocazioni = mantieniConvocazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadVaccinazioneAppuntamentoAnnullamento payloadVaccinazioneAppuntamentoAnnullamento = (PayloadVaccinazioneAppuntamentoAnnullamento) o;
    return Objects.equals(note, payloadVaccinazioneAppuntamentoAnnullamento.note) &&
        Objects.equals(motivazione, payloadVaccinazioneAppuntamentoAnnullamento.motivazione) &&
        Objects.equals(mantieniConvocazioni, payloadVaccinazioneAppuntamentoAnnullamento.mantieniConvocazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, motivazione, mantieniConvocazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadVaccinazioneAppuntamentoAnnullamento {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    mantieniConvocazioni: ").append(toIndentedString(mantieniConvocazioni)).append("\n");
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

