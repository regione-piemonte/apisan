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



public class PayloadEtichetta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String testoEtichetta = null;

  /**
   * testo dell&#39;etichetta da modificare
   **/
  
  @ApiModelProperty(value = "testo dell'etichetta da modificare")
  @JsonProperty("testo_etichetta") 
 
  public String getTestoEtichetta() {
    return testoEtichetta;
  }
  public void setTestoEtichetta(String testoEtichetta) {
    this.testoEtichetta = testoEtichetta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadEtichetta payloadEtichetta = (PayloadEtichetta) o;
    return Objects.equals(testoEtichetta, payloadEtichetta.testoEtichetta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testoEtichetta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadEtichetta {\n");
    
    sb.append("    testoEtichetta: ").append(toIndentedString(testoEtichetta)).append("\n");
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

