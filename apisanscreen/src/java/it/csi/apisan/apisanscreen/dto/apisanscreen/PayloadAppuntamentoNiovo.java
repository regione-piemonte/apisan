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



public class PayloadAppuntamentoNiovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String tipologiaCodice = null;
  private Integer agendaCodice = null;
  private String unitaOperativaCodice = null;
  private Integer aslCodice = null;
  private Integer dipartimentoCodice = null;
  private Date data = null;
  private String ora = null;
  private String oraInizio = null;
  private String oraFine = null;
  private String oraSlot = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_codice") 
 
  public String getTipologiaCodice() {
    return tipologiaCodice;
  }
  public void setTipologiaCodice(String tipologiaCodice) {
    this.tipologiaCodice = tipologiaCodice;
  }

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadAppuntamentoNiovo payloadAppuntamentoNiovo = (PayloadAppuntamentoNiovo) o;
    return Objects.equals(tipologiaCodice, payloadAppuntamentoNiovo.tipologiaCodice) &&
        Objects.equals(agendaCodice, payloadAppuntamentoNiovo.agendaCodice) &&
        Objects.equals(unitaOperativaCodice, payloadAppuntamentoNiovo.unitaOperativaCodice) &&
        Objects.equals(aslCodice, payloadAppuntamentoNiovo.aslCodice) &&
        Objects.equals(dipartimentoCodice, payloadAppuntamentoNiovo.dipartimentoCodice) &&
        Objects.equals(data, payloadAppuntamentoNiovo.data) &&
        Objects.equals(ora, payloadAppuntamentoNiovo.ora) &&
        Objects.equals(oraInizio, payloadAppuntamentoNiovo.oraInizio) &&
        Objects.equals(oraFine, payloadAppuntamentoNiovo.oraFine) &&
        Objects.equals(oraSlot, payloadAppuntamentoNiovo.oraSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipologiaCodice, agendaCodice, unitaOperativaCodice, aslCodice, dipartimentoCodice, data, ora, oraInizio, oraFine, oraSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadAppuntamentoNiovo {\n");
    
    sb.append("    tipologiaCodice: ").append(toIndentedString(tipologiaCodice)).append("\n");
    sb.append("    agendaCodice: ").append(toIndentedString(agendaCodice)).append("\n");
    sb.append("    unitaOperativaCodice: ").append(toIndentedString(unitaOperativaCodice)).append("\n");
    sb.append("    aslCodice: ").append(toIndentedString(aslCodice)).append("\n");
    sb.append("    dipartimentoCodice: ").append(toIndentedString(dipartimentoCodice)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ora: ").append(toIndentedString(ora)).append("\n");
    sb.append("    oraInizio: ").append(toIndentedString(oraInizio)).append("\n");
    sb.append("    oraFine: ").append(toIndentedString(oraFine)).append("\n");
    sb.append("    oraSlot: ").append(toIndentedString(oraSlot)).append("\n");
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

