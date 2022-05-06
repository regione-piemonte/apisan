/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class CausalePagamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private BigDecimal id = null;
  private String descrizione = null;
  private String codiceVersamento = null;

  /**
   * id della causale di pagamento
   **/
  
  @ApiModelProperty(example = "1.0", value = "id della causale di pagamento")
  @JsonProperty("id") 
 
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * descrizione della causale di versamento definita dalla Azienda sanitaria regionale
   **/
  
  @ApiModelProperty(example = "DIRITTI DI SEGRETERIA", value = "descrizione della causale di versamento definita dalla Azienda sanitaria regionale")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * codice versamento definito a livello ministeriale associato alla causale di versamento
   **/
  
  @ApiModelProperty(example = "72", value = "codice versamento definito a livello ministeriale associato alla causale di versamento")
  @JsonProperty("codice_versamento") 
 
  public String getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(String codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CausalePagamento causalePagamento = (CausalePagamento) o;
    return Objects.equals(id, causalePagamento.id) &&
        Objects.equals(descrizione, causalePagamento.descrizione) &&
        Objects.equals(codiceVersamento, causalePagamento.codiceVersamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, codiceVersamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CausalePagamento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    codiceVersamento: ").append(toIndentedString(codiceVersamento)).append("\n");
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

