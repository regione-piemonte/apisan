/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDisponibilita   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Boolean monitorabile = null;
  private Boolean selezionabile = null;
  private Boolean selezionabileRicongiungimentoFamiliare = null;
  private Boolean selezionabileAssistenzaTemporanea = null;
  private Boolean selezionabileInfanzia = null;
  private String medicoId = null;
  private String medicoCodiceFiscale = null;

  /**
   * true se il medico è monitorabile, false altrimenti
   **/
  
  @ApiModelProperty(example = "true", value = "true se il medico è monitorabile, false altrimenti")
  @JsonProperty("monitorabile") 
 
  public Boolean isMonitorabile() {
    return monitorabile;
  }
  public void setMonitorabile(Boolean monitorabile) {
    this.monitorabile = monitorabile;
  }

  /**
   * true se è possibile selezionare il medico, false altrimenti
   **/
  
  @ApiModelProperty(example = "false", value = "true se è possibile selezionare il medico, false altrimenti")
  @JsonProperty("selezionabile") 
 
  public Boolean isSelezionabile() {
    return selezionabile;
  }
  public void setSelezionabile(Boolean selezionabile) {
    this.selezionabile = selezionabile;
  }

  /**
   * true se è possibile selezionare il medico per un ricongiungimento familiare, false altrimenti
   **/
  
  @ApiModelProperty(example = "true", value = "true se è possibile selezionare il medico per un ricongiungimento familiare, false altrimenti")
  @JsonProperty("selezionabileRicongiungimentoFamiliare") 
 
  public Boolean isSelezionabileRicongiungimentoFamiliare() {
    return selezionabileRicongiungimentoFamiliare;
  }
  public void setSelezionabileRicongiungimentoFamiliare(Boolean selezionabileRicongiungimentoFamiliare) {
    this.selezionabileRicongiungimentoFamiliare = selezionabileRicongiungimentoFamiliare;
  }

  /**
   * true se è possibile selezionare il medico per assistenza temporanea, false altrimenti
   **/
  
  @ApiModelProperty(value = "true se è possibile selezionare il medico per assistenza temporanea, false altrimenti")
  @JsonProperty("selezionabileAssistenzaTemporanea") 
 
  public Boolean isSelezionabileAssistenzaTemporanea() {
    return selezionabileAssistenzaTemporanea;
  }
  public void setSelezionabileAssistenzaTemporanea(Boolean selezionabileAssistenzaTemporanea) {
    this.selezionabileAssistenzaTemporanea = selezionabileAssistenzaTemporanea;
  }

  /**
   * true se è possibile selezionare il medico (solitamente il pediatra) per assistenza di bambini da 0 a 6 anni, false altrimenti
   **/
  
  @ApiModelProperty(value = "true se è possibile selezionare il medico (solitamente il pediatra) per assistenza di bambini da 0 a 6 anni, false altrimenti")
  @JsonProperty("selezionabileInfanzia") 
 
  public Boolean isSelezionabileInfanzia() {
    return selezionabileInfanzia;
  }
  public void setSelezionabileInfanzia(Boolean selezionabileInfanzia) {
    this.selezionabileInfanzia = selezionabileInfanzia;
  }

  /**
   * L&#39;id del medico
   **/
  
  @ApiModelProperty(value = "L'id del medico")
  @JsonProperty("medicoId") 
 
  public String getMedicoId() {
    return medicoId;
  }
  public void setMedicoId(String medicoId) {
    this.medicoId = medicoId;
  }

  /**
   * Il codice fiscale del medico
   **/
  
  @ApiModelProperty(value = "Il codice fiscale del medico")
  @JsonProperty("medicoCodiceFiscale") 
 
  public String getMedicoCodiceFiscale() {
    return medicoCodiceFiscale;
  }
  public void setMedicoCodiceFiscale(String medicoCodiceFiscale) {
    this.medicoCodiceFiscale = medicoCodiceFiscale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDisponibilita modelDisponibilita = (ModelDisponibilita) o;
    return Objects.equals(monitorabile, modelDisponibilita.monitorabile) &&
        Objects.equals(selezionabile, modelDisponibilita.selezionabile) &&
        Objects.equals(selezionabileRicongiungimentoFamiliare, modelDisponibilita.selezionabileRicongiungimentoFamiliare) &&
        Objects.equals(selezionabileAssistenzaTemporanea, modelDisponibilita.selezionabileAssistenzaTemporanea) &&
        Objects.equals(selezionabileInfanzia, modelDisponibilita.selezionabileInfanzia) &&
        Objects.equals(medicoId, modelDisponibilita.medicoId) &&
        Objects.equals(medicoCodiceFiscale, modelDisponibilita.medicoCodiceFiscale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorabile, selezionabile, selezionabileRicongiungimentoFamiliare, selezionabileAssistenzaTemporanea, selezionabileInfanzia, medicoId, medicoCodiceFiscale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDisponibilita {\n");
    
    sb.append("    monitorabile: ").append(toIndentedString(monitorabile)).append("\n");
    sb.append("    selezionabile: ").append(toIndentedString(selezionabile)).append("\n");
    sb.append("    selezionabileRicongiungimentoFamiliare: ").append(toIndentedString(selezionabileRicongiungimentoFamiliare)).append("\n");
    sb.append("    selezionabileAssistenzaTemporanea: ").append(toIndentedString(selezionabileAssistenzaTemporanea)).append("\n");
    sb.append("    selezionabileInfanzia: ").append(toIndentedString(selezionabileInfanzia)).append("\n");
    sb.append("    medicoId: ").append(toIndentedString(medicoId)).append("\n");
    sb.append("    medicoCodiceFiscale: ").append(toIndentedString(medicoCodiceFiscale)).append("\n");
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

