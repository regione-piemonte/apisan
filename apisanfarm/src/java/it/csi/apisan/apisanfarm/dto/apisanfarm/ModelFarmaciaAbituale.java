/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmacia;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelFarmaciaAbituale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private Date dataValiditaInizio = null;
  private Date dataValiditaFine = null;
  private ModelFarmacia farmacia = null;

  /**
   * Un id univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * La data da cui la farmacia deve essere considerata come \&quot;abituale\&quot; per il cittadino
   **/
  

  @JsonProperty("data_validita_inizio") 
 
  public Date getDataValiditaInizio() {
    return dataValiditaInizio;
  }
  public void setDataValiditaInizio(Date dataValiditaInizio) {
    this.dataValiditaInizio = dataValiditaInizio;
  }

  /**
   * La data limite entro cui la farmacia deve essere considerata come \&quot;abituale\&quot; per il cittadino
   **/
  

  @JsonProperty("data_validita_fine") 
 
  public Date getDataValiditaFine() {
    return dataValiditaFine;
  }
  public void setDataValiditaFine(Date dataValiditaFine) {
    this.dataValiditaFine = dataValiditaFine;
  }

  /**
   **/
  

  @JsonProperty("farmacia") 
 
  public ModelFarmacia getFarmacia() {
    return farmacia;
  }
  public void setFarmacia(ModelFarmacia farmacia) {
    this.farmacia = farmacia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFarmaciaAbituale modelFarmaciaAbituale = (ModelFarmaciaAbituale) o;
    return Objects.equals(id, modelFarmaciaAbituale.id) &&
        Objects.equals(dataValiditaInizio, modelFarmaciaAbituale.dataValiditaInizio) &&
        Objects.equals(dataValiditaFine, modelFarmaciaAbituale.dataValiditaFine) &&
        Objects.equals(farmacia, modelFarmaciaAbituale.farmacia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataValiditaInizio, dataValiditaFine, farmacia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFarmaciaAbituale {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataValiditaInizio: ").append(toIndentedString(dataValiditaInizio)).append("\n");
    sb.append("    dataValiditaFine: ").append(toIndentedString(dataValiditaFine)).append("\n");
    sb.append("    farmacia: ").append(toIndentedString(farmacia)).append("\n");
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

