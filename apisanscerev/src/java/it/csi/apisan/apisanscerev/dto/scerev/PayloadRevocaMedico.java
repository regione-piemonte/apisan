/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadRevocaMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String motivoRevoca = null;

  /**
   * Motivazione per la revoca del medico
   **/
  
  @ApiModelProperty(value = "Motivazione per la revoca del medico")
  @JsonProperty("motivoRevoca") 
 
  public String getMotivoRevoca() {
    return motivoRevoca;
  }
  public void setMotivoRevoca(String motivoRevoca) {
    this.motivoRevoca = motivoRevoca;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadRevocaMedico payloadRevocaMedico = (PayloadRevocaMedico) o;
    return Objects.equals(motivoRevoca, payloadRevocaMedico.motivoRevoca);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motivoRevoca);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadRevocaMedico {\n");
    
    sb.append("    motivoRevoca: ").append(toIndentedString(motivoRevoca)).append("\n");
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

