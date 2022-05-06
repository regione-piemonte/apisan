/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDieta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private Date data = null;
  private String colazioneDescrizione = null;
  private Integer colazioneCalorie = null;
  private String pranzoDescrizione = null;
  private Integer pranzoCalorie = null;
  private String cenaDescrizione = null;
  private Integer cenaCalorie = null;
  private String spuntiniDescrizione = null;
  private Integer spuntiniCalorie = null;
  private Date dataCreazione = null;
  private Date dataAggiornamento = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * La data della dieta inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La data della dieta inserita dall'utente")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * La descrizione della colazione
   **/
  
  @ApiModelProperty(value = "La descrizione della colazione")
  @JsonProperty("colazione_descrizione") 
 
  public String getColazioneDescrizione() {
    return colazioneDescrizione;
  }
  public void setColazioneDescrizione(String colazioneDescrizione) {
    this.colazioneDescrizione = colazioneDescrizione;
  }

  /**
   * Il numero di calorie della colazione
   **/
  
  @ApiModelProperty(value = "Il numero di calorie della colazione")
  @JsonProperty("colazione_calorie") 
 
  public Integer getColazioneCalorie() {
    return colazioneCalorie;
  }
  public void setColazioneCalorie(Integer colazioneCalorie) {
    this.colazioneCalorie = colazioneCalorie;
  }

  /**
   * La descrizione del pranzo
   **/
  
  @ApiModelProperty(value = "La descrizione del pranzo")
  @JsonProperty("pranzo_descrizione") 
 
  public String getPranzoDescrizione() {
    return pranzoDescrizione;
  }
  public void setPranzoDescrizione(String pranzoDescrizione) {
    this.pranzoDescrizione = pranzoDescrizione;
  }

  /**
   * Il numero di calorie del pranzo
   **/
  
  @ApiModelProperty(value = "Il numero di calorie del pranzo")
  @JsonProperty("pranzo_calorie") 
 
  public Integer getPranzoCalorie() {
    return pranzoCalorie;
  }
  public void setPranzoCalorie(Integer pranzoCalorie) {
    this.pranzoCalorie = pranzoCalorie;
  }

  /**
   * La descrizione della cena
   **/
  
  @ApiModelProperty(value = "La descrizione della cena")
  @JsonProperty("cena_descrizione") 
 
  public String getCenaDescrizione() {
    return cenaDescrizione;
  }
  public void setCenaDescrizione(String cenaDescrizione) {
    this.cenaDescrizione = cenaDescrizione;
  }

  /**
   * Il numero di calorie della cena
   **/
  
  @ApiModelProperty(value = "Il numero di calorie della cena")
  @JsonProperty("cena_calorie") 
 
  public Integer getCenaCalorie() {
    return cenaCalorie;
  }
  public void setCenaCalorie(Integer cenaCalorie) {
    this.cenaCalorie = cenaCalorie;
  }

  /**
   * La descrizione degli spuntini
   **/
  
  @ApiModelProperty(value = "La descrizione degli spuntini")
  @JsonProperty("spuntini_descrizione") 
 
  public String getSpuntiniDescrizione() {
    return spuntiniDescrizione;
  }
  public void setSpuntiniDescrizione(String spuntiniDescrizione) {
    this.spuntiniDescrizione = spuntiniDescrizione;
  }

  /**
   * Il numero di calorie degli spuntini
   **/
  
  @ApiModelProperty(value = "Il numero di calorie degli spuntini")
  @JsonProperty("spuntini_calorie") 
 
  public Integer getSpuntiniCalorie() {
    return spuntiniCalorie;
  }
  public void setSpuntiniCalorie(Integer spuntiniCalorie) {
    this.spuntiniCalorie = spuntiniCalorie;
  }

  /**
   * La data di creazione
   **/
  
  @ApiModelProperty(value = "La data di creazione")
  @JsonProperty("data_creazione") 
 
  public Date getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(Date dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   * La data dell&#39;ultimo aggiornamento
   **/
  
  @ApiModelProperty(value = "La data dell'ultimo aggiornamento")
  @JsonProperty("data_aggiornamento") 
 
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDieta modelDieta = (ModelDieta) o;
    return Objects.equals(id, modelDieta.id) &&
        Objects.equals(data, modelDieta.data) &&
        Objects.equals(colazioneDescrizione, modelDieta.colazioneDescrizione) &&
        Objects.equals(colazioneCalorie, modelDieta.colazioneCalorie) &&
        Objects.equals(pranzoDescrizione, modelDieta.pranzoDescrizione) &&
        Objects.equals(pranzoCalorie, modelDieta.pranzoCalorie) &&
        Objects.equals(cenaDescrizione, modelDieta.cenaDescrizione) &&
        Objects.equals(cenaCalorie, modelDieta.cenaCalorie) &&
        Objects.equals(spuntiniDescrizione, modelDieta.spuntiniDescrizione) &&
        Objects.equals(spuntiniCalorie, modelDieta.spuntiniCalorie) &&
        Objects.equals(dataCreazione, modelDieta.dataCreazione) &&
        Objects.equals(dataAggiornamento, modelDieta.dataAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data, colazioneDescrizione, colazioneCalorie, pranzoDescrizione, pranzoCalorie, cenaDescrizione, cenaCalorie, spuntiniDescrizione, spuntiniCalorie, dataCreazione, dataAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDieta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    colazioneDescrizione: ").append(toIndentedString(colazioneDescrizione)).append("\n");
    sb.append("    colazioneCalorie: ").append(toIndentedString(colazioneCalorie)).append("\n");
    sb.append("    pranzoDescrizione: ").append(toIndentedString(pranzoDescrizione)).append("\n");
    sb.append("    pranzoCalorie: ").append(toIndentedString(pranzoCalorie)).append("\n");
    sb.append("    cenaDescrizione: ").append(toIndentedString(cenaDescrizione)).append("\n");
    sb.append("    cenaCalorie: ").append(toIndentedString(cenaCalorie)).append("\n");
    sb.append("    spuntiniDescrizione: ").append(toIndentedString(spuntiniDescrizione)).append("\n");
    sb.append("    spuntiniCalorie: ").append(toIndentedString(spuntiniCalorie)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
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

