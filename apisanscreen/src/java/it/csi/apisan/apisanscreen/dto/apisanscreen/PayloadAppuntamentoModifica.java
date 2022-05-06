/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadAppuntamentoModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer agendaCodice = null;
  private String unitaOperativaCodice = null;
  private Integer aslCodice = null;
  private Integer dipartimentoCodice = null;
  private Date data = null;
  private String ora = null;
  private String oraInizio = null;
  private String oraFine = null;
  private String oraSlot = null;
  private String progressivo = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("agenda_codice") 
 
  public Integer getAgendaCodice() {
    return agendaCodice;
  }
  public void setAgendaCodice(Integer agendaCodice) {
    this.agendaCodice = agendaCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_operativa_codice") 
 
  public String getUnitaOperativaCodice() {
    return unitaOperativaCodice;
  }
  public void setUnitaOperativaCodice(String unitaOperativaCodice) {
    this.unitaOperativaCodice = unitaOperativaCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl_codice") 
 
  public Integer getAslCodice() {
    return aslCodice;
  }
  public void setAslCodice(Integer aslCodice) {
    this.aslCodice = aslCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dipartimento_codice") 
 
  public Integer getDipartimentoCodice() {
    return dipartimentoCodice;
  }
  public void setDipartimentoCodice(Integer dipartimentoCodice) {
    this.dipartimentoCodice = dipartimentoCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(example = "12:08", value = "")
  @JsonProperty("ora") 
 
  public String getOra() {
    return ora;
  }
  public void setOra(String ora) {
    this.ora = ora;
  }

  /**
   **/
  
  @ApiModelProperty(example = "12:08", value = "")
  @JsonProperty("ora_inizio") 
 
  public String getOraInizio() {
    return oraInizio;
  }
  public void setOraInizio(String oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   **/
  
  @ApiModelProperty(example = "12:08", value = "")
  @JsonProperty("ora_fine") 
 
  public String getOraFine() {
    return oraFine;
  }
  public void setOraFine(String oraFine) {
    this.oraFine = oraFine;
  }

  /**
   **/
  
  @ApiModelProperty(example = "12:08", value = "")
  @JsonProperty("ora_slot") 
 
  public String getOraSlot() {
    return oraSlot;
  }
  public void setOraSlot(String oraSlot) {
    this.oraSlot = oraSlot;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("progressivo") 
 
  public String getProgressivo() {
    return progressivo;
  }
  public void setProgressivo(String progressivo) {
    this.progressivo = progressivo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadAppuntamentoModifica payloadAppuntamentoModifica = (PayloadAppuntamentoModifica) o;
    return Objects.equals(agendaCodice, payloadAppuntamentoModifica.agendaCodice) &&
        Objects.equals(unitaOperativaCodice, payloadAppuntamentoModifica.unitaOperativaCodice) &&
        Objects.equals(aslCodice, payloadAppuntamentoModifica.aslCodice) &&
        Objects.equals(dipartimentoCodice, payloadAppuntamentoModifica.dipartimentoCodice) &&
        Objects.equals(data, payloadAppuntamentoModifica.data) &&
        Objects.equals(ora, payloadAppuntamentoModifica.ora) &&
        Objects.equals(oraInizio, payloadAppuntamentoModifica.oraInizio) &&
        Objects.equals(oraFine, payloadAppuntamentoModifica.oraFine) &&
        Objects.equals(oraSlot, payloadAppuntamentoModifica.oraSlot) &&
        Objects.equals(progressivo, payloadAppuntamentoModifica.progressivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agendaCodice, unitaOperativaCodice, aslCodice, dipartimentoCodice, data, ora, oraInizio, oraFine, oraSlot, progressivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadAppuntamentoModifica {\n");
    
    sb.append("    agendaCodice: ").append(toIndentedString(agendaCodice)).append("\n");
    sb.append("    unitaOperativaCodice: ").append(toIndentedString(unitaOperativaCodice)).append("\n");
    sb.append("    aslCodice: ").append(toIndentedString(aslCodice)).append("\n");
    sb.append("    dipartimentoCodice: ").append(toIndentedString(dipartimentoCodice)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ora: ").append(toIndentedString(ora)).append("\n");
    sb.append("    oraInizio: ").append(toIndentedString(oraInizio)).append("\n");
    sb.append("    oraFine: ").append(toIndentedString(oraFine)).append("\n");
    sb.append("    oraSlot: ").append(toIndentedString(oraSlot)).append("\n");
    sb.append("    progressivo: ").append(toIndentedString(progressivo)).append("\n");
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

