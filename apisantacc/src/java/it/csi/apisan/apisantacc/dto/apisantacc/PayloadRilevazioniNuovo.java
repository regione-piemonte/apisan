/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisantacc.dto.apisantacc.CittadinicitIdtaccuinotaccuinoIdrilevazioniLista;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadRilevazioniNuovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<CittadinicitIdtaccuinotaccuinoIdrilevazioniLista> lista = new ArrayList<CittadinicitIdtaccuinotaccuinoIdrilevazioniLista>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista") 
 
  public List<CittadinicitIdtaccuinotaccuinoIdrilevazioniLista> getLista() {
    return lista;
  }
  public void setLista(List<CittadinicitIdtaccuinotaccuinoIdrilevazioniLista> lista) {
    this.lista = lista;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadRilevazioniNuovo payloadRilevazioniNuovo = (PayloadRilevazioniNuovo) o;
    return Objects.equals(lista, payloadRilevazioniNuovo.lista);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lista);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadRilevazioniNuovo {\n");
    
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
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

