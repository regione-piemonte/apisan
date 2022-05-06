/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanesenpat.model.ModelCodifica;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il codice di un'esenzione ")

public class ModelEsenzioneCodice   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;

  /**
   * Un codice univoco
   **/
  
  @ApiModelProperty(required = true, value = "Un codice univoco")
  @JsonProperty("codice") 
 
  @NotNull
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Una descrizione testuale
   **/
  
  @ApiModelProperty(required = true, value = "Una descrizione testuale")
  @JsonProperty("descrizione") 
 
  @NotNull
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
    ModelEsenzioneCodice modelEsenzioneCodice = (ModelEsenzioneCodice) o;
    return Objects.equals(codice, modelEsenzioneCodice.codice) &&
        Objects.equals(descrizione, modelEsenzioneCodice.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsenzioneCodice {\n");
    
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

