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



public class InlineResponse200   {
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
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(nascosta, inlineResponse200.nascosta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nascosta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
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

