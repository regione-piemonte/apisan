/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Payload   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Boolean nascosta = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("nascosta") 
 
  @NotNull
  public Boolean isNascosta() {
    return nascosta;
  }
  public void setNascosta(Boolean nascosta) {
    this.nascosta = nascosta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload payload = (Payload) o;
    return Objects.equals(nascosta, payload.nascosta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nascosta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload {\n");
    
    sb.append("    nascosta: ").append(toIndentedString(nascosta)).append("\n");
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

