/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelAccesso;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelResponseAccessi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelAccesso> consultazioni = new ArrayList<ModelAccesso>();
  private List<ModelAccesso> operazioni = new ArrayList<ModelAccesso>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consultazioni") 
 
  public List<ModelAccesso> getConsultazioni() {
    return consultazioni;
  }
  public void setConsultazioni(List<ModelAccesso> consultazioni) {
    this.consultazioni = consultazioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("operazioni") 
 
  public List<ModelAccesso> getOperazioni() {
    return operazioni;
  }
  public void setOperazioni(List<ModelAccesso> operazioni) {
    this.operazioni = operazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelResponseAccessi modelResponseAccessi = (ModelResponseAccessi) o;
    return Objects.equals(consultazioni, modelResponseAccessi.consultazioni) &&
        Objects.equals(operazioni, modelResponseAccessi.operazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultazioni, operazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelResponseAccessi {\n");
    
    sb.append("    consultazioni: ").append(toIndentedString(consultazioni)).append("\n");
    sb.append("    operazioni: ").append(toIndentedString(operazioni)).append("\n");
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

