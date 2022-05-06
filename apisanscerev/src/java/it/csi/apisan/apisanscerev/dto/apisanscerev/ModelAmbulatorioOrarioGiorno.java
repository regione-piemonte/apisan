/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioOrarioIntervallo;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAmbulatorioOrarioGiorno   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nome = null;
  private List<ModelAmbulatorioOrarioIntervallo> intervalli = new ArrayList<ModelAmbulatorioOrarioIntervallo>();

  /**
   * Il nome del giorno
   **/
  
  @ApiModelProperty(example = "Lunedì", value = "Il nome del giorno")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("intervalli") 
 
  public List<ModelAmbulatorioOrarioIntervallo> getIntervalli() {
    return intervalli;
  }
  public void setIntervalli(List<ModelAmbulatorioOrarioIntervallo> intervalli) {
    this.intervalli = intervalli;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAmbulatorioOrarioGiorno modelAmbulatorioOrarioGiorno = (ModelAmbulatorioOrarioGiorno) o;
    return Objects.equals(nome, modelAmbulatorioOrarioGiorno.nome) &&
        Objects.equals(intervalli, modelAmbulatorioOrarioGiorno.intervalli);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, intervalli);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAmbulatorioOrarioGiorno {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    intervalli: ").append(toIndentedString(intervalli)).append("\n");
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

