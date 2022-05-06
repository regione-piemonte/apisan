/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelAssociazione;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta una vaccinazione prenotata")

public class ModelAppuntamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String centroVaccinale = null;
  private String dataAppuntamento = null;
  private String dataConvocazione = null;
  private Boolean agenda = null;
  private String annullabilita = null;
  private List<ModelAssociazione> associazioni = new ArrayList<ModelAssociazione>();

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(required = true, value = "Identificativo univoco")
  @JsonProperty("id") 
 
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * l&#39;id del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "l'id del centro vaccinale")
  @JsonProperty("centro_vaccinale") 
 
  @NotNull
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   * la data dell&#39;apputamento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "la data dell'apputamento")
  @JsonProperty("data_appuntamento") 
 
  @NotNull
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * la data della convocazione relativa
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "la data della convocazione relativa")
  @JsonProperty("data_convocazione") 
 
  public String getDataConvocazione() {
    return dataConvocazione;
  }
  public void setDataConvocazione(String dataConvocazione) {
    this.dataConvocazione = dataConvocazione;
  }

  /**
   * indica se l&#39;appuntamento è stato creato tramite agenda
   **/
  
  @ApiModelProperty(value = "indica se l'appuntamento è stato creato tramite agenda")
  @JsonProperty("agenda") 
 
  public Boolean isAgenda() {
    return agenda;
  }
  public void setAgenda(Boolean agenda) {
    this.agenda = agenda;
  }

  /**
   * possibilità di annullare l appuntamento: N oppure S
   **/
  
  @ApiModelProperty(value = "possibilità di annullare l appuntamento: N oppure S")
  @JsonProperty("annullabilita") 
 
  public String getAnnullabilita() {
    return annullabilita;
  }
  public void setAnnullabilita(String annullabilita) {
    this.annullabilita = annullabilita;
  }

  /**
   * L&#39;elenco delle associazioni presenti nella vaccinazione proposta
   **/
  
  @ApiModelProperty(required = true, value = "L'elenco delle associazioni presenti nella vaccinazione proposta")
  @JsonProperty("associazioni") 
 
  @NotNull
  public List<ModelAssociazione> getAssociazioni() {
    return associazioni;
  }
  public void setAssociazioni(List<ModelAssociazione> associazioni) {
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
    ModelAppuntamento modelAppuntamento = (ModelAppuntamento) o;
    return Objects.equals(id, modelAppuntamento.id) &&
        Objects.equals(centroVaccinale, modelAppuntamento.centroVaccinale) &&
        Objects.equals(dataAppuntamento, modelAppuntamento.dataAppuntamento) &&
        Objects.equals(dataConvocazione, modelAppuntamento.dataConvocazione) &&
        Objects.equals(agenda, modelAppuntamento.agenda) &&
        Objects.equals(annullabilita, modelAppuntamento.annullabilita) &&
        Objects.equals(associazioni, modelAppuntamento.associazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, centroVaccinale, dataAppuntamento, dataConvocazione, agenda, annullabilita, associazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAppuntamento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    dataConvocazione: ").append(toIndentedString(dataConvocazione)).append("\n");
    sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
    sb.append("    annullabilita: ").append(toIndentedString(annullabilita)).append("\n");
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

