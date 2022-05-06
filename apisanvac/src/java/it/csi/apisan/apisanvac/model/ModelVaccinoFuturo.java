/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il vaccino futuro per il cittadino")

public class ModelVaccinoFuturo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer eta = null;
  private List<ModelVaccino> vaccini = new ArrayList<ModelVaccino>();

  /**
   * età in giorni prevista per il vaccino
   **/
  
  @ApiModelProperty(required = true, value = "età in giorni prevista per il vaccino")
  @JsonProperty("eta") 
 
  @NotNull
  public Integer getEta() {
    return eta;
  }
  public void setEta(Integer eta) {
    this.eta = eta;
  }

  /**
   * L&#39;elenco dei vaccini presenti nella vaccinazione futura
   **/
  
  @ApiModelProperty(required = true, value = "L'elenco dei vaccini presenti nella vaccinazione futura")
  @JsonProperty("vaccini") 
 
  @NotNull
  public List<ModelVaccino> getVaccini() {
    return vaccini;
  }
  public void setVaccini(List<ModelVaccino> vaccini) {
    this.vaccini = vaccini;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVaccinoFuturo modelVaccinoFuturo = (ModelVaccinoFuturo) o;
    return Objects.equals(eta, modelVaccinoFuturo.eta) &&
        Objects.equals(vaccini, modelVaccinoFuturo.vaccini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eta, vaccini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVaccinoFuturo {\n");
    
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    vaccini: ").append(toIndentedString(vaccini)).append("\n");
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

