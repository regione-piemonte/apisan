/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelIndirizzoGeo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private GeoJsonPoint coordinate = null;
  private String tipoViaStradario = null;
  private String prepStradario = null;
  private String via = null;
  private String civico = null;
  private String comune = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coordinate") 
 
  public GeoJsonPoint getCoordinate() {
    return coordinate;
  }
  public void setCoordinate(GeoJsonPoint coordinate) {
    this.coordinate = coordinate;
  }

  /**
   * tipo via
   **/
  
  @ApiModelProperty(value = "tipo via")
  @JsonProperty("tipo_via_stradario") 
 
  public String getTipoViaStradario() {
    return tipoViaStradario;
  }
  public void setTipoViaStradario(String tipoViaStradario) {
    this.tipoViaStradario = tipoViaStradario;
  }

  /**
   * preposizione stradario
   **/
  
  @ApiModelProperty(value = "preposizione stradario")
  @JsonProperty("prep_stradario") 
 
  public String getPrepStradario() {
    return prepStradario;
  }
  public void setPrepStradario(String prepStradario) {
    this.prepStradario = prepStradario;
  }

  /**
   * descrizione della via
   **/
  
  @ApiModelProperty(value = "descrizione della via")
  @JsonProperty("via") 
 
  public String getVia() {
    return via;
  }
  public void setVia(String via) {
    this.via = via;
  }

  /**
   * numero civico
   **/
  
  @ApiModelProperty(value = "numero civico")
  @JsonProperty("civico") 
 
  public String getCivico() {
    return civico;
  }
  public void setCivico(String civico) {
    this.civico = civico;
  }

  /**
   * descrizione  comune
   **/
  
  @ApiModelProperty(value = "descrizione  comune")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIndirizzoGeo modelIndirizzoGeo = (ModelIndirizzoGeo) o;
    return Objects.equals(coordinate, modelIndirizzoGeo.coordinate) &&
        Objects.equals(tipoViaStradario, modelIndirizzoGeo.tipoViaStradario) &&
        Objects.equals(prepStradario, modelIndirizzoGeo.prepStradario) &&
        Objects.equals(via, modelIndirizzoGeo.via) &&
        Objects.equals(civico, modelIndirizzoGeo.civico) &&
        Objects.equals(comune, modelIndirizzoGeo.comune);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinate, tipoViaStradario, prepStradario, via, civico, comune);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIndirizzoGeo {\n");
    
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
    sb.append("    tipoViaStradario: ").append(toIndentedString(tipoViaStradario)).append("\n");
    sb.append("    prepStradario: ").append(toIndentedString(prepStradario)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
    sb.append("    civico: ").append(toIndentedString(civico)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
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

