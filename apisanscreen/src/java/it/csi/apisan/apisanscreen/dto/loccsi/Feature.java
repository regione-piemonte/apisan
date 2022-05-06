/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.loccsi;

import java.util.HashMap;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Feature  {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String type = null;
  private Geometry geometry = null;
  private HashMap<String, String> properties = null;
  private Integer id = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type") 
 
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("geometry") 
 
  public Geometry getGeometry() {
    return geometry;
  }
  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("properties") 
 
  public  HashMap<String, String> getProperties() {
    return  properties;
  }
  public void setProperties(HashMap<String, String> properties) {
    this.properties = properties;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(type, feature.type) &&
        Objects.equals(geometry, feature.geometry) &&
        Objects.equals(properties, feature.properties) &&
        Objects.equals(id, feature.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, geometry, properties, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

