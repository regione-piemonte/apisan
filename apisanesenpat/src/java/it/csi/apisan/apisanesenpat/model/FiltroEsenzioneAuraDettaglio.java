/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesenpat.model.FiltroEsenzioneStato;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltroEsenzioneAuraDettaglio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private FiltroEsenzioneStato dataEmissione = null;
  private FiltroEsenzioneStato dataScadenza = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_emissione") 
 
  public FiltroEsenzioneStato getDataEmissione() {
    return dataEmissione;
  }
  public void setDataEmissione(FiltroEsenzioneStato dataEmissione) {
    this.dataEmissione = dataEmissione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_scadenza") 
 
  public FiltroEsenzioneStato getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(FiltroEsenzioneStato dataScadenza) {
    this.dataScadenza = dataScadenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltroEsenzioneAuraDettaglio filtroEsenzioneAuraDettaglio = (FiltroEsenzioneAuraDettaglio) o;
    return Objects.equals(dataEmissione, filtroEsenzioneAuraDettaglio.dataEmissione) &&
        Objects.equals(dataScadenza, filtroEsenzioneAuraDettaglio.dataScadenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataEmissione, dataScadenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroEsenzioneAuraDettaglio {\n");
    
    sb.append("    dataEmissione: ").append(toIndentedString(dataEmissione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
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

