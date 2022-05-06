/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadOscuratoModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean oscurato = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oscurato") 
 
  public Boolean isOscurato() {
    return oscurato;
  }
  public void setOscurato(Boolean oscurato) {
    this.oscurato = oscurato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadOscuratoModifica payloadOscuratoModifica = (PayloadOscuratoModifica) o;
    return Objects.equals(oscurato, payloadOscuratoModifica.oscurato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oscurato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadOscuratoModifica {\n");
    
    sb.append("    oscurato: ").append(toIndentedString(oscurato)).append("\n");
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

