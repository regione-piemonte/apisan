/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PraticaInCarrello   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscale = null;
  private String numeroPraticaRegionale = null;
  private Integer opposizione730 = null;

  /**
   * codice fiscale del pagante
   **/
  
  @ApiModelProperty(example = "FLCMHL69E03H926Y", value = "codice fiscale del pagante")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * indentificativo regionale della pratica da pagare
   **/
  
  @ApiModelProperty(example = "S90901123456789012345605035", value = "indentificativo regionale della pratica da pagare")
  @JsonProperty("numero_pratica_regionale") 
 
  public String getNumeroPraticaRegionale() {
    return numeroPraticaRegionale;
  }
  public void setNumeroPraticaRegionale(String numeroPraticaRegionale) {
    this.numeroPraticaRegionale = numeroPraticaRegionale;
  }

  /**
   **/
  
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty("opposizione730") 
 
  public Integer getOpposizione730() {
    return opposizione730;
  }
  public void setOpposizione730(Integer opposizione730) {
    this.opposizione730 = opposizione730;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PraticaInCarrello praticaInCarrello = (PraticaInCarrello) o;
    return Objects.equals(codiceFiscale, praticaInCarrello.codiceFiscale) &&
        Objects.equals(numeroPraticaRegionale, praticaInCarrello.numeroPraticaRegionale) &&
        Objects.equals(opposizione730, praticaInCarrello.opposizione730);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, numeroPraticaRegionale, opposizione730);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PraticaInCarrello {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    numeroPraticaRegionale: ").append(toIndentedString(numeroPraticaRegionale)).append("\n");
    sb.append("    opposizione730: ").append(toIndentedString(opposizione730)).append("\n");
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

