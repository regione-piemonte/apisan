/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelPrenotabile   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean prenotabile = null;

  /**
   * True se è prenotabile, false altrimenti
   **/
  
  @ApiModelProperty(example = "true", value = "True se è prenotabile, false altrimenti")
  @JsonProperty("prenotabile") 
 
  public Boolean isPrenotabile() {
    return prenotabile;
  }
  public void setPrenotabile(Boolean prenotabile) {
    this.prenotabile = prenotabile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPrenotabile modelPrenotabile = (ModelPrenotabile) o;
    return Objects.equals(prenotabile, modelPrenotabile.prenotabile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prenotabile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPrenotabile {\n");
    
    sb.append("    prenotabile: ").append(toIndentedString(prenotabile)).append("\n");
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

