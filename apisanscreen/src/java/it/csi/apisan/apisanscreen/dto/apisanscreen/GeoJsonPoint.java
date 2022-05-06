/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonGeometry;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint3D;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class GeoJsonPoint   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  

  /**
   * the geometry type
   */
  public enum TypeEnum {
    POINT("Point"),

        LINESTRING("LineString"),

        POLYGON("Polygon"),

        MULTIPOINT("MultiPoint"),

        MULTILINESTRING("MultiLineString"),

        MULTIPOLYGON("MultiPolygon");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type = null;
  private GeoJsonPoint3D coordinates = null;

  /**
   * the geometry type
   **/
  
  @ApiModelProperty(required = true, value = "the geometry type")
  @JsonProperty("type") 
 
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coordinates") 
 
  public GeoJsonPoint3D getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(GeoJsonPoint3D coordinates) {
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
    GeoJsonPoint geoJsonPoint = (GeoJsonPoint) o;
    return Objects.equals(type, geoJsonPoint.type) &&
        Objects.equals(coordinates, geoJsonPoint.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonPoint {\n");
    
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

