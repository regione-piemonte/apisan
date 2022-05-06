/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneMotivazioneAnnullamento;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Payload4   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private ModelEsenzioneMotivazioneAnnullamento motivazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivazione") 
 
  public ModelEsenzioneMotivazioneAnnullamento getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(ModelEsenzioneMotivazioneAnnullamento motivazione) {
    this.motivazione = motivazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload4 payload4 = (Payload4) o;
    return Objects.equals(motivazione, payload4.motivazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motivazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload4 {\n");
    
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
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

