/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancons.dto.apisancons.IntegerCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class IdInformativaFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private IntegerCrit idInformativa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_informativa") 
 
  public IntegerCrit getIdInformativa() {
    return idInformativa;
  }
  public void setIdInformativa(IntegerCrit idInformativa) {
    this.idInformativa = idInformativa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdInformativaFilter idInformativaFilter = (IdInformativaFilter) o;
    return Objects.equals(idInformativa, idInformativaFilter.idInformativa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idInformativa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdInformativaFilter {\n");
    
    sb.append("    idInformativa: ").append(toIndentedString(idInformativa)).append("\n");
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

