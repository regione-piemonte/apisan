/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelOperazioniAppuntamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean prenotabile = null;
  private Boolean modificabile = null;
  private Boolean visualizzabile = null;
  private String messaggio = null;

  /**
   * indica se l&#39;appuntamento è prenotabile o meno
   **/
  
  @ApiModelProperty(value = "indica se l'appuntamento è prenotabile o meno")
  @JsonProperty("prenotabile") 
 
  public Boolean isPrenotabile() {
    return prenotabile;
  }
  public void setPrenotabile(Boolean prenotabile) {
    this.prenotabile = prenotabile;
  }

  /**
   * indica se l&#39;appuntamento è modificabile o meno
   **/
  
  @ApiModelProperty(value = "indica se l'appuntamento è modificabile o meno")
  @JsonProperty("modificabile") 
 
  public Boolean isModificabile() {
    return modificabile;
  }
  public void setModificabile(Boolean modificabile) {
    this.modificabile = modificabile;
  }

  /**
   * indica se l&#39;appuntamento è visualizzabile o meno
   **/
  
  @ApiModelProperty(value = "indica se l'appuntamento è visualizzabile o meno")
  @JsonProperty("visualizzabile") 
 
  public Boolean isVisualizzabile() {
    return visualizzabile;
  }
  public void setVisualizzabile(Boolean visualizzabile) {
    this.visualizzabile = visualizzabile;
  }

  /**
   * messaggio da dare all&#39;utente
   **/
  
  @ApiModelProperty(value = "messaggio da dare all'utente")
  @JsonProperty("messaggio") 
 
  public String getMessaggio() {
    return messaggio;
  }
  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOperazioniAppuntamento modelOperazioniAppuntamento = (ModelOperazioniAppuntamento) o;
    return Objects.equals(prenotabile, modelOperazioniAppuntamento.prenotabile) &&
        Objects.equals(modificabile, modelOperazioniAppuntamento.modificabile) &&
        Objects.equals(visualizzabile, modelOperazioniAppuntamento.visualizzabile) &&
        Objects.equals(messaggio, modelOperazioniAppuntamento.messaggio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prenotabile, modificabile, visualizzabile, messaggio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOperazioniAppuntamento {\n");
    
    sb.append("    prenotabile: ").append(toIndentedString(prenotabile)).append("\n");
    sb.append("    modificabile: ").append(toIndentedString(modificabile)).append("\n");
    sb.append("    visualizzabile: ").append(toIndentedString(visualizzabile)).append("\n");
    sb.append("    messaggio: ").append(toIndentedString(messaggio)).append("\n");
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

