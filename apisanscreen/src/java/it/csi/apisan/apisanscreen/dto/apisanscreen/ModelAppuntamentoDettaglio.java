/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelIndirizzoGeo;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAppuntamentoDettaglio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String statoCodice = null;
  private Integer agendaCodice = null;
  private Integer dipartimentoCodice = null;
  private String dipartimentoDescrizione = null;
  private Integer aslCodice = null;
  private String aslDescrizione = null;
  private String unitaOperativaCodice = null;
  private String unitaOperativaDescrizione = null;
  private String unitaOperativaComune = null;
  private String unitaOperativaIndirizzo = null;
  private String unitaOperativaCivico = null;
  private Date dataInvitabile = null;
  private String livelloAppuntamento = null;
  private String codUnpr = null;
  private ModelIndirizzoGeo indirizzoGeo = null;

  /**
   * Il codice dello stato del cittadino
   **/
  
  @ApiModelProperty(value = "Il codice dello stato del cittadino")
  @JsonProperty("stato_codice") 
 
  public String getStatoCodice() {
    return statoCodice;
  }
  public void setStatoCodice(String statoCodice) {
    this.statoCodice = statoCodice;
  }

  /**
   * Il codice dell&#39;agenda
   **/
  
  @ApiModelProperty(value = "Il codice dell'agenda")
  @JsonProperty("agenda_codice") 
 
  public Integer getAgendaCodice() {
    return agendaCodice;
  }
  public void setAgendaCodice(Integer agendaCodice) {
    this.agendaCodice = agendaCodice;
  }

  /**
   * Il codice del dipartimento
   **/
  
  @ApiModelProperty(value = "Il codice del dipartimento")
  @JsonProperty("dipartimento_codice") 
 
  public Integer getDipartimentoCodice() {
    return dipartimentoCodice;
  }
  public void setDipartimentoCodice(Integer dipartimentoCodice) {
    this.dipartimentoCodice = dipartimentoCodice;
  }

  /**
   * La descrizione del dipartimento
   **/
  
  @ApiModelProperty(value = "La descrizione del dipartimento")
  @JsonProperty("dipartimento_descrizione") 
 
  public String getDipartimentoDescrizione() {
    return dipartimentoDescrizione;
  }
  public void setDipartimentoDescrizione(String dipartimentoDescrizione) {
    this.dipartimentoDescrizione = dipartimentoDescrizione;
  }

  /**
   * Codice dell&#39;ASL
   **/
  
  @ApiModelProperty(value = "Codice dell'ASL")
  @JsonProperty("asl_codice") 
 
  public Integer getAslCodice() {
    return aslCodice;
  }
  public void setAslCodice(Integer aslCodice) {
    this.aslCodice = aslCodice;
  }

  /**
   * La descrizione dell&#39;ASL
   **/
  
  @ApiModelProperty(value = "La descrizione dell'ASL")
  @JsonProperty("asl_descrizione") 
 
  public String getAslDescrizione() {
    return aslDescrizione;
  }
  public void setAslDescrizione(String aslDescrizione) {
    this.aslDescrizione = aslDescrizione;
  }

  /**
   * Il codice dell&#39;unità operativa
   **/
  
  @ApiModelProperty(value = "Il codice dell'unità operativa")
  @JsonProperty("unita_operativa_codice") 
 
  public String getUnitaOperativaCodice() {
    return unitaOperativaCodice;
  }
  public void setUnitaOperativaCodice(String unitaOperativaCodice) {
    this.unitaOperativaCodice = unitaOperativaCodice;
  }

  /**
   * Il codice dell&#39;agenda citologica
   **/
  
  @ApiModelProperty(value = "Il codice dell'agenda citologica")
  @JsonProperty("unita_operativa_descrizione") 
 
  public String getUnitaOperativaDescrizione() {
    return unitaOperativaDescrizione;
  }
  public void setUnitaOperativaDescrizione(String unitaOperativaDescrizione) {
    this.unitaOperativaDescrizione = unitaOperativaDescrizione;
  }

  /**
   * Il comune dell&#39;unità operativa
   **/
  
  @ApiModelProperty(value = "Il comune dell'unità operativa")
  @JsonProperty("unita_operativa_comune") 
 
  public String getUnitaOperativaComune() {
    return unitaOperativaComune;
  }
  public void setUnitaOperativaComune(String unitaOperativaComune) {
    this.unitaOperativaComune = unitaOperativaComune;
  }

  /**
   * L&#39;indirizzo dell&#39;unità operativa
   **/
  
  @ApiModelProperty(value = "L'indirizzo dell'unità operativa")
  @JsonProperty("unita_operativa_indirizzo") 
 
  public String getUnitaOperativaIndirizzo() {
    return unitaOperativaIndirizzo;
  }
  public void setUnitaOperativaIndirizzo(String unitaOperativaIndirizzo) {
    this.unitaOperativaIndirizzo = unitaOperativaIndirizzo;
  }

  /**
   * Il numero civico dell&#39;unità operativa
   **/
  
  @ApiModelProperty(value = "Il numero civico dell'unità operativa")
  @JsonProperty("unita_operativa_civico") 
 
  public String getUnitaOperativaCivico() {
    return unitaOperativaCivico;
  }
  public void setUnitaOperativaCivico(String unitaOperativaCivico) {
    this.unitaOperativaCivico = unitaOperativaCivico;
  }

  /**
   * Data a partire dalla quale l’assistita è invitabile
   **/
  
  @ApiModelProperty(value = "Data a partire dalla quale l’assistita è invitabile")
  @JsonProperty("data_invitabile") 
 
  public Date getDataInvitabile() {
    return dataInvitabile;
  }
  public void setDataInvitabile(Date dataInvitabile) {
    this.dataInvitabile = dataInvitabile;
  }

  /**
   * Il livello dell&#39;appuntamento.    * 1 - se I livello    * 2 - se II livello 
   **/
  
  @ApiModelProperty(value = "Il livello dell'appuntamento.    * 1 - se I livello    * 2 - se II livello ")
  @JsonProperty("livello_appuntamento") 
 
  public String getLivelloAppuntamento() {
    return livelloAppuntamento;
  }
  public void setLivelloAppuntamento(String livelloAppuntamento) {
    this.livelloAppuntamento = livelloAppuntamento;
  }

  /**
   * codice dell&#39;unpr
   **/
  
  @ApiModelProperty(value = "codice dell'unpr")
  @JsonProperty("cod_unpr") 
 
  public String getCodUnpr() {
    return codUnpr;
  }
  public void setCodUnpr(String codUnpr) {
    this.codUnpr = codUnpr;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo_geo") 
 
  public ModelIndirizzoGeo getIndirizzoGeo() {
    return indirizzoGeo;
  }
  public void setIndirizzoGeo(ModelIndirizzoGeo indirizzoGeo) {
    this.indirizzoGeo = indirizzoGeo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAppuntamentoDettaglio modelAppuntamentoDettaglio = (ModelAppuntamentoDettaglio) o;
    return Objects.equals(statoCodice, modelAppuntamentoDettaglio.statoCodice) &&
        Objects.equals(agendaCodice, modelAppuntamentoDettaglio.agendaCodice) &&
        Objects.equals(dipartimentoCodice, modelAppuntamentoDettaglio.dipartimentoCodice) &&
        Objects.equals(dipartimentoDescrizione, modelAppuntamentoDettaglio.dipartimentoDescrizione) &&
        Objects.equals(aslCodice, modelAppuntamentoDettaglio.aslCodice) &&
        Objects.equals(aslDescrizione, modelAppuntamentoDettaglio.aslDescrizione) &&
        Objects.equals(unitaOperativaCodice, modelAppuntamentoDettaglio.unitaOperativaCodice) &&
        Objects.equals(unitaOperativaDescrizione, modelAppuntamentoDettaglio.unitaOperativaDescrizione) &&
        Objects.equals(unitaOperativaComune, modelAppuntamentoDettaglio.unitaOperativaComune) &&
        Objects.equals(unitaOperativaIndirizzo, modelAppuntamentoDettaglio.unitaOperativaIndirizzo) &&
        Objects.equals(unitaOperativaCivico, modelAppuntamentoDettaglio.unitaOperativaCivico) &&
        Objects.equals(dataInvitabile, modelAppuntamentoDettaglio.dataInvitabile) &&
        Objects.equals(livelloAppuntamento, modelAppuntamentoDettaglio.livelloAppuntamento) &&
        Objects.equals(codUnpr, modelAppuntamentoDettaglio.codUnpr) &&
        Objects.equals(indirizzoGeo, modelAppuntamentoDettaglio.indirizzoGeo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statoCodice, agendaCodice, dipartimentoCodice, dipartimentoDescrizione, aslCodice, aslDescrizione, unitaOperativaCodice, unitaOperativaDescrizione, unitaOperativaComune, unitaOperativaIndirizzo, unitaOperativaCivico, dataInvitabile, livelloAppuntamento, codUnpr, indirizzoGeo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAppuntamentoDettaglio {\n");
    
    sb.append("    statoCodice: ").append(toIndentedString(statoCodice)).append("\n");
    sb.append("    agendaCodice: ").append(toIndentedString(agendaCodice)).append("\n");
    sb.append("    dipartimentoCodice: ").append(toIndentedString(dipartimentoCodice)).append("\n");
    sb.append("    dipartimentoDescrizione: ").append(toIndentedString(dipartimentoDescrizione)).append("\n");
    sb.append("    aslCodice: ").append(toIndentedString(aslCodice)).append("\n");
    sb.append("    aslDescrizione: ").append(toIndentedString(aslDescrizione)).append("\n");
    sb.append("    unitaOperativaCodice: ").append(toIndentedString(unitaOperativaCodice)).append("\n");
    sb.append("    unitaOperativaDescrizione: ").append(toIndentedString(unitaOperativaDescrizione)).append("\n");
    sb.append("    unitaOperativaComune: ").append(toIndentedString(unitaOperativaComune)).append("\n");
    sb.append("    unitaOperativaIndirizzo: ").append(toIndentedString(unitaOperativaIndirizzo)).append("\n");
    sb.append("    unitaOperativaCivico: ").append(toIndentedString(unitaOperativaCivico)).append("\n");
    sb.append("    dataInvitabile: ").append(toIndentedString(dataInvitabile)).append("\n");
    sb.append("    livelloAppuntamento: ").append(toIndentedString(livelloAppuntamento)).append("\n");
    sb.append("    codUnpr: ").append(toIndentedString(codUnpr)).append("\n");
    sb.append("    indirizzoGeo: ").append(toIndentedString(indirizzoGeo)).append("\n");
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

