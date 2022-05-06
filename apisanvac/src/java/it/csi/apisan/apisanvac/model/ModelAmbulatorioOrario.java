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

@ApiModel(description="Rappresenta l'orario nell'agenda elettronica <span style=\"text-decoration: underline;\">   Il formato e' stato realizzato sulla base dello strato giallo </span> ")

public class ModelAmbulatorioOrario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String giorno = null;
  private String oraInizioAm = null;
  private String oraFineAm = null;
  private String oraInizioPm = null;
  private String oraFinePm = null;

  /**
   * Giorno della settimana
   **/
  
  @ApiModelProperty(required = true, value = "Giorno della settimana")
  @JsonProperty("giorno") 
 
  @NotNull
  public String getGiorno() {
    return giorno;
  }
  public void setGiorno(String giorno) {
    this.giorno = giorno;
  }

  /**
   * L&#39;orario di inizio apertura AM in formato \&quot;full-time\&quot; delle specifiche ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "L'orario di inizio apertura AM in formato \"full-time\" delle specifiche ISO 8601")
  @JsonProperty("ora_inizio_am") 
 
  @NotNull
  public String getOraInizioAm() {
    return oraInizioAm;
  }
  public void setOraInizioAm(String oraInizioAm) {
    this.oraInizioAm = oraInizioAm;
  }

  /**
   * L&#39;orario di chiusura AM in formato \&quot;full-time\&quot; delle specifiche ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "L'orario di chiusura AM in formato \"full-time\" delle specifiche ISO 8601")
  @JsonProperty("ora_fine_am") 
 
  @NotNull
  public String getOraFineAm() {
    return oraFineAm;
  }
  public void setOraFineAm(String oraFineAm) {
    this.oraFineAm = oraFineAm;
  }

  /**
   * L&#39;orario di inizio apertura PM in formato \&quot;full-time\&quot; delle specifiche ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "L'orario di inizio apertura PM in formato \"full-time\" delle specifiche ISO 8601")
  @JsonProperty("ora_inizio_pm") 
 
  @NotNull
  public String getOraInizioPm() {
    return oraInizioPm;
  }
  public void setOraInizioPm(String oraInizioPm) {
    this.oraInizioPm = oraInizioPm;
  }

  /**
   * L&#39;orario di chiusura PM in formato \&quot;full-time\&quot; delle specifiche ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "L'orario di chiusura PM in formato \"full-time\" delle specifiche ISO 8601")
  @JsonProperty("ora_fine_pm") 
 
  @NotNull
  public String getOraFinePm() {
    return oraFinePm;
  }
  public void setOraFinePm(String oraFinePm) {
    this.oraFinePm = oraFinePm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAmbulatorioOrario modelAmbulatorioOrario = (ModelAmbulatorioOrario) o;
    return Objects.equals(giorno, modelAmbulatorioOrario.giorno) &&
        Objects.equals(oraInizioAm, modelAmbulatorioOrario.oraInizioAm) &&
        Objects.equals(oraFineAm, modelAmbulatorioOrario.oraFineAm) &&
        Objects.equals(oraInizioPm, modelAmbulatorioOrario.oraInizioPm) &&
        Objects.equals(oraFinePm, modelAmbulatorioOrario.oraFinePm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giorno, oraInizioAm, oraFineAm, oraInizioPm, oraFinePm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAmbulatorioOrario {\n");
    
    sb.append("    giorno: ").append(toIndentedString(giorno)).append("\n");
    sb.append("    oraInizioAm: ").append(toIndentedString(oraInizioAm)).append("\n");
    sb.append("    oraFineAm: ").append(toIndentedString(oraFineAm)).append("\n");
    sb.append("    oraInizioPm: ").append(toIndentedString(oraInizioPm)).append("\n");
    sb.append("    oraFinePm: ").append(toIndentedString(oraFinePm)).append("\n");
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

