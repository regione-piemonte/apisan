/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class ModelSuggestIndirizzo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String indirizzo = null;
  private GeoJsonPunto coordinate = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "6545486", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * l&#39;indirizzo trovato
   **/
  
  @ApiModelProperty(example = "Via Roma 14, Torino", value = "l'indirizzo trovato")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coordinate") 
 
  public GeoJsonPunto getCoordinate() {
    return coordinate;
  }
  public void setCoordinate(GeoJsonPunto coordinate) {
    this.coordinate = coordinate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelSuggestIndirizzo modelSuggestIndirizzo = (ModelSuggestIndirizzo) o;
    return Objects.equals(id, modelSuggestIndirizzo.id) &&
        Objects.equals(indirizzo, modelSuggestIndirizzo.indirizzo) &&
        Objects.equals(coordinate, modelSuggestIndirizzo.coordinate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, indirizzo, coordinate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSuggestIndirizzo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
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

