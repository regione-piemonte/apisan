/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Importo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private BigDecimal valore = null;
  private String valuta = null;

  /**
   * importo
   **/
  
  @ApiModelProperty(value = "importo")
  @JsonProperty("valore") 
 
  public BigDecimal getValore() {
    return valore;
  }
  public void setValore(BigDecimal valore) {
    this.valore = valore;
  }

  /**
   * tipo di moneta es EUR
   **/
  
  @ApiModelProperty(value = "tipo di moneta es EUR")
  @JsonProperty("valuta") 
 
  public String getValuta() {
    return valuta;
  }
  public void setValuta(String valuta) {
    this.valuta = valuta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Importo importo = (Importo) o;
    return Objects.equals(valore, importo.valore) &&
        Objects.equals(valuta, importo.valuta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valore, valuta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Importo {\n");
    
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
    sb.append("    valuta: ").append(toIndentedString(valuta)).append("\n");
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

