/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelScreeningPolipo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String polipo = null;
  private String tipo = null;
  private String sede = null;
  private String dimensione = null;
  private String polipectomiaBiopsia = null;
  private String recupero = null;
  private String dimIsto = null;
  private String tipoIsto = null;
  private String displasia = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polipo") 
 
  public String getPolipo() {
    return polipo;
  }
  public void setPolipo(String polipo) {
    this.polipo = polipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo") 
 
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sede") 
 
  public String getSede() {
    return sede;
  }
  public void setSede(String sede) {
    this.sede = sede;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dimensione") 
 
  public String getDimensione() {
    return dimensione;
  }
  public void setDimensione(String dimensione) {
    this.dimensione = dimensione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polipectomia_biopsia") 
 
  public String getPolipectomiaBiopsia() {
    return polipectomiaBiopsia;
  }
  public void setPolipectomiaBiopsia(String polipectomiaBiopsia) {
    this.polipectomiaBiopsia = polipectomiaBiopsia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recupero") 
 
  public String getRecupero() {
    return recupero;
  }
  public void setRecupero(String recupero) {
    this.recupero = recupero;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dim_isto") 
 
  public String getDimIsto() {
    return dimIsto;
  }
  public void setDimIsto(String dimIsto) {
    this.dimIsto = dimIsto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_isto") 
 
  public String getTipoIsto() {
    return tipoIsto;
  }
  public void setTipoIsto(String tipoIsto) {
    this.tipoIsto = tipoIsto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("displasia") 
 
  public String getDisplasia() {
    return displasia;
  }
  public void setDisplasia(String displasia) {
    this.displasia = displasia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelScreeningPolipo modelScreeningPolipo = (ModelScreeningPolipo) o;
    return Objects.equals(polipo, modelScreeningPolipo.polipo) &&
        Objects.equals(tipo, modelScreeningPolipo.tipo) &&
        Objects.equals(sede, modelScreeningPolipo.sede) &&
        Objects.equals(dimensione, modelScreeningPolipo.dimensione) &&
        Objects.equals(polipectomiaBiopsia, modelScreeningPolipo.polipectomiaBiopsia) &&
        Objects.equals(recupero, modelScreeningPolipo.recupero) &&
        Objects.equals(dimIsto, modelScreeningPolipo.dimIsto) &&
        Objects.equals(tipoIsto, modelScreeningPolipo.tipoIsto) &&
        Objects.equals(displasia, modelScreeningPolipo.displasia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polipo, tipo, sede, dimensione, polipectomiaBiopsia, recupero, dimIsto, tipoIsto, displasia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelScreeningPolipo {\n");
    
    sb.append("    polipo: ").append(toIndentedString(polipo)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    sede: ").append(toIndentedString(sede)).append("\n");
    sb.append("    dimensione: ").append(toIndentedString(dimensione)).append("\n");
    sb.append("    polipectomiaBiopsia: ").append(toIndentedString(polipectomiaBiopsia)).append("\n");
    sb.append("    recupero: ").append(toIndentedString(recupero)).append("\n");
    sb.append("    dimIsto: ").append(toIndentedString(dimIsto)).append("\n");
    sb.append("    tipoIsto: ").append(toIndentedString(tipoIsto)).append("\n");
    sb.append("    displasia: ").append(toIndentedString(displasia)).append("\n");
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

