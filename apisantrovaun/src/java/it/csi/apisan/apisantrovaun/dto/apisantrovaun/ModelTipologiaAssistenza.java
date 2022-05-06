/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.dto.apisantrovaun;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelTipologiaAssistenza   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private String label = null;

  /**
   * Un codice univoco
   **/
  
  @ApiModelProperty(value = "Un codice univoco")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Il nome della tipologia di assistenza
   **/
  
  @ApiModelProperty(value = "Il nome della tipologia di assistenza")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Una label da mostrare sulla UI
   **/
  
  @ApiModelProperty(value = "Una label da mostrare sulla UI")
  @JsonProperty("label") 
 
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTipologiaAssistenza modelTipologiaAssistenza = (ModelTipologiaAssistenza) o;
    return Objects.equals(codice, modelTipologiaAssistenza.codice) &&
        Objects.equals(descrizione, modelTipologiaAssistenza.descrizione) &&
        Objects.equals(label, modelTipologiaAssistenza.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTipologiaAssistenza {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

