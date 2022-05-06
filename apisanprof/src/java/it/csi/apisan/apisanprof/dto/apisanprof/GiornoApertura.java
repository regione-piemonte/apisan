/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanprof.dto.apisanprof.Orario;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class GiornoApertura   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String giorno = null;
  private List<Orario> fasceOrarie = new ArrayList<Orario>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("giorno") 
 
  public String getGiorno() {
    return giorno;
  }
  public void setGiorno(String giorno) {
    this.giorno = giorno;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fasce_orarie") 
 
  public List<Orario> getFasceOrarie() {
    return fasceOrarie;
  }
  public void setFasceOrarie(List<Orario> fasceOrarie) {
    this.fasceOrarie = fasceOrarie;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiornoApertura giornoApertura = (GiornoApertura) o;
    return Objects.equals(giorno, giornoApertura.giorno) &&
        Objects.equals(fasceOrarie, giornoApertura.fasceOrarie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giorno, fasceOrarie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiornoApertura {\n");
    
    sb.append("    giorno: ").append(toIndentedString(giorno)).append("\n");
    sb.append("    fasceOrarie: ").append(toIndentedString(fasceOrarie)).append("\n");
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

