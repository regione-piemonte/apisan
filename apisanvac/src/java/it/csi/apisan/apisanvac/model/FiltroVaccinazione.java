/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanvac.model.FiltriStringhe;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltroVaccinazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private FiltriStringhe priorita = null;
  private FiltriStringhe stato = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priorita") 
 
  public FiltriStringhe getPriorita() {
    return priorita;
  }
  public void setPriorita(FiltriStringhe priorita) {
    this.priorita = priorita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public FiltriStringhe getStato() {
    return stato;
  }
  public void setStato(FiltriStringhe stato) {
    this.stato = stato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltroVaccinazione filtroVaccinazione = (FiltroVaccinazione) o;
    return Objects.equals(priorita, filtroVaccinazione.priorita) &&
        Objects.equals(stato, filtroVaccinazione.stato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorita, stato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroVaccinazione {\n");
    
    sb.append("    priorita: ").append(toIndentedString(priorita)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
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

