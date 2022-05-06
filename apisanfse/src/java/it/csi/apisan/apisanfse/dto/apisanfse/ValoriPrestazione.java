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



public class ValoriPrestazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String quantita = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantita") 
 
  public String getQuantita() {
    return quantita;
  }
  public void setQuantita(String quantita) {
    this.quantita = quantita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValoriPrestazione valoriPrestazione = (ValoriPrestazione) o;
    return Objects.equals(quantita, valoriPrestazione.quantita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValoriPrestazione {\n");
    
    sb.append("    quantita: ").append(toIndentedString(quantita)).append("\n");
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

