/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Risorsa che contiene i dati di configurazione del front-end. Ad esempio può contenere delle stringhe \"helper\" da mostrare sulla UI per facilitare la comprensione dell'utente. Potrebbe contenere in futuro dei dati che permettono di capire lo stato del servizio (es. se è in manutenzione)")

public class Configurazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String descrizioneTitolare = null;

  /**
   * Contiene il testo, anche HTML, che descrive chi è il titolare di un&#39;esenzione 
   **/
  
  @ApiModelProperty(value = "Contiene il testo, anche HTML, che descrive chi è il titolare di un'esenzione ")
  @JsonProperty("descrizione_titolare") 
 
  public String getDescrizioneTitolare() {
    return descrizioneTitolare;
  }
  public void setDescrizioneTitolare(String descrizioneTitolare) {
    this.descrizioneTitolare = descrizioneTitolare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Configurazione configurazione = (Configurazione) o;
    return Objects.equals(descrizioneTitolare, configurazione.descrizioneTitolare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descrizioneTitolare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configurazione {\n");
    
    sb.append("    descrizioneTitolare: ").append(toIndentedString(descrizioneTitolare)).append("\n");
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

