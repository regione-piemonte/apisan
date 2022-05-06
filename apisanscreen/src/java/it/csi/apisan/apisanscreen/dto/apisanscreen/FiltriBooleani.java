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



public class FiltriBooleani   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean eq = null;
  private Boolean ne = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eq") 
 
  public Boolean isEq() {
    return eq;
  }
  public void setEq(Boolean eq) {
    this.eq = eq;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ne") 
 
  public Boolean isNe() {
    return ne;
  }
  public void setNe(Boolean ne) {
    this.ne = ne;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltriBooleani filtriBooleani = (FiltriBooleani) o;
    return Objects.equals(eq, filtriBooleani.eq) &&
        Objects.equals(ne, filtriBooleani.ne);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, ne);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltriBooleani {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
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

