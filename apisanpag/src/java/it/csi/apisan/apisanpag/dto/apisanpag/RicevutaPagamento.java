/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class RicevutaPagamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer idMandatoPagamento = null;
  private List<PagamentoSanitario> pagamenti = new ArrayList<PagamentoSanitario>();

  /**
   * ricevuta del mandato di pagamento valorizzato solo nel caso di pagamento psp
   **/
  
  @ApiModelProperty(value = "ricevuta del mandato di pagamento valorizzato solo nel caso di pagamento psp")
  @JsonProperty("id_mandato_pagamento") 
 
  public Integer getIdMandatoPagamento() {
    return idMandatoPagamento;
  }
  public void setIdMandatoPagamento(Integer idMandatoPagamento) {
    this.idMandatoPagamento = idMandatoPagamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pagamenti") 
 
  public List<PagamentoSanitario> getPagamenti() {
    return pagamenti;
  }
  public void setPagamenti(List<PagamentoSanitario> pagamenti) {
    this.pagamenti = pagamenti;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RicevutaPagamento ricevutaPagamento = (RicevutaPagamento) o;
    return Objects.equals(idMandatoPagamento, ricevutaPagamento.idMandatoPagamento) &&
        Objects.equals(pagamenti, ricevutaPagamento.pagamenti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idMandatoPagamento, pagamenti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RicevutaPagamento {\n");
    
    sb.append("    idMandatoPagamento: ").append(toIndentedString(idMandatoPagamento)).append("\n");
    sb.append("    pagamenti: ").append(toIndentedString(pagamenti)).append("\n");
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

