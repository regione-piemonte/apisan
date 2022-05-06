/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelAvvisoPagamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer auxdigit = null;
  private String applicationCode = null;
  private String iuv = null;
  private Date dataAssociazione = null;

  /**
   **/
  

  @JsonProperty("auxdigit") 
 
  @NotNull
  public Integer getAuxdigit() {
    return auxdigit;
  }
  public void setAuxdigit(Integer auxdigit) {
    this.auxdigit = auxdigit;
  }

  /**
   **/
  

  @JsonProperty("application_code") 
 
  public String getApplicationCode() {
    return applicationCode;
  }
  public void setApplicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
  }

  /**
   **/
  

  @JsonProperty("iuv") 
 
  @NotNull
  public String getIuv() {
    return iuv;
  }
  public void setIuv(String iuv) {
    this.iuv = iuv;
  }

  /**
   **/
  

  @JsonProperty("data_associazione") 
 
  @NotNull
  public Date getDataAssociazione() {
    return dataAssociazione;
  }
  public void setDataAssociazione(Date dataAssociazione) {
    this.dataAssociazione = dataAssociazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAvvisoPagamento modelAvvisoPagamento = (ModelAvvisoPagamento) o;
    return Objects.equals(auxdigit, modelAvvisoPagamento.auxdigit) &&
        Objects.equals(applicationCode, modelAvvisoPagamento.applicationCode) &&
        Objects.equals(iuv, modelAvvisoPagamento.iuv) &&
        Objects.equals(dataAssociazione, modelAvvisoPagamento.dataAssociazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxdigit, applicationCode, iuv, dataAssociazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAvvisoPagamento {\n");
    
    sb.append("    auxdigit: ").append(toIndentedString(auxdigit)).append("\n");
    sb.append("    applicationCode: ").append(toIndentedString(applicationCode)).append("\n");
    sb.append("    iuv: ").append(toIndentedString(iuv)).append("\n");
    sb.append("    dataAssociazione: ").append(toIndentedString(dataAssociazione)).append("\n");
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

