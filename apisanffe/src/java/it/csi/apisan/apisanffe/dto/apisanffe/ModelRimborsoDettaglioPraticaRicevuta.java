/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelRimborsoDettaglioPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idRimborso = null;
  private String dataRimborso = null;
  private String stampa = null;

  /**
   * id del rimborso
   **/
  

  @JsonProperty("id_rimborso") 
 
  public String getIdRimborso() {
    return idRimborso;
  }
  public void setIdRimborso(String idRimborso) {
    this.idRimborso = idRimborso;
  }

  /**
   * data del rimborso
   **/
  

  @JsonProperty("data_rimborso") 
 
  public String getDataRimborso() {
    return dataRimborso;
  }
  public void setDataRimborso(String dataRimborso) {
    this.dataRimborso = dataRimborso;
  }

  /**
   * base64 del file
   **/
  

  @JsonProperty("stampa") 
 
  public String getStampa() {
    return stampa;
  }
  public void setStampa(String stampa) {
    this.stampa = stampa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRimborsoDettaglioPraticaRicevuta modelRimborsoDettaglioPraticaRicevuta = (ModelRimborsoDettaglioPraticaRicevuta) o;
    return Objects.equals(idRimborso, modelRimborsoDettaglioPraticaRicevuta.idRimborso) &&
        Objects.equals(dataRimborso, modelRimborsoDettaglioPraticaRicevuta.dataRimborso) &&
        Objects.equals(stampa, modelRimborsoDettaglioPraticaRicevuta.stampa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRimborso, dataRimborso, stampa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRimborsoDettaglioPraticaRicevuta {\n");
    
    sb.append("    idRimborso: ").append(toIndentedString(idRimborso)).append("\n");
    sb.append("    dataRimborso: ").append(toIndentedString(dataRimborso)).append("\n");
    sb.append("    stampa: ").append(toIndentedString(stampa)).append("\n");
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

