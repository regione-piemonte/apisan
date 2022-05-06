/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesenpat.model.FiltroEsenzioneArchiviata;
import it.csi.apisan.apisanesenpat.model.FiltroEsenzioneStato;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltroEsenzioneAura   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private FiltroEsenzioneArchiviata archiviata = null;
  private FiltroEsenzioneStato tipologiaEsenzione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("archiviata") 
 
  public FiltroEsenzioneArchiviata getArchiviata() {
    return archiviata;
  }
  public void setArchiviata(FiltroEsenzioneArchiviata archiviata) {
    this.archiviata = archiviata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_esenzione") 
 
  public FiltroEsenzioneStato getTipologiaEsenzione() {
    return tipologiaEsenzione;
  }
  public void setTipologiaEsenzione(FiltroEsenzioneStato tipologiaEsenzione) {
    this.tipologiaEsenzione = tipologiaEsenzione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltroEsenzioneAura filtroEsenzioneAura = (FiltroEsenzioneAura) o;
    return Objects.equals(archiviata, filtroEsenzioneAura.archiviata) &&
        Objects.equals(tipologiaEsenzione, filtroEsenzioneAura.tipologiaEsenzione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiviata, tipologiaEsenzione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroEsenzioneAura {\n");
    
    sb.append("    archiviata: ").append(toIndentedString(archiviata)).append("\n");
    sb.append("    tipologiaEsenzione: ").append(toIndentedString(tipologiaEsenzione)).append("\n");
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

