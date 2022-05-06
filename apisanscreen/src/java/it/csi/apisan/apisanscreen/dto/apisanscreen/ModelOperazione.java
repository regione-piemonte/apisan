/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelOperazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean consentita = null;
  private String messaggio = null;

  /**
   * indica se possibile o meno effettuare l&#39;operazione
   **/
  
  @ApiModelProperty(value = "indica se possibile o meno effettuare l'operazione")
  @JsonProperty("consentita") 
 
  public Boolean isConsentita() {
    return consentita;
  }
  public void setConsentita(Boolean consentita) {
    this.consentita = consentita;
  }

  /**
   * descrizione del possibile errore
   **/
  
  @ApiModelProperty(value = "descrizione del possibile errore")
  @JsonProperty("messaggio") 
 
  public String getMessaggio() {
    return messaggio;
  }
  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOperazione modelOperazione = (ModelOperazione) o;
    return Objects.equals(consentita, modelOperazione.consentita) &&
        Objects.equals(messaggio, modelOperazione.messaggio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentita, messaggio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOperazione {\n");
    
    sb.append("    consentita: ").append(toIndentedString(consentita)).append("\n");
    sb.append("    messaggio: ").append(toIndentedString(messaggio)).append("\n");
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

