/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class AssistitoPiemontese   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean piemontese = null;

  /**
   * indica se il cittadino sia assistito in piemonte o meno
   **/
  
  @ApiModelProperty(example = "true", value = "indica se il cittadino sia assistito in piemonte o meno")
  @JsonProperty("piemontese") 
 
  public Boolean isPiemontese() {
    return piemontese;
  }
  public void setPiemontese(Boolean piemontese) {
    this.piemontese = piemontese;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistitoPiemontese assistitoPiemontese = (AssistitoPiemontese) o;
    return Objects.equals(piemontese, assistitoPiemontese.piemontese);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piemontese);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistitoPiemontese {\n");
    
    sb.append("    piemontese: ").append(toIndentedString(piemontese)).append("\n");
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

