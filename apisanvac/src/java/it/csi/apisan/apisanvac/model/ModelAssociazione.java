/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import java.math.BigDecimal;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il vaccino ")

public class ModelAssociazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private BigDecimal importoIndicativo = null;
  private List<ModelVaccino> vaccinazioni = new ArrayList<ModelVaccino>();

  /**
   * Il codice dell&#39;associazione
   **/
  
  @ApiModelProperty(required = true, value = "Il codice dell'associazione")
  @JsonProperty("codice") 
 
  @NotNull
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Descrizione estesa dell&#39;associazione
   **/
  
  @ApiModelProperty(required = true, value = "Descrizione estesa dell'associazione")
  @JsonProperty("descrizione") 
 
  @NotNull
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Un importo indicativo dell&#39;associazione
   **/
  
  @ApiModelProperty(required = true, value = "Un importo indicativo dell'associazione")
  @JsonProperty("importo_indicativo") 
 
  @NotNull
  public BigDecimal getImportoIndicativo() {
    return importoIndicativo;
  }
  public void setImportoIndicativo(BigDecimal importoIndicativo) {
    this.importoIndicativo = importoIndicativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vaccinazioni") 
 
  public List<ModelVaccino> getVaccinazioni() {
    return vaccinazioni;
  }
  public void setVaccinazioni(List<ModelVaccino> vaccinazioni) {
    this.vaccinazioni = vaccinazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAssociazione modelAssociazione = (ModelAssociazione) o;
    return Objects.equals(codice, modelAssociazione.codice) &&
        Objects.equals(descrizione, modelAssociazione.descrizione) &&
        Objects.equals(importoIndicativo, modelAssociazione.importoIndicativo) &&
        Objects.equals(vaccinazioni, modelAssociazione.vaccinazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, importoIndicativo, vaccinazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAssociazione {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    importoIndicativo: ").append(toIndentedString(importoIndicativo)).append("\n");
    sb.append("    vaccinazioni: ").append(toIndentedString(vaccinazioni)).append("\n");
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

