/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.dto.apisantrovaun;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class GeoJsonPunto   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String type = null;
  private List<BigDecimal> coordinates = new ArrayList<BigDecimal>();

  /**
   * Ha sempre valore \&quot;Point\&quot;
   **/
  
  @ApiModelProperty(example = "Point", value = "Ha sempre valore \"Point\"")
  @JsonProperty("type") 
 
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Contiene due coordinate, la prima è la longitudine mentre la seconda è la latitudine 
   **/
  
  @ApiModelProperty(example = "[10.13,12.1]", value = "Contiene due coordinate, la prima è la longitudine mentre la seconda è la latitudine ")
  @JsonProperty("coordinates") 
 
  public List<BigDecimal> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoJsonPunto geoJsonPunto = (GeoJsonPunto) o;
    return Objects.equals(type, geoJsonPunto.type) &&
        Objects.equals(coordinates, geoJsonPunto.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonPunto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

