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



public class ModelRilevazioneModalita   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizioneRegionale = null;
  private String descrizioneNazionale = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Descrizione regionale della modalità
   **/
  
  @ApiModelProperty(value = "Descrizione regionale della modalità")
  @JsonProperty("descrizione_regionale") 
 
  public String getDescrizioneRegionale() {
    return descrizioneRegionale;
  }
  public void setDescrizioneRegionale(String descrizioneRegionale) {
    this.descrizioneRegionale = descrizioneRegionale;
  }

  /**
   * Descrizione nazionale della modalità
   **/
  
  @ApiModelProperty(value = "Descrizione nazionale della modalità")
  @JsonProperty("descrizione_nazionale") 
 
  public String getDescrizioneNazionale() {
    return descrizioneNazionale;
  }
  public void setDescrizioneNazionale(String descrizioneNazionale) {
    this.descrizioneNazionale = descrizioneNazionale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRilevazioneModalita modelRilevazioneModalita = (ModelRilevazioneModalita) o;
    return Objects.equals(codice, modelRilevazioneModalita.codice) &&
        Objects.equals(descrizioneRegionale, modelRilevazioneModalita.descrizioneRegionale) &&
        Objects.equals(descrizioneNazionale, modelRilevazioneModalita.descrizioneNazionale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizioneRegionale, descrizioneNazionale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRilevazioneModalita {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizioneRegionale: ").append(toIndentedString(descrizioneRegionale)).append("\n");
    sb.append("    descrizioneNazionale: ").append(toIndentedString(descrizioneNazionale)).append("\n");
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

