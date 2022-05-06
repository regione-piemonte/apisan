/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Iuvmod3   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String dataAssegnazione = null;
  private String auxDigit = null;
  private String applicationCode = null;
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
   * aux_digit dello iuv modello3  Attenzione: puo essere non valorizzato
   **/
  
  @ApiModelProperty(example = "0", value = "aux_digit dello iuv modello3  Attenzione: puo essere non valorizzato")
  @JsonProperty("aux_digit") 
 
  public String getAuxDigit() {
    return auxDigit;
  }
  public void setAuxDigit(String auxDigit) {
    this.auxDigit = auxDigit;
  }

  /**
   * application code dello iuv modello3  Attenzione: puo essere non valorizzato
   **/
  
  @ApiModelProperty(example = "1", value = "application code dello iuv modello3  Attenzione: puo essere non valorizzato")
  @JsonProperty("application_code") 
 
  public String getApplicationCode() {
    return applicationCode;
  }
  public void setApplicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
  }

  /**
   * stringa composta di 13 cifre numeriche da inserire in un codice a barre 
   **/
  
  @ApiModelProperty(example = "16359884544", value = "stringa composta di 13 cifre numeriche da inserire in un codice a barre ")
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
    Iuvmod3 iuvmod3 = (Iuvmod3) o;
    return Objects.equals(dataAssegnazione, iuvmod3.dataAssegnazione) &&
        Objects.equals(auxDigit, iuvmod3.auxDigit) &&
        Objects.equals(applicationCode, iuvmod3.applicationCode) &&
        Objects.equals(iuv, iuvmod3.iuv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAssegnazione, auxDigit, applicationCode, iuv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Iuvmod3 {\n");
    
    sb.append("    dataAssegnazione: ").append(toIndentedString(dataAssegnazione)).append("\n");
    sb.append("    auxDigit: ").append(toIndentedString(auxDigit)).append("\n");
    sb.append("    applicationCode: ").append(toIndentedString(applicationCode)).append("\n");
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

