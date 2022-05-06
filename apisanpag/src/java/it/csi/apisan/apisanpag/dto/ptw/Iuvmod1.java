/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Iuvmod1   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String dataAssegnazione = null;
  private String iuv = null;

  /**
   **/
  
  @ApiModelProperty(example = "01/05/2018", value = "")
  @JsonProperty("data_assegnazione") 
 
  public String getDataAssegnazione() {
    return dataAssegnazione;
  }
  public void setDataAssegnazione(String dataAssegnazione) {
    this.dataAssegnazione = dataAssegnazione;
  }

  /**
   * stringa composta di 13 cifre numeriche da inserire in un codice a barre 
   **/
  
  @ApiModelProperty(example = "RF90171710003S00000005", value = "stringa composta di 13 cifre numeriche da inserire in un codice a barre ")
  @JsonProperty("iuv") 
 
  public String getIuv() {
    return iuv;
  }
  public void setIuv(String iuv) {
    this.iuv = iuv;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Iuvmod1 iuvmod1 = (Iuvmod1) o;
    return Objects.equals(dataAssegnazione, iuvmod1.dataAssegnazione) &&
        Objects.equals(iuv, iuvmod1.iuv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAssegnazione, iuv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Iuvmod1 {\n");
    
    sb.append("    dataAssegnazione: ").append(toIndentedString(dataAssegnazione)).append("\n");
    sb.append("    iuv: ").append(toIndentedString(iuv)).append("\n");
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

