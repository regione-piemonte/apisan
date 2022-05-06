/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.Importo;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModalitaErogazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer idAsr = null;
  private String codiceServizio = null;
  private String codiceVersamento = null;
  private String motivoPagamento = null;
  private Long modalitaErogazione = null;
  private Importo importoBinBonifico = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_asr") 
 
  public Integer getIdAsr() {
    return idAsr;
  }
  public void setIdAsr(Integer idAsr) {
    this.idAsr = idAsr;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_versamento") 
 
  public String getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(String codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivo_pagamento") 
 
  public String getMotivoPagamento() {
    return motivoPagamento;
  }
  public void setMotivoPagamento(String motivoPagamento) {
    this.motivoPagamento = motivoPagamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modalita_erogazione") 
 
  public Long getModalitaErogazione() {
    return modalitaErogazione;
  }
  public void setModalitaErogazione(Long modalitaErogazione) {
    this.modalitaErogazione = modalitaErogazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_bin_bonifico") 
 
  public Importo getImportoBinBonifico() {
    return importoBinBonifico;
  }
  public void setImportoBinBonifico(Importo importoBinBonifico) {
    this.importoBinBonifico = importoBinBonifico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModalitaErogazione modalitaErogazione = (ModalitaErogazione) o;
    return Objects.equals(idAsr, modalitaErogazione.idAsr) &&
        Objects.equals(codiceServizio, modalitaErogazione.codiceServizio) &&
        Objects.equals(codiceVersamento, modalitaErogazione.codiceVersamento) &&
        Objects.equals(motivoPagamento, modalitaErogazione.motivoPagamento) &&
        Objects.equals(modalitaErogazione, modalitaErogazione.modalitaErogazione) &&
        Objects.equals(importoBinBonifico, modalitaErogazione.importoBinBonifico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAsr, codiceServizio, codiceVersamento, motivoPagamento, modalitaErogazione, importoBinBonifico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModalitaErogazione {\n");
    
    sb.append("    idAsr: ").append(toIndentedString(idAsr)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    codiceVersamento: ").append(toIndentedString(codiceVersamento)).append("\n");
    sb.append("    motivoPagamento: ").append(toIndentedString(motivoPagamento)).append("\n");
    sb.append("    modalitaErogazione: ").append(toIndentedString(modalitaErogazione)).append("\n");
    sb.append("    importoBinBonifico: ").append(toIndentedString(importoBinBonifico)).append("\n");
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

