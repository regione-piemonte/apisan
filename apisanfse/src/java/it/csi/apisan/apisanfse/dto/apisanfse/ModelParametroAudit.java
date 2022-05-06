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



public class ModelParametroAudit   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String indice = null;
  private String valore = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indice") 
 
  public String getIndice() {
    return indice;
  }
  public void setIndice(String indice) {
    this.indice = indice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valore") 
 
  public String getValore() {
    return valore;
  }
  public void setValore(String valore) {
    this.valore = valore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelParametroAudit modelParametroAudit = (ModelParametroAudit) o;
    return Objects.equals(indice, modelParametroAudit.indice) &&
        Objects.equals(valore, modelParametroAudit.valore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indice, valore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelParametroAudit {\n");
    
    sb.append("    indice: ").append(toIndentedString(indice)).append("\n");
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
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

