/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadVaccinazioneAppuntamentoSpostamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String dataAppuntamento = null;
  private String dataConvocazione = null;
  private String codicePaziente = null;
  private String note = null;
  private String codiceAmbulatorio = null;
  private String codiceConsultorio = null;

  /**
   * La nuova data di appuntamento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "La nuova data di appuntamento")
  @JsonProperty("data_appuntamento") 
 
  @NotNull
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * La data della convocazione
   **/
  
  @ApiModelProperty(example = "2019-10-08T09:21:38.739Z", required = true, value = "La data della convocazione")
  @JsonProperty("data_convocazione") 
 
  @NotNull
  public String getDataConvocazione() {
    return dataConvocazione;
  }
  public void setDataConvocazione(String dataConvocazione) {
    this.dataConvocazione = dataConvocazione;
  }

  /**
   * Codice del paziente
   **/
  
  @ApiModelProperty(required = true, value = "Codice del paziente")
  @JsonProperty("codice_paziente") 
 
  @NotNull
  public String getCodicePaziente() {
    return codicePaziente;
  }
  public void setCodicePaziente(String codicePaziente) {
    this.codicePaziente = codicePaziente;
  }

  /**
   * Eventuali note
   **/
  
  @ApiModelProperty(value = "Eventuali note")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Codice dell ambulatorio su cui spostare l appuntamento
   **/
  
  @ApiModelProperty(value = "Codice dell ambulatorio su cui spostare l appuntamento")
  @JsonProperty("codice_ambulatorio") 
 
  public String getCodiceAmbulatorio() {
    return codiceAmbulatorio;
  }
  public void setCodiceAmbulatorio(String codiceAmbulatorio) {
    this.codiceAmbulatorio = codiceAmbulatorio;
  }

  /**
   * Codice consultorio
   **/
  
  @ApiModelProperty(value = "Codice consultorio")
  @JsonProperty("codice_consultorio") 
 
  public String getCodiceConsultorio() {
    return codiceConsultorio;
  }
  public void setCodiceConsultorio(String codiceConsultorio) {
    this.codiceConsultorio = codiceConsultorio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadVaccinazioneAppuntamentoSpostamento payloadVaccinazioneAppuntamentoSpostamento = (PayloadVaccinazioneAppuntamentoSpostamento) o;
    return Objects.equals(dataAppuntamento, payloadVaccinazioneAppuntamentoSpostamento.dataAppuntamento) &&
        Objects.equals(dataConvocazione, payloadVaccinazioneAppuntamentoSpostamento.dataConvocazione) &&
        Objects.equals(codicePaziente, payloadVaccinazioneAppuntamentoSpostamento.codicePaziente) &&
        Objects.equals(note, payloadVaccinazioneAppuntamentoSpostamento.note) &&
        Objects.equals(codiceAmbulatorio, payloadVaccinazioneAppuntamentoSpostamento.codiceAmbulatorio) &&
        Objects.equals(codiceConsultorio, payloadVaccinazioneAppuntamentoSpostamento.codiceConsultorio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAppuntamento, dataConvocazione, codicePaziente, note, codiceAmbulatorio, codiceConsultorio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadVaccinazioneAppuntamentoSpostamento {\n");
    
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    dataConvocazione: ").append(toIndentedString(dataConvocazione)).append("\n");
    sb.append("    codicePaziente: ").append(toIndentedString(codicePaziente)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    codiceAmbulatorio: ").append(toIndentedString(codiceAmbulatorio)).append("\n");
    sb.append("    codiceConsultorio: ").append(toIndentedString(codiceConsultorio)).append("\n");
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

