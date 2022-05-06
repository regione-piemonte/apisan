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



public class Delega   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String tipoDelega = null;
  private String gradoDelega = null;

  /**
   * grado della delega
   **/
  
  @ApiModelProperty(value = "grado della delega")
  @JsonProperty("tipo_delega") 
 
  public String getTipoDelega() {
    return tipoDelega;
  }
  public void setTipoDelega(String tipoDelega) {
    this.tipoDelega = tipoDelega;
  }

  /**
   * stato della delega
   **/
  
  @ApiModelProperty(value = "stato della delega")
  @JsonProperty("grado_delega") 
 
  public String getGradoDelega() {
    return gradoDelega;
  }
  public void setGradoDelega(String gradoDelega) {
    this.gradoDelega = gradoDelega;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Delega delega = (Delega) o;
    return Objects.equals(tipoDelega, delega.tipoDelega) &&
        Objects.equals(gradoDelega, delega.gradoDelega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDelega, gradoDelega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delega {\n");
    
    sb.append("    tipoDelega: ").append(toIndentedString(tipoDelega)).append("\n");
    sb.append("    gradoDelega: ").append(toIndentedString(gradoDelega)).append("\n");
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

