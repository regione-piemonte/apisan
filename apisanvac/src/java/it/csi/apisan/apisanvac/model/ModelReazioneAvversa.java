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

@ApiModel(description="rappresenta la reazione segnalata ")

public class ModelReazioneAvversa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String descrizioneReazione1 = null;
  private String descrizioneReazione2 = null;
  private String descrizioneReazione3 = null;
  private String data = null;
  private String gravita = null;

  /**
   * Descrizione prima reazione
   **/
  
  @ApiModelProperty(required = true, value = "Descrizione prima reazione")
  @JsonProperty("descrizione_reazione1") 
 
  @NotNull
  public String getDescrizioneReazione1() {
    return descrizioneReazione1;
  }
  public void setDescrizioneReazione1(String descrizioneReazione1) {
    this.descrizioneReazione1 = descrizioneReazione1;
  }

  /**
   * Descrizione seconda reazione
   **/
  
  @ApiModelProperty(value = "Descrizione seconda reazione")
  @JsonProperty("descrizione_reazione2") 
 
  public String getDescrizioneReazione2() {
    return descrizioneReazione2;
  }
  public void setDescrizioneReazione2(String descrizioneReazione2) {
    this.descrizioneReazione2 = descrizioneReazione2;
  }

  /**
   * Descrizione terza reazione
   **/
  
  @ApiModelProperty(value = "Descrizione terza reazione")
  @JsonProperty("descrizione_reazione3") 
 
  public String getDescrizioneReazione3() {
    return descrizioneReazione3;
  }
  public void setDescrizioneReazione3(String descrizioneReazione3) {
    this.descrizioneReazione3 = descrizioneReazione3;
  }

  /**
   * data della reazione
   **/
  
  @ApiModelProperty(required = true, value = "data della reazione")
  @JsonProperty("data") 
 
  @NotNull
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Gravita della reazione
   **/
  
  @ApiModelProperty(value = "Gravita della reazione")
  @JsonProperty("gravita") 
 
  public String getGravita() {
    return gravita;
  }
  public void setGravita(String gravita) {
    this.gravita = gravita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReazioneAvversa modelReazioneAvversa = (ModelReazioneAvversa) o;
    return Objects.equals(descrizioneReazione1, modelReazioneAvversa.descrizioneReazione1) &&
        Objects.equals(descrizioneReazione2, modelReazioneAvversa.descrizioneReazione2) &&
        Objects.equals(descrizioneReazione3, modelReazioneAvversa.descrizioneReazione3) &&
        Objects.equals(data, modelReazioneAvversa.data) &&
        Objects.equals(gravita, modelReazioneAvversa.gravita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descrizioneReazione1, descrizioneReazione2, descrizioneReazione3, data, gravita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReazioneAvversa {\n");
    
    sb.append("    descrizioneReazione1: ").append(toIndentedString(descrizioneReazione1)).append("\n");
    sb.append("    descrizioneReazione2: ").append(toIndentedString(descrizioneReazione2)).append("\n");
    sb.append("    descrizioneReazione3: ").append(toIndentedString(descrizioneReazione3)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    gravita: ").append(toIndentedString(gravita)).append("\n");
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

