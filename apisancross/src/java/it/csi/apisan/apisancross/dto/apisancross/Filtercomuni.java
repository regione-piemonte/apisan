/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Filtercomuni   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;

  /**
   * codice del comune
   **/
  
  @ApiModelProperty(value = "codice del comune")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filtercomuni filtercomuni = (Filtercomuni) o;
    return Objects.equals(codice, filtercomuni.codice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filtercomuni {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
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

