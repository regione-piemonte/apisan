/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadVaccinazioneAppuntamentoPrenotazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codicePaziente = null;
  private String codiceAmbulatorio = null;
  private String centroVaccinale = null;
  private String dataAppuntamento = null;
  private String dataConvocazione = null;
  private List<ModelVaccinoNoDose> vaccini = new ArrayList<ModelVaccinoNoDose>();

  /**
   * codice univoco del paziente
   **/
  
  @ApiModelProperty(value = "codice univoco del paziente")
  @JsonProperty("codice_paziente") 
 
  public String getCodicePaziente() {
    return codicePaziente;
  }
  public void setCodicePaziente(String codicePaziente) {
    this.codicePaziente = codicePaziente;
  }

  /**
   * codice univoco dell ambulatorio
   **/
  
  @ApiModelProperty(value = "codice univoco dell ambulatorio")
  @JsonProperty("codice_ambulatorio") 
 
  public String getCodiceAmbulatorio() {
    return codiceAmbulatorio;
  }
  public void setCodiceAmbulatorio(String codiceAmbulatorio) {
    this.codiceAmbulatorio = codiceAmbulatorio;
  }

  /**
   * id del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "id del centro vaccinale")
  @JsonProperty("centro_vaccinale") 
 
  @NotNull
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   * La data dell&#39;appuntamento da prenotare
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "La data dell'appuntamento da prenotare")
  @JsonProperty("data_appuntamento") 
 
  @NotNull
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * data di convocazione dell&#39;appuntamento
   **/
  
  @ApiModelProperty(value = "data di convocazione dell'appuntamento")
  @JsonProperty("data_convocazione") 
 
  public String getDataConvocazione() {
    return dataConvocazione;
  }
  public void setDataConvocazione(String dataConvocazione) {
    this.dataConvocazione = dataConvocazione;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
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
    PayloadVaccinazioneAppuntamentoPrenotazione payloadVaccinazioneAppuntamentoPrenotazione = (PayloadVaccinazioneAppuntamentoPrenotazione) o;
    return Objects.equals(codicePaziente, payloadVaccinazioneAppuntamentoPrenotazione.codicePaziente) &&
        Objects.equals(codiceAmbulatorio, payloadVaccinazioneAppuntamentoPrenotazione.codiceAmbulatorio) &&
        Objects.equals(centroVaccinale, payloadVaccinazioneAppuntamentoPrenotazione.centroVaccinale) &&
        Objects.equals(dataAppuntamento, payloadVaccinazioneAppuntamentoPrenotazione.dataAppuntamento) &&
        Objects.equals(dataConvocazione, payloadVaccinazioneAppuntamentoPrenotazione.dataConvocazione) &&
        Objects.equals(vaccini, payloadVaccinazioneAppuntamentoPrenotazione.vaccini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codicePaziente, codiceAmbulatorio, centroVaccinale, dataAppuntamento, dataConvocazione, vaccini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadVaccinazioneAppuntamentoPrenotazione {\n");
    
    sb.append("    codicePaziente: ").append(toIndentedString(codicePaziente)).append("\n");
    sb.append("    codiceAmbulatorio: ").append(toIndentedString(codiceAmbulatorio)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    dataConvocazione: ").append(toIndentedString(dataConvocazione)).append("\n");
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

