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

public class ModelFarmaciaOccasionale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private Date dataRichiesta = null;
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
   * La data da cui la farmacia ha fatto la richiesta
   **/
  

  @JsonProperty("data_richiesta") 
 
  public Date getDataRichiesta() {
    return dataRichiesta;
  }
  public void setDataRichiesta(Date dataRichiesta) {
    this.dataRichiesta = dataRichiesta;
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
    ModelFarmaciaOccasionale modelFarmaciaOccasionale = (ModelFarmaciaOccasionale) o;
    return Objects.equals(id, modelFarmaciaOccasionale.id) &&
        Objects.equals(dataRichiesta, modelFarmaciaOccasionale.dataRichiesta) &&
        Objects.equals(farmacia, modelFarmaciaOccasionale.farmacia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataRichiesta, farmacia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFarmaciaOccasionale {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataRichiesta: ").append(toIndentedString(dataRichiesta)).append("\n");
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

