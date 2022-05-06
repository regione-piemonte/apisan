/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il vaccino colontario ")

public class ModelVaccinoVolontario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private BigDecimal importoIndicativo = null;

  /**
   * Il codice del vaccino
   **/
  
  @ApiModelProperty(required = true, value = "Il codice del vaccino")
  @JsonProperty("codice") 
 
  @NotNull
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Descrizione estesa del vaccino
   **/
  
  @ApiModelProperty(required = true, value = "Descrizione estesa del vaccino")
  @JsonProperty("descrizione") 
 
  @NotNull
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * l&#39;importo della vaccinazione
   **/
  
  @ApiModelProperty(value = "l'importo della vaccinazione")
  @JsonProperty("importo_indicativo") 
 
  public BigDecimal getImportoIndicativo() {
    return importoIndicativo;
  }
  public void setImportoIndicativo(BigDecimal importoIndicativo) {
    this.importoIndicativo = importoIndicativo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVaccinoVolontario modelVaccinoVolontario = (ModelVaccinoVolontario) o;
    return Objects.equals(codice, modelVaccinoVolontario.codice) &&
        Objects.equals(descrizione, modelVaccinoVolontario.descrizione) &&
        Objects.equals(importoIndicativo, modelVaccinoVolontario.importoIndicativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, importoIndicativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVaccinoVolontario {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    importoIndicativo: ").append(toIndentedString(importoIndicativo)).append("\n");
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

