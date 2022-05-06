/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonProperty;

public class PayloadRichiestaArchiviata   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean archiviata = null;

  /**
   * il nuovo stato di archiviazione della richiesta
   **/
  

  @JsonProperty("archiviata") 
 
  @NotNull
  public Boolean isArchiviata() {
    return archiviata;
  }
  public void setArchiviata(Boolean archiviata) {
    this.archiviata = archiviata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadRichiestaArchiviata payloadRichiestaArchiviata = (PayloadRichiestaArchiviata) o;
    return Objects.equals(archiviata, payloadRichiestaArchiviata.archiviata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiviata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadRichiestaArchiviata {\n");
    
    sb.append("    archiviata: ").append(toIndentedString(archiviata)).append("\n");
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

