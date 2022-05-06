/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinaleOrarioIntervallo;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta gli orari di apertura di un centro vaccinale ")

public class ModelCentroVaccinaleOrario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String giorno = null;
  private List<ModelCentroVaccinaleOrarioIntervallo> intervallo = new ArrayList<ModelCentroVaccinaleOrarioIntervallo>();

  /**
   * Il giorno della settimana
   **/
  
  @ApiModelProperty(example = "Lunedì", required = true, value = "Il giorno della settimana")
  @JsonProperty("giorno") 
 
  @NotNull
  public String getGiorno() {
    return giorno;
  }
  public void setGiorno(String giorno) {
    this.giorno = giorno;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("intervallo") 
 
  @NotNull
  public List<ModelCentroVaccinaleOrarioIntervallo> getIntervallo() {
    return intervallo;
  }
  public void setIntervallo(List<ModelCentroVaccinaleOrarioIntervallo> intervallo) {
    this.intervallo = intervallo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCentroVaccinaleOrario modelCentroVaccinaleOrario = (ModelCentroVaccinaleOrario) o;
    return Objects.equals(giorno, modelCentroVaccinaleOrario.giorno) &&
        Objects.equals(intervallo, modelCentroVaccinaleOrario.intervallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giorno, intervallo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCentroVaccinaleOrario {\n");
    
    sb.append("    giorno: ").append(toIndentedString(giorno)).append("\n");
    sb.append("    intervallo: ").append(toIndentedString(intervallo)).append("\n");
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

