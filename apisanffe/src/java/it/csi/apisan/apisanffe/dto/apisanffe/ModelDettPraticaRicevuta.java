/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelRicevutaDettaglioPratica;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelRimborsoDettaglioPraticaRicevuta;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelDettPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private List<ModelRicevutaDettaglioPratica> ricevuta = new ArrayList<ModelRicevutaDettaglioPratica>();
  private List<ModelRimborsoDettaglioPraticaRicevuta> rimborso = new ArrayList<ModelRimborsoDettaglioPraticaRicevuta>();

  /**
   **/
  

  @JsonProperty("ricevuta") 
 
  public List<ModelRicevutaDettaglioPratica> getRicevuta() {
    return ricevuta;
  }
  public void setRicevuta(List<ModelRicevutaDettaglioPratica> ricevuta) {
    this.ricevuta = ricevuta;
  }

  /**
   **/
  

  @JsonProperty("rimborso") 
 
  public List<ModelRimborsoDettaglioPraticaRicevuta> getRimborso() {
    return rimborso;
  }
  public void setRimborso(List<ModelRimborsoDettaglioPraticaRicevuta> rimborso) {
    this.rimborso = rimborso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDettPraticaRicevuta modelDettPraticaRicevuta = (ModelDettPraticaRicevuta) o;
    return Objects.equals(ricevuta, modelDettPraticaRicevuta.ricevuta) &&
        Objects.equals(rimborso, modelDettPraticaRicevuta.rimborso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ricevuta, rimborso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDettPraticaRicevuta {\n");
    
    sb.append("    ricevuta: ").append(toIndentedString(ricevuta)).append("\n");
    sb.append("    rimborso: ").append(toIndentedString(rimborso)).append("\n");
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

