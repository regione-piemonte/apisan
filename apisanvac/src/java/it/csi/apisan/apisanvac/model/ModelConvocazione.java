/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta la proposta di vaccinazione")

public class ModelConvocazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idConvocazione = null;
  private String centroVaccinale = null;
  private String consultorio = null;
  private String paziente = null;
  private String dataConvocazione = null;
  private String dataAppuntamento = null;
  private List<ModelVaccinoNoDose> vaccini = new ArrayList<ModelVaccinoNoDose>();

  /**
   * l&#39;id dela convocazione
   **/
  
  @ApiModelProperty(value = "l'id dela convocazione")
  @JsonProperty("id_convocazione") 
 
  public String getIdConvocazione() {
    return idConvocazione;
  }
  public void setIdConvocazione(String idConvocazione) {
    this.idConvocazione = idConvocazione;
  }

  /**
   * l&#39;id del centro vaccinale
   **/
  
  @ApiModelProperty(value = "l'id del centro vaccinale")
  @JsonProperty("centro_vaccinale") 
 
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   * Il codice del consultorio
   **/
  
  @ApiModelProperty(value = "Il codice del consultorio")
  @JsonProperty("consultorio") 
 
  public String getConsultorio() {
    return consultorio;
  }
  public void setConsultorio(String consultorio) {
    this.consultorio = consultorio;
  }

  /**
   * Il codice fiscale del paziente
   **/
  
  @ApiModelProperty(required = true, value = "Il codice fiscale del paziente")
  @JsonProperty("paziente") 
 
  @NotNull
  public String getPaziente() {
    return paziente;
  }
  public void setPaziente(String paziente) {
    this.paziente = paziente;
  }

  /**
   * la data a partire dalla quale il soggetto è vaccinabile
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "la data a partire dalla quale il soggetto è vaccinabile")
  @JsonProperty("data_convocazione") 
 
  @NotNull
  public String getDataConvocazione() {
    return dataConvocazione;
  }
  public void setDataConvocazione(String dataConvocazione) {
    this.dataConvocazione = dataConvocazione;
  }

  /**
   * la data dell&#39;eventuale appuntamento fissato
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "la data dell'eventuale appuntamento fissato")
  @JsonProperty("data_appuntamento") 
 
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * L&#39;elenco dei vaccini presenti nella vaccinazione proposta
   **/
  
  @ApiModelProperty(required = true, value = "L'elenco dei vaccini presenti nella vaccinazione proposta")
  @JsonProperty("vaccini") 
 
  @NotNull
  public List<ModelVaccinoNoDose> getVaccini() {
    return vaccini;
  }
  public void setVaccini(List<ModelVaccinoNoDose> vaccini) {
    this.vaccini = vaccini;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConvocazione modelConvocazione = (ModelConvocazione) o;
    return Objects.equals(idConvocazione, modelConvocazione.idConvocazione) &&
        Objects.equals(centroVaccinale, modelConvocazione.centroVaccinale) &&
        Objects.equals(consultorio, modelConvocazione.consultorio) &&
        Objects.equals(paziente, modelConvocazione.paziente) &&
        Objects.equals(dataConvocazione, modelConvocazione.dataConvocazione) &&
        Objects.equals(dataAppuntamento, modelConvocazione.dataAppuntamento) &&
        Objects.equals(vaccini, modelConvocazione.vaccini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConvocazione, centroVaccinale, consultorio, paziente, dataConvocazione, dataAppuntamento, vaccini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConvocazione {\n");
    
    sb.append("    idConvocazione: ").append(toIndentedString(idConvocazione)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    consultorio: ").append(toIndentedString(consultorio)).append("\n");
    sb.append("    paziente: ").append(toIndentedString(paziente)).append("\n");
    sb.append("    dataConvocazione: ").append(toIndentedString(dataConvocazione)).append("\n");
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    vaccini: ").append(toIndentedString(vaccini)).append("\n");
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

