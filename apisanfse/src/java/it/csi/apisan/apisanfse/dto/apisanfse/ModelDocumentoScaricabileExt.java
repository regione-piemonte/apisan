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



public class ModelDocumentoScaricabileExt   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String servizioAzione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servizio_azione") 
 
  public String getServizioAzione() {
    return servizioAzione;
  }
  public void setServizioAzione(String servizioAzione) {
    this.servizioAzione = servizioAzione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentoScaricabileExt modelDocumentoScaricabileExt = (ModelDocumentoScaricabileExt) o;
    return Objects.equals(servizioAzione, modelDocumentoScaricabileExt.servizioAzione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servizioAzione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoScaricabileExt {\n");
    
    sb.append("    servizioAzione: ").append(toIndentedString(servizioAzione)).append("\n");
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

