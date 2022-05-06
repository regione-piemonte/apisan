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



public class PayloadDietaNuovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date data = null;
  private String colazioneDescrizione = null;
  private Integer colazioneCalorie = null;
  private String pranzoDescrizione = null;
  private Integer pranzoCalorie = null;
  private String cenaDescrizione = null;
  private Integer cenaCalorie = null;
  private String spuntiniDescrizione = null;
  private Integer spuntiniCalorie = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadDietaNuovo payloadDietaNuovo = (PayloadDietaNuovo) o;
    return Objects.equals(data, payloadDietaNuovo.data) &&
        Objects.equals(colazioneDescrizione, payloadDietaNuovo.colazioneDescrizione) &&
        Objects.equals(colazioneCalorie, payloadDietaNuovo.colazioneCalorie) &&
        Objects.equals(pranzoDescrizione, payloadDietaNuovo.pranzoDescrizione) &&
        Objects.equals(pranzoCalorie, payloadDietaNuovo.pranzoCalorie) &&
        Objects.equals(cenaDescrizione, payloadDietaNuovo.cenaDescrizione) &&
        Objects.equals(cenaCalorie, payloadDietaNuovo.cenaCalorie) &&
        Objects.equals(spuntiniDescrizione, payloadDietaNuovo.spuntiniDescrizione) &&
        Objects.equals(spuntiniCalorie, payloadDietaNuovo.spuntiniCalorie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, colazioneDescrizione, colazioneCalorie, pranzoDescrizione, pranzoCalorie, cenaDescrizione, cenaCalorie, spuntiniDescrizione, spuntiniCalorie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadDietaNuovo {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    colazioneDescrizione: ").append(toIndentedString(colazioneDescrizione)).append("\n");
    sb.append("    colazioneCalorie: ").append(toIndentedString(colazioneCalorie)).append("\n");
    sb.append("    pranzoDescrizione: ").append(toIndentedString(pranzoDescrizione)).append("\n");
    sb.append("    pranzoCalorie: ").append(toIndentedString(pranzoCalorie)).append("\n");
    sb.append("    cenaDescrizione: ").append(toIndentedString(cenaDescrizione)).append("\n");
    sb.append("    cenaCalorie: ").append(toIndentedString(cenaCalorie)).append("\n");
    sb.append("    spuntiniDescrizione: ").append(toIndentedString(spuntiniDescrizione)).append("\n");
    sb.append("    spuntiniCalorie: ").append(toIndentedString(spuntiniCalorie)).append("\n");
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

