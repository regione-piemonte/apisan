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



public class FiltroRicettaTipologia   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String eq = null;

  /**
   * Equal (&#x3D;&#x3D;)
   **/
  
  @ApiModelProperty(value = "Equal (==)")
  @JsonProperty("eq") 
 
  public String getEq() {
    return eq;
  }
  public void setEq(String eq) {
    this.eq = eq;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltroRicettaTipologia filtroRicettaTipologia = (FiltroRicettaTipologia) o;
    return Objects.equals(eq, filtroRicettaTipologia.eq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroRicettaTipologia {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
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

