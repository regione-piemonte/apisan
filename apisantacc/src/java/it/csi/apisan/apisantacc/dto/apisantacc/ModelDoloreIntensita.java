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



public class ModelDoloreIntensita   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer valore = null;
  private String descrizione = null;

  /**
   * codice univoco dell&#39;intensità
   **/
  
  @ApiModelProperty(value = "codice univoco dell'intensità")
  @JsonProperty("valore") 
 
  public Integer getValore() {
    return valore;
  }
  public void setValore(Integer valore) {
    this.valore = valore;
  }

  /**
   * nome del dolore
   **/
  
  @ApiModelProperty(value = "nome del dolore")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDoloreIntensita modelDoloreIntensita = (ModelDoloreIntensita) o;
    return Objects.equals(valore, modelDoloreIntensita.valore) &&
        Objects.equals(descrizione, modelDoloreIntensita.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valore, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDoloreIntensita {\n");
    
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

