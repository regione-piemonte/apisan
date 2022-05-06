/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEtichettaNumeroDocumenti   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private ModelEtichetta etichetta = null;
  private Integer numeroDocumenti = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("etichetta") 
 
  public ModelEtichetta getEtichetta() {
    return etichetta;
  }
  public void setEtichetta(ModelEtichetta etichetta) {
    this.etichetta = etichetta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_documenti") 
 
  public Integer getNumeroDocumenti() {
    return numeroDocumenti;
  }
  public void setNumeroDocumenti(Integer numeroDocumenti) {
    this.numeroDocumenti = numeroDocumenti;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEtichettaNumeroDocumenti modelEtichettaNumeroDocumenti = (ModelEtichettaNumeroDocumenti) o;
    return Objects.equals(etichetta, modelEtichettaNumeroDocumenti.etichetta) &&
        Objects.equals(numeroDocumenti, modelEtichettaNumeroDocumenti.numeroDocumenti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etichetta, numeroDocumenti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEtichettaNumeroDocumenti {\n");
    
    sb.append("    etichetta: ").append(toIndentedString(etichetta)).append("\n");
    sb.append("    numeroDocumenti: ").append(toIndentedString(numeroDocumenti)).append("\n");
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

