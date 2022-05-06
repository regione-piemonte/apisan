/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonFeatureCollection;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelIndiceLoccsi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer id = null;
  private String name = null;
  private String description = null;
  private List<String> catalogs = new ArrayList<String>();
  private GeoJsonFeatureCollection featureCollection = null;

  /**
   * Id dell&#39;indice LOCCSI
   **/
  
  @ApiModelProperty(value = "Id dell'indice LOCCSI")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Il nome dell&#39;indice LOCCSI
   **/
  
  @ApiModelProperty(value = "Il nome dell'indice LOCCSI")
  @JsonProperty("name") 
 
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Descrizione dell&#39;indice LOCCSI
   **/
  
  @ApiModelProperty(value = "Descrizione dell'indice LOCCSI")
  @JsonProperty("description") 
 
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Elenco di nomi di cataloghi coinvolti nell&#39;indice
   **/
  
  @ApiModelProperty(value = "Elenco di nomi di cataloghi coinvolti nell'indice")
  @JsonProperty("catalogs") 
 
  public List<String> getCatalogs() {
    return catalogs;
  }
  public void setCatalogs(List<String> catalogs) {
    this.catalogs = catalogs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("featureCollection") 
 
  public GeoJsonFeatureCollection getFeatureCollection() {
    return featureCollection;
  }
  public void setFeatureCollection(GeoJsonFeatureCollection featureCollection) {
    this.featureCollection = featureCollection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIndiceLoccsi modelIndiceLoccsi = (ModelIndiceLoccsi) o;
    return Objects.equals(id, modelIndiceLoccsi.id) &&
        Objects.equals(name, modelIndiceLoccsi.name) &&
        Objects.equals(description, modelIndiceLoccsi.description) &&
        Objects.equals(catalogs, modelIndiceLoccsi.catalogs) &&
        Objects.equals(featureCollection, modelIndiceLoccsi.featureCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, catalogs, featureCollection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIndiceLoccsi {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
    sb.append("    featureCollection: ").append(toIndentedString(featureCollection)).append("\n");
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

