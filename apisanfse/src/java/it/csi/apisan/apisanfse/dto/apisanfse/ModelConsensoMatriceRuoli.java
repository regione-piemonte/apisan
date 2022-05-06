/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRuoloDma;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelConsensoMatriceRuoli   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean consultazione = null;
  private Date dataDiAggiornamento = null;
  private ModelRuoloDma ruoloDma = null;

  /**
   * consenso a si o no
   **/
  
  @ApiModelProperty(value = "consenso a si o no")
  @JsonProperty("consultazione") 
 
  public Boolean isConsultazione() {
    return consultazione;
  }
  public void setConsultazione(Boolean consultazione) {
    this.consultazione = consultazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_di_aggiornamento") 
 
  public Date getDataDiAggiornamento() {
    return dataDiAggiornamento;
  }
  public void setDataDiAggiornamento(Date dataDiAggiornamento) {
    this.dataDiAggiornamento = dataDiAggiornamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_dma") 
 
  public ModelRuoloDma getRuoloDma() {
    return ruoloDma;
  }
  public void setRuoloDma(ModelRuoloDma ruoloDma) {
    this.ruoloDma = ruoloDma;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConsensoMatriceRuoli modelConsensoMatriceRuoli = (ModelConsensoMatriceRuoli) o;
    return Objects.equals(consultazione, modelConsensoMatriceRuoli.consultazione) &&
        Objects.equals(dataDiAggiornamento, modelConsensoMatriceRuoli.dataDiAggiornamento) &&
        Objects.equals(ruoloDma, modelConsensoMatriceRuoli.ruoloDma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultazione, dataDiAggiornamento, ruoloDma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConsensoMatriceRuoli {\n");
    
    sb.append("    consultazione: ").append(toIndentedString(consultazione)).append("\n");
    sb.append("    dataDiAggiornamento: ").append(toIndentedString(dataDiAggiornamento)).append("\n");
    sb.append("    ruoloDma: ").append(toIndentedString(ruoloDma)).append("\n");
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

