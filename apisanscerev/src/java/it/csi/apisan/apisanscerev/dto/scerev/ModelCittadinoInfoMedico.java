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



public class ModelCittadinoInfoMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String codiceFiscale = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "6545486", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Il codice fiscale del medico
   **/
  
  @ApiModelProperty(example = "MRARSS78M14I235F", value = "Il codice fiscale del medico")
  @JsonProperty("codiceFiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadinoInfoMedico modelCittadinoInfoMedico = (ModelCittadinoInfoMedico) o;
    return Objects.equals(id, modelCittadinoInfoMedico.id) &&
        Objects.equals(codiceFiscale, modelCittadinoInfoMedico.codiceFiscale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codiceFiscale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadinoInfoMedico {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
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

