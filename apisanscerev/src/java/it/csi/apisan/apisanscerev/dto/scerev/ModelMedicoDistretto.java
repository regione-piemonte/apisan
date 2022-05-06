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



public class ModelMedicoDistretto   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer codice = null;
  private String descrizione = null;

  /**
   * Il codice del distretto di appartenenza del medico
   **/
  
  @ApiModelProperty(value = "Il codice del distretto di appartenenza del medico")
  @JsonProperty("codice") 
 
  public Integer getCodice() {
    return codice;
  }
  public void setCodice(Integer codice) {
    this.codice = codice;
  }

  /**
   * Descrizione testuale del distretto di appartenenza del medico
   **/
  
  @ApiModelProperty(value = "Descrizione testuale del distretto di appartenenza del medico")
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
    ModelMedicoDistretto modelMedicoDistretto = (ModelMedicoDistretto) o;
    return Objects.equals(codice, modelMedicoDistretto.codice) &&
        Objects.equals(descrizione, modelMedicoDistretto.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMedicoDistretto {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
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

