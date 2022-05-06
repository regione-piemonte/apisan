/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il range di date per lo spostamento ")

public class ModelRangeDate   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String dataInizio = null;
  private String dataFine = null;

  /**
   * data inizio range
   **/
  
  @ApiModelProperty(required = true, value = "data inizio range")
  @JsonProperty("data_inizio") 
 
  @NotNull
  public String getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(String dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * data fine range
   **/
  
  @ApiModelProperty(required = true, value = "data fine range")
  @JsonProperty("data_fine") 
 
  @NotNull
  public String getDataFine() {
    return dataFine;
  }
  public void setDataFine(String dataFine) {
    this.dataFine = dataFine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRangeDate modelRangeDate = (ModelRangeDate) o;
    return Objects.equals(dataInizio, modelRangeDate.dataInizio) &&
        Objects.equals(dataFine, modelRangeDate.dataFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataInizio, dataFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRangeDate {\n");
    
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
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

