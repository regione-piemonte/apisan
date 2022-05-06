/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta i contatti temporanei del cittadino per questo servizio ")

public class ModelContattiTemporanei   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String telefono = null;
  private String email = null;
  private String indirizzoTemporaneo = null;
  private String comune = null;
  private String dataInizioValidita = null;
  private String dataFineValidita = null;

  /**
   * Il numero di telefono temporaneo
   **/
  
  @ApiModelProperty(value = "Il numero di telefono temporaneo")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * L&#39;indirizzo email temporaneo
   **/
  
  @ApiModelProperty(value = "L'indirizzo email temporaneo")
  @JsonProperty("email") 
 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * L&#39;indirizzo temporaneo
   **/
  
  @ApiModelProperty(required = true, value = "L'indirizzo temporaneo")
  @JsonProperty("indirizzo_temporaneo") 
 
  @NotNull
  public String getIndirizzoTemporaneo() {
    return indirizzoTemporaneo;
  }
  public void setIndirizzoTemporaneo(String indirizzoTemporaneo) {
    this.indirizzoTemporaneo = indirizzoTemporaneo;
  }

  /**
   * Il comune relativo all&#39;indirizzo
   **/
  
  @ApiModelProperty(value = "Il comune relativo all'indirizzo")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data_inizio_validita") 
 
  @NotNull
  public String getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(String dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data_fine_validita") 
 
  @NotNull
  public String getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(String dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelContattiTemporanei modelContattiTemporanei = (ModelContattiTemporanei) o;
    return Objects.equals(telefono, modelContattiTemporanei.telefono) &&
        Objects.equals(email, modelContattiTemporanei.email) &&
        Objects.equals(indirizzoTemporaneo, modelContattiTemporanei.indirizzoTemporaneo) &&
        Objects.equals(comune, modelContattiTemporanei.comune) &&
        Objects.equals(dataInizioValidita, modelContattiTemporanei.dataInizioValidita) &&
        Objects.equals(dataFineValidita, modelContattiTemporanei.dataFineValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefono, email, indirizzoTemporaneo, comune, dataInizioValidita, dataFineValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelContattiTemporanei {\n");
    
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    indirizzoTemporaneo: ").append(toIndentedString(indirizzoTemporaneo)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
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

