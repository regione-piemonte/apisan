/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanvac.model.ModelVaccinoSomministrato;
import java.math.BigDecimal;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelSomministrazioneAssociazioni   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private BigDecimal dose = null;
  private List<ModelVaccinoSomministrato> vaccinazioni = new ArrayList<ModelVaccinoSomministrato>();

  /**
   * Un codice univoco
   **/
  
  @ApiModelProperty(required = true, value = "Un codice univoco")
  @JsonProperty("codice") 
 
  @NotNull
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Una descrizione testuale
   **/
  
  @ApiModelProperty(required = true, value = "Una descrizione testuale")
  @JsonProperty("descrizione") 
 
  @NotNull
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Il numero della dose
   **/
  
  @ApiModelProperty(example = "1.0", required = true, value = "Il numero della dose")
  @JsonProperty("dose") 
 
  @NotNull
  public BigDecimal getDose() {
    return dose;
  }
  public void setDose(BigDecimal dose) {
    this.dose = dose;
  }

  /**
   * La lista dei vaccini eseguiti e la dose relativa
   **/
  
  @ApiModelProperty(required = true, value = "La lista dei vaccini eseguiti e la dose relativa")
  @JsonProperty("vaccinazioni") 
 
  @NotNull
  public List<ModelVaccinoSomministrato> getVaccinazioni() {
    return vaccinazioni;
  }
  public void setVaccinazioni(List<ModelVaccinoSomministrato> vaccinazioni) {
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
    ModelSomministrazioneAssociazioni modelSomministrazioneAssociazioni = (ModelSomministrazioneAssociazioni) o;
    return Objects.equals(codice, modelSomministrazioneAssociazioni.codice) &&
        Objects.equals(descrizione, modelSomministrazioneAssociazioni.descrizione) &&
        Objects.equals(dose, modelSomministrazioneAssociazioni.dose) &&
        Objects.equals(vaccinazioni, modelSomministrazioneAssociazioni.vaccinazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, dose, vaccinazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSomministrazioneAssociazioni {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    dose: ").append(toIndentedString(dose)).append("\n");
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

