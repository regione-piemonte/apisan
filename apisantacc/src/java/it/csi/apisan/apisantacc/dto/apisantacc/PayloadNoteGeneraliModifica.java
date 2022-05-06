/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadNoteGeneraliModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String statoSalute = null;
  private String stileVita = null;

  /**
   * Lo stato di salute inserito dal cittadino
   **/
  
  @ApiModelProperty(value = "Lo stato di salute inserito dal cittadino")
  @JsonProperty("stato_salute") 
 
  public String getStatoSalute() {
    return statoSalute;
  }
  public void setStatoSalute(String statoSalute) {
    this.statoSalute = statoSalute;
  }

  /**
   * Lo stile di vita inserito dal cittadino
   **/
  
  @ApiModelProperty(value = "Lo stile di vita inserito dal cittadino")
  @JsonProperty("stile_vita") 
 
  public String getStileVita() {
    return stileVita;
  }
  public void setStileVita(String stileVita) {
    this.stileVita = stileVita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadNoteGeneraliModifica payloadNoteGeneraliModifica = (PayloadNoteGeneraliModifica) o;
    return Objects.equals(statoSalute, payloadNoteGeneraliModifica.statoSalute) &&
        Objects.equals(stileVita, payloadNoteGeneraliModifica.stileVita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statoSalute, stileVita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadNoteGeneraliModifica {\n");
    
    sb.append("    statoSalute: ").append(toIndentedString(statoSalute)).append("\n");
    sb.append("    stileVita: ").append(toIndentedString(stileVita)).append("\n");
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

