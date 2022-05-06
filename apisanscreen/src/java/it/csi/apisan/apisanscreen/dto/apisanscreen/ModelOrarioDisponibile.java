/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelOrarioDisponibile   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String ora = null;
  private String oraInizio = null;
  private String oraFine = null;
  private String oraSlot = null;
  private String progressivo = null;

  /**
   * Un codice che identifica lo stato dell&#39;orario. Può valere \&quot;B\&quot; che indica che l&#39;orario è attualmente bloccato o \&quot;L\&quot; che indica che l&#39;orario è attualmente libero 
   */
  public enum StatoCodiceEnum {
    B("B"),

        L("L");
    private String value;

    StatoCodiceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatoCodiceEnum statoCodice = null;

  /**
   * L&#39;orario da mostrare a schermo
   **/
  
  @ApiModelProperty(example = "14:08", value = "L'orario da mostrare a schermo")
  @JsonProperty("ora") 
 
  public String getOra() {
    return ora;
  }
  public void setOra(String ora) {
    this.ora = ora;
  }

  /**
   * L&#39;orario di inizio dell&#39;intervallo
   **/
  
  @ApiModelProperty(example = "14:08", value = "L'orario di inizio dell'intervallo")
  @JsonProperty("ora_inizio") 
 
  public String getOraInizio() {
    return oraInizio;
  }
  public void setOraInizio(String oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   * L&#39;orario di fine dell&#39;intervallo
   **/
  
  @ApiModelProperty(example = "14:08", value = "L'orario di fine dell'intervallo")
  @JsonProperty("ora_fine") 
 
  public String getOraFine() {
    return oraFine;
  }
  public void setOraFine(String oraFine) {
    this.oraFine = oraFine;
  }

  /**
   * L&#39;orario che rappresenta lo slot
   **/
  
  @ApiModelProperty(example = "14:08", value = "L'orario che rappresenta lo slot")
  @JsonProperty("ora_slot") 
 
  public String getOraSlot() {
    return oraSlot;
  }
  public void setOraSlot(String oraSlot) {
    this.oraSlot = oraSlot;
  }

  /**
   * Un codice progressivo che indica il numero del posto disponibile in quello slot temporale. Ad esempio sulla fascia oraria delle 08 possono esserci 3 progressivi in modo che si possano prenotare 3 pazienti. Questo per gestire l&#39;overbooking della prenotazione 
   **/
  
  @ApiModelProperty(value = "Un codice progressivo che indica il numero del posto disponibile in quello slot temporale. Ad esempio sulla fascia oraria delle 08 possono esserci 3 progressivi in modo che si possano prenotare 3 pazienti. Questo per gestire l'overbooking della prenotazione ")
  @JsonProperty("progressivo") 
 
  public String getProgressivo() {
    return progressivo;
  }
  public void setProgressivo(String progressivo) {
    this.progressivo = progressivo;
  }

  /**
   * Un codice che identifica lo stato dell&#39;orario. Può valere \&quot;B\&quot; che indica che l&#39;orario è attualmente bloccato o \&quot;L\&quot; che indica che l&#39;orario è attualmente libero 
   **/
  
  @ApiModelProperty(value = "Un codice che identifica lo stato dell'orario. Può valere \"B\" che indica che l'orario è attualmente bloccato o \"L\" che indica che l'orario è attualmente libero ")
  @JsonProperty("stato_codice") 
 
  public StatoCodiceEnum getStatoCodice() {
    return statoCodice;
  }
  public void setStatoCodice(StatoCodiceEnum statoCodice) {
    this.statoCodice = statoCodice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOrarioDisponibile modelOrarioDisponibile = (ModelOrarioDisponibile) o;
    return Objects.equals(ora, modelOrarioDisponibile.ora) &&
        Objects.equals(oraInizio, modelOrarioDisponibile.oraInizio) &&
        Objects.equals(oraFine, modelOrarioDisponibile.oraFine) &&
        Objects.equals(oraSlot, modelOrarioDisponibile.oraSlot) &&
        Objects.equals(progressivo, modelOrarioDisponibile.progressivo) &&
        Objects.equals(statoCodice, modelOrarioDisponibile.statoCodice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ora, oraInizio, oraFine, oraSlot, progressivo, statoCodice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOrarioDisponibile {\n");
    
    sb.append("    ora: ").append(toIndentedString(ora)).append("\n");
    sb.append("    oraInizio: ").append(toIndentedString(oraInizio)).append("\n");
    sb.append("    oraFine: ").append(toIndentedString(oraFine)).append("\n");
    sb.append("    oraSlot: ").append(toIndentedString(oraSlot)).append("\n");
    sb.append("    progressivo: ").append(toIndentedString(progressivo)).append("\n");
    sb.append("    statoCodice: ").append(toIndentedString(statoCodice)).append("\n");
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

