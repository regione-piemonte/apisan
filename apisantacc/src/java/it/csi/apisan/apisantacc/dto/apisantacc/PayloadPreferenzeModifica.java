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



public class PayloadPreferenzeModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean visibile = null;

  /**
   * Il nuovo valore della preferenza
   **/
  
  @ApiModelProperty(value = "Il nuovo valore della preferenza")
  @JsonProperty("visibile") 
 
  public Boolean isVisibile() {
    return visibile;
  }
  public void setVisibile(Boolean visibile) {
    this.visibile = visibile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadPreferenzeModifica payloadPreferenzeModifica = (PayloadPreferenzeModifica) o;
    return Objects.equals(visibile, payloadPreferenzeModifica.visibile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadPreferenzeModifica {\n");
    
    sb.append("    visibile: ").append(toIndentedString(visibile)).append("\n");
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

