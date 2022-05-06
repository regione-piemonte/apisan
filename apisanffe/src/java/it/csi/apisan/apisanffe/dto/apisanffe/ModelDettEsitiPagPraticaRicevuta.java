/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelEsitoDettPraticaRicevuta;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelDettEsitiPagPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private List<ModelEsitoDettPraticaRicevuta> esito = new ArrayList<ModelEsitoDettPraticaRicevuta>();

  /**
   **/
  

  @JsonProperty("esito") 
 
  public List<ModelEsitoDettPraticaRicevuta> getEsito() {
    return esito;
  }
  public void setEsito(List<ModelEsitoDettPraticaRicevuta> esito) {
    this.esito = esito;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDettEsitiPagPraticaRicevuta modelDettEsitiPagPraticaRicevuta = (ModelDettEsitiPagPraticaRicevuta) o;
    return Objects.equals(esito, modelDettEsitiPagPraticaRicevuta.esito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDettEsitiPagPraticaRicevuta {\n");
    
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
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

