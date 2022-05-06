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



public class PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String note = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta payloadVaccinazioneAppuntamentoAnnullamentoRichiesta = (PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta) o;
    return Objects.equals(note, payloadVaccinazioneAppuntamentoAnnullamentoRichiesta.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

