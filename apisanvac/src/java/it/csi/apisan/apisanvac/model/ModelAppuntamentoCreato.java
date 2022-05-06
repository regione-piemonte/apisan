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

@ApiModel(description="Rappresenta una vaccinazione prenotata appena creata")

public class ModelAppuntamentoCreato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idConvocazione = null;

  /**
   * Identificativo univoco della convocazione relativa
   **/
  
  @ApiModelProperty(required = true, value = "Identificativo univoco della convocazione relativa")
  @JsonProperty("id_convocazione") 
 
  @NotNull
  public String getIdConvocazione() {
    return idConvocazione;
  }
  public void setIdConvocazione(String idConvocazione) {
    this.idConvocazione = idConvocazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAppuntamentoCreato modelAppuntamentoCreato = (ModelAppuntamentoCreato) o;
    return Objects.equals(idConvocazione, modelAppuntamentoCreato.idConvocazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConvocazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAppuntamentoCreato {\n");
    
    sb.append("    idConvocazione: ").append(toIndentedString(idConvocazione)).append("\n");
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

