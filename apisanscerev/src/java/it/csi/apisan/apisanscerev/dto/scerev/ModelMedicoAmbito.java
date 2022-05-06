/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelMedicoAmbito   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String ambitoCodice = null;
  private String ambitoDescrizione = null;

  /**
   * Il codice dell&#39;ambito del medico
   **/
  
  @ApiModelProperty(example = "2G", value = "Il codice dell'ambito del medico")
  @JsonProperty("ambitoCodice") 
 
  public String getAmbitoCodice() {
    return ambitoCodice;
  }
  public void setAmbitoCodice(String ambitoCodice) {
    this.ambitoCodice = ambitoCodice;
  }

  /**
   * Una descrizione testuale dell&#39;ambito del medico
   **/
  
  @ApiModelProperty(example = "Ambito MMG 2G - Gassino Torinese", value = "Una descrizione testuale dell'ambito del medico")
  @JsonProperty("ambitoDescrizione") 
 
  public String getAmbitoDescrizione() {
    return ambitoDescrizione;
  }
  public void setAmbitoDescrizione(String ambitoDescrizione) {
    this.ambitoDescrizione = ambitoDescrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelMedicoAmbito modelMedicoAmbito = (ModelMedicoAmbito) o;
    return Objects.equals(ambitoCodice, modelMedicoAmbito.ambitoCodice) &&
        Objects.equals(ambitoDescrizione, modelMedicoAmbito.ambitoDescrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ambitoCodice, ambitoDescrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMedicoAmbito {\n");
    
    sb.append("    ambitoCodice: ").append(toIndentedString(ambitoCodice)).append("\n");
    sb.append("    ambitoDescrizione: ").append(toIndentedString(ambitoDescrizione)).append("\n");
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

