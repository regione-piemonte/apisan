/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.math.BigDecimal;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Body   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String motivo = null;
  private String asrId = null;
  private String numeroRicevuta = null;
  private BigDecimal importoPagato = null;

  /**
   * il motivo del pagamento tra (S, L)
   **/
  
  @ApiModelProperty(value = "il motivo del pagamento tra (S, L)")
  @JsonProperty("motivo") 
 
  public String getMotivo() {
    return motivo;
  }
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  /**
   * l&#39;asr beneficiaria presa dall&#39;elenco disponibile
   **/
  
  @ApiModelProperty(value = "l'asr beneficiaria presa dall'elenco disponibile")
  @JsonProperty("asr_id") 
 
  public String getAsrId() {
    return asrId;
  }
  public void setAsrId(String asrId) {
    this.asrId = asrId;
  }

  /**
   * numero della ricevuta emessa dal circuito di pagamento
   **/
  
  @ApiModelProperty(value = "numero della ricevuta emessa dal circuito di pagamento")
  @JsonProperty("numero_ricevuta") 
 
  public String getNumeroRicevuta() {
    return numeroRicevuta;
  }
  public void setNumeroRicevuta(String numeroRicevuta) {
    this.numeroRicevuta = numeroRicevuta;
  }

  /**
   * importo in euro pagato
   **/
  
  @ApiModelProperty(value = "importo in euro pagato")
  @JsonProperty("importo_pagato") 
 
  public BigDecimal getImportoPagato() {
    return importoPagato;
  }
  public void setImportoPagato(BigDecimal importoPagato) {
    this.importoPagato = importoPagato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(motivo, body.motivo) &&
        Objects.equals(asrId, body.asrId) &&
        Objects.equals(numeroRicevuta, body.numeroRicevuta) &&
        Objects.equals(importoPagato, body.importoPagato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motivo, asrId, numeroRicevuta, importoPagato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    asrId: ").append(toIndentedString(asrId)).append("\n");
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
    sb.append("    importoPagato: ").append(toIndentedString(importoPagato)).append("\n");
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

