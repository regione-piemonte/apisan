/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CarrelloPagamentiSanitari   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private List<PraticaInCarrello> elencoPraticheDaPagaredaPagare = new ArrayList<PraticaInCarrello>();
  private String applicationId = null;
  private String transactionId = null;
  private Cittadino versante = null;

  /**
   **/
  
  @ApiModelProperty(example = "[{\"codice_fiscale\":\"FFFFFF69E03H926Y\",\"numero_pratica\":\"S30101123456789012345602670\"},{\"codice_fiscale\":\"GGGGGG69E03H926Y\",\"numero_pratica\":\"S20501123456789012345602670\"}]", value = "")
  @JsonProperty("elenco_pratiche_da_pagareda_pagare") 
 
  public List<PraticaInCarrello> getElencoPraticheDaPagaredaPagare() {
    return elencoPraticheDaPagaredaPagare;
  }
  public void setElencoPraticheDaPagaredaPagare(List<PraticaInCarrello> elencoPraticheDaPagaredaPagare) {
    this.elencoPraticheDaPagaredaPagare = elencoPraticheDaPagaredaPagare;
  }

  /**
   * identificativo asr sul motore del pagamento
   **/
  
  @ApiModelProperty(example = "", value = "identificativo asr sul motore del pagamento")
  @JsonProperty("application_id") 
 
  public String getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  /**
   * identificativo transazione generato motore del pagamento
   **/
  
  @ApiModelProperty(example = "", value = "identificativo transazione generato motore del pagamento")
  @JsonProperty("transaction_id") 
 
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versante") 
 
  public Cittadino getVersante() {
    return versante;
  }
  public void setVersante(Cittadino versante) {
    this.versante = versante;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrelloPagamentiSanitari carrelloPagamentiSanitari = (CarrelloPagamentiSanitari) o;
    return Objects.equals(elencoPraticheDaPagaredaPagare, carrelloPagamentiSanitari.elencoPraticheDaPagaredaPagare) &&
        Objects.equals(applicationId, carrelloPagamentiSanitari.applicationId) &&
        Objects.equals(transactionId, carrelloPagamentiSanitari.transactionId) &&
        Objects.equals(versante, carrelloPagamentiSanitari.versante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elencoPraticheDaPagaredaPagare, applicationId, transactionId, versante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrelloPagamentiSanitari {\n");
    
    sb.append("    elencoPraticheDaPagaredaPagare: ").append(toIndentedString(elencoPraticheDaPagaredaPagare)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    versante: ").append(toIndentedString(versante)).append("\n");
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

