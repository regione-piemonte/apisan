/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.IntegerCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class RicevutaFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private StringCrit numeroPraticaRegionale = null;
  private IntegerCrit idRicevuta = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_pratica_regionale") 
 
  public StringCrit getNumeroPraticaRegionale() {
    return numeroPraticaRegionale;
  }
  public void setNumeroPraticaRegionale(StringCrit numeroPraticaRegionale) {
    this.numeroPraticaRegionale = numeroPraticaRegionale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_ricevuta") 
 
  public IntegerCrit getIdRicevuta() {
    return idRicevuta;
  }
  public void setIdRicevuta(IntegerCrit idRicevuta) {
    this.idRicevuta = idRicevuta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RicevutaFilter ricevutaFilter = (RicevutaFilter) o;
    return Objects.equals(numeroPraticaRegionale, ricevutaFilter.numeroPraticaRegionale) &&
        Objects.equals(idRicevuta, ricevutaFilter.idRicevuta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroPraticaRegionale, idRicevuta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RicevutaFilter {\n");
    
    sb.append("    numeroPraticaRegionale: ").append(toIndentedString(numeroPraticaRegionale)).append("\n");
    sb.append("    idRicevuta: ").append(toIndentedString(idRicevuta)).append("\n");
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

