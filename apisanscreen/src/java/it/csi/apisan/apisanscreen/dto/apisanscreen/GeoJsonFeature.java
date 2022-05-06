/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonGeometry;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class GeoJsonFeature   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FEATURE("Feature");
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
  private Integer id = null;
  private GeoJsonGeometry geometry = null;
  private Object properties = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id") 
 
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("geometry") 
 
  @NotNull
  public GeoJsonGeometry getGeometry() {
    return geometry;
  }
  public void setGeometry(GeoJsonGeometry geometry) {
    this.geometry = geometry;
  }

  /**
   * contiene una serie di proprietà non strutturabili. Potrebbero cambiare da record a record 
   **/
  
  @ApiModelProperty(value = "contiene una serie di proprietà non strutturabili. Potrebbero cambiare da record a record ")
  @JsonProperty("properties") 
 
  public Object getProperties() {
    return properties;
  }
  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoJsonFeature geoJsonFeature = (GeoJsonFeature) o;
    return Objects.equals(type, geoJsonFeature.type) &&
        Objects.equals(id, geoJsonFeature.id) &&
        Objects.equals(geometry, geoJsonFeature.geometry) &&
        Objects.equals(properties, geoJsonFeature.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, geometry, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonFeature {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

