/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class VerificaTeam   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String descRisposta = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_risposta") 
 
  public String getDescRisposta() {
    return descRisposta;
  }
  public void setDescRisposta(String descRisposta) {
    this.descRisposta = descRisposta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificaTeam verificaTeam = (VerificaTeam) o;
    return Objects.equals(descRisposta, verificaTeam.descRisposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descRisposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificaTeam {\n");
    
    sb.append("    descRisposta: ").append(toIndentedString(descRisposta)).append("\n");
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

