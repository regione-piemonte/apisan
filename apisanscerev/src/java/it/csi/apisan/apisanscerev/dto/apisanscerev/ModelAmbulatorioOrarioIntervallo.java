/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAmbulatorioOrarioIntervallo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String apertura = null;
  private String chiusura = null;
  private String note = null;

  /**
   * L&#39;orario di apertura
   **/
  
  @ApiModelProperty(example = "08:30", value = "L'orario di apertura")
  @JsonProperty("apertura") 
 
  public String getApertura() {
    return apertura;
  }
  public void setApertura(String apertura) {
    this.apertura = apertura;
  }

  /**
   * l&#39;orario di chiusura
   **/
  
  @ApiModelProperty(example = "12:30", value = "l'orario di chiusura")
  @JsonProperty("chiusura") 
 
  public String getChiusura() {
    return chiusura;
  }
  public void setChiusura(String chiusura) {
    this.chiusura = chiusura;
  }

  /**
   * Note sull&#39;intervallo
   **/
  
  @ApiModelProperty(example = "Solo su appuntamento", value = "Note sull'intervallo")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAmbulatorioOrarioIntervallo modelAmbulatorioOrarioIntervallo = (ModelAmbulatorioOrarioIntervallo) o;
    return Objects.equals(apertura, modelAmbulatorioOrarioIntervallo.apertura) &&
        Objects.equals(chiusura, modelAmbulatorioOrarioIntervallo.chiusura) &&
        Objects.equals(note, modelAmbulatorioOrarioIntervallo.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apertura, chiusura, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAmbulatorioOrarioIntervallo {\n");
    
    sb.append("    apertura: ").append(toIndentedString(apertura)).append("\n");
    sb.append("    chiusura: ").append(toIndentedString(chiusura)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

