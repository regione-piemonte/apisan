/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancons.dto.apisancons.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class InformativaFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private StringCrit codiceTipoConsenso = null;
  private StringCrit codiceSottoTipoConsenso = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_tipo_consenso") 
 
  public StringCrit getCodiceTipoConsenso() {
    return codiceTipoConsenso;
  }
  public void setCodiceTipoConsenso(StringCrit codiceTipoConsenso) {
    this.codiceTipoConsenso = codiceTipoConsenso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_sotto_tipo_consenso") 
 
  public StringCrit getCodiceSottoTipoConsenso() {
    return codiceSottoTipoConsenso;
  }
  public void setCodiceSottoTipoConsenso(StringCrit codiceSottoTipoConsenso) {
    this.codiceSottoTipoConsenso = codiceSottoTipoConsenso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformativaFilter informativaFilter = (InformativaFilter) o;
    return Objects.equals(codiceTipoConsenso, informativaFilter.codiceTipoConsenso) &&
        Objects.equals(codiceSottoTipoConsenso, informativaFilter.codiceSottoTipoConsenso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceTipoConsenso, codiceSottoTipoConsenso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformativaFilter {\n");
    
    sb.append("    codiceTipoConsenso: ").append(toIndentedString(codiceTipoConsenso)).append("\n");
    sb.append("    codiceSottoTipoConsenso: ").append(toIndentedString(codiceSottoTipoConsenso)).append("\n");
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

