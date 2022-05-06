/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelOscuramento;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadOscuramento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelOscuramento> oscuramento = new ArrayList<ModelOscuramento>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oscuramento") 
 
  public List<ModelOscuramento> getOscuramento() {
    return oscuramento;
  }
  public void setOscuramento(List<ModelOscuramento> oscuramento) {
    this.oscuramento = oscuramento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadOscuramento payloadOscuramento = (PayloadOscuramento) o;
    return Objects.equals(oscuramento, payloadOscuramento.oscuramento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oscuramento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadOscuramento {\n");
    
    sb.append("    oscuramento: ").append(toIndentedString(oscuramento)).append("\n");
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

