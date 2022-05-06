/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ErroreDettaglio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String chiave = null;
  private String valore = null;

  /**
   * Codice univoco di errore interno
   **/
  

  @JsonProperty("chiave") 
 
  public String getChiave() {
    return chiave;
  }
  public void setChiave(String chiave) {
    this.chiave = chiave;
  }

  /**
   * Testo dell&#39;errore da mostrare al cittadino
   **/
  

  @JsonProperty("valore") 
 
  public String getValore() {
    return valore;
  }
  public void setValore(String valore) {
    this.valore = valore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErroreDettaglio erroreDettaglio = (ErroreDettaglio) o;
    return Objects.equals(chiave, erroreDettaglio.chiave) &&
        Objects.equals(valore, erroreDettaglio.valore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chiave, valore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErroreDettaglio {\n");
    
    sb.append("    chiave: ").append(toIndentedString(chiave)).append("\n");
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
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

