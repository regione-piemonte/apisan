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



public class ModelCategoriaTipologia   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String categoria = null;
  private String tipologia = null;

  /**
   * possibili valori * FSE * PERSONALE
   **/
  
  @ApiModelProperty(value = "possibili valori * FSE * PERSONALE")
  @JsonProperty("categoria") 
 
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia") 
 
  public String getTipologia() {
    return tipologia;
  }
  public void setTipologia(String tipologia) {
    this.tipologia = tipologia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCategoriaTipologia modelCategoriaTipologia = (ModelCategoriaTipologia) o;
    return Objects.equals(categoria, modelCategoriaTipologia.categoria) &&
        Objects.equals(tipologia, modelCategoriaTipologia.tipologia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoria, tipologia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCategoriaTipologia {\n");
    
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
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

