/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelScreeningPolipo;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRefertoClismaOpaco   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelScreeningPolipo> polipi = new ArrayList<ModelScreeningPolipo>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polipi") 
 
  public List<ModelScreeningPolipo> getPolipi() {
    return polipi;
  }
  public void setPolipi(List<ModelScreeningPolipo> polipi) {
    this.polipi = polipi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRefertoClismaOpaco modelRefertoClismaOpaco = (ModelRefertoClismaOpaco) o;
    return Objects.equals(polipi, modelRefertoClismaOpaco.polipi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polipi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRefertoClismaOpaco {\n");
    
    sb.append("    polipi: ").append(toIndentedString(polipi)).append("\n");
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

