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



public class FiltroCertificato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private FiltroEsenzioneArchiviata utilizzabile = null;
  private FiltroEsenzioneStato tipologiaEsenzione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("utilizzabile") 
 
  public FiltroEsenzioneArchiviata getUtilizzabile() {
    return utilizzabile;
  }
  public void setUtilizzabile(FiltroEsenzioneArchiviata utilizzabile) {
    this.utilizzabile = utilizzabile;
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
    FiltroCertificato filtroCertificato = (FiltroCertificato) o;
    return Objects.equals(utilizzabile, filtroCertificato.utilizzabile) &&
        Objects.equals(tipologiaEsenzione, filtroCertificato.tipologiaEsenzione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utilizzabile, tipologiaEsenzione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroCertificato {\n");
    
    sb.append("    utilizzabile: ").append(toIndentedString(utilizzabile)).append("\n");
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

