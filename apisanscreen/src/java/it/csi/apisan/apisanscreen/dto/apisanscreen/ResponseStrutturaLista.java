/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAsl;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLista;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ResponseStrutturaLista   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelAsl> asl = new ArrayList<ModelAsl>();
  private List<ModelUnitaOperativaLista> unitaOperative = new ArrayList<ModelUnitaOperativaLista>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl") 
 
  public List<ModelAsl> getAsl() {
    return asl;
  }
  public void setAsl(List<ModelAsl> asl) {
    this.asl = asl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_operative") 
 
  public List<ModelUnitaOperativaLista> getUnitaOperative() {
    return unitaOperative;
  }
  public void setUnitaOperative(List<ModelUnitaOperativaLista> unitaOperative) {
    this.unitaOperative = unitaOperative;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStrutturaLista responseStrutturaLista = (ResponseStrutturaLista) o;
    return Objects.equals(asl, responseStrutturaLista.asl) &&
        Objects.equals(unitaOperative, responseStrutturaLista.unitaOperative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asl, unitaOperative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStrutturaLista {\n");
    
    sb.append("    asl: ").append(toIndentedString(asl)).append("\n");
    sb.append("    unitaOperative: ").append(toIndentedString(unitaOperative)).append("\n");
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

