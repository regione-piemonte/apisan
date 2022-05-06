/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Orario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date orarioInizio = null;
  private Date orarioFine = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_inizio") 
 
  public Date getOrarioInizio() {
    return orarioInizio;
  }
  public void setOrarioInizio(Date orarioInizio) {
    this.orarioInizio = orarioInizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_fine") 
 
  public Date getOrarioFine() {
    return orarioFine;
  }
  public void setOrarioFine(Date orarioFine) {
    this.orarioFine = orarioFine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orario orario = (Orario) o;
    return Objects.equals(orarioInizio, orario.orarioInizio) &&
        Objects.equals(orarioFine, orario.orarioFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orarioInizio, orarioFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orario {\n");
    
    sb.append("    orarioInizio: ").append(toIndentedString(orarioInizio)).append("\n");
    sb.append("    orarioFine: ").append(toIndentedString(orarioFine)).append("\n");
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

