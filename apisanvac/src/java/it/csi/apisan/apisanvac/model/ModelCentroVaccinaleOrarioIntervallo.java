/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCentroVaccinaleOrarioIntervallo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String apertura = null;
  private String chiusura = null;

  /**
   * L&#39;orario di apertura in formato \&quot;full-time\&quot; delle specifiche ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "L'orario di apertura in formato \"full-time\" delle specifiche ISO 8601")
  @JsonProperty("apertura") 
 
  @NotNull
  public String getApertura() {
    return apertura;
  }
  public void setApertura(String apertura) {
    this.apertura = apertura;
  }

  /**
   * L&#39;orario di chiusura in formato \&quot;full-time\&quot; delle specifiche ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "L'orario di chiusura in formato \"full-time\" delle specifiche ISO 8601")
  @JsonProperty("chiusura") 
 
  @NotNull
  public String getChiusura() {
    return chiusura;
  }
  public void setChiusura(String chiusura) {
    this.chiusura = chiusura;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCentroVaccinaleOrarioIntervallo modelCentroVaccinaleOrarioIntervallo = (ModelCentroVaccinaleOrarioIntervallo) o;
    return Objects.equals(apertura, modelCentroVaccinaleOrarioIntervallo.apertura) &&
        Objects.equals(chiusura, modelCentroVaccinaleOrarioIntervallo.chiusura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apertura, chiusura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCentroVaccinaleOrarioIntervallo {\n");
    
    sb.append("    apertura: ").append(toIndentedString(apertura)).append("\n");
    sb.append("    chiusura: ").append(toIndentedString(chiusura)).append("\n");
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

