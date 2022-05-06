/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelAmbulatorioOrario;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta l'ambulatorio che definisce anche la presenza dell'agenda elettronica ")

public class ModelAmbulatorio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private List<ModelAmbulatorioOrario> orari = new ArrayList<ModelAmbulatorioOrario>();
  private List<ModelVaccinoNoDose> associazioni = new ArrayList<ModelVaccinoNoDose>();

  /**
   * Codice univoco dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(required = true, value = "Codice univoco dell'ambulatorio")
  @JsonProperty("codice") 
 
  @NotNull
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * descrizione dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(required = true, value = "descrizione dell'ambulatorio")
  @JsonProperty("descrizione") 
 
  @NotNull
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orari") 
 
  public List<ModelAmbulatorioOrario> getOrari() {
    return orari;
  }
  public void setOrari(List<ModelAmbulatorioOrario> orari) {
    this.orari = orari;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("associazioni") 
 
  public List<ModelVaccinoNoDose> getAssociazioni() {
    return associazioni;
  }
  public void setAssociazioni(List<ModelVaccinoNoDose> associazioni) {
    this.associazioni = associazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAmbulatorio modelAmbulatorio = (ModelAmbulatorio) o;
    return Objects.equals(codice, modelAmbulatorio.codice) &&
        Objects.equals(descrizione, modelAmbulatorio.descrizione) &&
        Objects.equals(orari, modelAmbulatorio.orari) &&
        Objects.equals(associazioni, modelAmbulatorio.associazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, orari, associazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAmbulatorio {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    orari: ").append(toIndentedString(orari)).append("\n");
    sb.append("    associazioni: ").append(toIndentedString(associazioni)).append("\n");
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

