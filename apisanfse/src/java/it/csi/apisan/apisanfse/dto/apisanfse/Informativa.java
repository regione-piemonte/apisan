/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Informativa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String identificativoInformativa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identificativo_informativa") 
 
  public String getIdentificativoInformativa() {
    return identificativoInformativa;
  }
  public void setIdentificativoInformativa(String identificativoInformativa) {
    this.identificativoInformativa = identificativoInformativa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Informativa informativa = (Informativa) o;
    return Objects.equals(identificativoInformativa, informativa.identificativoInformativa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificativoInformativa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Informativa {\n");
    
    sb.append("    identificativoInformativa: ").append(toIndentedString(identificativoInformativa)).append("\n");
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

