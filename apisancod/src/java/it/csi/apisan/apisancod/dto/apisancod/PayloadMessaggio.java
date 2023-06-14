/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.dto.apisancod;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisancod.dto.apisancod.ModelDocumento;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class PayloadMessaggio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String testo = null;
  private List<ModelDocumento> allegati = new ArrayList<ModelDocumento>();

  /**
   * Il testo del messaggio
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
  

  @JsonProperty("allegati") 
 
  public List<ModelDocumento> getAllegati() {
    return allegati;
  }
  public void setAllegati(List<ModelDocumento> allegati) {
    this.allegati = allegati;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadMessaggio payloadMessaggio = (PayloadMessaggio) o;
    return Objects.equals(testo, payloadMessaggio.testo) &&
        Objects.equals(allegati, payloadMessaggio.allegati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testo, allegati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadMessaggio {\n");
    
    sb.append("    testo: ").append(toIndentedString(testo)).append("\n");
    sb.append("    allegati: ").append(toIndentedString(allegati)).append("\n");
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

