/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.DateCrit;
import it.csi.apisan.apisancross.dto.apisancross.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ComuneFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private StringCrit desc = null;
  private StringCrit codiceCatasto = null;
  private DateCrit dataValidita = null;

  /**
   * descrizione del comune (in like o eq)
   **/
  
  @ApiModelProperty(value = "descrizione del comune (in like o eq)")
  @JsonProperty("desc") 
 
  public StringCrit getDesc() {
    return desc;
  }
  public void setDesc(StringCrit desc) {
    this.desc = desc;
  }

  /**
   * codice catastale del comune
   **/
  
  @ApiModelProperty(value = "codice catastale del comune")
  @JsonProperty("codice_catasto") 
 
  public StringCrit getCodiceCatasto() {
    return codiceCatasto;
  }
  public void setCodiceCatasto(StringCrit codiceCatasto) {
    this.codiceCatasto = codiceCatasto;
  }

  /**
   * data di validita del comune compresa tra  data_inizio_validita e data_fine_validita
   **/
  
  @ApiModelProperty(value = "data di validita del comune compresa tra  data_inizio_validita e data_fine_validita")
  @JsonProperty("data_validita") 
 
  public DateCrit getDataValidita() {
    return dataValidita;
  }
  public void setDataValidita(DateCrit dataValidita) {
    this.dataValidita = dataValidita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComuneFilter comuneFilter = (ComuneFilter) o;
    return Objects.equals(desc, comuneFilter.desc) &&
        Objects.equals(codiceCatasto, comuneFilter.codiceCatasto) &&
        Objects.equals(dataValidita, comuneFilter.dataValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, codiceCatasto, dataValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComuneFilter {\n");
    
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    codiceCatasto: ").append(toIndentedString(codiceCatasto)).append("\n");
    sb.append("    dataValidita: ").append(toIndentedString(dataValidita)).append("\n");
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

