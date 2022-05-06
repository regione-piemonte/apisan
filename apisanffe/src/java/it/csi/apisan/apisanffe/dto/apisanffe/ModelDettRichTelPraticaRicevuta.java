/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelRicevutaDettPraticaRicevuta;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelDettRichTelPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private List<ModelRicevutaDettPraticaRicevuta> ricevuta = new ArrayList<ModelRicevutaDettPraticaRicevuta>();

  /**
   **/
  

  @JsonProperty("ricevuta") 
 
  public List<ModelRicevutaDettPraticaRicevuta> getRicevuta() {
    return ricevuta;
  }
  public void setRicevuta(List<ModelRicevutaDettPraticaRicevuta> ricevuta) {
    this.ricevuta = ricevuta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDettRichTelPraticaRicevuta modelDettRichTelPraticaRicevuta = (ModelDettRichTelPraticaRicevuta) o;
    return Objects.equals(ricevuta, modelDettRichTelPraticaRicevuta.ricevuta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ricevuta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDettRichTelPraticaRicevuta {\n");
    
    sb.append("    ricevuta: ").append(toIndentedString(ricevuta)).append("\n");
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

