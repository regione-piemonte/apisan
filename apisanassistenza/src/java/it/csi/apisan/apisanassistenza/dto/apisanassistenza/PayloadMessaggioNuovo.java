/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonProperty;

public class PayloadMessaggioNuovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String testo = null;
  private ModelDocumentoScrittura allegato = null;

  /**
   * La mail su cui contattare il cittadino per questa richiesta
   **/
  

  @JsonProperty("testo") 
 
  @NotNull
  public String getTesto() {
    return testo;
  }
  public void setTesto(String testo) {
    this.testo = testo;
  }

  /**
   **/
  

  @JsonProperty("allegato") 
 
  public ModelDocumentoScrittura getAllegato() {
    return allegato;
  }
  public void setAllegato(ModelDocumentoScrittura allegato) {
    this.allegato = allegato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadMessaggioNuovo payloadMessaggioNuovo = (PayloadMessaggioNuovo) o;
    return Objects.equals(testo, payloadMessaggioNuovo.testo) &&
        Objects.equals(allegato, payloadMessaggioNuovo.allegato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testo, allegato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadMessaggioNuovo {\n");
    
    sb.append("    testo: ").append(toIndentedString(testo)).append("\n");
    sb.append("    allegato: ").append(toIndentedString(allegato)).append("\n");
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

